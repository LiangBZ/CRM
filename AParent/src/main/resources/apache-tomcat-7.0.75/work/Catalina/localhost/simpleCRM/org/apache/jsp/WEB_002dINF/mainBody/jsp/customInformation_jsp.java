/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.75
 * Generated at: 2017-04-21 02:18:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.mainBody.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customInformation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\t\t\t<h3 class=\"page-title\">客户管理</h3>\r\n");
      out.write("\t\t\t<ul class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">客户管理</a> <span class=\"divider\">/</span></li>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 客户列表 begin -->\r\n");
      out.write("\t<div class=\"row-fluid\" data-custom=\"information\">\r\n");
      out.write("\t\t<div class=\"span12\">\r\n");
      out.write("\t\t\t<div class=\"widget orange\">\r\n");
      out.write("\t\t\t\t<div class=\"widget-title\">\r\n");
      out.write("\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-reorder\"></i> 客户信息\r\n");
      out.write("\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"widget-body\">\r\n");
      out.write("\t\t\t\t\t<div style=\"min-height: 360px;\">\r\n");
      out.write("\t\t\t\t\t\t<!-- 编辑处理 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<table\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"table table-striped table-advance table-bordered table-hover\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-custom=\"information\">\r\n");
      out.write("\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>客户名称</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>联系人姓名</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>联系人手机</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>联系人职务</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>客户状态</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>客户级别</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>详情</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>商机</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr class=\"odd gradex\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>天阳科技</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>梁伯昭</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>15605925286</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>老总</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>潜在客户</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>非常重要</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td style=\"width:5%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-success\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-tags\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td style=\"width:5%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-glass\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td style=\"width:5%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-pencil\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr class=\"odd gradex\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>新大陆</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>黄河森</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>120</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>保安</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>潜在客户</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>赢单</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-success\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-tags\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-glass\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"icon-pencil\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<!-- /编辑end -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /客户列表 /end -->\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 添加新客户 begin -->\r\n");
      out.write("\t<div class=\"row-fluid\" data-custom=\"addCustom\">\r\n");
      out.write("\t\t<div class=\"span12\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"widget green\">\r\n");
      out.write("\t\t\t\t<div class=\"widget-title\">\r\n");
      out.write("\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-reorder\"></i> 添加客户\r\n");
      out.write("\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"widget-body\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<form action=\"#\" class=\"form-horizontal\" data-custom=\"addCustom\" onsubmit=\"return false;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">客户名称(*)</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"customName\" type=\"text\" class=\"span4\" required/> \r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">客户地址(*)</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"customAddress\" type=\"text\" class=\"span6\" required/>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">联系人名字(*)</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"customLinkmanName\" type=\"text\" class=\"span4\" required/>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">联系人手机号(*)</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"customLinkmanPhone\" data-mask=\"99999999999\" required type=\"text\" class=\"span4\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">联系人职务(*)</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"customLinkmanPost\" required type=\"text\" class=\"span4\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">备注</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea name=\"customLinkmanRemark\" class=\"span6 ckeditor\" rows=\"6\" required></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">跟进人(*)</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select name=\"followEmployeeId\" required\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"chzn-select-deselect span4\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"1\">张三</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"2\">李四</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">客户级别(*)</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select name=\"customRankId\" required\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"chzn-select-deselect span4\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"84084e44-0d45-11e7-9e9d-28d2444b860a\">小型客户</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"8ac12910-0d45-11e7-9e9d-28d2444b860a\">中型客户</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"8efeffc1-0d45-11e7-9e9d-28d2444b860a\">大型客户</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">客户状态(*)</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select name=\"customStateId\" required\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"chzn-select-deselect span4\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"31b14919-0d46-11e7-9e9d-28d2444b860a\">普通</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"373c6373-0d46-11e7-9e9d-28d2444b860a\">重要</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"72c10457-0d46-11e7-9e9d-28d2444b860a\">非常重要</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-actions\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-success\">保存</button>\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn\" onclick=\"refreshCustomInfos();\">取消</button>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"reset\" value=\"Reset\" class=\"hidden\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /添加新客户 /end -->\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 编辑客户 begin -->\r\n");
      out.write("\t<div class=\"row-fluid\" data-custom=\"editCustom\">\r\n");
      out.write("\t\t<div class=\"span12\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"widget green\">\r\n");
      out.write("\t\t\t\t<div class=\"widget-title\">\r\n");
      out.write("\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-reorder\"></i> 编辑客户\r\n");
      out.write("\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"widget-body\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<form action=\"#\" class=\"form-horizontal\" data-custom=\"editCustom\" onsubmit=\"return false;\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input name=\"customId\" type=\"hidden\" class=\"span4\" required/> \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">客户名称(*)</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"customName\" type=\"text\" class=\"span4\" required/> \r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">客户地址(*)</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"customAddress\" type=\"text\" class=\"span6\" required/>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">联系人名字(*)</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"customLinkmanName\" type=\"text\" class=\"span4\" required/>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">联系人手机号(*)</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"customLinkmanPhone\" data-mask=\"99999999999\" required type=\"text\" class=\"span4\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">联系人职务(*)</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"customLinkmanPost\" required type=\"text\" class=\"span4\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">备注</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea name=\"customLinkmanRemark\" class=\"span6 ckeditor\" rows=\"6\" required></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">跟进人(*)</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select name=\"followEmployeeId\" required\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"chzn-select-deselect span4\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"1\">张三</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"2\">李四</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">客户级别(*)</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select name=\"customRankId\" required\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"chzn-select-deselect span4\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"84084e44-0d45-11e7-9e9d-28d2444b860a\">小型客户</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"8ac12910-0d45-11e7-9e9d-28d2444b860a\">中型客户</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"8efeffc1-0d45-11e7-9e9d-28d2444b860a\">大型客户</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">客户状态(*)</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select name=\"customStateId\" required\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"chzn-select-deselect span4\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"31b14919-0d46-11e7-9e9d-28d2444b860a\">普通</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"373c6373-0d46-11e7-9e9d-28d2444b860a\">重要</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"72c10457-0d46-11e7-9e9d-28d2444b860a\">非常重要</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-actions\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-success\">保存</button>\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn\" onclick=\"refreshCustomInfos();\">取消</button>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"reset\" value=\"Reset\" class=\"hidden\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /编辑客户 /end -->\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 添加新商机 begin -->\r\n");
      out.write("\t<div class=\"row-fluid\" data-BusinessOpportunity=\"addBusinessOpportunity\">\r\n");
      out.write("\t\t<div class=\"span12\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"widget green\">\r\n");
      out.write("\t\t\t\t<div class=\"widget-title\">\r\n");
      out.write("\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-reorder\"></i> 添加商机\r\n");
      out.write("\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"widget-body\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<!-- <div class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"btn-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"btn green\" onclick=\"refreshCustomInfos()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t返回<i class=\"icon-plus\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"space10\"></div>\r\n");
      out.write("\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t<div class=\"space10\"></div> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<form style=\"margin-left:10px;\" action=\"#\" class=\"form-horizontal\" data-BusinessOpportunity=\"addBusinessOpportunity\" onsubmit=\"return false;\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"customId\" value=\"\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">产品(*)</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select name=\"productId\" required onchange=\"productIdSelect(this);\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"chzn-select-deselect span4\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"1\">农业监控系统</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"2\">简易CRM</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"3\">定制CRM</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">产品价格(￥)</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select name=\"productPrice\" disabled\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"chzn-select-deselect span4\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"1\">1212123.00</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"2\">1234322.00</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"3\">50000.00</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("                            <label class=\"control-label\">(预期)/成交价格(*)</label>\r\n");
      out.write("                            <div class=\"controls\">\r\n");
      out.write("                                <div class=\"input-prepend input-append\">\r\n");
      out.write("                                    <span class=\"add-on\">￥</span>\r\n");
      out.write("                                    <input name=\"preSalesAmount\" type=\"text\" data-mask=\"99999999.99\" required/>\r\n");
      out.write("                                    <span class=\"add-on\">.00</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("<!-- \t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("                            <label class=\"control-label\">成本(*)</label>\r\n");
      out.write("                            <div class=\"controls\">\r\n");
      out.write("                                <div class=\"input-prepend input-append\">\r\n");
      out.write("                                    <span class=\"add-on\">￥</span>\r\n");
      out.write("                                    <input name=\"cost\" type=\"text\" data-mask=\"99999999.99\" required/>\r\n");
      out.write("                                    <span class=\"add-on\">.00</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                       \t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("                            <label class=\"control-label\">实际售出金额(*)</label>\r\n");
      out.write("                            <div class=\"controls\">\r\n");
      out.write("                                <div class=\"input-prepend input-append\">\r\n");
      out.write("                                    <span class=\"add-on\">￥</span>\r\n");
      out.write("                                    <input name=\"realWages\" type=\"text\" data-mask=\"99999999.99\" required/>\r\n");
      out.write("                                    <span class=\"add-on\">.00</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write(" --> \t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t                <label class=\"control-label\">(预期)/售出时间(*)</label>\r\n");
      out.write("\t\t\t                <div class=\"controls input-group date\" name=\"preDealTime\" >\r\n");
      out.write("\t\t\t                    <div class=\"input-prepend input-append\">\r\n");
      out.write("\t\t\t\t                    <input name=\"preDealTime\" class=\"form-control\" size=\"16\" type=\"text\" readonly>\r\n");
      out.write("\t\t\t\t                    <span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-remove\"></span></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-calendar\"></span></span>\r\n");
      out.write("\t\t\t\t                    <span class=\"add-on\"><i class=\"icon-calendar\"></i></span>\r\n");
      out.write("\t\t\t                \t</div>\r\n");
      out.write("\t\t\t                </div>\r\n");
      out.write("\t\t\t\t        </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">备注</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea name=\"remark\" class=\"span6 ckeditor\" rows=\"6\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label class=\"control-label\">销售阶段(*)</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select name=\"salesStageId\" required\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"chzn-select-deselect span4\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"ddc2e328-0d4b-11e7-9e9d-28d2444b860a\">初步沟通</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"fbf40d99-0d4b-11e7-9e9d-28d2444b860a\">方案报价</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"011bc899-0d4c-11e7-9e9d-28d2444b860a\">谈判协商</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-actions\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-success\">保存</button>\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn\" onclick=\"refreshCustomInfos();\">取消</button>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"reset\" value=\"Reset\" class=\"hidden\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /添加新商机 /end -->\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t//初始化表格 \r\n");
      out.write("\t\tinitCustomInfos();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('div[name=\"preDealTime\"]').datetimepicker({\r\n");
      out.write("\t        language:  'zh-CN',\r\n");
      out.write("\t        weekStart: 1,\r\n");
      out.write("\t        todayBtn:  1,\r\n");
      out.write("\t\t\tautoclose: 1,\r\n");
      out.write("\t\t\ttodayHighlight: 1,\r\n");
      out.write("\t\t\tstartView: 2,\r\n");
      out.write("\t\t\tminView: 2,\r\n");
      out.write("\t\t\tforceParse: 0,\r\n");
      out.write("\t\t\tformat: 'yyyy-mm-dd',\r\n");
      out.write("\t\t\tstartDate : new Date() \r\n");
      out.write("\t    });\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/mainBody/jsp/customInformation.jsp(31,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${authorityMap['34a71c5d-0d3b-11e7-9e9d-28d2444b860a'] eq 1}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<div class=\"clearfix\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"btn-group\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn green\" onclick=\"addCustomShow()\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t添加客户 <i class=\"icon-plus\"></i>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      if (!_jspx_th_c_005fif_005f0_reused) {
        _jspx_th_c_005fif_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_c_005fif_005f0);
      }
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/mainBody/jsp/customInformation.jsp(53,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${authorityMap['10c42c6f-0d91-11e7-9e9d-28d2444b860a'] eq 1}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<th>编辑</th>\r\n");
          out.write("\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      if (!_jspx_th_c_005fif_005f1_reused) {
        _jspx_th_c_005fif_005f1.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_c_005fif_005f1);
      }
    }
    return false;
  }
}