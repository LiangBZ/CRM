package cn.com.noomn.service;

import cn.com.noomn.util.Infos;

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
	
	/**
	 * 发送邮件
	 * @param employeeVo
	 * @return
	 */
	Infos sendEmail(final cn.com.noomn.vo.EmployeeVo employeeVo);
	
	/**
	 * 根据主键更新
	 * @param employeeVo
	 * @return
	 */
	int updateEmployeeByPrimaryKey(final cn.com.noomn.vo.EmployeeVo employeeVo);
}
