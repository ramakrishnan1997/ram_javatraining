/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2022-07-04 05:13:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Register</title>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"\n");
      out.write("	integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\n");
      out.write("	crossorigin=\"anonymous\">\n");
      out.write("	<style type=\"text/css\">\n");
      out.write("	.image{\n");
      out.write("	background-image:url(\"image/register.jpg\");\n");
      out.write("	background-size: cover;\n");
      out.write("	background-repeat: no-repeat;\n");
      out.write("	\n");
      out.write("	}\n");
      out.write("	label:before {\n");
      out.write("	content: \"*\";\n");
      out.write("}\n");
      out.write("	</style>\n");
      out.write("	\n");
      out.write("</head>\n");
      out.write("<body class=\"image\">\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"col-md-4\"></div>\n");
      out.write("<div class=\"col-md-4\" align=\"center\">\n");
      out.write("<h1 style=\"text-align:center\">Register</h1> \n");
      out.write("<form action=\"add\" method=\"get\">\n");
      out.write("<div><label>User Name</label><input type=\"text\" name=\"username\" ></div>\n");
      out.write("<div><label>Name</label><input type=\"text\" name=\"name\" style=\"margin-left: 36px\" ></div>\n");
      out.write("<div><label>Phone No</label><input type=\"text\" name=\"phonenumber\"  style=\"margin-left: 4px\" ></div>\n");
      out.write("<div><label>Email</label><input type=\"email\" name=\"email\" style=\"margin-left: 36px\" ></div>\n");
      out.write("<div><label>Password</label><input type=\"password\" name=\"password\" style=\"margin-left: 7px\"></div>\n");
      out.write("<div><label>Age</label><input type=\"text\" name=\"age\" style=\"margin-left: 47px\" ></div>\n");
      out.write("<div>\n");
      out.write("<label for=\"gender\">Gender</label>\n");
      out.write("<div>\n");
      out.write("<input type=\"radio\" value=\"Male\" name=\"gender\" >\n");
      out.write("<label>Male</label>\n");
      out.write("</div>\n");
      out.write("<div>\n");
      out.write("<input type=\"radio\" value=\"Female\" name=\"gender\" style=\"margin-left: 20px\" >\n");
      out.write("<label>Female</label>\n");
      out.write("</div>\n");
      out.write("<div>\n");
      out.write("<input type=\"radio\" value=\"Other\" name=\"gender\" style=\"margin-left: 7px\" >\n");
      out.write("<label>Other</label>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<input type=\"submit\" value=\"Register\">\n");
      out.write("<input type=\"reset\" value=\"Clear\">\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"col-md-4\"></div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
