<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container-fluid">

	<div class="row-fluid">
		<div class="span12">

			<h3 class="page-title">成员信息</h3>
			<ul class="breadcrumb">
				<li><a href="#">成员管理</a> <span class="divider">/</span></li>
				<li class="active">成员信息</li>
				<span class="divider">/</span>
				</li>
			</ul>

		</div>
	</div>

	<!-- 员工列表 begin -->
	<div class="row-fluid" data-member="information">
		<div class="span12">
			<div class="widget orange">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 成员信息
					</h4>
				</div>
				<div class="widget-body">
					<div style="min-height: 360px;">
						<!-- 编辑处理 -->

						<c:if test="${authorityMap['b3184bfb-0bfc-11e7-9e9d-28d2444b860a'] eq 1}">
							<div class="clearfix">
								<div class="btn-group">
									<button class="btn green" onclick="showAddMember('${pageContext.request.contextPath}/mainBodys/getDepartmentVoList')">
										员工入职 <i class="icon-plus"></i>
									</button>
								</div>
							</div>
						</c:if>

						<table
							class="table table-striped table-advance table-bordered table-hover"
							data-table="memberInformation">
							<thead>
								<th>员工名称</th>
								<th>员工号</th>
								<th>所属部门</th>
								<th>角色</th>
								<th>手机</th>
								<th style="width:6%;">查看</th>
								<c:if test="${authorityMap['e23df149-1686-11e7-a0f7-94de80188a22'] eq 1}">
									<th style="width:6%;">编辑</th>
								</c:if>
							</thead>
							<tbody>
								<tr class="odd gradex">
									<td>梁伯昭</td>
									<td>0001</td>
									<td>总裁办</td>
									<td>管理员</td>
									<td>15605925286</td>
									<td>
										<button class="btn btn-success">
											<i class="icon-tags"></i>
										</button>
									</td>
									<td>
										<button class="btn btn-primary">
											<i class="icon-pencil"></i>
										</button>
									</td>
								</tr>
								<tr class="odd gradex">
									<td>黄志彦</td>
									<td>0004</td>
									<td>总裁办</td>
									<td>总经理</td>
									<td>15692837619</td>
									<td>
										<button class="btn btn-success">
											<i class="icon-tags"></i>
										</button>
									</td>
									<td>
										<button class="btn btn-primary">
											<i class="icon-pencil"></i>
										</button>
									</td>
								</tr>
							</tbody>
						</table>
						<!-- /编辑end -->

					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- /员工列表 /end -->

	<!-- 添加新员工 begin -->
	<div class="row-fluid" data-member="addMember">
		<div class="span12">

			<div class="widget green">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 员工入职
					</h4>
				</div>
				<div class="widget-body">

					<form action="#" class="form-horizontal" data-menberAdd="menberAdd" onsubmit="return false;">

						<div class="control-group">
							<label class="control-label">用户名</label>
							<div class="controls">
								<input name="employeeUsername" onblur="addRandom(this);" onfocus="removeRadom(this);" type="text" class="span6" required/> 
								<span class="help-inline">用于登录使用</span>
								<input type="hidden" data-isRadom="employeeUsername" value="0" />
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label">姓名</label>
							<div class="controls">
								<input name="employeeRealName" type="text" class="span6" required/> <span
									class="help-inline">请填写真实姓名</span>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label">邮箱</label>
							<div class="controls">
								<div class="input-prepend">
									<span class="add-on">@</span> 
									<input name="employeeEmail" type="email" placeholder="Email Address" required/>
								</div>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label">手机</label>
							<div class="controls">
								<input name="employeePhone" data-mask="99999999999" required type="text" class="span6" />
							</div>
						</div>

						<div class="control-group">
							<label class="control-label">部门</label>
							<div class="controls">
								<select name="departmentIdEmployee" required onchange="getAddEmployeeUserrole(this);"
									class="chzn-select-deselect span6" >
								</select>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label">角色</label>
							<div class="controls">
								<select name="userroleIdEmployee" required class="chzn-select-deselect span6" ></select>
							</div>
						</div>

						<div class="form-actions">
							<button type="submit" class="btn btn-success">保存</button>
							<button type="button" class="btn" onclick="refreshMemberInfos()">取消</button>
							<input type="reset" value="Reset" class="hidden"/>
						</div>
					</form>

				</div>
			</div>

		</div>
	</div>
	<!-- /添加新员工 /end -->
	
	<!-- 员工信息详情 begin -->
	<div class="row-fluid" data-member="showMember">
		<div class="span12">
				<div class="widget green">
					<div class="widget-title">
						<h4>
							<i class="icon-reorder"></i> 员工详情
						</h4>
					</div>
					<div class="widget-body">
						<div class="clearfix" style="margin-bottom: 20px;">
								<div class="btn-group">
									<button class="btn green" onclick="refreshMemberInfos()">
										返回 <i class="icon-plus"></i>
									</button>
								</div>
						</div>
						
						<form style="padding:10px;" action="#" class="form-horizontal" data-menberShow="menberShow" onsubmit="return false;">
							<div class="control-group">
								<label class="control-label">工号</label>
								<div class="controls">
									<input name="employeeNumber" type="text" class="span6" disabled/> 
								</div>
							</div>
							
							<div class="control-group">
								<label class="control-label">用户名</label>
								<div class="controls">
									<input name="employeeUsername" type="text" class="span6" disabled/> 
								</div>
							</div>
							
							<div class="control-group">
								<label class="control-label">姓名</label>
								<div class="controls">
									<input name="employeeRealName" type="text" class="span6" disabled/>
								</div>
							</div>
		
							<div class="control-group">
								<label class="control-label">邮箱</label>
								<div class="controls">
									<div class="input-prepend">
										<input name="employeeEmail" type="email" disabled/>
									</div>
								</div>
							</div>
		
							<div class="control-group">
								<label class="control-label">手机</label>
								<div class="controls">
									<input name="employeePhone" disabled type="text" class="span6" />
								</div>
							</div>
							
							<div class="control-group">
								<label class="control-label">部门</label>
								<div class="controls">
									<input name="departmentName" disabled type="text" class="span6" />
								</div>
							</div>
							
							<div class="control-group">
								<label class="control-label">职务</label>
								<div class="controls">
									<input name="userroleName" disabled type="text" class="span6" />
								</div>
							</div>
							
						</form>
					</div>
				</div>
			
		</div>
	</div>
	<!-- /员工信息详情 /end -->
	
	<!-- 编辑员工信息 begin -->
	<div class="row-fluid" data-member="editMember">
		<div class="span12">

			<div class="widget green">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 编辑员工信息
					</h4>
				</div>
				<div class="widget-body">

					<form action="#" class="form-horizontal" data-menberEdit="menberEdit" onsubmit="return false;">
						<input name="employeeId" type="hidden"/> 
						<div class="control-group">
							<label class="control-label">用户名</label>
							<div class="controls">
								<input name="employeeUsername" type="text" class="span6" required disabled/> 
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label">姓名</label>
							<div class="controls">
								<input name="employeeRealName" type="text" class="span6" disabled/>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label">邮箱</label>
							<div class="controls">
								<div class="input-prepend">
									<span class="add-on">@</span> 
									<input name="employeeEmail" type="email" placeholder="Email Address" required/>
								</div>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label">手机</label>
							<div class="controls">
								<input name="employeePhone" data-mask="99999999999" required type="text" class="span6" />
							</div>
						</div>

						<div class="control-group">
							<label class="control-label">部门</label>
							<div class="controls">
								<select name="departmentIdEmployee" required onchange="getEditEmployeeUserrole(this);"
									class="chzn-select-deselect span6" >
								</select>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label">角色</label>
							<div class="controls">
								<select name="userroleIdEmployee" required
									class="chzn-select-deselect span6" >
									<option value="57695387-0987-11e7-b918-28d2444b860a">销售人员</option>
									<option value="5e8d627f-0987-11e7-b918-28d2444b860a">部门经理</option>
									<c:if test="${authorityMap['b7b79e68-0beb-11e7-9e9d-28d2444b860a'] eq 1}">
										<option value="6566dff0-0987-11e7-b918-28d2444b860a">总经理</option>
									</c:if>
								</select>
							</div>
						</div>

						<div class="form-actions">
							<button type="submit" class="btn btn-success">保存</button>
							<button type="button" class="btn" onclick="refreshMemberInfos()">取消</button>
							<input type="reset" value="Reset" class="hidden"/>
						</div>
					</form>

				</div>
			</div>

		</div>
	</div>
	<!-- /编辑员工信息 /end -->
	
</div>

<script type="text/javascript">
	$(function() {
		//初始化表格 
		initMemberInformationTable("${pageContext.request.contextPath}/mainBodys/getEmployeeVoList");
	})
</script>
