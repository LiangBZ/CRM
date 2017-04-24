<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container-fluid">

	<div class="row-fluid">
		<div class="span12">

			<h3 class="page-title">外勤审批</h3>
			<ul class="breadcrumb">
				<li><a href="#">外勤</a> <span class="divider">/</span></li>
				<li><a href="#">外勤审批</a> <span class="divider">/</span></li>
			</ul>

		</div>
	</div>

	<!-- 外勤审批 begin -->
	<div class="row-fluid" data-workOutside="approve">
		<div class="span12">

			<div class="widget green">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 外勤审批
					</h4>
				</div>
				<div class="widget-body">
				
					<table
						class="table table-striped table-advance table-bordered table-hover"
						data-workOutside="approve">
						<thead>
							<th>申请理由</th>
							<th>申请人</th>
							<th>审批人</th>
							<th>外出时间</th>
							<th>返回时间</th>
							<th>审批状态</th>
							<th>同意/不同意</th>
						</thead>
						<tbody>
							<tr class="odd gradex">
								<td>和天阳公司探讨CRM项目需求</td>
								<td>李四</td>
								<td>张三</td>
								<td>2017-3-30 09:10</td>
								<td>2017-3-30 13:10</td>
								<td>等待审核</td>
								<td>
									<button class="btn btn-success">
										<i class="icon-ok"></i>
									</button>
									<button class="btn btn-primary">
										<i class="icon-trash"></i>
									</button>
								</td>
							</tr>
							<tr class="odd gradex">
								<td>和天阳公司探讨农业系统项目需求</td>
								<td>王五</td>
								<td>张三</td>
								<td>2017-3-30 10:10</td>
								<td>2017-3-30 13:10</td>
								<td>等待审核</td>
								<td>
									<button class="btn btn-success">
										<i class="icon-ok"></i>
									</button>
									<button class="btn btn-primary">
										<i class="icon-trash"></i>
									</button>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<!-- /外勤审批 /end -->
	
</div>

<script>
	$(function() {
		initWorkOutsideApprove();
	})
</script>
