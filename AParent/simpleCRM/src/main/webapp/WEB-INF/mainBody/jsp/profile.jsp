<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container-fluid">

	<div class="row-fluid">
		<div class="span12">

			<h3 class="page-title">我的资料</h3>
			<ul class="breadcrumb">
				<li><a href="#">个人资料</a> <span class="divider">/</span></li>
				<li><a href="#">我的资料</a> <span class="divider">/</span></li>
			</ul>

		</div>
	</div>


	<div class="row-fluid">

		<div class=" profile span12">
			<div class="span2">
				<a href="javascript:(void)" class="profile-features active"> <i
					class=" icon-user"></i>
					<p class="info">个人资料</p>
				</a>
			</div>
			<div class="span10">
				<div class="row-fluid">
					<div class="span12 bio">
						<h2>${sessionScope.employeeRealName}</h2>
						<p>
							<label>登录名 </label>: <span name="employeeUsername">liangbozhao</span>
						</p>
						<div>
						<p>
							<label>工号 </label>: <span name="employeeNumber">employeeNumber</span>
						</p>
						<p>
							<label>邮箱 </label>: <span name="employeeEmail">employeeEmail</span>
						</p>
						<p>
							<label>手机 </label>: <span name="employeePhone">employeePhone</span>
						</p>
						<p>
							<label>部门 </label>: <span name="departmentName">departmentName</span>
						</p>
						<p>
							<label>职务 </label>: <span name="userroleName">userroleName</span>
						</p>
						<div class="space5"></div>
						<hr>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<script type="text/javascript">
$(function() {
	getProfileInfo("${sessionScope.employeeId}");
})
</script>