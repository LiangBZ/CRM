package cn.com.noomn.service;

import java.util.List;

import cn.com.noomn.util.Infos;
import cn.com.noomn.vo.EmployeeVo;

public interface EmployeeVoService {
	
	/**
	 * 初始化用户表
	 * @return
	 */
	public Infos initEmployeeVo();
	
	/**
	 * 获取所有员工的信息
	 */
	public List<EmployeeVo> getAllEmployeeVo();
	
	/**
	 * 获得一个员工的详细信息
	 * @param employeeVo
	 * @return
	 */
	public EmployeeVo getOneEmployeeVo(EmployeeVo employeeVo);
	
	/**
	 * 添加新员工
	 * @return
	 */
	public Infos insertEmployeeVo(EmployeeVo employeeVo);
	
	/**
	 * 更新员工信息
	 * @param employeeVo
	 * @return
	 */
	public Infos updateEmployeeVo(EmployeeVo employeeVo);
	
	/**
	 * 根据已有的条件来查询
	 * @param employeeVo
	 * @return
	 */
	public List<EmployeeVo> selectForNimble(EmployeeVo employeeVo);
	
	/**
	 * 获取可以选择的跟进人
	 * @param employeeVo
	 * @return
	 */
	public List<EmployeeVo> selectcanChooseFoller(EmployeeVo employeeVo);
}
