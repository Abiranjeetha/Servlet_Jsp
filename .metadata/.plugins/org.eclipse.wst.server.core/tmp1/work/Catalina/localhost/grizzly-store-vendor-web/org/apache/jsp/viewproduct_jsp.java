/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2019-05-17 03:45:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/header.jsp", Long.valueOf(1557911327253L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      out.write("<style>\r\n");
      out.write("#column1\r\n");
      out.write("{\r\n");
      out.write("float:left;\r\n");
      out.write("width:20%;\r\n");
      out.write(" border-style=\"solid\";\r\n");
      out.write(" border-width: 5px;\r\n");
      out.write("}\r\n");
      out.write("#column2\r\n");
      out.write("{\r\n");
      out.write("float:left;\r\n");
      out.write("width:60%;\r\n");
      out.write(" border-style=\"solid\";\r\n");
      out.write(" border-width: 5px;\r\n");
      out.write("}\r\n");
      out.write("#column3\r\n");
      out.write("{\r\n");
      out.write("float:left;\r\n");
      out.write("width:20%;\r\n");
      out.write(" border-style=\"solid\";\r\n");
      out.write(" border-width: 5px;\r\n");
      out.write("}\r\n");
      out.write("#col2col1\r\n");
      out.write("{\r\n");
      out.write("float:left;\r\n");
      out.write("width:50%;\r\n");
      out.write("}\r\n");
      out.write("#col2col2\r\n");
      out.write("{\r\n");
      out.write("float:left;\r\n");
      out.write("width:50%;\r\n");
      out.write("padding-left:40px;\r\n");
      out.write("}\r\n");
      out.write(".tab\r\n");
      out.write("{\r\n");
      out.write("background-color: #f1f1f1;\r\n");
      out.write("border: none;\r\n");
      out.write("float: left;\r\n");
      out.write("color: black;\r\n");
      out.write("width: 33.33%;\r\n");
      out.write("height: 50px;\r\n");
      out.write("font-size: 25px;\r\n");
      out.write("text-align: left;\r\n");
      out.write("font-weight: 550;\r\n");
      out.write("}\r\n");
      out.write(".tab:hover\r\n");
      out.write("{\r\n");
      out.write("background-color: #777D7D;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"background-color:#EAEDED;height:70px;\">\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel = \"stylesheet\" type=\"text/css\" href=\"form.css\">\r\n");
      out.write("<style>\r\n");
      out.write("#user\r\n");
      out.write("{\r\n");
      out.write("float:right\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"/grizzly-store-vendor-web/LogoutController\" method=\"post\">\r\n");
      out.write("<h1>Grizzly \r\n");
      out.write("<img alt=\"not available\" src=\"grizzly.png\" width=\"40\"> \r\n");
      out.write("store\r\n");
      out.write("<input type=\"text\" id=\"text\" placeholder=\"search\">\r\n");
      out.write("<div id=\"user\">Welcome, ");
      out.print(session.getAttribute("username") );
      out.write("\r\n");
      out.write("<input type=\"submit\" value=\"Logout\" id=\"btn\"> </div>\r\n");
      out.write("</h1>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<div id=\"column1\">\r\n");
      out.write("<form style=\"background-color:#EAEDED;\">\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<center>\r\n");
      out.write("<h2>PROFILE&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"editadmin.jsp\"><input type=\"submit\" value=\"EDIT\" id=\"sub\"></a></h2>\r\n");
      out.write("<br/>\r\n");
      out.write("</center>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<img alt=\"not available\" src=\"/grizzly-store-admin-web/add1.png\" width=200>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<h3>ID</h3>\r\n");
      out.print(session.getAttribute("userid") );
      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<h3>Designation</h3>\r\n");
      out.print(session.getAttribute("designation") );
      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<h3>Office</h3>\r\n");
      out.print(session.getAttribute("office") );
      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"column2\" style=\"padding-left:50px;\">\r\n");
      out.write("<div>\r\n");
      out.write("  <a href=\"/grizzly-store-vendor-web/ListproductController\"><input type=\"button\" value=\"PRODUCT\" class=\"tab\"></a>\r\n");
      out.write("  <a href=\"/grizzly-store-vendor-web/ListvendorsController\"><input type=\"button\" value=\"VENDOR\" class=\"tab\"></a>\r\n");
      out.write("  <a href=\"#home\"><input type=\"button\" value=\" \" class=\"tab\"></a>\r\n");
      out.write("</div>\r\n");
      out.write("<br><br><br><br>\r\n");
      out.write("<div style=\"float:left\">\r\n");
      out.print(request.getAttribute("pname"));
      out.write("&nbsp;&nbsp;&nbsp;by&nbsp;&nbsp;&nbsp;");
      out.print(request.getAttribute("pbrand"));
      out.write("&nbsp;&nbsp;&nbsp;<img src=\"/grizzly-store-vendor-web/edit.png\" alt=\"not available\" width=\"20\" height=\"20\">\r\n");
      out.write("<br/>\r\n");
      out.write("*");
      out.print(request.getAttribute("rating") );
      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<img src=\"/grizzly-store-vendor-web/view.png\" alt=\"not available\" width=\"520\" height=\"520\">\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"float:center;\">\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("&nbsp;&nbsp;&nbsp;Product description&nbsp;&nbsp;&nbsp;<img src=\"/grizzly-store-vendor-web/edit.png\" alt=\"not available\" width=\"20\" height=\"20\">\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("&nbsp;&nbsp;&nbsp;");
      out.print(request.getAttribute("pdescription") );
      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("&nbsp;&nbsp;&nbsp;Rs.&nbsp;");
      out.print(request.getAttribute("pprice") );
      out.write("\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<form action=\"/grizzly-store-vendor-web/ListproductController\">\r\n");
      out.write("<input style=\"float:right\" type=\"submit\" value=\"Finish\" id=\"btn\">\r\n");
      out.write("</form>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<form action=\"/grizzly-store-vendor-web/ListproductController\">\r\n");
      out.write("<input style=\"float:right\"type=\"submit\" value=\"Cancel\" id=\"btn\">\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
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
