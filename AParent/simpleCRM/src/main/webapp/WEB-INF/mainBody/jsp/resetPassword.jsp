<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container-fluid">

	<div class="row-fluid">
		<div class="span12">

			<h3 class="page-title">修改密码</h3>
			<ul class="breadcrumb">
				<li><a href="#">个人资料</a> <span class="divider">/</span></li>
				<li><a href="#">修改密码</a> <span class="divider">/</span></li>
			</ul>

		</div>
	</div>

	<div class="row-fluid">
		<div class="span12">
			<div class="widget box green">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 修改密码
					</h4>
				</div>
				<div class="widget-body">
					<form class="form-horizontal" action="#" data-resetPassword="resetPassword" onsubmit="return false;">
						<input type="hidden" name="employeeId" value="${employeeId}">
						<div id="pills" class="custom-wizard-pills">
							<div class="tab-content">
								<div class="tab-pane" id="pills-tab1">
									<h3>第一步</h3>
									<div class="control-group">
										<label class="control-label">原密码</label>
										<div class="controls">
											<input type="text" name="employeePassword1" class="span6"> 
											<span class="help-inline">请输入您的登录密码</span>
										</div>
									</div>
									<div class="control-group">
										<button class="btn btn-default" onclick="resetPasswordValidate();">下一步</button>
									</div>
									
								</div>
								<div class="tab-pane" id="pills-tab2">
									<h3>第二步</h3>
									<div class="control-group">
										<label class="control-label">新密码</label>
										<div class="controls">
											<input type="text" name="employeePassword2" class="span6" /> 
											<span class="help-inline">请输入新密码</span>
										</div>
									</div>
									<div class="control-group">
										<button class="btn" onclick="updatePassword();">保存</button>
									</div>
								</div>
								<div class="tab-pane" id="pills-tab3">
									<h3>密码修改成功</h3>
								</div>
								<ul class="pager wizard">
									<li class="hidden" ><a href="#pills-tab1" data-toggle="tab">第一步</a></li>
									<li class="hidden"><a href="#pills-tab2" data-toggle="tab">下一步</a></li>
									<li class="hidden"><a href="#pills-tab3" data-toggle="tab">完成</a></li>
								</ul>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>

<script>
	$(function() {
		$('a[href="#pills-tab1"]').click();
	})
</script>