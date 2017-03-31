<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container-fluid">

	<div class="row-fluid">
		<div class="span12">

			<h3 class="page-title">所有商机</h3>
			<ul class="breadcrumb">
				<li><a href="#">商机</a> <span class="divider">/</span></li>
				<li><a href="#">所有商机</a> <span class="divider">/</span></li>
			</ul>

		</div>
	</div>
	
	<!-- 查看所有商机 begin -->
	<div class="row-fluid" data-businessOpportunity="allBusinessOpportunityInfos">
		<div class="span12">

			<div class="widget green">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 商机
					</h4>
				</div>
				<div class="widget-body">
					<table
						class="table table-striped table-advance table-bordered table-hover"
						data-businessOpportunity="allBusinessOpportunityInfos">
						<thead>
							<th>客户名称</th>
							<th>产品名称</th>
							<th>(预计)/成交价格(￥)</th>
							<th>(预计)/成交时间</th>
							<th>销售阶段</th>
							<th>跟进人</th>
							<th>详情</th>
							<th>编辑</th>
							<th>任务详情</th>
							<c:if test="${authorityMap['06765f5e-0f9e-11e7-8663-28d2444b860a'] eq 1}">
								<th>建立任务</th>
							</c:if>
						</thead>
						<tbody>
							<tr class="odd gradex">
								<th>天阳宏业</th>
								<td>一米软件</td>
								<td>1908299.00</td>
								<td>2017/3/30</td>
								<td><span class="label label-success">初步沟通(10%)</span></td>
								<td>张三</td>
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
								<td style="width: 7%">
									<button class="btn btn-success"
										onclick="">
										<i class="icon-wrench"></i>
									</button>
								</td>
								<td style="width: 7%">
									<button class="btn btn-success"
										onclick="">
										<i class="icon-wrench"></i>
									</button>
								</td>
							</tr>
							<tr class="odd gradex">
								<td>一品威客</td>
								<td>和兴农业系统</td>
								<td>345231.00</td>
								<td>2017/4/10</td>
								<td><span class="label label-warning">谈判(50%)</span></td>
								<td>李四</td>
								<td style="width: 6%">
									<button class="btn btn-success"
										onclick="showCustomBusinessOpportunity();">
										<i class="icon-tags"></i>
									</button>
								</td>
								<td style="width: 6%">
									<button class="btn btn-success"
										onclick="">
										<i class="icon-tags"></i>
									</button>
								</td>
								<td style="width: 7%">
									<button class="btn btn-success"
										onclick="">
										<i class="icon-wrench"></i>
									</button>
								</td>
								<td style="width: 7%">
									<button class="btn btn-success"
										onclick="">
										<i class="icon-wrench"></i>
									</button>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<!-- /查看所有商机 /end -->

	<!-- /编辑商机 /begin -->
	<div class="row-fluid" data-BusinessOpportunity="editBusinessOpportunity">
		<div class="span12">

			<div class="widget green">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 编辑商机
					</h4>
				</div>
				<div class="widget-body">
					
					<form style="margin-left:10px;" action="#" class="form-horizontal" data-BusinessOpportunity="editBusinessOpportunity" onsubmit="return false;">
						
						<input type="hidden" name="businessOpportunityId" value="">
						
						<div class="control-group">
							<label class="control-label">产品(*)</label>
							<div class="controls">
								<input name="productName" required disabled type="text" class="span4" />
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label">销售阶段(*)</label>
							<div class="controls">
								<select name="salesStageId" required
									class="chzn-select-deselect span4" >
									<option value="ddc2e328-0d4b-11e7-9e9d-28d2444b860a">初步沟通</option>
									<option value="fbf40d99-0d4b-11e7-9e9d-28d2444b860a">方案报价</option>
									<option value="011bc899-0d4c-11e7-9e9d-28d2444b860a">谈判协商</option>
									<option value="053bd26b-0d4c-11e7-9e9d-28d2444b860a">赢单</option>
									<option value="0b16581b-0d4c-11e7-9e9d-28d2444b860a">输单</option>
								</select>
							</div>
						</div>
						
						<div class="control-group">
                            <label class="control-label">产品价格(￥)</label>
                            <div class="controls">
                                <div class="input-prepend input-append">
                                    <span class="add-on">￥</span>
                                    <input name="productPrice" type="text" data-mask="99999999.99" required disabled/>
                                    <span class="add-on">.00</span>
                                </div>
                            </div>
                        </div>
<!--						
 						<div class="control-group">
                            <label class="control-label">成本(*)</label>
                            <div class="controls">
                                <div class="input-prepend input-append">
                                    <span class="add-on">￥</span>
                                    <input name="cost" type="text" data-mask="99999999.99" required disabled/>
                                    <span class="add-on">.00</span>
                                </div>
                            </div>
                        </div>
 -->						
						<div class="control-group">
                            <label class="control-label">(预期)/成交金额(*)</label>
                            <div class="controls">
                                <div class="input-prepend input-append">
                                    <span class="add-on">￥</span>
                                    <input name="preSalesAmount" type="text" data-mask="99999999.99" required/>
                                    <span class="add-on">.00</span>
                                </div>
                            </div>
                        </div>
