package cn.com.noomn.mapper.vo;

import java.util.List;

import cn.com.noomn.vo.DepartmentVo;

public interface DepartmentVoMapper {
	
	/**
	 * 根据已有属性值查询
	 * @return
	 */
	List<DepartmentVo> selectForNimble(DepartmentVo departmentVo);
	
	/**
	 * 根据部门id查询部门信息和部门的员工信息
	 * @param departmentVo
	 * @return
	 */
	List<DepartmentVo> selectDepartmentAndEmployee(DepartmentVo departmentVo);
	
	/**
	 * 根据部门id删除部门
	 * @param departmentVoList
	 * @return
	 */
	int deleteDepartmentListByPrimaryKey(List<DepartmentVo> departmentVoList);
	
	/**
	 * 获取已经被使用的部门id
	 * @return
	 */
	List<String> selectBeUsedDepartmentId();
	
	/**
	 * 获取已经存在的DepartmentId
	 * @return
	 */
	List<String> selectDepartmentId();
}