<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">

			<h3 class="page-title">客户详情</h3>
			<ul class="breadcrumb">
				<li><a href="#">客户管理</a> <span class="divider">/</span></li>
				<li class="active">客户详情</li>
			</ul>

		</div>
	</div>

	<div class="row-fluid">
		<div class="span12">

			<div class="widget orange">
			
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 客户详情
					</h4>
				</div>
				<div class="widget-body">
					<div class="bs-docs-example">
						<input type="hidden" name="customId" value="">
						<ul class="nav nav-tabs">
							<li class="active"><a data-toggle="tab" href="#home" onclick="datailCustomShow();">客户信息</a></li>
							<li><a data-toggle="tab" href="#profile" onclick="getCustomBusinessOpportunity();">客户商机</a></li>
						</ul>
						<div class="tab-content" style="min-height:350px;">
							<div id="home" class="tab-pane fade in active">
								<div class="row-fluid">
									<div class=" profile span12">
										<div class="span2">
											<a href="javascript:(void)" class="profile-features active"> <i
												class=" icon-user"></i>
												<p class="info">基本信息</p>
											</a>
										</div>
										<div class="span10">
											<div class="row-fluid">
												<div class="span8 bio">
													<h2><span name="customName">黄河森</span></h2>
													<p>
														<label>地址 </label>: <span name="customAddress">福建省厦门市集美区软件园三期</span>
													</p>
													<div>
														<p>
															<label>联系人 </label>: <span name="customLinkmanName">黄河森</span>
														</p>
														<p>
															<label>职务 </label>: <span name="customLinkmanPost">菜鸡</span>
														</p>
														<p>
															<label>电话 </label>: <span name="customLinkmanPhone">12987657867</span>
														</p>
														<p>
															<label>部门</label>: <span name="departmentName">销售 1 部</span>
														</p>
														<p>
															<label>级别 </label>: <span name="customStateName">普通</span>
														</p>
														<p>
															<label>状态 </label>: <span name="customRankName">小型客户</span>
														</p>
														<p>
															<label>备注 </label>: <span name="customLinkmanRemark">没什么卵用</span>
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
							
							<div id="profile" class="tab-pane fade">
								<table
									class="table table-striped table-advance table-bordered table-hover"
									data-custom="businessOpportunityInfos">
									<thead>
										<th>产品名称</th>
										<th>预计销售金额(￥)</th>
										<th>预计成交时间</th>
										<th>销售阶段</th>
										<th>跟进人</th>
										<th style="width: 200px;overflow: hidden;">备注</th>
										<th>详情</th>
									</thead>
									<tbody>
										<tr class="odd gradex">
											<td>一米软件</td>
											<td>1908299.00</td>
											<td>2017/3/30</td>
											<td><span class="label label-success">初步沟通(10%)</span></td>
											<td>张三</td>
											<td>需要更改系统，添加新的功能</td>
											<td style="width:6%">
												<button class="btn btn-success" onclick="showCustomBusinessOpportunity();">
													<i class="icon-tags"></i>
												</button>
											</td>
										</tr>
										<tr class="odd gradex">
											<td>和兴农业系统</td>
											<td>345231.00</td>
											<td>2017/4/10</td>
											<td><span class="label label-warning">谈判(50%)</span></td>
											<td>李四</td>
											<td>系统完善，部署维护即可 系统完善，部署维护即可系统完善，部署维护即可系统完善，部署维护即可</td>
											<td style="width:6%">
												<button class="btn btn-success" onclick="showCustomBusinessOpportunity();">
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
			</div>

		</div>
	</div>
</div>

