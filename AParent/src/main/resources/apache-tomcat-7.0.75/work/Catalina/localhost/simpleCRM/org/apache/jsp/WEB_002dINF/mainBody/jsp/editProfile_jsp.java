/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.75
 * Generated at: 2017-04-21 02:19:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.mainBody.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t<div class=\"span12\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h3 class=\"page-title\">修改个人资料</h3>\r\n");
      out.write("\t\t\t<ul class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">个人资料</a> <span class=\"divider\">/</span></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">修改个人资料</a> <span class=\"divider\">/</span></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 编辑个人信息 begin -->\r\n");
      out.write("\t<div class=\"row-fluid\" data-editProfile=\"editProfile\">\r\n");
      out.write("\t\t<div class=\"span12\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"widget green\">\r\n");
      out.write("\t\t\t\t<div class=\"widget-title\">\r\n");
      out.write("\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-reorder\"></i> 修改个人资料\r\n");
      out.write("\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"widget-body\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<form action=\"#\" class=\"form-horizontal\" data-editProfile=\"editProfile\" onsubmit=\"return false;\">\r\n");
      out.write("\t\t\t\t\t\t<input name=\"employeeId\" type=\"hidden\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">邮箱</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-prepend\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"add-on\">@</span> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input name=\"employeeEmail\" type=\"email\" placeholder=\"Email Address\"  required  />\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">手机</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"employeePhone\" data-mask=\"99999999999\" required type=\"text\" class=\"span6\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("                                    <label class=\"control-label\">个人头像</label>\r\n");
      out.write("                                    <div class=\"controls\">\r\n");
      out.write("                                        <div data-provides=\"fileupload\" class=\"fileupload fileupload-new\">\r\n");
      out.write("                                            <div style=\"width: 200px; height: 150px;\" class=\"fileupload-new thumbnail\">\r\n");
      out.write("                                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employeeImgPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div data-newImg=\"newImg\" style=\"max-width: 200px; max-height: 150px; line-height: 20px;\" class=\"fileupload-preview fileupload-exists thumbnail\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div>\r\n");
      out.write("                                               <span class=\"btn btn-file\">\r\n");
      out.write("                                               \t\t<span class=\"fileupload-new\">选择头像</span>\r\n");
      out.write("                                               \t\t<span class=\"fileupload-exists\">重新选择</span>\r\n");
      out.write("                                               \t\t<input type=\"file\" class=\"default\">\r\n");
      out.write("                                               \t</span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                         <span class=\"label label-important\">注意!</span>\r\n");
      out.write("                                         <span>\r\n");
      out.write("                                       \t  \t请选择png图片作为头像\r\n");
      out.write("                                         </span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-actions\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-success btn-lg\" style=\"width:200px;\">保存</button>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"reset\" value=\"Reset\" class=\"hidden\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /编辑个人信息 /end -->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tinitEditProfileSubmit();\r\n");
      out.write("\t\tinitEditProfileForm(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.employeeId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\");\r\n");
      out.write("\t})\r\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
