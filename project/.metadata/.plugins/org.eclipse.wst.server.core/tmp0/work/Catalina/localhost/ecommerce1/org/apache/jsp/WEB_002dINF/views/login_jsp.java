/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-08-22 10:03:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/shared/navbar.jsp", Long.valueOf(1503391455144L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<!--  <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">-->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t <style type=\"text/css\">\r\n");
      out.write("  \t.btn{\r\n");
      out.write("  \t\tbackground-color: #6A5ACD; \r\n");
      out.write("  \t\tbox-shadow: 3px 3px 6px grey;\r\n");
      out.write("  \t\tcolor: white;\r\n");
      out.write("  \t}\r\n");
      out.write("\r\n");
      out.write("  \t.btn:hover{\r\n");
      out.write("  \t\tbackground-color: #00FF7F;\r\n");
      out.write("  \t\tbox-shadow: 2px 2px 4px grey;\r\n");
      out.write("  \t}\r\n");
      out.write("  \t.reg:hover{\r\n");
      out.write("  \t\tcolor:green;\r\n");
      out.write("  \t}\r\n");
      out.write("  </style>\r\n");
      out.write(" \r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("<style>\r\n");
      out.write("nav {\r\n");
      out.write("\tbackground-color: #1b6d85;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\" style=\"border-bottom-style: none; \">\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse\" style=\"background-color: green;\">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"home.html\">ShopMobiles</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\">Select Product <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Samsung</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Nokia</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">HTC</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\"><span\r\n");
      out.write("\t\t\t\t\t\tclass=\"glyphicon glyphicon-shopping-cart\"></span>Cart</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\">Admin <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"admin/product\">Product</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"admin/supplier\">Supplier</a></li>\r\n");
      out.write("\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"login1\">Sign In<span\r\n");
      out.write("\t\t\t\t\t\tclass=\"glyphicon glyphicon-log-in\"></span></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"registration.html\">Register<span\r\n");
      out.write("\t\t\t\t\t\tclass=\"glyphicon glyphicon-registration-mark\"></span></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("<!-- login starts -->\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\t<div class=\"col-md-6\" style=\"margin-left: 25%; \">\r\n");
      out.write("  \t\t\t\t<div><p style=\"color: red; margin-left: 40%; font-size: 24px; text-shadow: 3px 3px 5px grey; \">LOGIN </p></div>\r\n");
      out.write("\r\n");
      out.write("  \t\t\t<form >\r\n");
      out.write("  \t\t\t\t<div class=\"form-group\">\r\n");
      out.write("  \t\t\t\t\t<label>Enter Email:</label><span style=\"color: red\">*</span>\r\n");
      out.write("  \t\t\t\t\t<input type=\"text\" name=\"uname\" class=\"form-control\" placeholder=\"Enter Your Email\">\r\n");
      out.write("  \t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("  \t\t\t\t<div class=\"form-group\">\r\n");
      out.write("  \t\t\t\t\t<label>Password:</label><span style=\"color: red\">*</span>\r\n");
      out.write("  \t\t\t\t\t<input type=\"Password\" name=\"uname\" class=\"form-control\" placeholder=\"Enter Your Password\">\r\n");
      out.write("  \t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("  \t\t\t\t<div style=\"margin-left: 30% \">\r\n");
      out.write("  \t\t\t\t\t<input type=\"submit\" value=\"Log IN\" class=\"btn\" style=\"margin-right: 10%; padding-right: 25px; padding-left: 25px\">\r\n");
      out.write("  \t\t\t\t\t<p style=\"float:right; margin-right:30%; color:red; text-shadow:2px 2px 3px grey; margin-top:2%;\">New User ? <a href=\"registerpage\" class=\"reg\">Register Here</a></p>\r\n");
      out.write("  \t\t\t\t\t\r\n");
      out.write("  \t\t\t\t</div>\r\n");
      out.write("  \t\t\t</form>\r\n");
      out.write("  \t\t\t \r\n");
      out.write("  \t\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- login ends -->\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
