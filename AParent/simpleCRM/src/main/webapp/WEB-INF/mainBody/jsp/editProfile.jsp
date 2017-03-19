<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container-fluid">

	<div class="row-fluid">
		<div class="span12">

			<h3 class="page-title">修改个人资料</h3>
			<ul class="breadcrumb">
				<li><a href="#">个人资料</a> <span class="divider">/</span></li>
				<li><a href="#">修改个人资料</a> <span class="divider">/</span></li>
			</ul>

		</div>
	</div>

	<!-- 编辑个人信息 begin -->
	<div class="row-fluid" data-editProfile="editProfile">
		<div class="span12">

			<div class="widget green">
				<div class="widget-title">
					<h4>
						<i class="icon-reorder"></i> 员工入职
					</h4>
				</div>
				<div class="widget-body">

					<form action="#" class="form-horizontal" data-editProfile="editProfile" onsubmit="return false;">
						<input name="employeeId" type="hidden" />

						<div class="control-group">
							<label class="control-label">邮箱</label>
							<div class="controls">
								<div class="input-prepend">
									<span class="add-on">@</span> 
									<input name="employeeEmail" type="email" placeholder="Email Address"  required  />
								</div>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label">手机</label>
							<div class="controls">
								<input name="employeePhone" data-mask="99999999999" required type="text" class="span6" />
							</div>
						</div>
						
						<div class="control-group">
                                    <label class="control-label">个人头像</label>
                                    <div class="controls">
                                        <div data-provides="fileupload" class="fileupload fileupload-new">
                                            <div style="width: 200px; height: 150px;" class="fileupload-new thumbnail">
                                                <img src="${employeeImgPath}">
                                            </div>
                                            <div data-newImg="newImg" style="max-width: 200px; max-height: 150px; line-height: 20px;" class="fileupload-preview fileupload-exists thumbnail">
                                            </div>
                                            <div>
                                               <span class="btn btn-file">
                                               		<span class="fileupload-new">选择头像</span>
                                               		<span class="fileupload-exists">重新选择</span>
                                               		<input type="file" class="default">
                                               	</span>
                                            </div>
                                        </div>
                                         <span class="label label-important">注意!</span>
                                         <span>
                                       	  	请选择png图片作为头像
                                         </span>
                                    </div>
                                </div>

						<div class="form-actions">
							<button type="submit" class="btn btn-success">保存</button>
							<button type="button" class="btn">取消</button>
							<input type="reset" value="Reset" class="hidden" />
						</div>
					</form>

				</div>
			</div>

		</div>
	</div>
	<!-- /编辑个人信息 /end -->
</div>

<script type="text/javascript">
	$(function() {
		initEditProfileSubmit();
		initEditProfileForm("${sessionScope.employeeId}");
	})
</script>