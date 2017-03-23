<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container-fluid">

	<div class="row-fluid">
		<div class="span12">

			<h3 class="page-title">发布的任务</h3>
			<ul class="breadcrumb">
				<li><a href="#">任务</a> <span class="divider">/</span></li>
				<li><a href="#">发布的任务</a> <span class="divider">/</span></li>
			</ul>

		</div>
	</div>
	
	<!-- 编辑任务 begin -->
	<div class="row-fluid" data-Task="editTask">
		<div class="span12">

			<div class="widget green">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 编辑任务
					</h4>
				</div>
				<div class="widget-body">
				
					<form style="margin-left:10px;" action="#" class="form-horizontal" data-Task="editTask" onsubmit="return false;">
						
						<input type="hidden" name="businessOpportunityIdTask" value="">
						<input type="hidden" name="followEmployeeIdTask" value="">
						
						<div class="control-group">
							<label class="control-label">任务内容(*)</label>
							<div class="controls">
								<textarea name="taskContent" class="span6 ckeditor" rows="6" required></textarea>
							</div>
						</div>
						
						<div class="control-group">
			                <label class="control-label">任务开始时间(*)</label>
			                <div class="controls input-group date" name="taskStartTime" >
			                    <div class="input-prepend input-append">
				                    <input name="taskStartTime" class="form-control" size="16" type="text" required>
				                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
									<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
				                    <span class="add-on"><i class="icon-calendar"></i></span>
			                	</div>
			                </div>
				        </div>
						
						<div class="control-group">
			                <label class="control-label">任务截止时间(*)</label>
			                <div class="controls input-group date" name="taskEndTime" >
			                    <div class="input-prepend input-append">
				                    <input name="taskEndTime" class="form-control" size="16" type="text" required>
				                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
									<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
				                    <span class="add-on"><i class="icon-calendar"></i></span>
			                	</div>
			                </div>
				        </div>
				        
				        <div class="control-group">
							<label class="control-label">执行人员</label>
							<div class="controls">
								<input type="text" name="employeeRealName" class="span6" disabled> 
							</div>
						</div>
				        
						<div class="form-actions">
							<button type="submit" class="btn btn-success">保存</button>
							<button type="button" class="btn">取消</button>
							<input type="reset" value="Reset" class="hidden"/>
						</div>
					</form>
					
				</div>
			</div>

		</div>
	</div>
	<!-- /编辑任务 /end -->

</div>
