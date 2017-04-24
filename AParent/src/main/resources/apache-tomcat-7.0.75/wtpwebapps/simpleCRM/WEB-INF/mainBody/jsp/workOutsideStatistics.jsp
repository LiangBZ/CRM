<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container-fluid">

	<div class="row-fluid">
		<div class="span12">

			<h3 class="page-title">外勤统计</h3>
			<ul class="breadcrumb">
				<li><a href="#">外勤</a> <span class="divider">/</span></li>
				<li><a href="#">外勤统计</a> <span class="divider">/</span></li>
			</ul>

		</div>
	</div>


	<!-- 外勤统计 begin -->
	<div class="row-fluid">
		<div class="span12 responsive" data-tablet="span9 fix-margin"
			data-desktop="span12">

			<div class="widget yellow">
				<div class="widget-title">
					<h4>
						<i class="icon-calendar"></i> 外勤统计
					</h4>
				</div>
				<div class="widget-body">
					<div data-calendar="calendar" class="has-toolbar"></div>
				</div>
			</div>
		</div>
		
	</div>
	<!-- /外勤统计 /end -->

</div>

<%-- <script src="${pageContext.request.contextPath}/mainBody/js/external-dragging-calendar.js"></script> --%>

<script>
	$(function() {
		workOutsideCalendarInit();
	});
</script>



