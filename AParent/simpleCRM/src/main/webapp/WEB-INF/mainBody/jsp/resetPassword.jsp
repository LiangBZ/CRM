<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
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
						<i class="icon-reorder"></i> 三个步骤
					</h4>
				</div>
				<div class="widget-body">
					<form class="form-horizontal" action="#" data-resetPassword="resetPassword">
						<input type="hidden" name="employeeId" value="${employeeId}">
						<input type="hidden" name="doNext" value="0">
						<div id="pills" class="custom-wizard-pills">
							<ul>
								<li data-action="resetPasswordValidate" ><a href="#pills-tab1" data-toggle="tab" data-show="0">1、输入原密码</a></li>
								<li data-action="updatePassword" ><a href="#pills-tab2" data-toggle="tab" data-show="0">2、输入新密码</a></li>
								<li><a href="#pills-tab3" data-toggle="tab" data-show="0">3、修改成功</a></li>
							</ul>
							<div class="progress progress-success progress-striped active">
								<div class="bar"></div>
							</div>
							<div class="tab-content">
								<div class="tab-pane" id="pills-tab1">
									<h3>第一步</h3>
									<div class="control-group">
										<label class="control-label">原密码</label>
										<div class="controls">
											<input type="password" name="employeePassword1" class="span6"> 
											<span class="help-inline">请输入登录本系统的密码</span>
										</div>
									</div>
								</div>
								<div class="tab-pane" id="pills-tab2">
									<h3>第二步</h3>
									<div class="control-group">
										<label class="control-label">新密码</label>
										<div class="controls">
											<input type="password" name="employeePassword2" class="span6" /> 
											<span class="help-inline">请输入新的密码</span>
										</div>
									</div>
									<div class="control-group">
										<label class="control-label">确认密码</label>
										<div class="controls">
											<input type="password" name="employeePassword3" class="span6" />  
											<span class="help-inline">请再次输入新的密码</span>
										</div>
									</div>
								</div>
								<div class="tab-pane" id="pills-tab3">
									<h3>第三步</h3>
									<h2>密码修改成功！</h2>
								</div>
								<ul class="pager wizard">
									<li class="previous first"><a href="javascript:;">第一步</a></li>
									<li class="previous"><a href="javascript:;">上一步</a></li>
									<li class="next"><a href="javascript:;" onclick="doAction();">下一步</a></li>
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
		
		$('a[data-toggle="tab"]').data("show","1");
		$('#pills').bootstrapWizard({
			'tabClass' : 'nav nav-pills',
			'debug' : false,
			onTabShow : function(tab, navigation, index) {
				var isShow = $('a[data-toggle="tab"]').data("show");
				if(isShow == 0) {
					return;
				}
				var $total = navigation.find('li').length;
				var $current = index + 1;
				var $percent = ($current / $total) * 100;
				$('#pills').find('.bar').css({
					width : $percent + '%'
				});
			}
		});
		$('a[data-toggle="tab"]').data("show","0");
		
		$('a[data-toggle="tab"]').on('show.bs.tab', function (e) {
			var isShow = $('a[data-toggle="tab"]').data("show");
			if(isShow == 0) {
				e.preventDefault();
			}
		});
		
	})
	
</script>
