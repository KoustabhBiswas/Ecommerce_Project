/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-08-24 19:24:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/views/shared/footer.jsp", Long.valueOf(1502990180788L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1501004285049L));
    _jspx_dependants.put("/WEB-INF/views/shared/navbar.jsp", Long.valueOf(1503597450103L));
    _jspx_dependants.put("jar:file:/C:/Users/Koustabh/project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ecommerce1/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>ShopMobiles</title>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("<!-- <script src=\"jquery-3.2.1.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>-->\r\n");
      out.write("<style>\r\n");
      out.write("a {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-color: wheat;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sp {\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("\tpadding-bottom: 6px;\r\n");
      out.write("\tpadding-top: 6px;\r\n");
      out.write("\tpadding-left: 10px;\r\n");
      out.write("\tpadding-right: 10px;\r\n");
      out.write("\tborder-bottom-left-radius: 1155px;\r\n");
      out.write("\tborder-bottom-right-radius: 1155px;\r\n");
      out.write("\tborder-top-left-radius: 1155px;\r\n");
      out.write("\tborder-top-right-radius: 1155px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sp1 {\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("\tpadding-bottom: 7px;\r\n");
      out.write("\tpadding-top: 7px;\r\n");
      out.write("\tpadding-left: 8px;\r\n");
      out.write("\tpadding-right: 8px;\r\n");
      out.write("\tborder-bottom-left-radius: 1155px;\r\n");
      out.write("\tborder-bottom-right-radius: 1155px;\r\n");
      out.write("\tborder-top-left-radius: 1155px;\r\n");
      out.write("\tborder-top-right-radius: 1155px;\r\n");
      out.write("\tmargin-left: 3%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sp2 {\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("\tpadding-bottom: 6px;\r\n");
      out.write("\tpadding-top: 6px;\r\n");
      out.write("\tpadding-left: 5px;\r\n");
      out.write("\tpadding-right: 5px;\r\n");
      out.write("\tborder-bottom-left-radius: 1155px;\r\n");
      out.write("\tborder-bottom-right-radius: 1155px;\r\n");
      out.write("\tborder-top-left-radius: 1155px;\r\n");
      out.write("\tborder-top-right-radius: 1155px;\r\n");
      out.write("\tmargin-left: 3%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t");
      out.write("<style>\r\n");
      out.write("nav {\r\n");
      out.write("\tbackground-color: #1b6d85;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\" style=\"border-bottom-style: none;  \">\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse\" style=\"background-color: green; border-radius:0px; color:white;\">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"home\">ShopMobiles</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\">Select Product <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"samsung\">Samsung</a></li>\r\n");
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
      out.write("\t\t<!-- Carasouel begins -->\r\n");
      out.write("\t\t<div class=\"row\" style=\"margin-top: -1.5%;\">\r\n");
      out.write("\t\t\t<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("\t\t\t\t<div class=\"carousel-inner\">\r\n");
      out.write("\t\t\t\t\t<div class=\"item active\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" alt=\"nokia\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"img-responsive\" style=\"height: 300px; width: 100%\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" alt=\"Htc\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"img-responsive\" style=\"height: 300px; width: 100%\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\talt=\"samsung\" class=\"img-responsive\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"height: 300px; width: 100%;\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<a class=\"left carousel-control\" href=\"#myCarousel\"\r\n");
      out.write("\t\t\t\t\tdata-slide=\"prev\"> <span\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-left\" style=\"height: 90px;\"></span>\r\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Previous</span>\r\n");
      out.write("\t\t\t\t</a> <a class=\"right carousel-control\" href=\"#myCarousel\"\r\n");
      out.write("\t\t\t\t\tdata-slide=\"next\"> <span\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-right\"></span> <span\r\n");
      out.write("\t\t\t\t\tclass=\"sr-only\">Next</span>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- carasouel ends -->\r\n");
      out.write("\t\t<!-- main content begins -->\r\n");
      out.write("\t\t<div class=\"row\" style=\"margin-top: 2%;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"panel panel-default col-md-12\"\r\n");
      out.write("\t\t\t\tstyle=\"border: 0px solid; height: auto\">\r\n");
      out.write("\t\t\t\t<div class=\"panel panel-default col-md-2\"\r\n");
      out.write("\t\t\t\t\tstyle=\"border: 0px solid blue; height: auto; width: 300px;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"height: 255px; width: 280px; border: 0px solid red\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\" alt=\"Samsung J7\"\r\n");
      out.write("\t\t\t\t\t\t\twidth=\"250\" height=\"236\" style=\"border: 0px solid\" /> </a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-footer\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"border: 0px solid; height: auto; width: 250px; margin-left: 5.5%; background-color: white;\">\r\n");
      out.write("\t\t\t\t\t\t<P style=\"margin-left: 29%; color: red;\">Samsung J7</P>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"panel panel-default col-md-2\"\r\n");
      out.write("\t\t\t\t\tstyle=\"border: 0px solid blue; height: auto; width: 300px;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"height: 255px; width: 280px; border: 0px solid red\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\talt=\"Asus Zenfone Max\" width=\"250\" height=\"236\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"border: 0px solid\" /> </a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-footer\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"border: 0px solid; height: auto; width: 250px; margin-left: 5.5%; background-color: white;\">\r\n");
      out.write("\t\t\t\t\t\t<P style=\"margin-left: 29%; color: red;\">Asus Zenfone Max</P>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"panel panel-default col-md-2\"\r\n");
      out.write("\t\t\t\t\tstyle=\"border: 0px solid blue; height: auto; width: 300px;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"height: 255px; width: 280px; border: 0px solid red\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      if (_jspx_meth_c_005furl_005f5(_jspx_page_context))
        return;
      out.write("\" alt=\"Nokia 6\"\r\n");
      out.write("\t\t\t\t\t\t\twidth=\"250\" height=\"236\" style=\"border: 0px solid\" /> </a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-footer\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"border: 0px solid; height: auto; width: 250px; margin-left: 5.5%; background-color: white;\">\r\n");
      out.write("\t\t\t\t\t\t<P style=\"margin-left: 29%; color: red;\">Nokia 6</P>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"panel panel-default col-md-2\"\r\n");
      out.write("\t\t\t\t\tstyle=\"border: 0px solid blue; height: auto; width: 300px;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"height: 255px; width: 280px; border: 0px solid red\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      if (_jspx_meth_c_005furl_005f6(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\talt=\"RedMi Note 4\" width=\"250\" height=\"236\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"border: 0px solid\" /> </a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-footer\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"border: 0px solid; height: auto; width: 250px; margin-left: 5.5%; background-color: white;\">\r\n");
      out.write("\t\t\t\t\t\t<P style=\"margin-left: 29%; color: red;\">RedMi Note 4</P>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- main content ends -->\r\n");
      out.write("\t\t");
      out.write(" \r\n");
      out.write("<footer class=\"row\" style=\"background-color: #1b6d85;  height: auto; margin-top:15%;\">\r\n");
      out.write("\t<div class=\"col-md-4 col-lg-4 col-sm-4\" style=\"border: 0px solid;\">\r\n");
      out.write("\t\t<div style=\"margin-left: 26%\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"contact.html\" style=\"color: white\">Contact</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"aboutus.html\" style=\"color: white\">About Us</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"col-md-4\"\r\n");
      out.write("\t\tstyle=\"border: 0px solid; margin-left: 25%; margin-top: 1%;\">\r\n");
      out.write("\t\t<a href=\"https://www.facebook.com/\"><span class=\"sp\"><i\r\n");
      out.write("\t\t\t\tclass=\"fa fa-facebook\"></i></span></a> <a href=\"https://twitter.com/Twitter\"><span\r\n");
      out.write("\t\t\tclass=\"sp1\"><i class=\"fa fa-twitter\"></i></span></a> <a\r\n");
      out.write("\t\t\thref=\"https://plus.google.com\"><span class=\"sp2\"><i\r\n");
      out.write("\t\t\t\tclass=\"fa fa-google-plus\"></i></span></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</footer>\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/views/home.jsp(90,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/resources/images/h1.jpg");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/views/home.jsp(94,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/resources/images/h2.jpg");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /WEB-INF/views/home.jsp(98,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/resources/images/h3.jpg");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent(null);
    // /WEB-INF/views/home.jsp(127,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/resources/images/J7.jpg");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f4.setParent(null);
    // /WEB-INF/views/home.jsp(141,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f4.setValue("/resources/images/ASUS_zenfone_3_Max__L_1.jpg");
    int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
    if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f5.setParent(null);
    // /WEB-INF/views/home.jsp(156,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f5.setValue("/resources/images/nokia.jpeg");
    int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
    if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f6(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f6.setParent(null);
    // /WEB-INF/views/home.jsp(170,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f6.setValue("/resources/images/Xiaomi-Redmi-Note4-grey-med.jpg");
    int _jspx_eval_c_005furl_005f6 = _jspx_th_c_005furl_005f6.doStartTag();
    if (_jspx_th_c_005furl_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
    return false;
  }
}
