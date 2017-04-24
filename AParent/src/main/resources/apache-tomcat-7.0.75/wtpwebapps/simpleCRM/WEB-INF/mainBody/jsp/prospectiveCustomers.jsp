<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container-fluid">

	<div class="row-fluid">
		<div class="span12">

			<h3 class="page-title">(潜在客户 / 销售意向)</h3>
			<ul class="breadcrumb">
				<li><a href="#">商机</a> <span class="divider">/</span></li>
				<li><a href="#">(潜在客户 / 销售意向)</a> <span class="divider">/</span></li>
			</ul>

		</div>
	</div>
	
	<!-- 潜在客户--销售意向 begin -->
	<div class="row-fluid" data-prospective="prospectiveCustomers">
		<div class="span12">

			<div class="widget green">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 潜在客户 / 销售意向
					</h4>
				</div>
				<div class="widget-body">
					<table
						class="table table-striped table-advance table-bordered table-hover"
						data-prospective="prospectiveCustomers">
						<thead>
							<th>客户名称</th>
							<th>客户类型</th>
							<th>产品编号</th>
							<th>产品名称</th>
							<th>预计成交价格(￥)</th>
							<th>预计成交时间</th>
							<th>销售阶段</th>
							<th>(潜在 / 销售)分析</th>
							<th>查看</th>
						</thead>
						<tbody>
							<tr class="odd gradex">
								<td>天阳宏业</td>
								<td>中型客户</td>
								<td>SX098765</td>
								<td>一米软件</td>
								<td>1908299.00</td>
								<td>2017/3/30</td>
								<td>10.5</td>
								<td><span class="text-success"><b>☆☆☆☆☆</b></span></td>
								<td style="width: 7%">
									<button class="btn btn-success"
										onclick="">
										<i class="icon-wrench"></i>
									</button>
								</td>
							</tr>
							<tr class="odd gradex">
								<td>一品威客</td>
								<td>小型客户</td>
								<td>SX032912</td>
								<td>和兴农业系统</td>
								<td>345231.00</td>
								<td>2017/4/10</td>
								<td>15</td>
								<td><span class="text-warning"><b>☆☆</b></span></td>
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
	<!-- /潜在客户--销售意向 /end -->

	
	<div class="row-fluid" data-char="charLine">
		<!-- 沟通反馈 begin -->
		<div class="span6">
			<div class="widget yellow">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 沟通反馈
					</h4>
				</div>
				<div class="widget-body" style="height:400px;padding:0;">
					<div data-char="feedbackCount" class="chart" style="height:400px;"></div>
				</div>
			</div>
		</div>
		<!-- /沟通反馈 /end -->
		
		<!-- 销售金额 begin -->
		<div class="span6">

			<div class="widget purple">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 销售金额
					</h4>
				</div>
				<div class="widget-body" style="padding:0;height:400px;">
					<div data-char="money" class="chart" style="height:400px;"></div>
				</div>
			</div>

		</div>
		<!-- /销售金额 /end -->
	</div>
	
	
	<!-- 销售金额 begin -->
	<!-- <div class="row-fluid" data-char="charPie">
		<div class="span12">

			<div class="widget purple">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 销售金额
					</h4>
				</div>
				<div class="widget-body" style="padding:0;height:400px;">
					<div data-char="money" class="chart" style="height:400px;"></div>
				</div>
			</div>

		</div>
	</div> -->
	<!-- /销售金额 /end -->
	
	<div class="space20"></div>
</div>

<script>
	$(function() {
		initProspective();
		initChars();
	})
</script>