<!--                         					
						<div class="control-group">
                            <label class="control-label">实际售出金额(*)</label>
                            <div class="controls">
                                <div class="input-prepend input-append">
                                    <span class="add-on">￥</span>
                                    <input name="realWages" type="text" data-mask="99999999.99" required/>
                                    <span class="add-on">.00</span>
                                </div>
                            </div>
                        </div>
						
 -->						<div class="control-group">
			                <label class="control-label">(预期)/售出时间(*)</label>
			                <div class="controls input-group date" name="preDealTime" >
			                    <div class="input-prepend input-append">
				                    <input name="preDealTime" class="form-control" size="16" type="text" readonly>
				                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
									<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
				                    <span class="add-on"><i class="icon-calendar"></i></span>
			                	</div>
			                </div>
				        </div>

						<div class="control-group">
							<label class="control-label">备注</label>
							<div class="controls">
								<textarea name="remark" class="span6 ckeditor" rows="6"></textarea>
							</div>
						</div>
						
						
						<div class="form-actions">
							<button type="submit" class="btn btn-success">保存</button>
							<button type="button" class="btn" onclick="refreshBusinessOpportunityInfos();">取消</button>
							<input type="reset" value="Reset" class="hidden"/>
						</div>
					</form>
					
				</div>
			</div>

		</div>
	</div>
	<!-- /编辑商机 /end -->
	
	
	<!-- 添加任务 begin -->
	<div class="row-fluid" data-Task="addTask">
		<div class="span12">

			<div class="widget green">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 添加任务
					</h4>
				</div>
				<div class="widget-body">
				
					<form style="margin-left:10px;" action="#" class="form-horizontal" data-Task="addTask" onsubmit="return false;">
						
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
							<button type="button" class="btn" onclick="refreshBusinessOpportunityInfos();">取消</button>
							<input type="reset" value="Reset" class="hidden"/>
						</div>
					</form>
					
				</div>
			</div>

		</div>
	</div>
	<!-- /添加新商机 /end -->
	
	<!-- 查看任务 begin -->
	<div class="row-fluid" data-task="businessOpportunitysAllTask">
		<div class="span12">

			<div class="widget green">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 任务
					</h4>
				</div>
				<div class="widget-body">
					
					<div class="clearfix">
						<div class="btn-group">
							<button class="btn green" onclick="reShowBusinessOpportunity();">
								返回 <i class="icon-plus"></i>
							</button>
						</div>
					</div>
				
					<table
						class="table table-striped table-advance table-bordered table-hover"
						data-task="businessOpportunitysAllTask">
						<thead>
							<th>任务内容</th>
							<th>创建时间</th>
							<th>开始日期</th>
							<th>截止日期</th>
							<th>创建人</th>
							<th>执行者</th>
							<th>状态</th>
							<th>详情</th>
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
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<!-- /查看任务 /end -->
	
	<!-- 任务详情 begin -->
	
	<div class="row-fluid" data-oTaskDetail="oTaskDetail">
		<div class="span12">
			
			<div class="widget green">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 任务反馈
					</h4>
				</div>
				<div class="widget-body">
				
					<div class="clearfix">
						<div class="btn-group">
							<button class="btn green" onclick="reShowBusinessOpportunitysTask();">
								返回 <i class="icon-plus"></i>
							</button>
						</div>
					</div>
					
					<div class="space20"></div>
				
					<form style="margin-left:10px;" action="#" class="form-horizontal" data-oTaskDetail="oTaskDetail" onsubmit="return false;">
						
						<input type="hidden" name="taskId" value="">
						<input type="hidden" name="reEmployeeId" value="">
						
						<div class="control-group">
							<label class="control-label">任务内容</label>
							<div class="controls">
								<textarea name="taskContent" class="span6 ckeditor" rows="6" readonly="readonly"></textarea>
							</div>
						</div>
						
						<div class="control-group">
			                <label class="control-label">任务开始时间</label>
			                <div class="controls input-group date" name="taskStartTime" >
			                    <div class="input-prepend input-append">
				                    <input name="taskStartTime" class="form-control" size="16" type="text" readonly="readonly">
				                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
									<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
				                    <span class="add-on"><i class="icon-calendar"></i></span>
			                	</div>
			                </div>
				        </div>
						
						<div class="control-group">
			                <label class="control-label">任务截止时间</label>
			                <div class="controls input-group date" name="taskEndTime" >
			                    <div class="input-prepend input-append">
				                    <input name="taskEndTime" class="form-control" size="16" type="text" readonly="readonly">
				                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
									<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
				                    <span class="add-on"><i class="icon-calendar"></i></span>
			                	</div>
			                </div>
				        </div>
				        
				        <div class="control-group">
							<label class="control-label">发起人</label>
							<div class="controls">
								<input type="text" name="spEmployeeRealName" class="span6" readonly="readonly"> 
							</div>
						</div>
						
				        <div class="control-group">
							<label class="control-label">执行人员</label>
							<div class="controls">
								<input type="text" name="reEmployeeRealName" class="span6" readonly="readonly"> 
							</div>
						</div>
						
						<hr>
						
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
						
						<!-- <div class="form-actions">
							<button type="button" class="btn" onclick="reShowBusinessOpportunitysTask();">返回</button>
						</div> -->
					</form>
					
				</div>
			</div>

		</div>
	</div>
	<!-- /任务详情 /end -->
</div>

<script>
	$(function() {
		initBusinessOpportunityInfos();
		
		$('div[name="preDealTime"]').datetimepicker({
	        language:  'zh-CN',
	        weekStart: 1,
	        todayBtn:  1,
			autoclose: 1,
			todayHighlight: 1,
			startView: 2,
			minView: 2,
			forceParse: 0,
			format: 'yyyy-mm-dd',
			startDate : new Date() 
	    });
	})
</script>
