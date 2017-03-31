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

	<!-- 产品列表 begin -->
	<div class="row-fluid" data-product="information">
		<div class="span12">
			<div class="widget orange">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 产品信息
					</h4>
				</div>
				<div class="widget-body">
					<div style="min-height: 360px;">
						<!-- 编辑处理 -->

						<c:if test="${authorityMap['8ee8e7eb-0ca9-11e7-9e9d-28d2444b860a'] eq 1}">
							<div class="clearfix">
								<div class="btn-group">
									<button class="btn green" onclick="addProductShow();">
										添加产品 <i class="icon-plus"></i>
									</button>
								</div>
							</div>
						</c:if>

						<table
							class="table table-striped table-advance table-bordered table-hover"
							data-table="productInformation">
							<thead>
								<th>产品号</th>
								<th>产品名称</th>
								<th>产品价格</th>
								<th style="width:5%;text-align: center;">pdf</th>
								<th style="width:5%;text-align: center;">查看</th>
								<c:if test="${authorityMap['523c4eee-0d3b-11e7-9e9d-28d2444b860a'] eq 1}">
									<th style="width:5%;text-align: center;">编辑</th>
								</c:if>
							</thead>
							<tbody>
								<tr class="odd gradex">
									<td>SD0001</td>
									<td>CRM</td>
									<td>500000.00</td>
									<td>
										<button class="btn btn-warning">
											<i class="icon-arrow-down"></i>
										</button>
									</td>
									<td>
										<button class="btn btn-success">
											<i class="icon-tags"></i>
										</button>
									</td>
									<td>
										<button class="btn btn-info">
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
	<!-- /产品列表 /end -->
	
	<!-- 添加新产品 begin -->
	<div class="row-fluid" data-product="addProduct">
		<div class="span12">

			<div class="widget green">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 添加产品
					</h4>
				</div>
				<div class="widget-body">
					<form data-product="addProduct" method="post" enctype="multipart/form-data" class="form-horizontal" onsubmit="return false;">  
						<div class="control-group">
							<label class="control-label">名称</label>
							<div class="controls">
								<input name="productName" type="text" class="span6" placeholder="请输入产品名称.." required/> 
							</div>
						</div>
						
						<div class="control-group">
                            <label class="control-label">描述</label>
                            <div class="controls">
                              <textarea name="productDetail" class="span6 ckeditor" rows="6"></textarea>
                            </div>
	                    </div>
						
						<div class="control-group">
                            <label class="control-label">价格</label>
                            <div class="controls">
                                <div class="input-prepend input-append">
                                    <span class="add-on">￥</span>
                                    <input name="productPrice" type="text" data-mask="99999999.99" required/>
                                    <span class="add-on">.00</span>
                                </div>
                            </div>
                        </div>
						
						<div class="control-group">
							<label class="control-label">pdf</label>
							<div class="controls">
								<input name="file" type="file" accept="application/pdf" class="span6 btn" />
							</div>
						</div>
						
						<div class="form-actions">
							<button type="submit" class="btn btn-success">保存</button>
							<button type="button" class="btn" onclick="refreshProductInfos()">取消</button>
							<input type="reset" value="Reset" class="hidden"/>
						</div>
					</form> 
				
				</div>
			</div>

		</div>
	</div>
	<!-- /添加新产品 /end -->
	
	<!-- 产品信息详情 begin -->
	<div class="row-fluid" data-product="showProduct">
		<div class="span12">
				<div class="widget green">
					<div class="widget-title">
						<h4>
							<i class="icon-reorder"></i> 产品详情
						</h4>
					</div>
					<div class="widget-body">
						<div class="clearfix" style="margin-bottom: 20px;">
								<div class="btn-group">
									<button class="btn green" onclick="refreshProductInfos()">
										返回 <i class="icon-plus"></i>
									</button>
								</div>
						</div>
						
						<form style="padding:10px;" action="#" class="form-horizontal" data-product="showProduct" onsubmit="return false;">
							
							<input type="hidden" name="productId" value="">
							
							<div class="control-group">
								<label class="control-label">产品号</label>
								<div class="controls">
									<input name="productName" type="text" class="span6" disabled/> 
								</div>
							</div>
							
							<div class="control-group">
								<label class="control-label">价格</label>
								<div class="controls">
									<input name="productPrice" type="text" class="span6" disabled/> 
								</div>
							</div>
							
							<div class="control-group">
								<label class="control-label">描述</label>
								<div class="controls">
									<textarea name="productDetail" class="span6 ckeditor" rows="6" disabled/>
								</div>
							</div>
		
							<div class="control-group">
								<label class="control-label">pdf</label>
								<div class="controls">
									<div class="input-prepend">
										<a data-button="downloadPDF" href='javasvript:void(0);' class='btn btn-warning'  data-id=''>下载</a>
									</div>
								</div>
							</div>
		
						</form>
					</div>
				</div>
			
		</div>
	</div>
	<!-- /产品信息详情 /end -->
	
	
	<!-- 产品信息修改 begin -->
	<div class="row-fluid" data-product="editProduct">
		<div class="span12">
				<div class="widget green">
					<div class="widget-title">
						<h4>
							<i class="icon-reorder"></i> 编辑产品信息
						</h4>
					</div>
					<div class="widget-body">
						<div class="clearfix" style="margin-bottom: 20px;">
								<div class="btn-group">
									<button class="btn green" onclick="refreshProductInfos()">
										返回 <i class="icon-plus"></i>
									</button>
								</div>
						</div>
						
						<form style="padding:10px;" action="#" class="form-horizontal" data-product="editProduct" onsubmit="return false;">
							
							<input type="hidden" name="productId" value="">
							
							<div class="control-group">
								<label class="control-label">产品号</label>
								<div class="controls">
									<input name="productNum" type="text" class="span6" disabled required/> 
								</div>
							</div>
							
							<div class="control-group">
								<label class="control-label">产品名称</label>
								<div class="controls">
									<input name="productName" type="text" class="span6" required/> 
								</div>
							</div>
							
							<div class="control-group">
								<label class="control-label">价格</label>
								<div class="controls">
									<input name="productPrice" type="text" class="span6" data-mask="99999999.99" required /> 
								</div>
							</div>
							
							<div class="control-group">
								<label class="control-label">描述</label>
								<div class="controls">
									 <textarea name="productDetail" class="span6 ckeditor" rows="6"></textarea>
								</div>
							</div>
		
							<div class="control-group">
							<label class="control-label">pdf</label>
							<div class="controls">
								<input name="file" type="file" accept="application/pdf" class="span6 btn" />
							</div>
						</div>
						
						<div class="form-actions">
							<button type="submit" class="btn btn-success">保存</button>
							<button type="button" class="btn" onclick="refreshProductInfos()">取消</button>
							<input type="reset" value="Reset" class="hidden"/>
						</div>
		
						</form>
					</div>
				</div>
			
		</div>
	</div>
	<!-- /产品信息修改 /end -->

</div>

<script type="text/javascript">
	$(function() {
		initProductInfos();
	})
</script>
