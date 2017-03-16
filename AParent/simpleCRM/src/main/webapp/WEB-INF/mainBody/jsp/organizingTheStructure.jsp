<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<div class="container-fluid">

	<div class="row-fluid">
		<div class="span12">

			<h3 class="page-title">组织结构</h3>
			<ul class="breadcrumb">
				<li><a href="#">成员管理</a> <span class="divider">/</span></li>
				<li class="active">组织结构</li>
				<span class="divider">/</span>
				</li>
			</ul>

		</div>
	</div>


	<div class="row-fluid">
		<div class="span3">
			<div class="widget">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i>组织结构
					</h4>
				</div>
				<div class="widget-body">
					<div style="min-height: 360px;">
						<ul id="treeDemo" class="ztree" style="margin-top: 0; width: 100%; height: auto;"></ul>
					</div>
				</div>
			</div>
		</div>
		<div class="span9">
			<div class="widget">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i>详情
					</h4>
				</div>
				<div class="widget-body">
					<div style="min-height: 360px;">
					<!-- 编辑处理 -->
					
						<div class="clearfix">
							<div class="btn-group">
								<button id="editable-sample_new" class="btn green" onclick='addDepartment();'>
									添加部门 <i class="icon-plus"></i>
								</button>
							</div>
							<div class="btn-group">
								<button id="editable-sample_new" class="btn green" onclick='deleteDepartmentList(this, "${pageContext.request.contextPath}/mainBodys/deleteDepartmentVoList");'>
									删除部门 <i class="icon-plus"></i>
								</button>
							</div>
						</div>
						
						
						<table class="table table-striped table-bordered" data-table="organizingTable">
                       		 <thead>
                                <tr>
                                    <th style="width:8px;"></th>
                                    <th>部门名称</th>
                                    <th>员工数量</th>
                                    <th>添加员工</th>
                                    <th>编辑部门</th>
                                    <th>删除部门</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr class="odd gradex">
                                    <td><input type="checkbox" class="checkboxes" value="1"/></td>
                                    <td>技术部</td>
                                    <td><span class="label label-success">10</span></td>
                               		<td><a href="javascript:void(0);">添加员工</a></td>
                                    <td><a href="javascript:void(0);">编辑部门</a></td>
                                    <td><a href="javascript:void(0);">删除部门</a></td>
                                </tr>
                                 <tr class="odd gradex">
                                    <td><input type="checkbox" class="checkboxes" value="1"/></td>
                                    <td>人事部</td>
                                    <td class="hidden-phone"><span class="label label-success">50</span></td>
                                	<td><a href="javascript:void(0);">添加员工</a></td>
                                    <td><a href="javascript:void(0);">编辑部门</a></td>
                                    <td><a href="javascript:void(0);">删除部门</a></td>
                                </tr>
                                <tr class="odd gradex">
                                    <td><input type="checkbox" class="checkboxes" value="1"/></td>
                                    <td>离职员工</td>
                                    <td class="hidden-phone"><span class="label label-inverse">0</span></td>
                                	<td><a href="javascript:void(0);">添加员工</a></td>
                                    <td><a href="javascript:void(0);">编辑部门</a></td>
                                    <td><a href="javascript:void(0);">删除部门</a></td>
                                </tr>
                                <tr class="odd gradex">
                                    <td><input type="checkbox" class="checkboxes" value="1"/></td>
                                    <td>woeri</td>
                                    <td class="hidden-phone"><span class="label label-success">30</span></td>
                                	<td><a href="javascript:void(0);">添加员工</a></td>
                                    <td><a href="javascript:void(0);">编辑部门</a></td>
                                    <td><a href="javascript:void(0);">删除部门</a></td>
                                </tr>
                                <tr class="odd gradex">
                                    <td><input type="checkbox" class="checkboxes" value="1"/></td>
                                    <td>soa bal</td>
                                    <td class="hidden-phone"><span class="label label-inverse">0</span></td>
                                	<td><a href="javascript:void(0);">添加员工</a></td>
                                    <td><a href="javascript:void(0);">编辑部门</a></td>
                                    <td><a href="javascript:void(0);">删除部门</a></td>
                                </tr>
                                <tr class="odd gradex">
                                    <td><input type="checkbox" class="checkboxes" value="1"/></td>
                                    <td>woeri</td>
                                    <td class="hidden-phone"><span class="label label-success">20</span></td>
                                	<td><a href="javascript:void(0);">添加员工</a></td>
                                    <td><a href="javascript:void(0);">编辑部门</a></td>
                                    <td><a href="javascript:void(0);">删除部门</a></td>
                                </tr>
                                <tr class="odd gradex">
                                    <td><input type="checkbox" class="checkboxes" value="1"/></td>
                                    <td>uirer</td>
                                    <td class="hidden-phone"><span class="label label-warning">80</span></td>
                                	<td><a href="javascript:void(0);">添加员工</a></td>
                                    <td><a href="javascript:void(0);">编辑部门</a></td>
                                    <td><a href="javascript:void(0);">删除部门</a></td>
                                </tr>
                                <tr class="odd gradex">
                                    <td><input type="checkbox" class="checkboxes" value="1"/></td>
                                    <td>samsu</td>
                                    <td class="hidden-phone"><span class="label label-success">40</span></td>
                                	<td><a href="javascript:void(0);">添加员工</a></td>
                                    <td><a href="javascript:void(0);">编辑部门</a></td>
                                    <td><a href="javascript:void(0);">删除部门</a></td>
                                </tr>
                                <tr class="odd gradex">
                                    <td><input type="checkbox" class="checkboxes" value="1"/></td>
                                    <td>jhone doe</td>
                                    <td class="hidden-phone"><span class="label label-success">32</span></td>
                                	<td><a href="javascript:void(0);">添加员工</a></td>
                                    <td><a href="javascript:void(0);">编辑部门</a></td>
                                    <td><a href="javascript:void(0);">删除部门</a></td>
                                </tr>
                                <tr class="odd gradex">
                                    <td><input type="checkbox" class="checkboxes" value="1"/></td>
                                    <td>jhone doe</td>
                                    <td class="hidden-phone"><span class="label label-success">25</span></td>
                                	<td><a href="javascript:void(0);">添加员工</a></td>
                                    <td><a href="javascript:void(0);">编辑部门</a></td>
                                    <td><a href="javascript:void(0);">删除部门</a></td>
                                </tr>
                                <tr class="odd gradex">
                                    <td><input type="checkbox" class="checkboxes" value="1"/></td>
                                    <td>jhone doe</td>
                                    <td class="hidden-phone"><a
                                    <td class="hidden-phone"><span class="label label-success">15</span>
                                    <td><a href="javascript:void(0);">添加员工</a></td>
                                    <td><a href="javascript:void(0);">编辑部门</a></td>
                                    <td><a href="javascript:void(0);">删除部门</a></td>
                                </tr>
                            </tbody>
                         </table>
						
					<!-- /编辑end -->
					
				</div>
			</div>
		</div>
	</div>


	<script type="text/javascript">
		$(function() {
			//初始化树
			initTree("${pageContext.request.contextPath}/mainBodys/getTreeJson","${pageContext.request.contextPath}/mainBodys/getDepartmentVoDataArray");
			
			//初始化表格 
			script("${pageContext.request.contextPath}/mainBodys/getDepartmentVoDataArray","${pageContext.request.contextPath}/mainBodys/getTreeJson");
		 })
		 
	</script>
	
 
 
