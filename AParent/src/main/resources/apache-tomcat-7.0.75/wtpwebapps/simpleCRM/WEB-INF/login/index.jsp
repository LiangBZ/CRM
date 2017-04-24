<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">

<title>登录</title>

	<!-- jquery -->
    <script src="${pageContext.request.contextPath}/Util/js/jquery/jquery.2.1.1.min.js"></script>

    <!-- bootstrap & fontawesome -->
    <script src="${pageContext.request.contextPath}/Util/js/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Util/js/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/login/fonts/font-awesome/4.2.0/css/font-awesome.min.css"/>

    <!-- text fonts -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/login/fonts/fonts-googleapis/fonts.googleapis.com.css"/>

    <!-- ace styles -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/login/css/ace.min.css"/>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/Util/js/bootstrapValidator0.5.2/css/bootstrapValidator.min.css">
    <script src="${pageContext.request.contextPath}/Util/js/bootstrapValidator0.5.2/js/bootstrapValidator.min.js"></script>
    <script src="${pageContext.request.contextPath}/Util/js/bootstrapValidator0.5.2/js/language/zh_CN.js"></script>
	
	<script type="text/javascript" src="${pageContext.request.contextPath}/Util/js/security.js"></script>
	
	<link rel="stylesheet" href="${pageContext.request.contextPath}/Util/js/craftpip-jquery-confirm-e3e217e/css/jquery-confirm.css">
	<script src="${pageContext.request.contextPath}/Util/js/craftpip-jquery-confirm-e3e217e/js/jquery-confirm.js"></script>
	
	
	<!-- MyUtil.js -->
	<script type="text/javascript" src="${pageContext.request.contextPath}/Util/js/util.js"></script>
	
	<!-- 安全校验 -->
	<%@ include file="/WEB-INF/Util/jsp/securityRSA.jsp" %>
	<!-- 模态弹出框 -->
	<%-- <%@ include file="/WEB-INF/Util/jsp/alertModal.jsp" %> --%>
