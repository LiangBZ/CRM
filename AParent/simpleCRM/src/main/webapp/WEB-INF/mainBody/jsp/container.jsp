<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<% 
response.setHeader("Pragma","No-cache");
response.setHeader("Cache-Control","no-cache");
response.setDateHeader("Expires", -10);
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>container</title>
	<!-- jquery -->
    <script src="${pageContext.request.contextPath}/mainBody/js/jquery-1.8.3.min.js"></script>
    <%-- <script src="${pageContext.request.contextPath}/Util/js/jquery/jquery.2.1.1.min.js"></script> --%>
	<link href="${pageContext.request.contextPath}/mainBody/css/bootstrap-fileupload.css" rel="stylesheet"/>
	<link href="${pageContext.request.contextPath}/mainBody/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/mainBody/css/bootstrap-responsive.min.css" rel="stylesheet"/>
   	<link href="${pageContext.request.contextPath}/mainBody/css/font-awesome.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/mainBody/css/style.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/mainBody/css/style-responsive.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/mainBody/css/style-default.css" rel="stylesheet" id="style_color"/>
	<link href="${pageContext.request.contextPath}/mainBody/css/bootstrap-fullcalendar.css" rel="stylesheet" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Util/js/bootstrapValidator0.5.2/css/bootstrapValidator.min.css">
	
	<!-- 组织结构 -->
	<link href="${pageContext.request.contextPath}/Util/Font-Awesome-master/css/font-awesome.css" rel="stylesheet" />
	<link href="${pageContext.request.contextPath}/Util/js/zTree_v3-master/css/metroStyle/metroStyle.css" rel="stylesheet" />
	
	<!-- 日期 -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Util/js/bootstrap-datetimepicker-master/css/bootstrap-datetimepicker.css" />
	
	<script type="text/javascript">
		$.ajaxSetup({
			cache:false
		});
	</script>
	
	<style>
		td {
			border : 1px solid #ddd;
			padding :8px;
		}
	</style>
</head>

<body class="fixed-top">

<div id="header" class="navbar navbar-inverse navbar-fixed-top">

    <div class="navbar-inner">
        <div class="container-fluid">

            <div class="sidebar-toggle-box hidden-phone">
                <div class="icon-reorder tooltips" data-placement="right" data-original-title="缩放菜单"></div>
            </div>


            <a class="brand" href="${pageContext.request.contextPath}/logout/removeSession">
                <img src="${pageContext.request.contextPath}/mainBody/img/png/logo2.png" alt="Metro Lab"/>
            </a>


            <a class="btn btn-navbar collapsed" id="main_menu_trigger" data-toggle="collapse"
               data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="arrow"></span>
            </a>

            <div class="top-nav ">
                <ul class="nav pull-right top-menu">

                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-userInfo="userInfo">
                            <img src="${employeeImgPath}"  style="width:29px;height:29px;">
                            <span class="username">${sessionScope.employeeRealName}</span>
                            <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu extended logout">
                            <li><a href="javascript:void(0);" onclick="loadMainBody('mainBody/jsp/profile')"><i class="icon-user"></i>个人资料</a></li>
                            <li><a href="${pageContext.request.contextPath}/logout/removeSession"><i class="icon-key"></i>退出</a></li>
                        </ul>
                    </li>

                </ul>

            </div>
        </div>
    </div>

</div>


