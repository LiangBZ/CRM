package cn.com.noomn.mapper.vo;

public interface EmployeeVoMapper {
	/**
	 * 登录验证
	 * @param cn.com.noomn.vo.EmployeeVo employeeVo
	 * @return cn.com.noomn.vo.EmployeeVo employeeVo
	 * @throws Exception
	 */
	cn.com.noomn.vo.EmployeeVo selectForlogin(final cn.com.noomn.vo.EmployeeVo employeeVo) throws Exception;

	/**
	 * 根据vo已经赋值的属性（所有已经赋值的属性）查询
	 * @param employeeVo
	 * @return employeeVo
	 * @throws Exception
	 */
	cn.com.noomn.vo.EmployeeVo selectForNimble(final cn.com.noomn.vo.EmployeeVo employeeVo) throws Exception;
}