package cn.com.noomn.service;

/**
 * 登录接口
 *
 */
public interface LoginsService {
	/**
	 * 登录查询
	 * @param cn.com.noomn.vo.EmployeeVo
	 * @return cn.com.noomn.vo.EmployeeVo
	 * @throws Exception
	 */
	boolean selectForlogin(final cn.com.noomn.vo.EmployeeVo employeeVo);
	
	/**
	 * 查询员工信息
	 * @param employeeVo
	 * @return
	 * @throws Exception
	 */
	cn.com.noomn.vo.EmployeeVo selectEmployee(final cn.com.noomn.vo.EmployeeVo employeeVo);
}
