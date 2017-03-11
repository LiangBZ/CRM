<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>container</title>
	<!-- jquery -->
    <script src="${pageContext.request.contextPath}/Util/js/jquery/jquery.2.1.1.min.js"></script>
	<link href="${pageContext.request.contextPath}/mainBody/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/mainBody/css/bootstrap-responsive.min.css" rel="stylesheet"/>
   	<link href="${pageContext.request.contextPath}/mainBody/css/font-awesome.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/mainBody/css/style.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/mainBody/css/style-responsive.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/mainBody/css/style-default.css" rel="stylesheet" id="style_color"/>
</head>

<body class="fixed-top">
<div id="header" class="navbar navbar-inverse navbar-fixed-top">

    <div class="navbar-inner">
        <div class="container-fluid">

            <div class="sidebar-toggle-box hidden-phone">
                <div class="icon-reorder tooltips" data-placement="right" data-original-title="缩放菜单"></div>
            </div>


            <a class="brand" href="${pageContext.request.contextPath}">
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
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <img src="${pageContext.request.contextPath}/mainBody/img/jpg/avatar1_small.jpg" alt="">
                            <span class="username">Jhon Doe</span>
                            <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu extended logout">
                            <li><a href="#"><i class="icon-user"></i>我的资料</a></li>
                            <li><a href="#"><i class="icon-cog"></i>我的设置</a></li>
                            <li><a href="login.html"><i class="icon-key"></i>退出</a></li>
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
                    <a href="javascript:void(0)" class="">
                        <i class="icon-book"></i>
                        <span>成员管理</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="javascript:void(0)">组织结构</a></li>
                        <li><a class="" href="javascript:void(0)">职务权限</a></li>
                        <li><a class="" href="javascript:void(0)">成员信息</a></li>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:void(0)" class="">
                        <i class="icon-cogs"></i>
                        <span>通知</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="javascript:void(0)">收到的通知</a></li>
                        <li><a class="" href="javascript:void(0)">发出的通知</a></li>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:void(0)" class="">
                        <i class="icon-tasks"></i>
                        <span>流程</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="javascript:void(0)">创建流程</a></li>
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
                    <a href="javascript:void(0)" class="">
                        <i class="icon-fire"></i>
                        <span>工作汇报</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="javascript:void(0)">我的工作汇报</a></li>
                        <li><a class="" href="javascript:void(0)">我可以查看的工作汇报</a></li>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a class="" href="javascript:void(0)">
                        <i class="icon-trophy"></i>
                        <span>客户管理</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a href="javascript:void(0)" class="">我跟进的客户</a></li>
                        <li><a href="javascript:void(0)" class="">我可以查看的客户</a></li>
                    </ul>
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
                        <li><a class="" href="javascript:void(0)">我的商机</a></li>
                        <li><a class="" href="javascript:void(0)">我可以查看的商机</a></li>
                        <li><a class="" href="javascript:void(0)">商机分析</a></li>
                    </ul>
                </li>
                <li class="sub-menu">
                    <a href="javascript:void(0)" class="">
                        <i class="icon-glass"></i>
                        <span>产品</span>
                        <span class="arrow"></span>
                    </a>
                    <ul class="sub">
                        <li><a class="" href="javascript:void(0)">产品列表</a></li>
                        <li><a class="" href="javascript:void(0)">修改产品信息</a></li>
                    </ul>
                </li>

                <li>
                    <a class="" href="${pageContext.request.contextPath}">
                        <i class="icon-user"></i>
                        <span>重新登录</span>
                    </a>
                </li>
            </ul>

        </div>
    </div>


    <div id="main-content">

    </div>

</div>


<div id="footer">
    2017 &copy; www.noomn.simplecrm.com
</div>

</body>

<script src="${pageContext.request.contextPath}/mainBody/js/jquery.nicescroll.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/mainBody/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/mainBody/js/jquery.scrollto.min.js"></script>
<script src="${pageContext.request.contextPath}/mainBody/js/common-scripts.js"></script>

<script type="text/javascript">
	var loadMainBody = function(jspURL) {
		$('#main-content').load("${pageContext.request.contextPath}/mainBodys/loadMainBody", {jspURL: jspURL});
	}
 	$(function() {
		loadMainBody('mainBody/jsp/consoleDesk');
	})
</script>
</html>