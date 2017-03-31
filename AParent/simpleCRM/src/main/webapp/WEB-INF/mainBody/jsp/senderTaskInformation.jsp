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
	
	<!-- 查看任务 begin -->
	<div class="row-fluid" data-task="senderTask">
		<div class="span12">

			<div class="widget green">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 任务
					</h4>
				</div>
				<div class="widget-body">
					<table
						class="table table-striped table-advance table-bordered table-hover"
						data-task="senderTask">
						<thead>
							<th>任务内容</th>
							<th>创建时间</th>
							<th>开始日期</th>
							<th>截止日期</th>
							<th>创建人</th>
							<th>执行者</th>
							<th>状态</th>
							<th>商机</th>
							<c:if test="${authorityMap['769c7965-1394-11e7-aa71-28d2444b860a'] eq 1}">
								<th>编辑</th>
							</c:if>
						</thead>
						<tbody>
							<tr class="odd gradex">
								<th>第一次发布任务</th>
								<td>2017-03-21</td>
								<td>2017-03-21</td>
								<td>2017-04-01</td>
								<td>王五</td>
								<td>李四</td>
								<td>未完成</td>
								<td style="width: 6%">
									<button class="btn btn-success"
										onclick="">
										<i class="icon-tags"></i>
									</button>
								</td>
								<td style="width: 6%">
									<button class="btn btn-success"
										onclick="">
										<i class="icon-tags"></i>
									</button>
								</td>
							</tr>
							<tr class="odd gradex">
								<th>第二次发布任务</th>
								<td>2017-03-22</td>
								<td>2017-03-22</td>
								<td>2017-04-11</td>
								<td>王五</td>
								<td>张三</td>
								<td>未完成</td>
								<td style="width: 6%">
									<button class="btn btn-success"
										onclick="">
										<i class="icon-tags"></i>
									</button>
								</td>
								<td style="width: 6%">
									<button class="btn btn-success"
										onclick="">
										<i class="icon-tags"></i>
									</button>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<!-- /查看任务 /end -->
	
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
						
						<input type="hidden" name="taskId" value="">
						
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
							<label class="control-label">状态(*)</label>
							<div class="controls">
								<select name="taskStop" required
									class="chzn-select-deselect span4" >
									<option value="-1">无法完成</option>
									<option value="0">未完成</option>
									<option value="1">已完成</option>
								</select>
							</div>
						</div>
				        
				        <div class="control-group">
							<label class="control-label">发起人</label>
							<div class="controls">
								<input type="text" name="spEmployeeRealName" class="span6" disabled> 
							</div>
						</div>
				        
				        <div class="control-group">
							<label class="control-label">执行人员</label>
							<div class="controls">
								<input type="text" name="reEmployeeRealName" class="span6" disabled> 
							</div>
						</div>
				        
						<div class="form-actions">
							<button type="submit" class="btn btn-success">保存</button>
							<button type="button" class="btn" onclick="refreshSenderTaskInfos();">取消</button>
							<input type="reset" value="Reset" class="hidden"/>
						</div>
						
						<!-- 时间轴 begin  -->
						<div class="timeline-messages" data-timeLine="feedback">
						
							<div class="msg-time-chat">
								<div class="message-body msg-in">
									<span class="arrow"></span>
									<div class="text">
										<p class="attribution">
											<a href="#" >Jhon Doe</a>
											at 1:55pm, 13th April 2013
										</p>
										<p>Hello, How are you brother?</p>
									</div>
								</div>
							</div>
	
							<div class="msg-time-chat">
								<div class="message-body msg-out">
									<span class="arrow"></span>
									<div class="text">
										<p class="attribution">
											<a href="#">Jonathan Smith</a> 
											at 2:01pm, 13th April 2013
										</p>
										<p>I'm Fine, Thank you. What about you? How is going on?</p>
									</div>
								</div>
							</div>
	
	
							<div class="msg-time-chat">
								<div class="message-body msg-in">
									<span class="arrow"></span>
									<div class="text">
										<p class="attribution">
											<a href="#">Jhon Doe</a> 
											at 2:03pm, 13th April 2013
										</p>
										<p>Yeah I'm fine too. Everything is going fine here.</p>
									</div>
								</div>
							</div>
	
	
							<div class="msg-time-chat">
								<div class="message-body msg-out">
									<span class="arrow"></span>
									<div class="text">
										<p class="attribution">
											<a href="#">Jonathan Smith</a> 
											at 2:05pm, 13th April 2013
										</p>
										<p>
											well good to know that. anyway how much time you need to done your task?
										</p>
									</div>
								</div>
							</div>
						</div>
						<!-- /时间轴 /end -->
					</form>
					
				</div>
			</div>

		</div>
	</div>
	<!-- /编辑任务 /end -->

</div>

<script>
	$(function() {
		initSenderTaskInfo();
	})
</script>