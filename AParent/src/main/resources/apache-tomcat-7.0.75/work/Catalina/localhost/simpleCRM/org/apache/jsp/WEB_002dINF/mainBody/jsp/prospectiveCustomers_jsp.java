/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.75
 * Generated at: 2017-04-21 02:18:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.mainBody.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class prospectiveCustomers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t\t<h3 class=\"page-title\">(潜在客户 / 销售意向)</h3>\r\n");
      out.write("\t\t\t<ul class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">商机</a> <span class=\"divider\">/</span></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">(潜在客户 / 销售意向)</a> <span class=\"divider\">/</span></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 潜在客户--销售意向 begin -->\r\n");
      out.write("\t<div class=\"row-fluid\" data-prospective=\"prospectiveCustomers\">\r\n");
      out.write("\t\t<div class=\"span12\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"widget green\">\r\n");
      out.write("\t\t\t\t<div class=\"widget-title\">\r\n");
      out.write("\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-reorder\"></i> 潜在客户 / 销售意向\r\n");
      out.write("\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"widget-body\">\r\n");
      out.write("\t\t\t\t\t<table\r\n");
      out.write("\t\t\t\t\t\tclass=\"table table-striped table-advance table-bordered table-hover\"\r\n");
      out.write("\t\t\t\t\t\tdata-prospective=\"prospectiveCustomers\">\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t<th>客户名称</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>客户类型</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>产品编号</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>产品名称</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>预计成交价格(￥)</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>预计成交时间</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>销售阶段</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>(潜在 / 销售)分析</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>查看</th>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"odd gradex\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>天阳宏业</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>中型客户</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>SX098765</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>一米软件</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>1908299.00</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>2017/3/30</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>10.5</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><span class=\"text-success\"><b>☆☆☆☆☆</b></span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"width: 7%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn btn-success\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wrench\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"odd gradex\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>一品威客</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>小型客户</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>SX032912</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>和兴农业系统</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>345231.00</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>2017/4/10</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>15</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><span class=\"text-warning\"><b>☆☆</b></span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"width: 7%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn btn-success\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-wrench\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /潜在客户--销售意向 /end -->\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"row-fluid\" data-char=\"charLine\">\r\n");
      out.write("\t\t<!-- 沟通反馈 begin -->\r\n");
      out.write("\t\t<div class=\"span6\">\r\n");
      out.write("\t\t\t<div class=\"widget yellow\">\r\n");
      out.write("\t\t\t\t<div class=\"widget-title\">\r\n");
      out.write("\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-reorder\"></i> 沟通反馈\r\n");
      out.write("\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"widget-body\" style=\"height:400px;padding:0;\">\r\n");
      out.write("\t\t\t\t\t<div data-char=\"feedbackCount\" class=\"chart\" style=\"height:400px;\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /沟通反馈 /end -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- 销售金额 begin -->\r\n");
      out.write("\t\t<div class=\"span6\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"widget purple\">\r\n");
      out.write("\t\t\t\t<div class=\"widget-title\">\r\n");
      out.write("\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-reorder\"></i> 销售金额\r\n");
      out.write("\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"widget-body\" style=\"padding:0;height:400px;\">\r\n");
      out.write("\t\t\t\t\t<div data-char=\"money\" class=\"chart\" style=\"height:400px;\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /销售金额 /end -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 销售金额 begin -->\r\n");
      out.write("\t<!-- <div class=\"row-fluid\" data-char=\"charPie\">\r\n");
      out.write("\t\t<div class=\"span12\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"widget purple\">\r\n");
      out.write("\t\t\t\t<div class=\"widget-title\">\r\n");
      out.write("\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-reorder\"></i> 销售金额\r\n");
      out.write("\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"widget-body\" style=\"padding:0;height:400px;\">\r\n");
      out.write("\t\t\t\t\t<div data-char=\"money\" class=\"chart\" style=\"height:400px;\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div> -->\r\n");
      out.write("\t<!-- /销售金额 /end -->\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"space20\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tinitProspective();\r\n");
      out.write("\t\tinitChars();\r\n");
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