<div id="container" class="row-fluid">

    <div class="sidebar-scroll">
        <div id="sidebar" class="nav-collapse collapse">


            <div class="navbar-inverse">
                <form class="navbar-search visible-phone">
                    <input type="text" class="search-query" placeholder="Search"/>
                </form>
            </div>


            <ul class="sidebar-menu">
                <li class="sub-menu active">
                    <a class="" href="javascript:void(0)" onclick="loadMainBody('mainBody/jsp/consoleDesk')">
                        <i class="icon-dashboard"></i>
                        <span>控制台</span>
                    </a>
                </li>
                <li class="sub-menu">
                    <a href="javascript:void(0)">
                        <i class="icon-book"></i>
                        <span>成员管理</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="javascript:void(0)" onclick="loadMainBody('mainBody/jsp/organizingTheStructure')">组织结构</a></li>
                        <c:if test="${authorityMap['8d1bacfa-0ac3-11e7-991c-28d2444b860a'] eq 1 and empty authorityMap['8699fb77-0ace-11e7-a1cf-28d2444b860a']}">
                        	<li><a class="" href="javascript:void(0)" onclick="loadMainBody('mainBody/jsp/officialAuthority')">职务权限</a></li>
                        </c:if>
                        <c:if test="${authorityMap['8699fb77-0ace-11e7-a1cf-28d2444b860a'] eq 1}">
                        	<li><a class="" href="javascript:void(0)" onclick="loadMainBody('mainBody/jsp/officialAuthorityManager')">职务权限</a></li>
                        </c:if>
                        <li><a class="" href="javascript:void(0)" onclick="loadMainBody('mainBody/jsp/memberInformation')">成员信息</a></li>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:void(0)" class="">
                        <i class="icon-th"></i>
                        <span>任务</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                    	<c:if test="${authorityMap['7584310e-1030-11e7-8663-28d2444b860a'] eq 1}">
                        	<li><a class="" href="javascript:void(0)" onclick="loadMainBody('mainBody/jsp/receiveTaskInformation')">收到的任务</a></li>
                        </c:if>
                        <c:if test="${authorityMap['96151773-102f-11e7-8663-28d2444b860a'] eq 1}">
                       		<li><a class="" href="javascript:void(0)" onclick="loadMainBody('mainBody/jsp/senderTaskInformation')">发布的任务</a></li>
                        </c:if>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a class="" href="javascript:void(0)" onclick="loadMainBody('mainBody/jsp/customInformation')">
                        <i class="icon-trophy"></i>
                        <span>客户管理</span>
                    </a>
                </li>
                <li class="sub-menu">
                    <a class="" href="javascript:void(0)">
                        <i class="icon-map-marker"></i>
                        <span>外勤</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                    	<c:if test="${authorityMap['a4a35af4-167f-11e7-a0f7-94de80188a22'] eq 1}">
                        <li><a href="javascript:void(0)" class="" onclick="loadMainBody('mainBody/jsp/workOutside')">申请外勤</a></li>
                        </c:if>
                        <c:if test="${authorityMap['96dd987b-1138-11e7-8663-28d2444b860a'] eq 1}">
                       		<li><a class="" href="javascript:void(0)" onclick="loadMainBody('mainBody/jsp/workOutsideApprove')">外勤审核</a></li>
                        </c:if>
                        <li><a href="javascript:void(0)" class="" onclick="loadMainBody('mainBody/jsp/workOutsideStatistics')">外勤统计</a></li>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:void(0)" class="">
                        <i class="icon-file-alt"></i>
                        <span>商机</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="javascript:void(0)"  onclick="loadMainBody('mainBody/jsp/businessOpportunityInformation')">所有商机</a></li>
                        <li><a class="" href="javascript:void(0)"  onclick="loadMainBody('mainBody/jsp/prospectiveCustomers')">潜在客户 / 销售意向</a></li>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:void(0)" onclick="loadMainBody('mainBody/jsp/productInformation')" class="">
                        <i class="icon-glass"></i>
                        <span>产品</span>
                    </a>
                </li>

                <li class="sub-menu">
                    <a class="" href="javascript:void(0)">
                        <i class="icon-user"></i>
                        <span>个人资料</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="javascript:void(0)" onclick="loadMainBody('mainBody/jsp/profile')">我的资料</a></li>
                        <li><a class="" href="javascript:void(0)" onclick="loadMainBody('mainBody/jsp/editProfile')">修改个人资料</a></li>
                        <li><a class="" href="javascript:void(0)" onclick="loadMainBody('mainBody/jsp/resetPassword')">修改密码</a></li>
                    </ul>
                </li>
            </ul>

        </div>
    </div>


    <div id="main-content">
		<!-- 页面加载 -->
    </div>

</div>


<div id="footer">
    2017 &copy; www.noomn.simplecrm.com
</div>

<a class="twitter" data-title="Goto twitter?" href="http://twitter.com/craftpip">Goto twitter</a>
</body>

<script src="${pageContext.request.contextPath}/mainBody/js/bootstrap-fileupload.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/mainBody/js/jquery.nicescroll.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/mainBody/js/jquery.scrollto.min.js"></script>
<script src="${pageContext.request.contextPath}/mainBody/js/common-scripts.js"></script>
<script src="${pageContext.request.contextPath}/Util/js/bootstrapValidator0.5.2/js/bootstrapValidator.min.js"></script>
<script src="${pageContext.request.contextPath}/Util/js/bootstrapValidator0.5.2/js/language/zh_CN.js"></script>

