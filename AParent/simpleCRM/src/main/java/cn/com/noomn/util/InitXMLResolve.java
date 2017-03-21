package cn.com.noomn.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import cn.com.noomn.vo.CustomRankVo;
import cn.com.noomn.vo.CustomStateVo;
import cn.com.noomn.vo.DepartmentVo;
import cn.com.noomn.vo.EmployeeVo;
import cn.com.noomn.vo.SalesStageVo;
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
		int departmentInit = Integer.valueOf(element.attribute("departmentInit").getStringValue());
		
		DepartmentVo departmentVo = new DepartmentVo();
		departmentVo.setDepartmentId(departmentId);
		departmentVo.setDepartmentName(departmentName);
		departmentVo.setDepartmentInit(departmentInit);
		
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
		String userroleIdEmployee = element.attribute("userroleIdEmployee").getStringValue();
		String employeeRealName = element.attribute("employeeRealName").getStringValue();
		String employeeNumber = element.attribute("employeeNumber").getStringValue();
		String employeeUsername = element.attribute("employeeUsername").getStringValue();
		String employeePassword = element.attribute("employeePassword").getStringValue();
		String employeeEmail = element.attribute("employeeEmail").getStringValue();
		String employeePhone = element.attribute("employeePhone").getStringValue();
		int employeeInit = Integer.valueOf(element.attribute("employeeInit").getStringValue());
		
		EmployeeVo employeeVo = new EmployeeVo();
		employeeVo.setEmployeeId(employeeId);
		employeeVo.setDepartmentIdEmployee(departmentIdEmployee);
		employeeVo.setUserroleIdEmployee(userroleIdEmployee);
		employeeVo.setEmployeeRealName(employeeRealName);
		employeeVo.setEmployeeNumber(employeeNumber);
		employeeVo.setEmployeeUsername(employeeUsername);
		employeeVo.setEmployeePassword(employeePassword);
		employeeVo.setEmployeeInit(employeeInit);
		employeeVo.setEmployeeEmail(employeeEmail);
		employeeVo.setEmployeePhone(employeePhone);
		
		return employeeVo;
	}
	
	/**
	 * xml客户级别
	 * @return
	 */
	public List<CustomRankVo> getCustomRankXMLByXPathExpression() {
		List<Node> selectNodes = document.selectNodes("//customRank");
		List<CustomRankVo> customRankVoList = new ArrayList<CustomRankVo>();
		for(int i=0; i<selectNodes.size(); i++) {
			Element element = ((Element)selectNodes.get(i));
			CustomRankVo customRankVo = this.setCustomRankAttrFromElement(element);
			customRankVoList.add(customRankVo);
		}
		return customRankVoList;
	}
	
	private CustomRankVo setCustomRankAttrFromElement(Element element) {
		String customRankId = element.attribute("customRankId").getStringValue();
		String customRankName = element.attribute("customRankName").getStringValue();
		
		CustomRankVo customRankVo = new CustomRankVo();
		customRankVo.setCustomRankId(customRankId);
		customRankVo.setCustomRankName(customRankName);
		
		return customRankVo;
	}
	
	/**
	 * xml客户状态
	 * @return
	 */
	public List<CustomStateVo> getCustomStateXMLByXPathExpression() {
		List<Node> selectNodes = document.selectNodes("//customState");
		List<CustomStateVo> customStateVoList = new ArrayList<CustomStateVo>();
		for(int i=0; i<selectNodes.size(); i++) {
			Element element = ((Element)selectNodes.get(i));
			CustomStateVo customStateVo = this.setCustomStateVoAttrFromElement(element);
			customStateVoList.add(customStateVo);
		}
		return customStateVoList;
	}
	
	private CustomStateVo setCustomStateVoAttrFromElement(Element element) {
		String customStateId = element.attribute("customStateId").getStringValue();
		String customStateName = element.attribute("customStateName").getStringValue();
		
		CustomStateVo customStateVo = new CustomStateVo();
		customStateVo.setCustomStateId(customStateId);
		customStateVo.setCustomStateName(customStateName);
		
		return customStateVo;
	}
	
	/**
	 * xml销售阶段
	 * @return
	 */
	public List<SalesStageVo> getSalesStageXMLByXPathExpression() {
		List<Node> selectNodes = document.selectNodes("//salesStage");
		List<SalesStageVo> salesStageVoList = new ArrayList<SalesStageVo>();
		for(int i=0; i<selectNodes.size(); i++) {
			Element element = ((Element)selectNodes.get(i));
			SalesStageVo salesStageVo = this.setSalesStageVoAttrFromElement(element);
			salesStageVoList.add(salesStageVo);
		}
		return salesStageVoList;
	}
	
	private SalesStageVo setSalesStageVoAttrFromElement(Element element) {
		String salesStageId = element.attribute("salesStageId").getStringValue();
		String salesStageName = element.attribute("salesStageName").getStringValue();
		int rateOfProgress = Integer.valueOf(element.attribute("rateOfProgress").getStringValue());
		
		SalesStageVo salesStageVo = new SalesStageVo();
		salesStageVo.setSalesStageId(salesStageId);
		salesStageVo.setSalesStageName(salesStageName);
		salesStageVo.setRateOfProgress(rateOfProgress);
		
		return salesStageVo;
	}

	public static void main(String[] args) {
		InitXMLResolve initXMLResolve = new InitXMLResolve();
		
		List<EmployeeVo> employeeList = initXMLResolve.getEmployeeXMLByXPathExpression();
		List<UserroleVo> userroleList = initXMLResolve.getUserroleXMLByXPathExpression();
		List<DepartmentVo> departmentList = initXMLResolve.getDepartmentXMLByXPathExpression();
	}
}