</head>
<body class="login-layout">
<div class="main-container">
    <div class="main-content">
        <div class="row">
            <div class="col-sm-10 col-sm-offset-1">
                <div class="login-container">

                    <div class="space-12"></div>

                    <div class="center">
                        <h1>
                            <i class="ace-icon fa fa-leaf green"></i>
                            <span class="red">CRM</span>
                            <span class="white" id="id-text2">客户关系</span>
                        </h1>
                        <h4 class="blue" id="id-company-text">noomn.com</h4>
                    </div>

                    <div class="space-6"></div>
			
					<!-- .position-relative begin -->
                    <div class="position-relative">

						<!-- 用户登录 begin -->
                        <!-- login-box-->
                        <div id="login-box" class="login-box visible widget-box no-border">
                            <div class="widget-body">
                                <div class="widget-main">
                                    <h4 class="header blue lighter bigger">
                                        <i class="ace-icon fa fa-coffee green"></i>
                                        	请输入您的信息
                                    </h4>

                                    <div class="space-6"></div>

                                    <!-- 登录表单 -->
                                    <form data-form="loginBoxForm" action="${pageContext.request.contextPath}/logins/login" method="post">
                                        <!-- 用户名 -->
                                        <div class="form-group">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                                <input type="text" class="form-control" placeholder="用户名.." name="employeeUsername" value="liangbozhao" />
                                            </div>
                                        </div><!-- /用户名 -->

                                        <!-- 密码 -->
                                        <div class="form-group">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                                <input type="password" class="form-control" placeholder="密码.." name="password" value="123456" />
                                                <input type="hidden" name="employeeRSAPassword"/>
                                            </div>
                                        </div><!-- /密码 -->

                                        <div class="space"></div>

                                            <div class="clearfix">
                                            	
                                                <button data-submit="submitButton" data-formName="loginBoxForm" type="button" class="width-35 pull-right btn btn-sm btn-primary">
                                                    <i class="ace-icon fa fa-key"></i>
                                                    <span class="bigger-110">登录</span>
                                                </button>
                                            </div>

                                            <div class="space-4"></div>
                                    </form><!-- /登录表单 -->

                                </div><!-- /.widget-main -->
                                
                                <div class="toolbar clearfix mytoolbar center">
                                    <a href="#" data-target="#forgot-box" class="forgot-password-link">
                                        <i class="ace-icon fa fa-arrow-left"></i>
                                       	 忘记密码
                                    </a>
                                </div>
                                
                            </div><!-- /.widget-body -->
                        </div><!-- /.login-box -->
                        <!-- 用户登录 /end -->
						
						
						<!-- 找回密码 begin -->
                        <div id="forgot-box" class="forgot-box widget-box no-border">
                            <div class="widget-body">
                                <div class="widget-main">
                                    <h4 class="header red lighter bigger">
                                        <i class="ace-icon fa fa-key"></i>
                                        	重置密码
                                    </h4>

                                    <div class="space-6"></div>
                                    <p>
                                       	 输入您的电子邮件和接收指令
                                    </p>

                                    <!--  找回密码表单 -->
                                    <form data-form="forgotBoxForm" action="#">
                                    	
                                    	<!-- employeeUsername -->
                                        <div class="form-group">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                                <input name="employeeUsername" type="text" class="form-control" placeholder="用户名.." />
                                            </div>
                                        </div><!-- /employeeUsername -->
                                    
                                        <!-- email -->
                                        <div class="form-group">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                                                <input name="employeeEmail" type="email" class="form-control" placeholder="Email.." />
                                            </div>
                                        </div><!-- /email -->
                                        
                                        <!-- employeeInstruct -->
                                        <div class="form-group">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-wrench"></i></span>
                                                <input name="employeeInstruct" type="text" class="form-control" placeholder="验证码.." />
                                            </div>
                                        </div><!-- /employeeInstruct -->
                                        
                                        <div class="clearfix">
                                        	<button data-sendEmail="sendEmailButton" onclick="sendEmailForResetPassword(30);" type="button" class="width-48 pull-left btn btn-sm btn-danger">
                                                <i class="ace-icon fa fa-lightbulb-o"></i>
                                                <span data-sendEmail="sendEmailButtonSpan" class="bigger-110">发送邮件</span>
                                            </button>
                                        	<button onclick="resetPassword();" data-submit="submitButton" type="button" class="width-48 pull-right btn btn-sm btn-danger">
                                                <i class="ace-icon fa fa-lightbulb-o"></i>
                                                <span data-submitButtonSpan="data-submitButtonSpan" class="bigger-110">重置密码</span>
                                            </button>
                                        </div>
                                    </form><!--  找回密码表单 -->
                                </div><!-- /.widget-main -->

                                <div class="toolbar center">
                                    <a href="#" data-target="#login-box" class="back-to-login-link">
                                       	 返回登录
                                        <i class="ace-icon fa fa-arrow-right"></i>
                                    </a>
                                </div>
                            </div><!-- /.widget-body -->
                        </div><!-- /.forgot-box -->
                        <!-- 找回密码 /end -->


						<!-- 用户注册 begin-->
                        <div id="signup-box" class="signup-box widget-box no-border">
                            <div class="widget-body">
                                <div class="widget-main">
                                    <h4 class="header green lighter bigger">
                                        <i class="ace-icon fa fa-users blue"></i>
                                       	 用户注册
                                    </h4>

                                    <div class="space-6"></div>
                                    <p>填写信息: </p>

                                    <!-- 注册表单 -->
                                    <form data-form="signupBoxForm">
                                        <!-- email -->
                                        <div class="form-group">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                                                <input name="email" type="email" class="form-control" placeholder="Email.."  />
                                            </div>
                                        </div><!-- /email -->

                                        <!-- 用户名 -->
                                        <div class="form-group">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                                <input name="username" type="text" class="form-control" placeholder="用户名.." />
                                            </div>
                                        </div><!-- /用户名 -->

                                        <!-- 密码 -->
                                        <div class="form-group">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                                <input name="password" type="password" class="form-control" placeholder="密码.."  />
                                            </div>
                                        </div><!-- /密码 -->

                                        <!-- 确认密码 -->
                                        <div class="form-group">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-retweet"></i></span>
                                                <input name="confirmPassword" type="password" class="form-control" placeholder="确认密码.."  />
                                            </div>
                                        </div><!-- /确认密码 -->

                                            <label class="block">
                                                <input type="checkbox" class="ace"/>
														<span class="lbl">
															接受
															<a href="#">用户协议</a>
														</span>
                                            </label>

                                            <div class="space-8"></div>

                                            <div class="clearfix">
                                                <button data-reset="resetButton" type="reset" class="width-30 pull-left btn btn-sm">
                                                    <i class="ace-icon fa fa-refresh"></i>
                                                    <span class="bigger-110">重置</span>
                                                </button>

                                                <button data-submit="submitButton" type="button" class="width-65 pull-right btn btn-sm btn-success">
                                                    <span class="bigger-110">注册</span>
                                                    <i class="ace-icon fa fa-arrow-right icon-on-right"></i>
                                                </button>
                                            </div>
                                    </form><!-- /注册表单 -->
                                </div>

                                <div class="toolbar center">
                                    <a href="#" data-target="#login-box" class="back-to-login-link">
                                        <i class="ace-icon fa fa-arrow-left"></i>
                                        	返回登录
                                    </a>
                                </div>
                            </div><!-- /.widget-body -->
                        </div><!-- /.signup-box -->
                        <!-- 用户注册 /end-->
                        
                    </div><!-- /.position-relative -->



					<!-- 主题 begin -->
                    <div class="navbar-fixed-top align-right">
                        <br/>
                        &nbsp;
                        <a id="btn-login-dark" href="#">Dark</a>
                        &nbsp;
                        <span class="blue">/</span>
                        &nbsp;
                        <a id="btn-login-blur" href="#">Blur</a>
                        &nbsp;
                        <span class="blue">/</span>
                        &nbsp;
                        <a id="btn-login-light" href="#">Light</a>
                        &nbsp; &nbsp; &nbsp;
                    </div>
                    <!-- 主题 /end -->
                </div>
            </div><!-- /.col -->
        </div><!-- /.row -->
    </div><!-- /.main-content -->
