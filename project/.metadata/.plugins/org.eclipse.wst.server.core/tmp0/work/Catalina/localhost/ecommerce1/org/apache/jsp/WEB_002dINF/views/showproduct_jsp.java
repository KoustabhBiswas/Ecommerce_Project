/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-08-25 09:49:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class showproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
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
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<style>\r\n");
      out.write("\t.productDiv{\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\t \r\n");
      out.write("\tmargin-top:1%;\r\n");
      out.write("\tmargin-left:10%;\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("\t.btnDiv{\r\n");
      out.write("\t\tfloat:right;\r\n");
      out.write("\t\t \r\n");
      out.write("\t\tmargin-top:5%;\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("\t.cartbtn{\r\n");
      out.write("\t\tbackground-color:\t#00ffff;\r\n");
      out.write("\t\tpadding:15px 15px 15px 15px;\r\n");
      out.write("\t\t \r\n");
      out.write("\t}\r\n");
      out.write("\t.buybtn{\r\n");
      out.write("\t\tbackground-color:\t#00ffff;\r\n");
      out.write("\t\tpadding:7px 20px 7px 15px;\r\n");
      out.write("\t\tmargin-top:4%;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
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
      out.write("<div class=\"col-md-12\" style=\"margin-top:2%;  background-color:#F8F8F8;\">\r\n");
      out.write("\t\t\t   \t\t <div class=\"col-md-12\" style=\"margin-top:2%;  background-color:#F8F8F8;\">\r\n");
      out.write("\t\t\t   \t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t   \t\t\t\t<div  style=\"float:left; \"><a href=\"ecommerce1/samsung/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.productId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"><img src=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write(" \" width=\"300px\" ></a></div>\r\n");
      out.write("\t\t\t   \t\t\t\t<div class=\"productDiv\">\r\n");
      out.write("\t\t\t\t\t   \t\t    \r\n");
      out.write("\t\t\t\t\t   \t\t     <div style=\"float:rigth; color:red; font-size: 30px;\"><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.company_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.product_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p></div>\r\n");
      out.write("\t\t\t\t\t   \t\t <div style=\"float:rigth; color:blue; font-size: 25px;\"><p>Price : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.product_price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" </p></div>\r\n");
      out.write("\t\t\t\t\t   \t\t  <div style=\"float:rigth; color:blue; font-size: 25px;\"><p>Description : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.product_description}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" </p></div>\r\n");
      out.write("\t\t\t\t\t   \t\t</div>  \r\n");
      out.write("\t\t\t   \t\t  <div class=\"btnDiv\">\r\n");
      out.write("\t\t\t   \t\t  \t\t\t <a href=\"addCart\" class=\"btn btn-info\" style=\"text-decoration:none;\">Add To Cart</a> <br/>\r\n");
      out.write("\t\t\t   \t\t   \t\t\t <a href=\"#\"  class=\"btn btn-info\" style=\"margin-top:10%;\">Buy Now</a>\r\n");
      out.write("\t\t\t   \t\t   </div>\r\n");
      out.write("\t\t\t   \t\t   \r\n");
      out.write("\t\t\t   \t\t </div> \r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("\t\t\t   </div>\r\n");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/views/showproduct.jsp(52,91) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/resources/images/product/${product.product_image}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }
}
