/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.59
 * Generated at: 2022-08-21 06:48:05 UTC
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
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/Project_Spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/project/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1655882683439L));
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
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"//cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css\">\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>ClassUp</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write("html { \n");
      out.write("	background: url(\"resources/images/background.jpg\") no-repeat center center fixed; \n");
      out.write("	-webkit-background-size: cover;\n");
      out.write("	-moz-background-size: cover;\n");
      out.write("	-o-background-size: cover;\n");
      out.write("	background-size: cover;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("	device-height:100%;\n");
      out.write("	device-width:100%;\n");
      out.write("	margin: 0 auto;\n");
      out.write("	text-align: center;\n");
      out.write("}\n");
      out.write("ul { \n");
      out.write("	list-style-type:none; \n");
      out.write("	padding:0;  \n");
      out.write("	align-items: center; \n");
      out.write("}\n");
      out.write(".center{\n");
      out.write("	position:absolute;\n");
      out.write("	left:50%; top:50%;\n");
      out.write("	transform:translate(-50%, -50%);  \n");
      out.write("}\n");
      out.write(".login ul li { margin:10px 0; }\n");
      out.write(".login input { width:400px; height: 38px; box-sizing: border-box; border-radius: 13px; padding: 0 15px; border: 0px solid #ffffff; opacity: 0.7; } \n");
      out.write(".login input:focus { outline:none;} \n");
      out.write(".login input[type=button] {\n");
      out.write("	background-color: #3367d6; border: none; color:#fff;\n");
      out.write("	cursor: pointer;\n");
      out.write("	opacity: 0.8;\n");
      out.write("} \n");
      out.write("\n");
      out.write(".btn-social-login {\n");
      out.write("  transition: all .2s;\n");
      out.write("  outline: 0;\n");
      out.write("  border: 1px solid transparent;\n");
      out.write("  padding: .5rem !important;\n");
      out.write("  border-radius: 50%;\n");
      out.write("  color: #fff;\n");
      out.write("  margin: 0 10px;\n");
      out.write("}\n");
      out.write(".btn-social-login:focus {\n");
      out.write("  box-shadow: 0 0 0 .2rem rgba(0,123,255,.25);\n");
      out.write("}\n");
      out.write(".text-dark { color: #343a40!important; }\n");
      out.write(".find li{float: left; margin-right: 5px;}\n");
      out.write("a:link, a:visited {text-decoration:none; }\n");
      out.write("a{margin: 5px 0; font-size: 18px; background: #D2C3BC; opacity: 80%}\n");
      out.write("li {color:white;}\n");
      out.write("</style>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class='center'>\n");
      out.write("	<img src='img/logo05.png'>\n");
      out.write("	<div class='login'>\n");
      out.write("	<ul>\n");
      out.write("		<li><input type='text' id='id' class='chk' placeholder=\"아이디\"></li>\n");
      out.write("		<li><input type='password' id='pw' class='chk' placeholder=\"비밀번호\"></li>\n");
      out.write("		<li><input type='button' value='로그인' onclick=\"login()\"></li>\n");
      out.write("		<li><a href='member'><input type='button' value='회원가입' style=\"background-color: gray;\"></a></li>\n");
      out.write("		<li><a href='findPw'>비밀번호찾기</a></li>\n");
      out.write("		<li><hr></li>\n");
      out.write("		<li><button onclick='location=\"naver_login\"' class='btn-social-login' style='background:#1FC700'><i class=\"xi-3x xi-naver\"></i></button>\n");
      out.write("		<button onclick='location=\"kakao_login\"' class='btn-social-login' style='background:#FFEB00'><i class=\"xi-3x xi-kakaotalk text-dark\"></i></button></li>\n");
      out.write("	</ul>\n");
      out.write("	</div>\n");
      out.write("</div>\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.13.1/jquery-ui.min.js\"></script>\n");
      out.write("<script src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\n");
      out.write("<script src='resources/js/member_check.js?'></script>\n");
      out.write("<script src='resources/js/common.js?'></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$('#pw').keyup(function(e){\n");
      out.write("	if( e.keyCode==13 ) login();\n");
      out.write("});\n");
      out.write("\n");
      out.write("function login(){\n");
      out.write("	if( emptyCheck() ){\n");
      out.write("		\n");
      out.write("		$.ajax({\n");
      out.write("			url: 'home',\n");
      out.write("			data: { id:$('#id').val(), pw:$('#pw').val() },\n");
      out.write("			success: function( response ){\n");
      out.write("				if( response )\n");
      out.write("					location = '");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("				else{\n");
      out.write("					alert('아이디나 비밀번호가 일치하지 않습니다!')\n");
      out.write("					$('#id').focus();\n");
      out.write("				}\n");
      out.write("			},error: function(req, text){\n");
      out.write("				alert( text+':'+req.status);\n");
      out.write("			}			\n");
      out.write("		});\n");
      out.write("	}	\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/views/home.jsp(98,17) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/main");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }
}