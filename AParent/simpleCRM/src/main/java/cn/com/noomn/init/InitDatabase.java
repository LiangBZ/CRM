package cn.com.noomn.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import cn.com.noomn.service.AuthorityService;
import cn.com.noomn.service.DepartmentService;
import cn.com.noomn.service.EmployeeVoService;
import cn.com.noomn.service.UserroleAuthorityVoService;
import cn.com.noomn.service.UserroleVoService;
import cn.com.noomn.util.Infos;

public class InitDatabase implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private AuthorityService authorityService;
	@Autowired
	private UserroleVoService userroleVoService;
	@Autowired
	private EmployeeVoService employeeVoService;
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private UserroleAuthorityVoService userroleAuthorityVoService;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if(event.getApplicationContext().getParent() == null) {
			System.err.println("容器初始化 /end =============================");
			System.err.println("权限表初始化 begin ============================");
			authorityService.initAuthority();
			System.err.println("权限表初始化 /end ============================");
			
			System.err.println("角色表初始化 begin ============================");
			Infos initUserroleVo = userroleVoService.initUserroleVo();
			System.err.println(initUserroleVo.obj);
			System.err.println("角色表初始化 /end ============================");
			
			System.err.println("部门表初始化 begin ============================");
			Infos initDepartment = departmentService.initDepartment();
			System.err.println(initDepartment.obj);
			System.err.println("部门表初始化 /end ============================");
			
			System.err.println("人员表初始化 begin ============================");
			Infos initEmployeeVo = employeeVoService.initEmployeeVo();
			System.err.println(initEmployeeVo.obj);
			System.err.println("人员表初始化 /end ============================");
			
			System.err.println("角色-权限 表初始化 begin ============================");
			Infos initUserroleAuthorityVo = userroleAuthorityVoService.initUserroleAuthorityVo();
			System.err.println(initUserroleAuthorityVo.obj);
			System.err.println("角色-权限 表初始化 /end ============================");
		}
	}

}
