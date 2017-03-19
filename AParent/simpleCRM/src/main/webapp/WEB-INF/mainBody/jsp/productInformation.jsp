<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container-fluid">

	<div class="row-fluid">
		<div class="span12">

			<h3 class="page-title">产品列表</h3>
			<ul class="breadcrumb">
				<li><a href="#">成员</a> <span class="divider">/</span></li>
				<li class="active">产品列表</li>
				<span class="divider">/</span>
				</li>
			</ul>

		</div>
	</div>

	<!-- 员工列表 begin -->
	<div class="row-fluid" data-member="information">
		<div class="span12">
			<div class="widget orange">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 成员信息
					</h4>
				</div>
				<div class="widget-body">
					<div style="min-height: 360px;">
						<!-- 编辑处理 -->

						<c:if test="${authorityMap['8ee8e7eb-0ca9-11e7-9e9d-28d2444b860a'] eq 1}">
							<div class="clearfix">
								<div class="btn-group">
									<button class="btn green">
										添加产品 <i class="icon-plus"></i>
									</button>
								</div>
							</div>
						</c:if>

						<table
							class="table table-striped table-advance table-bordered table-hover"
							data-table="memberInformation">
							<thead>
								<th>产品号</th>
								<th>产品名称</th>
								<th>产品价格</th>
								<th>pdf下载</th>
								<th>操作</th>
							</thead>
							<tbody>
								<tr class="odd gradex">
									<td>梁伯昭</td>
									<td>0001</td>
									<td>总裁办</td>
									<td>管理员</td>
									<td>15605925286</td>
									<td>
										<button class="btn btn-success">
											<i class="icon-tags"></i>
										</button>
										<button class="btn btn-primary">
											<i class="icon-pencil"></i>
										</button>
									</td>
								</tr>
								<tr class="odd gradex">
									<td>黄志彦</td>
									<td>0004</td>
									<td>总裁办</td>
									<td>总经理</td>
									<td>15692837619</td>
									<td>
										<button class="btn btn-success">
											<i class="icon-tags"></i>
										</button>
										<button class="btn btn-primary">
											<i class="icon-pencil"></i>
										</button>
									</td>
								</tr>
							</tbody>
						</table>

						<!-- /编辑end -->

					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- /员工列表 /end -->

</div>

<script type="text/javascript">
</script>
