<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container-fluid">

	<div class="row-fluid">
		<div class="span12">

			<h3 class="page-title">职务权限</h3>
			<ul class="breadcrumb">
				<li><a href="#">成员管理</a> <span class="divider">/</span></li>
				<li class="active">职务权限</li>
				<span class="divider">/</span>
				</li>
			</ul>

		</div>
	</div>

	<div class="row-fluid">
		<div class="span12">

			<div class="widget green">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 权限设置
					</h4>
				</div>
				<div class="widget-body">

					<div class="row-fluid">
						<div class="span12">

							<div class="tabbable custom-tab tabs-left">

								<ul class="nav nav-tabs tabs-left">
									<li><a href="#tab2" data-toggle="tab"
										onclick="getAllAuthorityManager('${pageContext.request.contextPath}/mainBodys/getAllAuthorityManager','5e8d627f-0987-11e7-b918-28d2444b860a');">部门经理</a></li>
									<li><a href="#tab3" data-toggle="tab"
										onclick="getAllAuthorityManager('${pageContext.request.contextPath}/mainBodys/getAllAuthorityManager','57695387-0987-11e7-b918-28d2444b860a');">销售人员</a></li>
								</ul>
								<div class="tab-content"
									style="min-height: 200px; padding: 15px; padding-top: 10px;">
									<div class="tab-pane" id="tab2"
										data-tab="5e8d627f-0987-11e7-b918-28d2444b860a">
										<div class="clearfix">
											<div class="btn-group">
												<button
													onclick="saveAuthority(this, '${pageContext.request.contextPath}/mainBodys/updateUserroleAuthority')"
													data-userroleId="5e8d627f-0987-11e7-b918-28d2444b860a"
													data-tabId="#tab2" class="btn green">
													保存 <i class="icon-film"></i>
												</button>
											</div>
										</div>
										<div class="space7"></div>
										<table
											class="table table-striped table-bordered table-advance table-hover">
											<thead>
												<tr>
													<th></th>
													<th><i class="icon-star"></i>权限名称</th>
													<th><i class="icon-question-sign"></i>权限描述</th>
													<th><i class="icon-edit"></i>编辑</th>
												</tr>
											</thead>
											<tbody></tbody>
										</table>

										<div class="space7"></div>

										<p>
											&nbsp;按钮使用说明： &nbsp; <i class="icon-film"></i> : 保存更改
											&nbsp;&nbsp;&nbsp; <i class="icon-ok"></i> : 选中权限
											&nbsp;&nbsp;&nbsp; <i class="icon-trash"></i> : 取消权限
										</p>

									</div>
									<div class="tab-pane" id="tab3"
										data-tab="57695387-0987-11e7-b918-28d2444b860a">
										<div class="clearfix">
											<div class="btn-group">
												<button
													onclick="saveAuthority(this, '${pageContext.request.contextPath}/mainBodys/updateUserroleAuthority')"
													data-userroleId="57695387-0987-11e7-b918-28d2444b860a"
													data-tabId="#tab3" class="btn green">
													保存 <i class="icon-film"></i>
												</button>
											</div>
										</div>
										<div class="space7"></div>
										<table
											class="table table-striped table-bordered table-advance table-hover">
											<thead>
												<tr>
													<th></th>
													<th><i class="icon-star"></i>权限名称</th>
													<th><i class="icon-question-sign"></i>权限描述</th>
													<th><i class="icon-edit"></i>编辑</th>
												</tr>
											</thead>
											<tbody></tbody>
										</table>

										<div class="space7"></div>

										<p>
											&nbsp;按钮使用说明： &nbsp; <i class="icon-film"></i> : 保存更改
											&nbsp;&nbsp;&nbsp; <i class="icon-ok"></i> : 选中权限
											&nbsp;&nbsp;&nbsp; <i class="icon-trash"></i> : 取消权限
										</p>
									</div>
								</div>
							</div>

						</div>
						<div class="space10 visible-phone"></div>
					</div>
				</div>
			</div>

		</div>
	</div>
</div>

<script
	src="${pageContext.request.contextPath}/mainBody/js/jquery-ui-1.10.1.custom.min.js"
	type="text/javascript"></script>

<script>
	$(function() {
		$('a[href="#tab2"]').click();
	})
</script>