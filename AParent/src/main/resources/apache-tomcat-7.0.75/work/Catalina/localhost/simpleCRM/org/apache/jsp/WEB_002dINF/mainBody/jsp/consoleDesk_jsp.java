/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.75
 * Generated at: 2017-04-20 13:56:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.mainBody.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class consoleDesk_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t<div class=\"span12\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<h3 class=\"page-title\">控制台</h3>\r\n");
      out.write("\t\t\t<ul class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t<li class=\"active\">控制台</li> <span class=\"divider\">/</span></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"row-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"metro-nav\">\r\n");
      out.write("\t\t\t<div class=\"metro-nav-block nav-block-orange double\">\r\n");
      out.write("\t\t\t\t<a data-original-title=\"\" href=\"javascript:void(0);\"> <i class=\"icon-fire\"></i>\r\n");
      out.write("\t\t\t\t\t<div class=\"info\">1</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"status\">控制台</div>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"metro-nav-block nav-light-brown\">\r\n");
      out.write("\t\t\t\t<a data-original-title=\"\" href=\"javascript:void(0);\"> <i class=\"icon-book\"></i>\r\n");
      out.write("\t\t\t\t\t<div class=\"info\">2</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"status\">成员管理</div>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"metro-nav-block nav-block-yellow \">\r\n");
      out.write("\t\t\t\t<a data-original-title=\"\" href=\"javascript:void(0);\"> <i class=\"icon-th\"></i>\r\n");
      out.write("\t\t\t\t\t<div class=\"info\">3</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"status\">任务</div>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"metro-nav-block nav-light-purple double\">\r\n");
      out.write("\t\t\t\t<a data-original-title=\"\" href=\"javascript:void(0);\"> <i class=\"icon-trophy\"></i>\r\n");
      out.write("\t\t\t\t\t<div class=\"info\">4</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"status\">客户管理</div>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"metro-nav\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"metro-nav-block nav-olive\">\r\n");
      out.write("\t\t\t\t<a data-original-title=\"\" href=\"javascript:void(0);\"> <i class=\"icon-map-marker\"></i>\r\n");
      out.write("\t\t\t\t\t<div class=\"info\">5</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"status\">外勤拜访</div>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"metro-nav-block nav-light-green double\">\r\n");
      out.write("\t\t\t\t<a data-original-title=\"\" href=\"javascript:void(0);\"> <i class=\"icon-file-alt\"></i>\r\n");
      out.write("\t\t\t\t\t<div class=\"info\">6</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"status\">商机</div>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"metro-nav-block nav-light-brown double\">\r\n");
      out.write("\t\t\t\t<a data-original-title=\"\" href=\"javascript:void(0);\"> <i class=\"icon-glass\"></i>\r\n");
      out.write("\t\t\t\t\t<div class=\"info\">7</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"status\">产品</div>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"metro-nav-block nav-block-grey \">\r\n");
      out.write("\t\t\t\t<a data-original-title=\"\" href=\"javascript:void(0);\"> <i class=\"icon-user\"></i>\r\n");
      out.write("\t\t\t\t\t<div class=\"info\">8</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"status\">个人资料</div>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"space10\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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