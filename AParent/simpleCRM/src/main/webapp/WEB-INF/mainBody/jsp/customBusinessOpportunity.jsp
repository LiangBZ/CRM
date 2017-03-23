<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<input type="hidden" name="customId" value="">
<input type="hidden" name="businessOpportunityId" value="">

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
					<button class="btn btn-info" style="width:100px;">
						所有商机 <i class="icon-plus"></i>
					</button>
				</div>
				<div class="btn-group">
					<button class="btn btn-success" style="width:100px;">
						客户商机 <i class="icon-plus"></i>
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
										<div class="span12 bio">
											<h2><span name="customName">天阳宏业科技股份有限公司厦门分公司</span></h2>
											<div>
												<div class="space10"></div>
												<div style="margin-bottom:15px;">
													<div style="width:60px;display:block;float:left;">联系人 : </div> <div name="customLinkmanName" style="width:240px; display:block;float:left;"> 白植伟</div>
												</div>
												<div class="space10"></div>
												<div style="margin-bottom:15px;">
													<div style="width:60px;display:block;float:left;">职务 : </div> <div name="customLinkmanPost" style="width:240px; display:block;float:left;">业务部经理</div>
												</div>
												<div class="space10"></div>
												<div style="margin-bottom:15px;">
													<div style="width:60px;display:block;float:left;">手机 : </div> <div name="customLinkmanPhone" style="width:240px; display:block;float:left;"> 18820331121</div>
												</div>
												<div class="space10"></div>
												<div style="margin-bottom:15px;">
													<div style="width:60px;display:block;float:left;">住址 : </div> <div name="customAddress" style="width:240px; display:block;float:left;">福建省厦门市软件园二期望海路59号之二701室</div>
												</div>
												<div class="space10"></div>
												<div style="margin-bottom:15px;">
													<div style="width:60px;display:block;float:left;">备注 : </div> <div name="customLinkmanRemark" style="width:240px; display:block;float:left;">软件公司，主要做金融业务。业务广，客户多。需要CRM管理客户关系。</div>
												</div>
												<div class="space10"></div>
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
									<td><span name="productName">一米软件</span></td>
								</tr>
								<tr class="odd gradex">
									<td>跟进人</td>
									<td><span name="employeeRealName">梁伯昭</span></td>
								</tr>
								<tr class="odd gradex">
									<td>所属部门</td>
									<td><span name="departmentName">销售1部</span></td>
								</tr>
								<tr class="odd gradex">
									<td>预计销售金额(￥)</td>
									<td><span name="preSalesAmount">99921.00</span></td>
								</tr>
								<tr class="odd gradex">
									<td>预计成交时间</td>
									<td><span name="preDealTime">2017/5</span></td>
								</tr>
								<tr class="odd gradex">
									<td>销售阶段</td>
									<td><span name="salesStageName">初步沟通(10%)</span></td>
								</tr>
								<tr class="odd gradex">
									<td>备注</td>
									<td><span name="remark">该公司需要定制一些新的功能，需要少许的改动。</span></td>
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
						任务已经完成 <strong class="label label-info"><span name="rateOfProgress">85%</span></strong>
						<div class="space10"></div>
						<div class="progress progress-success progress-striped active">
							<div data-rateOfProgress="rateOfProgress" style="width: 85%;" class="bar"></div>
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
								<img alt="" src="${pageContext.request.contextPath}/mainBody/img/jpg/avatar1.jpg" class="avatar">
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
								<img alt="" src="${pageContext.request.contextPath}/mainBody/img/jpg/avatar2.jpg" class="avatar"></a>
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
							<img alt="" src="${pageContext.request.contextPath}/mainBody/img/jpg/avatar1.jpg" class="avatar"></a>
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
							<img alt="" src="${pageContext.request.contextPath}/mainBody/img/jpg/avatar2.jpg" class="avatar"></a>
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