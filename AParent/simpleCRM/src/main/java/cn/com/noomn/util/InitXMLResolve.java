package cn.com.noomn.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import cn.com.noomn.vo.DepartmentVo;
import cn.com.noomn.vo.EmployeeVo;
import cn.com.noomn.vo.UserroleVo;

public class InitXMLResolve {
	public SAXReader reader;
	public final Document document;
	public final Element rootElement;

	public InitXMLResolve() {
		//默认路径
		this("init.xml");
	}
	
	public InitXMLResolve(String resourceURL) {
		try {
			reader = new SAXReader();
			document = reader.read(this.getClass().getClassLoader().getResourceAsStream(resourceURL));
//			document = reader.read(new File("src/main/resources/init.xml"));
			rootElement = document.getRootElement();
		} catch (DocumentException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 判断是否加载过
	 * @return
	 */
	public boolean isLoaded() {
		Node selectNode = document.selectSingleNode("//init");
		Element element = (Element)selectNode;
		String inited =  element.attribute("inited").getStringValue();
		return "1".equals(inited) ? true : false;
	}
	
	/**
	 * 返回所有DepartmentVo叶子结点
	 * @return
	 */
	public List<DepartmentVo> getDepartmentXMLByXPathExpression() {
		List<Node> selectNodes = document.selectNodes("//department");
		List<DepartmentVo> departmentVoList = new ArrayList<DepartmentVo>();
		for(int i=0; i<selectNodes.size(); i++) {
			Element element = ((Element)selectNodes.get(i));
			DepartmentVo departmentVo = this.setDepartmentAttrFromElement(element);
			departmentVoList.add(departmentVo);
		}
		return departmentVoList;
	}
	
	private DepartmentVo setDepartmentAttrFromElement(Element element) {
		String departmentId = element.attribute("departmentId").getStringValue();
		String departmentName = element.attribute("departmentName").getStringValue();
		
		DepartmentVo departmentVo = new DepartmentVo();
		departmentVo.setDepartmentId(departmentId);
		departmentVo.setDepartmentName(departmentName);
		
		return departmentVo;
	}
	
	
	/**
	 * 返回所有UserroleVo叶子结点
	 * @return
	 */
	public List<UserroleVo> getUserroleXMLByXPathExpression() {
		List<Node> selectNodes = document.selectNodes("//role");
		List<UserroleVo> userroleVoList = new ArrayList<UserroleVo>();
		for(int i=0; i<selectNodes.size(); i++) {
			Element element = ((Element)selectNodes.get(i));
			UserroleVo userroleVo = this.setUserroleAttrFromElement(element);
			userroleVoList.add(userroleVo);
		}
		return userroleVoList;
	}
	
	private UserroleVo setUserroleAttrFromElement(Element element) {
		String userroleId = element.attribute("userroleId").getStringValue();
		String userroleName = element.attribute("userroleName").getStringValue();
		String userroleExplain = element.attribute("userroleExplain").getStringValue();
		
		UserroleVo userroleVo = new UserroleVo();
		userroleVo.setUserroleId(userroleId);
		userroleVo.setUserroleName(userroleName);
		userroleVo.setUserroleExplain(userroleExplain);
		
		return userroleVo;
	}
	
	/**
	 * 返回所有Employee叶子结点
	 * @return
	 */
	public List<EmployeeVo> getEmployeeXMLByXPathExpression() {
		List<Node> selectNodes = document.selectNodes("//user");
		List<EmployeeVo> employeeVoList = new ArrayList<EmployeeVo>();
		for(int i=0; i<selectNodes.size(); i++) {
			Element element = ((Element)selectNodes.get(i));
			EmployeeVo employeeVo = this.setEmployeeAttrFromElement(element);
			employeeVoList.add(employeeVo);
		}
		return employeeVoList;
	}
	
	private EmployeeVo setEmployeeAttrFromElement(Element element) {
		String employeeId = element.attribute("employeeId").getStringValue();
		String departmentIdEmployee = element.attribute("departmentIdEmployee").getStringValue();
		String employeePhone = element.attribute("employeePhone").getStringValue();
		String employeeIdnumber = element.attribute("employeeIdnumber").getStringValue();
		String employeeState = element.attribute("employeeState").getStringValue();
		String employeeNumber = element.attribute("employeeNumber").getStringValue();
		String employeeUsername = element.attribute("employeeUsername").getStringValue();
		String employeePassword = element.attribute("employeePassword").getStringValue();
		
		EmployeeVo employeeVo = new EmployeeVo();
		employeeVo.setEmployeeId(employeeId);
		employeeVo.setDepartmentIdEmployee(departmentIdEmployee);
		employeeVo.setEmployeePhone(employeePhone);
		employeeVo.setEmployeeIdnumber(employeeIdnumber);
		employeeVo.setEmployeeState(employeeState);
		employeeVo.setEmployeeNumber(employeeNumber);
		employeeVo.setEmployeeUsername(employeeUsername);
		employeeVo.setEmployeePassword(employeePassword);
		
		return employeeVo;
	}
	
	public void resetAttribute() {
		XMLWriter writer = null;
		try {
			String path = InitXMLResolve.class.getClassLoader().getResource("init.xml").getPath();
			writer = new XMLWriter(new FileWriter(path));
			writer.write(document);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			if(writer != null)
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
					throw new RuntimeException(e);
				}
		}
	}

	public static void main(String[] args) {
		InitXMLResolve initXMLResolve = new InitXMLResolve();
		boolean loaded = initXMLResolve.isLoaded();
		if(loaded) return;
		
		List<EmployeeVo> employeeList = initXMLResolve.getEmployeeXMLByXPathExpression();
		List<UserroleVo> userroleList = initXMLResolve.getUserroleXMLByXPathExpression();
		List<DepartmentVo> departmentList = initXMLResolve.getDepartmentXMLByXPathExpression();
		System.out.println(departmentList);
		initXMLResolve.rootElement.setAttributeValue("inited", "0");
		initXMLResolve.resetAttribute();
	}
}
