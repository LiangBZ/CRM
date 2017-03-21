package cn.com.noomn.mapper.vo;

import java.util.List;

import cn.com.noomn.util.Infos;
import cn.com.noomn.vo.EmployeeVo;

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
	 * @return
	 */
	List<cn.com.noomn.vo.EmployeeVo> selectForNimble(final cn.com.noomn.vo.EmployeeVo employeeVo);
	
	/**
	 * 查询已经存在的EmployeeVoId
	 * @return
	 */
	List<String> selectEmployeeVoId();
	
	/**
	 * 通过EmployeeVo的条件查询(角色  right join 员工  left join 部门)信息
	 * @return
	 */
	List<EmployeeVo> selectRoleRightEmployeeLeftDepartment(final EmployeeVo employeeVo);
	
	/**
	 * 查找最大的员工号
	 * @return
	 */
	int selectMaxEmployeeNumber();
	
}