<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>500</title>

<link href="${pageContext.request.contextPath}/mainBody/css/bootstrap.min.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/mainBody/css/bootstrap-responsive.min.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/mainBody/css/font-awesome.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/mainBody/css/style.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/mainBody/css/style-responsive.css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/mainBody/css/style-default.css" rel="stylesheet" id="style_color" />

</head>
<body class="error-500">
	<div class="error-wrap">
		<h1>Ouch!</h1>
		<h2>系统崩溃了</h2>
		<div class="metro green">
			<span> 5 </span>
		</div>
		<div class="metro yellow">
			<span> 0 </span>
		</div>
		<div class="metro purple">
			<span> 0 </span>
		</div>
		<p>
			我们很快将会解决这个问题. <a href="${pageContext.request.contextPath}/"> 点击这里返回登录页</a>
		</p>
	</div>
</body>

</html>
