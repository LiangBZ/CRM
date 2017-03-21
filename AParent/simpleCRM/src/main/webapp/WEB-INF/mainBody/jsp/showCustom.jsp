<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<div class="container-fluid">

	<div class="row-fluid">
		<div class="span12">
			<h3 class="page-title">客户商机</h3>
			<ul class="breadcrumb">
				<li>商机 <span class="divider">/</span></li>
				<li>客户商机</li>
			</ul>
		</div>
	</div>
	
	<div class="row-fluid">
		<div class="span12">
			<div class="clearfix">
				<div class="btn-group">
					<button class="btn btn-info" style="width:80px;">
						返回 <i class="icon-plus"></i>
					</button>
				</div>
			</div>
		</div>
		<div class="space15"></div>
	</div>

	<div class="row-fluid">
		<div class="row-fluid">
			<!-- 客户信息 begin -->
			<div class="span6">
				<div class="widget green">
					<div class="widget-title">
						<h4>
							<i class="icon-reorder"> </i> 客户信息
						</h4>
					</div>
					<div class="widget-body" style="height:320px;">
						<div class="row-fluid">
							<div class=" profile span12">
								<div class="span3">
									<a href="javascript:(void)" class="profile-features active"> <i
										class=" icon-user"></i>
										<p class="info">客户资料</p>
									</a>
								</div>
								<div class="span1"></div>
								<div class="span8">
									<div class="row-fluid">
										<div class="span8 bio">
											<h2>${sessionScope.employeeRealName}</h2>
											<p>
												<label style="width:60px;">登录名 </label>: <span name="employeeUsername">liangbozhao</span>
											</p>
											<div>
												<p>
													<label style="width:60px;">工号 </label>: <span name="employeeNumber">employeeNumber</span>
												</p>
												<p>
													<label style="width:60px;">邮箱 </label>: <span name="employeeEmail">employeeEmail</span>
												</p>
												<p>
													<label style="width:60px;">手机 </label>: <span name="employeePhone">employeePhone</span>
												</p>
												<p>
													<label style="width:60px;">部门 </label>: <span name="departmentName">departmentName</span>
												</p>
												<p>
													<label style="width:60px;">职务 </label>: <span name="userroleName">userroleName</span>
												</p>
												<div class="space5"></div>
												<hr>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- /客户信息 /end -->
			
			<!-- 商机信息 begin -->
			<div class="span6">
				<div class="widget red">
					<div class="widget-title">
						<h4>
							<i class="icon-reorder"></i> 商机信息
						</h4>
					</div>
					<div class="widget-body" style="height:320px;">
						<table
							class="table table-striped table-advance table-bordered table-hover"
							data-table="memberInformation">
							<thead>
								<th style="width:30%;">名称</th>
								<th style="width:70%;">内容</th>
							</thead>
							<tbody>
								<tr class="odd gradex">
									<td>产品名称</td>
									<td>一米软件</td>
								</tr>
								<tr class="odd gradex">
									<td>跟进人</td>
									<td><span name="">梁伯昭</span></td>
								</tr>
								<tr class="odd gradex">
									<td>所属部门</td>
									<td>销售1部</td>
								</tr>
								<tr class="odd gradex">
									<td>预计销售金额(￥)</td>
									<td>99921.00</td>
								</tr>
								<tr class="odd gradex">
									<td>预计成交时间</td>
									<td>2017/5</td>
								</tr>
								<tr class="odd gradex">
									<td>销售阶段</td>
									<td>初步沟通(10%)</td>
								</tr>
								<tr class="odd gradex">
									<td>备注</td>
									<td>该公司需要定制一些新的功能，需要少许的改动。</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
			<!-- /商机信息 /end -->
		</div>
	</div>
	
	<!-- 任务进度 begin -->
	<div class="row-fluid">
		<div class="widget purple">
			<div class="widget-title">
				<h4>
					<i class="icon-tasks"></i> 任务进度
				</h4>
			</div>
			<div class="widget-body">
				<ul class="unstyled">
					<li>
						<span class="btn btn-inverse"> 
							<i class="icon-check"></i>
						</span> 
						任务已经完成 <strong class="label label-info"> 85%</strong>
						<div class="space10"></div>
						<div class="progress progress-success progress-striped active">
							<div style="width: 85%;" class="bar"></div>
						</div></li>
				</ul>
			</div>
		</div>
	</div>
	<!-- /任务进度 /end -->

	<!-- 任务反馈 begin -->
	<div class="row-fluid">
		<div class="span12">
			<div class="widget red">
				<div class="widget-title">
					<h4>
						<i class="icon-comments-alt"></i>任务反馈
					</h4>
				</div>
				<div class="widget-body">
					<div class="timeline-messages">

						<div class="msg-time-chat">
							<a class="message-img" href="#">
								<img alt="" src="../img/jpg/avatar1.jpg" class="avatar">
							</a>
							<div class="message-body msg-in">
								<span class="arrow"></span>
								<div class="text">
									<p class="attribution">
										<a href="#">Jhon Doe</a>
										at 1:55pm, 13th April 2013
									</p>
									<p>Hello, How are you brother?</p>
								</div>
							</div>
						</div>

						<div class="msg-time-chat">
							<a class="message-img" href="#">
								<img alt="" src="../img/jpg/avatar2.jpg" class="avatar"></a>
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
							<a class="message-img" href="#">
							<img alt="" src="../img/jpg/avatar1.jpg" class="avatar"></a>
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
							<a class="message-img" href="#">
							<img alt="" src="../img/jpg/avatar2.jpg" class="avatar"></a>
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
				</div>
			</div>

		</div>
	</div>
	<!-- /任务反馈 /end -->
</div>