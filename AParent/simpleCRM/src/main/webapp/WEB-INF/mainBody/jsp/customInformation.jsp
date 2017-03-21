<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container-fluid">

	<div class="row-fluid">
		<div class="span12">

			<h3 class="page-title">客户管理</h3>
			<ul class="breadcrumb">
				<li><a href="#">客户管理</a> <span class="divider">/</span></li>
				</li>
			</ul>

		</div>
	</div>

	<!-- 客户列表 begin -->
	<div class="row-fluid" data-custom="information">
		<div class="span12">
			<div class="widget orange">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 客户信息
					</h4>
				</div>
				<div class="widget-body">
					<div style="min-height: 360px;">
						<!-- 编辑处理 -->

						<c:if test="${authorityMap['34a71c5d-0d3b-11e7-9e9d-28d2444b860a'] eq 1}">
							<div class="clearfix">
								<div class="btn-group">
									<button class="btn green" onclick="addCustomShow()">
										添加客户 <i class="icon-plus"></i>
									</button>
								</div>
							</div>
						</c:if>

						<table
							class="table table-striped table-advance table-bordered table-hover"
							data-custom="information">
							<thead>
								<th>客户名称</th>
								<th>联系人姓名</th>
								<th>联系人手机</th>
								<th>联系人职务</th>
								<th>客户状态</th>
								<th>客户级别</th>
								<th>详情</th>
								<c:if test="${authorityMap['10c42c6f-0d91-11e7-9e9d-28d2444b860a'] eq 1}">
									<th>编辑</th>
								</c:if>
							</thead>
							<tbody>
								<tr class="odd gradex">
									<td>天阳科技</td>
									<td>梁伯昭</td>
									<td>15605925286</td>
									<td>老总</td>
									<td>潜在客户</td>
									<td>非常重要</td>
									<td style="width:5%">
										<button class="btn btn-success">
											<i class="icon-tags"></i>
										</button>
									</td>
									<td style="width:6%">
										<button class="btn btn-primary">
											<i class="icon-pencil"></i>
										</button>
									</td>
								</tr>
								<tr class="odd gradex">
									<td>新大陆</td>
									<td>黄河森</td>
									<td>120</td>
									<td>保安</td>
									<td>潜在客户</td>
									<td>赢单</td>
									<td>
										<button class="btn btn-success">
											<i class="icon-tags"></i>
										</button>
									</td>
									<td>
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
	<!-- /客户列表 /end -->
	
	<!-- 添加新客户 begin -->
	<div class="row-fluid" data-custom="addCustom">
		<div class="span12">

			<div class="widget green">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 添加客户
					</h4>
				</div>
				<div class="widget-body">

					<form action="#" class="form-horizontal" data-custom="addCustom" onsubmit="return false;">

						<div class="control-group">
							<label class="control-label">客户名称(*)</label>
							<div class="controls">
								<input name="customName" type="text" class="span4" required/> 
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label">客户地址(*)</label>
							<div class="controls">
								<input name="customAddress" type="text" class="span6" required/>
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label">联系人名字(*)</label>
							<div class="controls">
								<input name="customLinkmanName" type="text" class="span4" required/>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label">联系人手机号(*)</label>
							<div class="controls">
								<input name="customLinkmanPhone" data-mask="99999999999" required type="text" class="span4" />
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label">联系人职务(*)</label>
							<div class="controls">
								<input name="customLinkmanPost" required type="text" class="span4" />
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label">备注</label>
							<div class="controls">
								<textarea name="customLinkmanRemark" class="span6 ckeditor" rows="6" required></textarea>
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label">跟进人(*)</label>
							<div class="controls">
								<select name="followEmployeeId" required
									class="chzn-select-deselect span4" >
									<option value="1">张三</option>
									<option value="2">李四</option>
								</select>
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label">客户级别(*)</label>
							<div class="controls">
								<select name="customRankId" required
									class="chzn-select-deselect span4" >
									<option value="84084e44-0d45-11e7-9e9d-28d2444b860a">小型客户</option>
									<option value="8ac12910-0d45-11e7-9e9d-28d2444b860a">中型客户</option>
									<option value="8efeffc1-0d45-11e7-9e9d-28d2444b860a">大型客户</option>
								</select>
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label">客户状态(*)</label>
							<div class="controls">
								<select name="customStateId" required
									class="chzn-select-deselect span4" >
									<option value="31b14919-0d46-11e7-9e9d-28d2444b860a">普通</option>
									<option value="373c6373-0d46-11e7-9e9d-28d2444b860a">重要</option>
									<option value="72c10457-0d46-11e7-9e9d-28d2444b860a">非常重要</option>
								</select>
							</div>
						</div>

						<div class="form-actions">
							<button type="submit" class="btn btn-success">保存</button>
							<button type="button" class="btn" onclick="refreshCustomInfos();">取消</button>
							<input type="reset" value="Reset" class="hidden"/>
						</div>
					</form>

				</div>
			</div>

		</div>
	</div>
	<!-- /添加新客户 /end -->
	
	
	<!-- 编辑客户 begin -->
	<div class="row-fluid" data-custom="editCustom">
		<div class="span12">

			<div class="widget green">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 添加客户
					</h4>
				</div>
				<div class="widget-body">

					<form action="#" class="form-horizontal" data-custom="editCustom" onsubmit="return false;">
						
						<input name="customId" type="hidden" class="span4" required/> 
						
						<div class="control-group">
							<label class="control-label">客户名称(*)</label>
							<div class="controls">
								<input name="customName" type="text" class="span4" required/> 
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label">客户地址(*)</label>
							<div class="controls">
								<input name="customAddress" type="text" class="span6" required/>
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label">联系人名字(*)</label>
							<div class="controls">
								<input name="customLinkmanName" type="text" class="span4" required/>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label">联系人手机号(*)</label>
							<div class="controls">
								<input name="customLinkmanPhone" data-mask="99999999999" required type="text" class="span4" />
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label">联系人职务(*)</label>
							<div class="controls">
								<input name="customLinkmanPost" required type="text" class="span4" />
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label">备注</label>
							<div class="controls">
								<textarea name="customLinkmanRemark" class="span6 ckeditor" rows="6" required></textarea>
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label">客户级别(*)</label>
							<div class="controls">
								<select name="customRankId" required
									class="chzn-select-deselect span4" >
									<option value="84084e44-0d45-11e7-9e9d-28d2444b860a">小型客户</option>
									<option value="8ac12910-0d45-11e7-9e9d-28d2444b860a">中型客户</option>
									<option value="8efeffc1-0d45-11e7-9e9d-28d2444b860a">大型客户</option>
								</select>
							</div>
						</div>
						
						<div class="control-group">
							<label class="control-label">客户状态(*)</label>
							<div class="controls">
								<select name="customStateId" required
									class="chzn-select-deselect span4" >
									<option value="31b14919-0d46-11e7-9e9d-28d2444b860a">普通</option>
									<option value="373c6373-0d46-11e7-9e9d-28d2444b860a">重要</option>
									<option value="72c10457-0d46-11e7-9e9d-28d2444b860a">非常重要</option>
								</select>
							</div>
						</div>

						<div class="form-actions">
							<button type="submit" class="btn btn-success">保存</button>
							<button type="button" class="btn" onclick="refreshCustomInfos();">取消</button>
							<input type="reset" value="Reset" class="hidden"/>
						</div>
					</form>

				</div>
			</div>

		</div>
	</div>
	<!-- /编辑客户 /end -->

</div>

<script type="text/javascript">
	$(function() {
		//初始化表格 
		initCustomInfos();
	})
</script>
