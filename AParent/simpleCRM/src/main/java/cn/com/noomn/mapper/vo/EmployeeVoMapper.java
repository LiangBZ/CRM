package cn.com.noomn.mapper.vo;

public interface EmployeeVoMapper {
	/**
	 * 登录验证
	 * @param cn.com.noomn.vo.EmployeeVo employeeVo
	 * @return cn.com.noomn.vo.EmployeeVo employeeVo
	 * @throws Exception
	 */
	cn.com.noomn.vo.EmployeeVo selectForlogin(final cn.com.noomn.vo.EmployeeVo employeeVo) throws Exception;
}