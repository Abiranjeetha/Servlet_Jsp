/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.9
 * Generated at: 2019-05-16 03:52:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1557401507843L));
    _jspx_dependants.put("jar:file:/D:/765095/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/grizzly-store-vendor-web/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1557911327253L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel = \"stylesheet\" type=\"text/css\" href=\"cssfiles/form.css\">\r\n");
      out.write("<style>\r\n");
      out.write("#column1\r\n");
      out.write("{\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\twidth:20%;\r\n");
      out.write("\tborder-style=\"solid\";\r\n");
      out.write("\tborder-width: 5px;\r\n");
      out.write("}\r\n");
      out.write("#column2\r\n");
      out.write("{\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\twidth:60%;\r\n");
      out.write(" \tborder-style=\"solid\";\r\n");
      out.write(" \tborder-width: 5px;\r\n");
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
      out.write("table\r\n");
      out.write("{\r\n");
      out.write("border-collapse:collapse;\r\n");
      out.write("}\r\n");
      out.write("table th\r\n");
      out.write("{\r\n");
      out.write("border-right:2.5px solid #D1D5D5;\r\n");
      out.write("}\r\n");
      out.write("table th:last-child\r\n");
      out.write("{\r\n");
      out.write("border-right:0;\r\n");
      out.write("}\r\n");
      out.write("table th:nth-child(7)\r\n");
      out.write("{\r\n");
      out.write("border-right:0;\r\n");
      out.write("}\r\n");
      out.write("table th:nth-child(8)\r\n");
      out.write("{\r\n");
      out.write("border-right:0;\r\n");
      out.write("}\r\n");
      out.write("table td\r\n");
      out.write("{\r\n");
      out.write("border:2.5px solid #D1D5D5;\r\n");
      out.write("border-left:0;\r\n");
      out.write("}\r\n");
      out.write("table tr:first-child td\r\n");
      out.write("{\r\n");
      out.write("border-top:0;\r\n");
      out.write("}\r\n");
      out.write("table tr:last-child td\r\n");
      out.write("{\r\n");
      out.write("border-bottom: 0;\r\n");
      out.write("}\r\n");
      out.write("table tr td:last-child\r\n");
      out.write("{\r\n");
      out.write("border-right:0;\r\n");
      out.write("}\r\n");
      out.write("table tr td:nth-child(7)\r\n");
      out.write("{\r\n");
      out.write("border-right:0;\r\n");
      out.write("}\r\n");
      out.write("table tr td:nth-child(8)\r\n");
      out.write("{\r\n");
      out.write("border-right:0;\r\n");
      out.write("}\r\n");
      out.write("table td:first-child\r\n");
      out.write("{\r\n");
      out.write("border-right:0;\r\n");
      out.write("border-bottom:0;\r\n");
      out.write("}\r\n");
      out.write("table th:first-child\r\n");
      out.write("{\r\n");
      out.write("border-right:0;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"background-color:#EAEDED;height:90px;\">\r\n");
      out.write("<br/>\r\n");
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
      out.write("<h2 align=\"center\">PROFILE</h2>\r\n");
      out.write("<br/>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      out.write("<img alt=\"not available\" src=\"add1.png\" width=200>\r\n");
      out.write("<br/>\r\n");
      out.write("<h2>");
      out.print(session.getAttribute("username") );
      out.write("</h2>\r\n");
      out.write("<h3>*");
      out.print(session.getAttribute("rating") );
      out.write("</h3>\r\n");
      out.write("<h3>Contact</h3>\r\n");
      out.write("<h6>");
      out.print(session.getAttribute("contact") );
      out.write("</h6>\r\n");
      out.write("<h3>Address</h3>\r\n");
      out.write("<h6>");
      out.print(session.getAttribute("address") );
      out.write("</h6>\r\n");
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
      out.write("<div>\r\n");
      out.write("<select id=\"btn\">\r\n");
      out.write("<option>choose action</option>\r\n");
      out.write("<option>add</option>\r\n");
      out.write("<option>delete</option>\r\n");
      out.write("</select>\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<input type=\"text\" id=\"btn\" placeholder=\"Category name\"/>\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<select id=\"btn\">\r\n");
      out.write("<option>sort by</option>\r\n");
      out.write("</select>\r\n");
      out.write("<div style=\"float:right;\"><a href=\"addproduct.jsp\"><input type=\"submit\" value=\"Add Product\" id=\"btn\"></a></div>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<br/>\r\n");
      out.write("<br/>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /listproduct.jsp(147,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty prdlist}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("<table>\r\n");
        out.write("<tr>\r\n");
        out.write("\t<th width=\"20\"></th> \r\n");
        out.write("\t<th width=\"180\" align=\"center\">Products list</th>\r\n");
        out.write("\t<th width=\"180\" align=\"center\">Brand </th>\r\n");
        out.write("\t<th width=\"180\" align=\"center\">Category</th>\r\n");
        out.write("\t<th width=\"180\" align=\"center\">Rating</th>\r\n");
        out.write("\t<th width=\"180\" align=\"center\">Offer</th>\r\n");
        out.write("\t<th width=\"140\" align=\"center\"></th>\r\n");
        out.write("\t<th width=\"90\" align=\"center\"></th>\r\n");
        out.write("</tr>\r\n");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("</table>\r\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /listproduct.jsp(159,0) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/listproduct.jsp(159,0) '${prdlist}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${prdlist}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /listproduct.jsp(159,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("product");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td><input type=\"radio\" name=\"product\"></td>\r\n");
          out.write("\t\t<td align=\"center\" height=\"30\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.pname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t<td align=\"center\" height=\"30\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.pbrand}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t<td align=\"center\" height=\"30\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.pcategory}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t<td align=\"center\" height=\"30\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.rating}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t<td align=\"center\" height=\"30\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.discount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t\t<td ><form action=\"/grizzly-store-vendor-web/ViewproductController?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.pid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" method=\"post\" style=\"padding-left:50px;\"><input type=\"submit\" value=\"view\" style=\"border-radius:20px;\"></form></td>\r\n");
          out.write("\t\t<td ><form action=\"/grizzly-store-vendor-web/RemoveproductController?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.pid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" method=\"post\"><input type=\"submit\" value=\"remove\" style=\"border-radius:20px;\"></form></td>\r\n");
          out.write("\t</tr>\r\n");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}