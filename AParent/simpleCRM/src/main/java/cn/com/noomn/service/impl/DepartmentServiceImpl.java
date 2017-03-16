package cn.com.noomn.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.noomn.mapper.dao.DepartmentMapper;
import cn.com.noomn.mapper.vo.DepartmentVoMapper;
import cn.com.noomn.mapper.vo.EmployeeVoMapper;
import cn.com.noomn.service.DepartmentService;
import cn.com.noomn.util.Infos;
import cn.com.noomn.util.Message;
import cn.com.noomn.util.TreeLeaf;
import cn.com.noomn.vo.DepartmentVo;
import cn.com.noomn.vo.EmployeeVo;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentVoMapper departmentVoMapper;
	@Autowired
	private DepartmentMapper departmentMapper;
	@Autowired
	private EmployeeVoMapper employeeVoMapper;
	
	@Override
	public String selectDepartmentJson() {
		//从数据库取数据
		List<DepartmentVo> departmentVoList = departmentVoMapper.selectDepartmentAndEmployee(null);
		
		//tree数据源list
		List<TreeLeaf> treeDatasourceList = new ArrayList<TreeLeaf>();
		
		//根节点
		TreeLeaf treeLeaf = new TreeLeaf();
		treeLeaf.setId("root");
		treeLeaf.setpId("root");
		treeLeaf.setName("crm");
		treeLeaf.setOpen(true);
		treeDatasourceList.add(treeLeaf);
		
		//子节点
		for(int i=0; i<departmentVoList.size(); i++) {
			DepartmentVo departmentVo = departmentVoList.get(i);
			TreeLeaf treeLeaf2 = new TreeLeaf();
			treeLeaf2.setId(departmentVo.getDepartmentId());
			treeLeaf2.setpId(treeLeaf.getId());
			treeLeaf2.setName(departmentVo.getDepartmentName());
			treeDatasourceList.add(treeLeaf2);
			
			List<EmployeeVo> employeeVoList = departmentVo.getEmployeeVoList();
			int size = employeeVoList.size();
			int j = 0;
			while(j<size) {
				EmployeeVo employeeVo = employeeVoList.get(j);
				TreeLeaf treeLeaf3 = new TreeLeaf();
				treeLeaf3.setId(employeeVo.getEmployeeId());
				treeLeaf3.setpId(treeLeaf2.getId());
				treeLeaf3.setName(employeeVo.getEmployeeRealName());
				treeDatasourceList.add(treeLeaf3);
				j++;
			}
		}
		
		//转化为json字符串
		net.sf.json.JSONArray treeDataSource = net.sf.json.JSONArray.fromObject(treeDatasourceList);
		return treeDataSource.toString();
	}

	@Override
	public List<DepartmentVo> selectDepartmentList(DepartmentVo departmentVo) {
		//从数据库取数据
		List<DepartmentVo> departmentVoList = departmentVoMapper.selectForNimble(departmentVo);
		return departmentVoList;
	}

	@Override
	public List<DepartmentVo> selectDepartmentAndEmployee(
			DepartmentVo departmentVo) {
		return departmentVoMapper.selectDepartmentAndEmployee(departmentVo);
	}

	@Override
	public Infos deleteDepartmentById(DepartmentVo departmentVo) {
		EmployeeVo employeeVo = new EmployeeVo();
		employeeVo.setDepartmentIdEmployee(departmentVo.getDepartmentId());

		try {
			employeeVo = employeeVoMapper.selectForNimble(employeeVo);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		Infos infos = Infos.getInfosInstance();
		if(employeeVo != null) {
			infos.message = Message.ERROR;
			infos.obj = "部门已被使用，无法删除";
			return infos;
		}
		int deleteCount = departmentMapper.deleteByPrimaryKey(departmentVo.getDepartmentId());
		if(deleteCount == 0) {
			infos.message = Message.ERROR;
			infos.obj = "删除失败，请重试";
			return infos;
		}
		infos.message = Message.SUCCESS;
		infos.obj = "删除成功";
		return infos;
	}

	@Override
	public Infos updateDepartment(DepartmentVo departmentVo) {
		int updateCount = departmentMapper.updateByPrimaryKeySelective(departmentVo);
		Infos infos = Infos.getInfosInstance();
		if(updateCount == 1) {
			infos.setMessage(Message.SUCCESS);
			infos.setObj("编辑部门成功");
			return infos;
		}
		infos.setMessage(Message.ERROR);
		infos.setObj("编辑部门失败");
		return infos;
	}

	@Override
	public Infos insertDepartment(DepartmentVo departmentVo) {
		int insertCount = departmentMapper.insertSelective(departmentVo);
		Infos infos = Infos.getInfosInstance();
		if(insertCount == 1) {
			infos.setMessage(Message.SUCCESS);
			infos.setObj("添加部门成功");
			return infos;
		}
		infos.setMessage(Message.ERROR);
		infos.setObj("编辑部门失败");
		return infos;
	}

	@Override
	public Infos deleteDepartmentList(List<DepartmentVo> departmentVoList) {
		List<String> departmentIdUsed = departmentVoMapper.selectBeUsedDepartmentId();
		List<DepartmentVo> departmentNeedDelete = new ArrayList<DepartmentVo>();
		for(int i=0; i<departmentVoList.size(); i++) {
			String departmentId = departmentVoList.get(i).getDepartmentId();
			boolean isContains = departmentIdUsed.contains(departmentId);
			if(isContains) continue;
			else departmentNeedDelete.add(departmentVoList.get(i));
		}
		
		int deleteCount = departmentVoMapper.deleteDepartmentListByPrimaryKey(departmentNeedDelete);
		Infos infos = Infos.getInfosInstance();
		if(deleteCount == 0) {
			infos.message = Message.ERROR;
			infos.obj = "删除失败";
		}else if(deleteCount == departmentVoList.size()) {
			infos.message = Message.SUCCESS;
			infos.obj = "删除成功";
		}else {
			infos.message = Message.WARN;
			infos.obj = "成功删除" + deleteCount +"条，删除失败" + (departmentVoList.size()-deleteCount) + "条";
		}
		return infos;
	}
}
