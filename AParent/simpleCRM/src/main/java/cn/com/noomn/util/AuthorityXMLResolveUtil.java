package cn.com.noomn.util;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import cn.com.noomn.vo.AuthorityVo;

public final class AuthorityXMLResolveUtil {
	
	public SAXReader reader;
	public final Document document;
	public final Element rootElement;

	public AuthorityXMLResolveUtil() {
		//默认路径
		this("authority.xml");
	}
	
	public AuthorityXMLResolveUtil(String resourceURL) {
		try {
			reader = new SAXReader();
			document = reader.read(this.getClass().getClassLoader().getResourceAsStream(resourceURL));
//			document = reader.read(new File("src/main/resources/authority.xml"));
			rootElement = document.getRootElement();
		} catch (DocumentException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 返回所有叶子结点的key
	 * @return
	 */
	public List<String> getAllLeafNodeKeysByXPathExpression() {
		List<Node> selectNodes = document.selectNodes("//key-value");
		List<String> list = new ArrayList<String>();
		for(int i=0; i<selectNodes.size(); i++) {
			Element element = ((Element)selectNodes.get(i));
			AuthorityVo authorityVo = this.setAttrFromElement(element);
			list.add(authorityVo.getAuthorityId());
		}
		return list;
	}
	
	/**
	 * 获取所有的叶子节点
	 * @param xpathExpression
	 * @return
	 */
	public Map<String, AuthorityVo> getAllLeafNodeByXPathExpression() {
		List<Node> selectNodes = document.selectNodes("//key-value");
		Map<String, AuthorityVo> map = new HashMap<String, AuthorityVo>();
		for(int i=0; i<selectNodes.size(); i++) {
			Element element = ((Element)selectNodes.get(i));
			AuthorityVo authorityVo = this.setAttrFromElement(element);
			map.put(authorityVo.getAuthorityId(), authorityVo);
		}
		return map;
	}
	
	/**
	 * 通过表达式获取叶子节点
	 * @param xpathExpression
	 * @return
	 */
	public AuthorityVo getAuthorityVoSingleByXPathExpression(String xpathExpression) {
		Node singleNode = document.selectSingleNode(xpathExpression);
		Element element = ((Element)singleNode);
		AuthorityVo setAttrFromElement = this.setAttrFromElement(element);
		return this.setAttrFromElement(element);
	}
	
	/**
	 * 通过表达式获取二级节点(一级节点只能有一个)
	 * @param xpathExpression
	 * @return
	 */
	public List<AuthorityVo> getAuthorityVoListByXPathExpression(String xpathExpression) {
		Node singleNode = document.selectSingleNode(xpathExpression);
		Element element = ((Element)singleNode);
		List<Element> elements = element.elements();
		List<AuthorityVo> authorityVoList = new ArrayList<AuthorityVo>();
		for(int i=0; i<elements.size(); i++) {
			authorityVoList.add(this.setAttrFromElement(elements.get(i)));
		}
		
		return authorityVoList;
	}
	
	/**
	 * 通过表达式获取二级节点(一级节点可以有多个)
	 * @param xpathExpression
	 * @return
	 */
	public List<AuthorityVo> getAuthorityVoByXPathExpression(String xpathExpression) {
		Iterator iterator = document.selectNodes(xpathExpression).iterator();
		List<AuthorityVo> authorityVoList = new ArrayList<AuthorityVo>();
		while(iterator.hasNext()) {
			Node singleNode = (Node)iterator.next();
			Element element = ((Element)singleNode);
			AuthorityVo authorityVo = this.setAttrFromElement(element);
			List<Element> elements = element.elements();
			List<AuthorityVo> authorityVoListChild = new ArrayList<AuthorityVo>();
			for(int i=0; i<elements.size(); i++) {
				authorityVoListChild.add(this.setAttrFromElement(elements.get(i)));
			}
			authorityVo.setAuthorityVoList(authorityVoListChild);
			authorityVoList.add(authorityVo);
		}
		
		return authorityVoList;
	}
	
	/**
	 * 遍历某个节点下的所有子节点
	 * @param element
	 * @return
	 */
	public AuthorityVo getAuthorityFromElement(Element element) {
		List<Element> elements = element.elements();
		
		if(elements.size() > 0) {
			AuthorityVo authorityFather = new AuthorityVo();
			authorityFather.setFatherNode(true);
			String id = element.attribute("id").getStringValue();
			String explain = element.attribute("explain").getStringValue();
			String fatherNodeId = element.attribute("fatherNodeId").getStringValue();
			authorityFather.setAuthorityId(id);
			authorityFather.setAuthorityExplain(explain);
			authorityFather.setFatherNodeId(fatherNodeId);
			for(int i=0; i<elements.size(); i++) {
				AuthorityVo authorityVoChild = this.getAuthorityFromElement(elements.get(i));
				authorityFather.getAuthorityVoList().add(authorityVoChild);
			}
			return authorityFather;
		}else {
			return this.setAttrFromElement(element);
		}
	}
	
	private AuthorityVo setAttrFromElement(Element element) {
		boolean isFatherNode = Boolean.valueOf(element.attribute("isFatherNode").getValue()); 
		String name = null;
		if(!isFatherNode) {
			name = element.attribute("name").getStringValue();
		}
		String id = element.attribute("id").getStringValue();
		String explain = element.attribute("explain").getStringValue();
		String fatherNodeId = element.attribute("fatherNodeId").getStringValue();
		
		AuthorityVo authorityVo = new AuthorityVo();
		authorityVo.setAuthorityId(id);
		authorityVo.setAuthorityExplain(explain);
		authorityVo.setFatherNodeId(fatherNodeId);
		authorityVo.setFatherNode(isFatherNode);
		if(!isFatherNode) {
			authorityVo.setAuthorityName(name);
		}
		
		return authorityVo;
	}

}
