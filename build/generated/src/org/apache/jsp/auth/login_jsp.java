package org.apache.jsp.auth;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String titulo = "Proyecto";
        
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/layout/head.jsp");
    _jspx_dependants.add("/layout/libraries.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <title>TESE | ");
      out.print( titulo);
      out.write("\n");
      out.write("  </title>\n");
      out.write("\n");
      out.write("  <!-- Google Font: Source Sans Pro -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback\">\n");
      out.write("  <!-- Font Awesome -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\" integrity=\"sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("  <!-- Theme style -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdn.nekdu.com/css/adminlte.min.css\">");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"hold-transition login-page\">\n");
      out.write("<div class=\"login-box\">\n");
      out.write("\n");
      out.write("<div class=\"card card-outline card-primary\">\n");
      out.write("<div class=\"card-header text-center\">\n");
      out.write("<a href=\"../../index2.html\" class=\"h1\"><b>Admin</b>LTE</a>\n");
      out.write("</div>\n");
      out.write("<div class=\"card-body\">\n");
      out.write("<p class=\"login-box-msg\">Sign in to start your session</p>\n");
      out.write("<form action=\"../../index3.html\" method=\"post\">\n");
      out.write("<div class=\"input-group mb-3\">\n");
      out.write("<input type=\"email\" class=\"form-control\" placeholder=\"Email\">\n");
      out.write("<div class=\"input-group-append\">\n");
      out.write("<div class=\"input-group-text\">\n");
      out.write("<span class=\"fas fa-envelope\"></span>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"input-group mb-3\">\n");
      out.write("<input type=\"password\" class=\"form-control\" placeholder=\"Password\">\n");
      out.write("<div class=\"input-group-append\">\n");
      out.write("<div class=\"input-group-text\">\n");
      out.write("<span class=\"fas fa-lock\"></span>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"col-8\">\n");
      out.write("<div class=\"icheck-primary\">\n");
      out.write("<input type=\"checkbox\" id=\"remember\">\n");
      out.write("<label for=\"remember\">\n");
      out.write("Remember Me\n");
      out.write("</label>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"col-4\">\n");
      out.write("<button type=\"submit\" class=\"btn btn-primary btn-block\">Sign In</button>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("<div class=\"social-auth-links text-center mt-2 mb-3\">\n");
      out.write("<a href=\"#\" class=\"btn btn-block btn-primary\">\n");
      out.write("<i class=\"fab fa-facebook mr-2\"></i> Sign in using Facebook\n");
      out.write("</a>\n");
      out.write("<a href=\"#\" class=\"btn btn-block btn-danger\">\n");
      out.write("<i class=\"fab fa-google-plus mr-2\"></i> Sign in using Google+\n");
      out.write("</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<p class=\"mb-1\">\n");
      out.write("<a href=\"forgot-password.html\">I forgot my password</a>\n");
      out.write("</p>\n");
      out.write("<p class=\"mb-0\">\n");
      out.write("<a href=\"register.html\" class=\"text-center\">Register a new membership</a>\n");
      out.write("</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- jQuery -->\r\n");
      out.write("<script src=\"https://cdn.nekdu.com/plugins/jquery/jquery.min.js\"></script>\r\n");
      out.write("<!-- Bootstrap 4 -->\r\n");
      out.write("<script src=\"https://cdn.nekdu.com/plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<!-- AdminLTE App -->\r\n");
      out.write("<script src=\"https://cdn.nekdu.com/js/adminlte.min.js\"></script>\r\n");
      out.write("<!-- AdminLTE for demo purposes -->\r\n");
      out.write("<script src=\"https://cdn.nekdu.com/js/demo.js\"></script>");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