<!-- 组织结构 -->
<script src="${pageContext.request.contextPath}/mainBody/js/jquery.datatables.js"></script>
<script src="${pageContext.request.contextPath}/mainBody/js/dt_bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/Util/js/zTree_v3-master/js/jquery.ztree.all.js"></script>
<script src="${pageContext.request.contextPath}/Util/js/myTree.js"></script>


<%-- <script src="${pageContext.request.contextPath}/Util/js/bootstrap-3.3.7-dist/js/bootstrap.js"></script> --%>
<script src="${pageContext.request.contextPath}/mainBody/js/bootstrap.min.js"></script>

<!-- 校验 -->
<script src="${pageContext.request.contextPath}/mainBody/js/bootstrap-inputmask.min.js"></script>

<link rel="stylesheet" href="${pageContext.request.contextPath}/Util/js/craftpip-jquery-confirm-e3e217e/css/jquery-confirm.css">
<script src="${pageContext.request.contextPath}/Util/js/craftpip-jquery-confirm-e3e217e/js/jquery-confirm.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/mainBody/js/jquery.bootstrap.wizard.min.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/mainBody/js/chosen.jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/mainBody/js/clockface.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/mainBody/js/jquery.tagsinput.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/mainBody/js/bootstrap-datepicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/mainBody/js/date.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/mainBody/js/daterangepicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/mainBody/js/bootstrap-colorpicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/mainBody/js/bootstrap-timepicker.js"></script>


<!-- 日期 -->
<script type="text/javascript" src="${pageContext.request.contextPath}/Util/js/bootstrap-datetimepicker-master/js/bootstrap-datetimepicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/Util/js/bootstrap-datetimepicker-master/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>

<!-- 提示信息 -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/mainBody/css/jquery.gritter.css"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/mainBody/js/jquery.gritter.js"></script>

<!-- 日历 -->
<script type="text/javascript" src="${pageContext.request.contextPath}/mainBody/js/jquery-ui-1.9.2.custom.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/mainBody/js/jquery.slimscroll.min.js"></script>
<script src="${pageContext.request.contextPath}/mainBody/js/fullcalendar.min.js"></script>

<script src="${pageContext.request.contextPath}/Util/js/echarts/echarts.min.js" type="text/javascript"></script>

<!-- pdfjs -->
<script src="${pageContext.request.contextPath}/Util/js/PDFJS/pdf.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/Util/js/PDFJS/pdf.worker.js" type="text/javascript"></script>

<!-- websocket -->
<script src="${pageContext.request.contextPath}/Util/js/socket/sockjs-0.3.min.js"></script>

<link href="${pageContext.request.contextPath}/mainBody/css/jquery.fancybox.css" rel="stylesheet" />
<script src="${pageContext.request.contextPath}/mainBody/js/jquery.bootstrap.wizard.min.js"></script>

<script src="${pageContext.request.contextPath}/Util/js/util.js"></script>


<script type="text/javascript">
	var loadMainBody = function(jspURL) {
		$('#main-content').load("${pageContext.request.contextPath}/mainBodys/loadMainBody/", {jspURL: jspURL});
	}
 	$(function() {
		loadMainBody('mainBody/jsp/consoleDesk');
		connect();
		
/* 		提示窗口
		$.gritter.add({
            // (string | mandatory) the heading of the notification
            title: '新任务',
            // (string | mandatory) the text inside the notification
            //text: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus eget tincidunt velit. Cum sociis natoque penatibus et <a href="#" style="color:#ccc">magnis dis parturient</a> montes, nascetur ridiculus mus.',
            text: '<a href="http://localhost:8080/simpleCRM">http://www.baidu.com</a>',
            // (string | optional) the image to display on the left
            image: 'img/avatar-mini.png',
            // (bool | optional) if you want it to fade out on its own or just sit there
            sticky: true,
            // (int | optional) the time you want it to be alive for before fading out
            time: '',
            // (string | optional) the class name you want to apply to that specific message
            class_name: 'my-sticky-class'
        }); */
	})
	
</script>

</html>
