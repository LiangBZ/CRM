<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container-fluid">

	<div class="row-fluid">
		<div class="span12">

			<h3 class="page-title">外勤申请</h3>
			<ul class="breadcrumb">
				<li><a href="#">外勤</a> <span class="divider">/</span></li>
				<li><a href="#">外勤申请</a> <span class="divider">/</span></li>
			</ul>

		</div>
	</div>

	<!-- 查看所有外勤记录 begin -->
	<div class="row-fluid" data-workOutside="showWorkOutside">
		<div class="span12">

			<div class="widget green">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 外勤申请
					</h4>
				</div>
				<div class="widget-body">
				
					<div class="clearfix">
						<div class="btn-group">
							<button class="btn green" onclick="addProcessShow()">
								申请外勤 <i class="icon-plus"></i>
							</button>
						</div>
					</div>
				
					<table
						class="table table-striped table-advance table-bordered table-hover"
						data-workOutside="showWorkOutside">
						<thead>
							<th>申请理由</th>
							<th>申请人</th>
							<th>审批人</th>
							<th>外出时间</th>
							<th>返回时间</th>
							<th>审批状态</th>
						</thead>
						<tbody>
							<tr class="odd gradex">
								<td>和天阳公司探讨CRM项目需求</td>
								<td>李四</td>
								<td>张三</td>
								<td>2017-3-30 09:10</td>
								<td>2017-3-30 13:10</td>
								<td>通过</td>
							</tr>
							<tr class="odd gradex">
								<td>和天阳公司探讨农业系统项目需求</td>
								<td>王五</td>
								<td>张三</td>
								<td>2017-3-30 10:10</td>
								<td>2017-3-30 13:10</td>
								<td>等待审核</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<!-- /查看所有外勤记录 /end -->
	
	
	<!-- 申请外勤 begin -->
	<div class="row-fluid" data-process="addProcess">
		<div class="span12">

			<div class="widget green">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 申请外勤
					</h4>
				</div>
				<div class="widget-body">

					<form action="#" class="form-horizontal" data-process="addProcess" onsubmit="return false;">

						<div class="control-group">
							<label class="control-label">申请理由(*)</label>
							<div class="controls">
								<textarea name="processContent" class="span6 ckeditor" rows="6" required></textarea>
							</div>
						</div>
						
						<div class="control-group">
			                <label class="control-label">外勤开始时间(*)</label>
			                <div class="controls input-group date form_datetime" name="processStartTime" >
			                    <div class="input-prepend input-append">
				                    <input name="processStartTime" class="form-control" size="16" type="text" required>
				                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
									<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
				                    <span class="add-on"><i class="icon-calendar"></i></span>
			                	</div>
			                </div>
				        </div>
				        
						<div class="control-group">
			                <label class="control-label">外勤截止时间(*)</label>
			                <div class="controls input-group date" name="processEndTime" >
			                    <div class="input-prepend input-append">
				                    <input name="processEndTime" class="form-control" size="16" type="text" required>
				                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
									<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
				                    <span class="add-on"><i class="icon-calendar"></i></span>
			                	</div>
			                </div>
				        </div>
						
						<div class="control-group">
							<label class="control-label">申请人</label>
							<div class="controls">
								<input name="processEmployeeId" type="hidden" class="span4"/> 
								<input name="processEmployeeName" type="text" class="span4" disabled/>
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label">审批人(*)</label>
							<div class="controls">
								<select name="processApprover" required
									class="chzn-select-deselect span4" >
									<option value="0">张三</option>
									<option value="1">李四</option>
								</select>
							</div>
						</div>
						
						<div class="form-actions">
							<button type="submit" class="btn btn-success">保存</button>
							<button type="button" class="btn" onclick="reFreshWorkOutsideInfo();">取消</button>
							<input type="reset" value="Reset" class="hidden"/>
						</div>
					</form>

				</div>
			</div>

		</div>
	</div>
	<!-- /申请外勤 /end -->
</div>

<script>
	$(function() {
		initWorkOutsideInfo();
	})
</script>