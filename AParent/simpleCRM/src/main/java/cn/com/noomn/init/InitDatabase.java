package cn.com.noomn.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import cn.com.noomn.service.AuthorityService;

public class InitDatabase implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private cn.com.noomn.util.ResolveXMLUtil resolveXMLUtil;
	
	@Autowired
	private AuthorityService authorityService;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if(event.getApplicationContext().getParent() == null) {
			System.err.println("容器初始化结束 =============================");
			authorityService.initAuthority();
			System.err.println("权限表初始化结束============================");
		}
	}

}