</div><!-- /.main-container -->

<!-- inline scripts related to this page -->
<script type="text/javascript">

    jQuery(function ($) {
        $(document).on('click', '.toolbar a[data-target]', function (e) {
            e.preventDefault();
            var target = $(this).data('target');
            $('.widget-box.visible').removeClass('visible');//hide others
            $(target).addClass('visible');//show target
        });
    });

    //you don't need this, just used for changing background
    jQuery(function ($) {
        $('#btn-login-dark').on('click', function (e) {
            $('body').attr('class', 'login-layout');
            $('#id-text2').attr('class', 'white');
            $('#id-company-text').attr('class', 'blue');
        });
        $('#btn-login-light').on('click', function (e) {
            $('body').attr('class', 'login-layout light-login');
            $('#id-text2').attr('class', 'grey');
            $('#id-company-text').attr('class', 'blue');
        });
        $('#btn-login-blur').on('click', function (e) {
            $('body').attr('class', 'login-layout blur-login');
            $('#id-text2').attr('class', 'white');
            $('#id-company-text').attr('class', 'light-blue');
        });
    });
</script>

<script type="text/javascript">
    var option =
    {
        message: 'This value is not valid',
        feedbackIcons:{
            valid: 'glyphicon glyphicon-ok',
            invalid:'glyphicon glyphicon-remove',
            validating:'glyphicon glyphicon-refresh'
        },
        fields: {
        	employeeEmail: {
                validators: {
                    notEmpty: {
                        message: '请输入邮箱'
                    },
                    emailAddress: {
                        message: '请输入正确的邮件地址'
                    }
                }
            },
            employeeInstruct: {
                validators: {
                    notEmpty: {
                        message: '请输入验证码'
                    }
                }
            },
            employeeUsername: {
                validators: {
                    notEmpty: {
                        message: ' 用户名不能为空'
                    }
                }
            },
            password: {
                validators: {
                    notEmpty: {
                        message: '密码不能为空'
                    },
                }
            },
            confirmPassword: {
                validators: {
                    notEmpty: {message: '请再次输入密码'},
                    identical: {  //比较是否相同
                        field: 'password',  //需要进行比较的input name值
                        message: '两次密码不一致'
                    }
                }
            },
        }
    }
 
    $(function() {
        var $form = $("form");
        $form.bootstrapValidator(option);
    })

</script>

<script type="text/javascript">
	//提交: 登录按钮
	$('form[data-form="loginBoxForm"]').find(':button[data-submit="submitButton"]').click(function() {
		var passwordVal = $('form[data-form="loginBoxForm"]').find(':input[name="password"]').val();
		var publicKeyModulus = "${publicKeyModulus}";
		var publicExponent = "${publicExponent}";
		passwordVal = encryptRSA(publicKeyModulus, publicExponent, passwordVal);
		$('form[data-form="loginBoxForm"]').find(':input[name="employeeRSAPassword"]').val(passwordVal);
		$('form[data-form="loginBoxForm"]').find(':button[type="submit"]').click();
	});
</script>

<script type="text/javascript">
	//消息提示
	showInfos("${infos}", "${infos.message}", "${infos.obj}", "${pageContext.request.contextPath}");
</script>

<script type="text/javascript">

	//封装一个加密方法，m对应modulus，e对应public exponent，text是明文
	function encryptRSA(m, e, text) {
		var key = RSAUtils.getKeyPair(e, '', m);
		return RSAUtils.encryptedString(key, text);
	};

</script>

