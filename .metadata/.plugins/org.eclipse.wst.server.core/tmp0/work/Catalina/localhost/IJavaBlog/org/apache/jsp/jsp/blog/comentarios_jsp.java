/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2014-09-26 11:53:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.blog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Entrada;
import model.Comentario;
import java.util.List;

public final class comentarios_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/jsp/blog/cabecera.jsp", Long.valueOf(1411732365709L));
    _jspx_dependants.put("/jsp/blog/navegacion.jsp", Long.valueOf(1411731419553L));
    _jspx_dependants.put("/jsp/blog/pie.jsp", Long.valueOf(1411261578000L));
    _jspx_dependants.put("/jsp/blog/enlaces.jsp", Long.valueOf(1411732381346L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
      out.write("     \n");
      out.write("     \n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<title>IJavaBlog</title>\n");
      out.write("\t<!-- <link href=\"css/comun.css\" rel=\"stylesheet\" type=\"text/css\" />  -->\n");
      out.write("\t<!-- <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />   -->\n");
      out.write("\t<link href=\"css/ijavablog.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t<script type=\"text/javascript\" src=\"/IJavaBlog/js/util.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\n");
      out.write("\tfunction ocultarCapas(){ \n");
      out.write("\t\tvar str = \"\";\n");
      out.write("\t    var patron = \"comentario\";\n");
      out.write("\t\tvar objs = document.getElementsByTagName(\"div\");\n");
      out.write("\t\t\n");
      out.write("\t\tfor(var i=0;i<objs.length;i++){\n");
      out.write("\t\t\tif(objs[i].id  != \"undefined\"){\n");
      out.write("\t\t\t\tstr=objs[i].id;\n");
      out.write("\t\t\t\tif(str.indexOf(patron) > -1){\n");
      out.write("\t\t\t\t objs[i].style.display = \"none\";\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t</script>\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("\t\n");
      out.write("<div id=\"cabecera\" class=\"cabecera\">");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("<!--  <link href=\"css/cabecera.css\" rel=\"stylesheet\" type=\"text/css\" /> -->\n");
      out.write("\t<!--  <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />  -->\n");
      out.write("\t\n");
      out.write("<div id=\"cabecera\" >\n");
      out.write("\t\n");
      out.write("\t<div onclick=\"javascript:location.href='index.blog'\"><h1>Blog de Java</h1></div>\n");
      out.write("\n");
      out.write("</div>");
      out.write("</div>\n");
      out.write("<div id=\"navegacion\" class=\"navegacion\">");
      out.write("\n");
      out.write("<div id=\"navegacion\">\n");
      out.write("\t<a href=\"registrarUsuario.blog\">Regístrate</a>\n");
      out.write("</div>");
      out.write("</div>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("<div id=\"cuerpo\" class=\"entradas\" >\n");
      out.write("\t\n");
      out.write("<div id=\"errores\">\n");
      out.write("\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</div>\t\n");
      out.write("\t\n");
      out.write("\t");

	Entrada ent= (Entrada) request.getAttribute("entrada");
	 
      out.write("\n");
      out.write("\t\t<table id=\"entrada\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t\t<td>ID:</td>\n");
      out.write("\t\t\t\t<td>");
      out.print(ent.getIdEntrada() );
      out.write("</td> \n");
      out.write("\t\t\t</tr>\t\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Cabecera:</td>\n");
      out.write("\t\t\t\t<td>");
      out.print(ent.getCabeceraEntrada() );
      out.write(" </td> \n");
      out.write("\t\t\t</tr>\t\t\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Entrada:</td>\n");
      out.write("\t\t\t\t<td>");
      out.print(ent.getEntrada() );
      out.write(" </td> \n");
      out.write("\t\t\t</tr>\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Fecha de creación:</td>\n");
      out.write("\t\t\t\t<td>");
      out.print(ent.getFechacreacion() );
      out.write(" </td> \n");
      out.write("\t\t\t</tr>\t\t\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td colspan=\"2\">\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\t\t\n");
      out.write("\t\t</table>\t\n");
      out.write("\t\t<table id=\"tablaComentariosEntrada\" border=\"1\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>Id comentario</td>\n");
      out.write("\t\t\t\t\t<td>Comentario</td>\n");
      out.write("\t\t\t\t\t<td>Usuario</td>\n");
      out.write("\t\t\t\t\t<td>Fecha de Creación</td>\n");
      out.write("\t\t\t\t\t<td>Mostrar</td>\n");
      out.write("\t\t\t\t\t<td>Eliminar</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t");

				// Obteniendo los comentarios que son enviados desde el Controlador
				List<Comentario> comentarios= (List<Comentario>)
				request.getAttribute("comentarios");
			
				if (comentarios != null) {
					for (Comentario c: comentarios) {
			
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>");
      out.print( c.getIdcomentario() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td>");
      out.print( c.getComentario() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td>");
      out.print( c.getIdusuario() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td>");
      out.print( c.getFechacreacion() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"button\" onclick=\"ocultarCapas();mostrar('comentario_");
      out.print( c.getIdcomentario() );
      out.write("')\" value=\"Editar\"/> </td>\n");
      out.write("\t\t\t\t\t<td><a href=\"eliminarComentario.blog?idComentario=");
      out.print( c.getIdcomentario() );
      out.write("&idEntrada=");
      out.print(ent.getIdEntrada() );
      out.write("\" \n");
      out.write("\t\t\t\t\t\t\tonclick=\"return confirmar()\" >Eliminar\t</a>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t");

					}
					for (Comentario c: comentarios) {
				
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t</table>\n");
      out.write("\t\t<div id=\"comentario_");
      out.print( c.getIdcomentario() );
      out.write("\" style=\"display: none;\">\n");
      out.write("\t\t\t");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent(null);
      // /jsp/blog/comentarios.jsp(118,3) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setAction("actualizarComentario.blog");
      // /jsp/blog/comentarios.jsp(118,3) name = commandName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setCommandName("comentarioForm");
      // /jsp/blog/comentarios.jsp(118,3) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setMethod("post");
      int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
        if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\t\t\t       \n");
            out.write("\t\t\t\t   \t<table>\n");
            out.write("\t\t\t\t\t\t<tr>\n");
            out.write("\t\t\t\t\t\t\t<td>\n");
            out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"idEntrada\" id=\"idEntrada\" value=\"");
            out.print( ent.getIdEntrada() );
            out.write("\" />\n");
            out.write("\t\t\t\t\t\t\t");
            //  form:input
            org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fname_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
            _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
            _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /jsp/blog/comentarios.jsp(123,7) null
            _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "name", "idComentario");
            // /jsp/blog/comentarios.jsp(123,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005finput_005f0.setPath("idComentario");
            // /jsp/blog/comentarios.jsp(123,7) null
            _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "value",  c.getIdcomentario() );
            int[] _jspx_push_body_count_form_005finput_005f0 = new int[] { 0 };
            try {
              int _jspx_eval_form_005finput_005f0 = _jspx_th_form_005finput_005f0.doStartTag();
              if (_jspx_th_form_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (java.lang.Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005finput_005f0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005finput_005f0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005finput_005f0.doFinally();
              _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fname_005fnobody.reuse(_jspx_th_form_005finput_005f0);
            }
            out.write("</td> \n");
            out.write("\t\t\t\t\t\t</tr>\t\n");
            out.write("\t\t\t\t\t\t<tr>\n");
            out.write("\t\t\t\t\t\t\t<td>");
            //  form:input
            org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fname_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
            _jspx_th_form_005finput_005f1.setPageContext(_jspx_page_context);
            _jspx_th_form_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /jsp/blog/comentarios.jsp(126,11) null
            _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "name", "idusuario");
            // /jsp/blog/comentarios.jsp(126,11) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005finput_005f1.setPath("idusuario");
            // /jsp/blog/comentarios.jsp(126,11) null
            _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "value",  c.getIdusuario() );
            int[] _jspx_push_body_count_form_005finput_005f1 = new int[] { 0 };
            try {
              int _jspx_eval_form_005finput_005f1 = _jspx_th_form_005finput_005f1.doStartTag();
              if (_jspx_th_form_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (java.lang.Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005finput_005f1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005finput_005f1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005finput_005f1.doFinally();
              _005fjspx_005ftagPool_005fform_005finput_0026_005fvalue_005fpath_005fname_005fnobody.reuse(_jspx_th_form_005finput_005f1);
            }
            out.write("</td> \n");
            out.write("\t\t\t\t\t\t</tr>\n");
            out.write("\t\t\t\t\t\t<tr>\n");
            out.write("\t\t\t\t\t\t\t<td>\n");
            out.write("\t\t\t\t\t\t\t\t<textarea name=\"comentario\" id=\"comentario\" cols=\"100\">");
            out.print( c.getComentario() );
            out.write("</textarea>\n");
            out.write("\t\t\t\t\t\t\t</td> \n");
            out.write("\t\t\t\t\t\t</tr>\t\t\n");
            out.write("\t\t\t\t\t\t<tr>\n");
            out.write("\t\t\t\t\t\t\t<td >\n");
            out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Publicar\"/>\t\n");
            out.write("\t\t\t\t\t\t\t</td>\n");
            out.write("\t\t\t\t\t\t</tr>\t\t\n");
            out.write("\t\t\t\t\t</table>\t\n");
            out.write("\t\t\t");
            int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fform_005f0.doFinally();
        _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fcommandName_005faction.reuse(_jspx_th_form_005fform_005f0);
      }
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t");

				}
			}
		
      out.write("\n");
      out.write("</div>\t\n");
      out.write("\t\t\n");
      out.write("<div  id=\"enlaces\" class=\"enlaces\">");
      out.write("\n");
      out.write("<div id=\"enlaces\">\n");
      out.write("\t\t<h1>About me</h1>\n");
      out.write("\tHola chavales ....\n");
      out.write("\t\n");
      out.write("\t<a href=\"administrar.blog\"> Administrar</a>\n");
      out.write("\t</br>\n");
      out.write("\t<form action=\"autenticar.blog\" method=\"post\">\n");
      out.write("\t<div>\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t</div> \t\n");
      out.write("\t</form>\n");
      out.write("</div>");
      out.write("</div>\n");
      out.write("<div  id=\"pie\" class=\"pie\">\t");
      out.write("\n");
      out.write("<div id=\"pie\">\n");
      out.write("\tIJavaBlog, 2004&copy;\n");
      out.write("</div>");
      out.write("</div>\n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /jsp/blog/comentarios.jsp(50,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("e");
    // /jsp/blog/comentarios.jsp(50,1) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/jsp/blog/comentarios.jsp(50,1) '${errores}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${errores}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\n');
          out.write('	');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("<br/>\n");
          out.write("\t");
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

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        out.write('	');
        out.write('	');
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /jsp/blog/enlaces.jsp(12,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty sessionScope.usuario}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t<input type=\"text\" name=\"correo\" /> \t\n");
        out.write("\t\t\t\t<input type=\"text\" name=\"clave\" /> \t\n");
        out.write("\t\t\t\t<input type=\"submit\" value=\"Entrar\" />\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t<span style=\"text-align: right;\">\n");
        out.write("\t\t\t\tBienvenido, ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.usuario.correo }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\n");
        out.write("\t\t\t\t<a href=\"cerrarSesion.blog\">Cerrar sesión</a>\t\n");
        out.write("\t\t\t</span>\t\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }
}