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
   <%--  <script src="${pageContext.request.contextPath}/mainBody/js/jquery-1.8.2.min.js"></script> --%>
    <script src="${pageContext.request.contextPath}/Util/js/jquery/jquery.2.1.1.min.js"></script>
	<link href="${pageContext.request.contextPath}/mainBody/css/bootstrap-fileupload.css" rel="stylesheet"/>
	<link href="${pageContext.request.contextPath}/mainBody/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/mainBody/css/bootstrap-responsive.min.css" rel="stylesheet"/>
   	<link href="${pageContext.request.contextPath}/mainBody/css/font-awesome.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/mainBody/css/style.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/mainBody/css/style-responsive.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/mainBody/css/style-default.css" rel="stylesheet" id="style_color"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Util/js/bootstrapValidator0.5.2/css/bootstrapValidator.min.css">
	
	<!-- 组织结构 -->
	<link href="${pageContext.request.contextPath}/Util/Font-Awesome-master/css/font-awesome.css" rel="stylesheet" />
	<link href="${pageContext.request.contextPath}/Util/js/zTree_v3-master/css/metroStyle/metroStyle.css" rel="stylesheet" />
	
	<%@ include file="/WEB-INF/Util/jsp/alertModal.jsp" %>
	<%@ include file="/WEB-INF/Util/jsp/organizing_editDepartment.jsp" %>
	<%@ include file="/WEB-INF/Util/jsp/organizing_addDepartment.jsp" %>
	
	<script type="text/javascript">
		$.ajaxSetup({
			cache:false
		});
	</script>
</head>