<script type="text/javascript">

	//倒计时
	var timeID = 0;
	function timeDown(timeNow) {
		if(--timeNow >= 0) {
			var $sendEmailButtonSpan = $('span[data-sendEmail="sendEmailButtonSpan"]');
			$sendEmailButtonSpan.html(timeNow + "秒后再次发送");
			timeID = setTimeout(function() { 
				timeDown(timeNow);
	        }, 
	        1000);
		}
	}

	//发送邮件
	function sendEmailForResetPassword(timeNow) {
		$form = $('form[data-form="forgotBoxForm"]');
		$form.data('bootstrapValidator').resetForm();
			
		$form = $('form[data-form="forgotBoxForm"]');
		var isTrue = false;
		$form.data("bootstrapValidator").validateField('employeeUsername');
		$form.data("bootstrapValidator").validateField('employeeEmail');
		isTrue = $form.data("bootstrapValidator").isValidField('employeeUsername');
		if (isTrue == false) return;
		isTrue = $form.data("bootstrapValidator").isValidField('employeeEmail');
		if (isTrue == false) return;
		
		var $sendEmailButton = $(':button[data-sendEmail="sendEmailButton"]');
		var $sendEmailButtonSpan = $('span[data-sendEmail="sendEmailButtonSpan"]');
		$('form[data-form="forgotBoxForm"]').find(":input").attr("disabled", true);
		$('form[data-form="forgotBoxForm"]').find(":button").attr("disabled", true);
		
		
		var employeeUsernameVal = $form.find(':input[name="employeeUsername"]').val();
		var employeeEmailVal = $form.find(':input[name="employeeEmail"]').val();
		$.ajax({
			url : "${pageContext.request.contextPath}/logins/sendEmailForResetPassword",
			type : "POST",
			dataType : "json",
			data : {
				employeeUsername : employeeUsernameVal,
				employeeEmail : employeeEmailVal
			},
			beforeSend : function() {
				$sendEmailButtonSpan.html(timeNow  + "秒后再次发送" );
				timeDown(timeNow);
			},
			complete: function(){
				clearTimeout(timeID);
				var $sendEmailButton = $(':button[data-sendEmail="sendEmailButton"]');
				var $sendEmailButtonSpan = $('span[data-sendEmail="sendEmailButtonSpan"]');
				$sendEmailButtonSpan.html("发送邮件");
				$('form[data-form="forgotBoxForm"]').find(":input").removeAttr("disabled");
				$('form[data-form="forgotBoxForm"]').find(":button").removeAttr("disabled");
			},
			success : function(data) {
				setAlertModalTitleAndBody("发送邮件", data.obj);
				$('div[data-Modal="alertModal"]').modal('show');
			},
			error : function() {
				timeNow = 0;
				clearTimeout(timeID);
				setAlertModalTitleAndBody("发送邮件", "发送失败，我们会尽快修复该问题。");
				$('div[data-Modal="alertModal"]').modal('show');
			}
		});
	}

	//重置密码
	function resetPassword() {
		$form = $('form[data-form="forgotBoxForm"]');

		var isTrue = $form.bootstrapValidator('validate').data('bootstrapValidator').isValid();
		if (isTrue == false) return;
		
		$('form[data-form="forgotBoxForm"]').find('span[data-submitButtonSpan="data-submitButtonSpan"]').html("正在重置");
		$('form[data-form="forgotBoxForm"]').find(":input").attr("disabled", true);
		$('form[data-form="forgotBoxForm"]').find(":button").attr("disabled", true);
		
		var employeeUsernameVal = $form.find(':input[name="employeeUsername"]').val();
		var employeeEmailVal = $form.find(':input[name="employeeEmail"]').val();
		var employeeInstructVal = $form.find(':input[name="employeeInstruct"]').val();
		$.ajax({
			async: true,
			url : "${pageContext.request.contextPath}/logins/resetPassword",
			type : "POST",
			dataType : "json",
			data : {
				employeeUsername : employeeUsernameVal,
				employeeEmail : employeeEmailVal,
				employeeInstruct : employeeInstructVal
			},
			success : function(data) {
				setAlertModalTitleAndBody("发送邮件", data.obj);
				$('div[data-Modal="alertModal"]').modal('show');
				
				$('form[data-form="forgotBoxForm"]').find(':button[data-submit="submitButton"]').removeAttr("disabled");
				$('form[data-form="forgotBoxForm"]').find('span[data-submitButtonSpan="data-submitButtonSpan"]').html("重置密码");
				$(':button[data-sendEmail="sendEmailButton"]').removeAttr("disabled");
			},
			error : function() {
				setAlertModalTitleAndBody("发送邮件", "发送失败，我们会尽快修复该问题。");
				$('div[data-Modal="alertModal"]').modal('show');
					
				$('form[data-form="forgotBoxForm"]').find(':button[data-submit="submitButton"]').removeAttr("disabled");
				$('form[data-form="forgotBoxForm"]').find('span[data-submitButtonSpan="data-submitButtonSpan"]').html("重置密码");
				$(':button[data-sendEmail="sendEmailButton"]').removeAttr("disabled");
			}
		});
	}

</script>
</body>
</html>