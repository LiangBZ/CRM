package cn.com.noomn.init;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import cn.com.noomn.service.AuthorityService;
import cn.com.noomn.util.InitXMLResolve;
import cn.com.noomn.vo.DepartmentVo;
import cn.com.noomn.vo.EmployeeVo;
import cn.com.noomn.vo.UserroleVo;

public class InitDatabase implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private cn.com.noomn.util.AuthorityXMLResolveUtil resolveXMLUtil;
	@Autowired
	private InitXMLResolve initXMLResolve;
	
	@Autowired
	private AuthorityService authorityService;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if(event.getApplicationContext().getParent() == null) {
			System.err.println("容器初始化结束 =============================");
			authorityService.initAuthority();
			System.err.println("权限表初始化结束============================");
			List<EmployeeVo> employeeXMLByXPathExpression = initXMLResolve.getEmployeeXMLByXPathExpression();
			System.out.println(employeeXMLByXPathExpression);
			List<DepartmentVo> departmentXMLByXPathExpression = initXMLResolve.getDepartmentXMLByXPathExpression();
			System.out.println(departmentXMLByXPathExpression);
			List<UserroleVo> userroleXMLByXPathExpression = initXMLResolve.getUserroleXMLByXPathExpression();
			System.out.println(userroleXMLByXPathExpression);
		}
	}

}
