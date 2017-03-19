package cn.com.noomn.service;

import java.util.List;

import cn.com.noomn.util.Infos;
import cn.com.noomn.vo.DepartmentVo;

public interface DepartmentService {

	/**
	 * 获取部门信息
	 * @return
	 */
	public String selectDepartmentJson();
	
	/**
	 * 获取部门列表
	 * @return
	 */
	public List<DepartmentVo> selectDepartmentList(DepartmentVo departmentVo);
	
	/**
	 * 获取部门信息以及部门员工信息
	 * @param departmentVo
	 * @return
	 */
	public List<DepartmentVo> selectDepartmentAndEmployee(cn.com.noomn.vo.DepartmentVo departmentVo);
	
	/**
	 * 根据Id删除
	 * @param departmentVo
	 * @return
	 */
	public Infos deleteDepartmentById(cn.com.noomn.vo.DepartmentVo departmentVo);
	
	/**
	 * 更新一个部门
	 * @param departmentVo
	 * @return
	 */
	public Infos updateDepartment(cn.com.noomn.vo.DepartmentVo departmentVo);
	
	/**
	 * 添加一个部门
	 * @param departmentVo
	 * @return
	 */
	public Infos insertDepartment(cn.com.noomn.vo.DepartmentVo departmentVo);
	
	/**
	 * 删除部门
	 * @param departmentVo
	 * @return
	 */
	public Infos deleteDepartmentList(List<cn.com.noomn.vo.DepartmentVo> departmentVoList);
	
	/**
	 * 初始化部门表
	 * @return
	 */
	public Infos initDepartment();
}