<body class="fixed-top">
<div id="header" class="navbar navbar-inverse navbar-fixed-top">

    <div class="navbar-inner">
        <div class="container-fluid">

            <div class="sidebar-toggle-box hidden-phone">
                <div class="icon-reorder tooltips" data-placement="right" data-original-title="缩放菜单"></div>
            </div>


            <a class="brand" href="${pageContext.request.contextPath}/logout/removeSession">
                <img src="${pageContext.request.contextPath}/mainBody/img/png/logo.png" alt="Metro Lab"/>
            </a>


            <a class="btn btn-navbar collapsed" id="main_menu_trigger" data-toggle="collapse"
               data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="arrow"></span>
            </a>

            <div id="top_menu" class="nav notify-row">

                <ul class="nav top-menu">

                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="icon-tasks"></i>
                            <span class="badge badge-important">6</span>
                        </a>
                        <ul class="dropdown-menu extended tasks-bar">
                            <li>
                                <p>你有6条任务</p>
                            </li>
                            <li>
                                <a href="#">
                                    <div class="task-info">
                                        <div class="desc">控制台</div>
                                        <div class="percent">44%</div>
                                    </div>
                                    <div class="progress progress-striped active no-margin-bot">
                                        <div class="bar" style="width: 44%;"></div>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <div class="task-info">
                                        <div class="desc">数据库更新</div>
                                        <div class="percent">65%</div>
                                    </div>
                                    <div class="progress progress-striped progress-success active no-margin-bot">
                                        <div class="bar" style="width: 65%;"></div>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <div class="task-info">
                                        <div class="desc">手机开发进度</div>
                                        <div class="percent">87%</div>
                                    </div>
                                    <div class="progress progress-striped progress-info active no-margin-bot">
                                        <div class="bar" style="width: 87%;"></div>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <div class="task-info">
                                        <div class="desc">手机App进度</div>
                                        <div class="percent">33%</div>
                                    </div>
                                    <div class="progress progress-striped progress-warning active no-margin-bot">
                                        <div class="bar" style="width: 33%;"></div>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <div class="task-info">
                                        <div class="desc">控制台</div>
                                        <div class="percent">90%</div>
                                    </div>
                                    <div class="progress progress-striped progress-danger active no-margin-bot">
                                        <div class="bar" style="width: 90%;"></div>
                                    </div>
                                </a>
                            </li>
                            <li class="external">
                                <a href="#">查看所有任务</a>
                            </li>
                        </ul>
                    </li>


                    <li class="dropdown" id="header_inbox_bar">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="icon-envelope-alt"></i>
                            <span class="badge badge-important">5</span>
                        </a>
                        <ul class="dropdown-menu extended inbox">
                            <li>
                                <p>你有5条消息</p>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="photo"><img src="${pageContext.request.contextPath}/mainBody/img/png/avatar-mini.png" alt="avatar"/></span>
									<span class="subject">
									<span class="from">Jonathan Smith</span>
									<span class="time">Just now</span>
									</span>
									<span class="message">
									    Hello, 这是个消息列子.
									</span>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="photo"><img src="${pageContext.request.contextPath}/mainBody/img/png/avatar-mini.png" alt="avatar"/></span>
									<span class="subject">
									<span class="from">Jhon Doe</span>
									<span class="time">10 mins</span>
									</span>
									<span class="message">
									 Hi, 最近咋样?
									</span>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="photo"><img src="${pageContext.request.contextPath}/mainBody/img/png/avatar-mini.png" alt="avatar"/></span>
									<span class="subject">
									<span class="from">Jason Stathum</span>
									<span class="time">3 hrs</span>
									</span>
									<span class="message">
									    This is awesome dashboard.
									</span>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="photo"><img src="${pageContext.request.contextPath}/mainBody/img/png/avatar-mini.png" alt="avatar"/></span>
									<span class="subject">
									<span class="from">Jondi Rose</span>
									<span class="time">Just now</span>
									</span>
									<span class="message">
									    Hello, this is metrolab
									</span>
                                </a>
                            </li>
                            <li>
                                <a href="#">See all messages</a>
                            </li>
                        </ul>
                    </li>


                    <li class="dropdown" id="header_notification_bar">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">

                            <i class="icon-bell-alt"></i>
                            <span class="badge badge-warning">7</span>
                        </a>
                        <ul class="dropdown-menu extended notification">
                            <li>
                                <p>你有7条提示信息</p>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="label label-important"><i class="icon-bolt"></i></span>
                                    Server #3 overloaded.
                                    <span class="small italic">34 mins</span>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="label label-warning"><i class="icon-bell"></i></span>
                                    Server #10 not respoding.
                                    <span class="small italic">1 Hours</span>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="label label-important"><i class="icon-bolt"></i></span>
                                    Database overloaded 24%.
                                    <span class="small italic">4 hrs</span>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="label label-success"><i class="icon-plus"></i></span>
                                    New user registered.
                                    <span class="small italic">Just now</span>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="label label-info"><i class="icon-bullhorn"></i></span>
                                    Application error.
                                    <span class="small italic">10 mins</span>
                                </a>
                            </li>
                            <li>
                                <a href="#">See all notifications</a>
                            </li>
                        </ul>
                    </li>


                </ul>
            </div>

            <div class="top-nav ">
                <ul class="nav pull-right top-menu">

                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-userInfo="userInfo">
                            <img src="${employeeImgPath}"  style="width:29px;height:29px;">
                            <span class="username">${sessionScope.employeeRealName}</span>
                            <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu extended logout">
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
                        <i class="icon-tasks"></i>
                        <span>流程</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="javascript:void(0)">申请流程</a></li>
                        <li><a class="" href="javascript:void(0)">需要我审批的流程</a></li>
                        <li><a class="" href="javascript:void(0)">历史流程</a></li>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:void(0)" class="">
                        <i class="icon-th"></i>
                        <span>任务</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="javascript:void(0)">收到的任务</a></li>
                        <li><a class="" href="javascript:void(0)">发布任务</a></li>
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
                        <span>外勤拜访</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a href="javascript:void(0)" class="">我的外勤拜访</a></li>
                        <li><a href="javascript:void(0)" class="">我可以查看的拜访</a></li>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:void(0)" class="">
                        <i class="icon-file-alt"></i>
                        <span>商机</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="javascript:void(0)" onclick="loadMainBody('mainBody/jsp/showCustom')">查看商机</a></li>
                        <li><a class="" href="javascript:void(0)">添加商机</a></li>
                        <li><a class="" href="javascript:void(0)">商机分析</a></li>
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
<script src="${pageContext.request.contextPath}/Util/js/bootstrap-3.3.7-dist/js/bootstrap.js"></script>

<!-- 校验 -->
<script src="${pageContext.request.contextPath}/mainBody/js/bootstrap-inputmask.min.js"></script>

<script src="${pageContext.request.contextPath}/Util/js/util.js"></script>

<link rel="stylesheet" href="${pageContext.request.contextPath}/Util/js/craftpip-jquery-confirm-e3e217e/css/jquery-confirm.css">
<script src="${pageContext.request.contextPath}/Util/js/craftpip-jquery-confirm-e3e217e/js/jquery-confirm.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/mainBody/js/jquery.bootstrap.wizard.min.js"></script>

<script type="text/javascript">
	var loadMainBody = function(jspURL) {
		$('#main-content').load("${pageContext.request.contextPath}/mainBodys/loadMainBody/", {jspURL: jspURL});
	}
 	$(function() {
		loadMainBody('mainBody/jsp/consoleDesk');
	})
	
</script>
</html>
