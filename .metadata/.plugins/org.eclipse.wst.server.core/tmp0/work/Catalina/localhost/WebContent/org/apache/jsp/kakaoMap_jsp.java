/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.41
 * Generated at: 2021-04-13 07:03:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class kakaoMap_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
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

      out.write('\r');
      out.write('\n');
request.setCharacterEncoding("UTF-8");
      out.write('\r');
      out.write('\n');
response.setContentType("text/html; charset=UTF-8");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>???kakakoMap???</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-latest.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.map_wrap {position:relative;width:100%;height:350px;}\r\n");
      out.write("    .title {font-weight:bold;display:block;}\r\n");
      out.write("    .hAddr {position:absolute;left:10px;top:10px;border-radius: 2px;background:#fff;background:rgba(255,255,255,0.8);z-index:1;padding:5px;}\r\n");
      out.write("    #centerAddr {display:block;margin-top:2px;font-weight: normal;}\r\n");
      out.write("    .bAddr {padding:5px;text-overflow: ellipsis;overflow: hidden;white-space: nowrap;}\r\n");
      out.write("    \r\n");
      out.write("\ttable{\r\n");
      out.write("\t\twidth: 1000px;\r\n");
      out.write("\t}\r\n");
      out.write("\ttr > th{\r\n");
      out.write("\t\ttext-align: left;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\t<p><em>????????? ??????????????????!</em></p>\r\n");
      out.write("\t\t\t\t\t\t????????????\t<br/>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"makerSpace\" >\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"\" name=\"postLatitude\" value=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" id=\"MapAddress\" name=\"MapAddress\" value=\"\" /> \r\n");
      out.write("\t\t\t\t\t\t<div class=\"map_wrap\">\r\n");
      out.write("\t\t\t\t\t\t    <div id=\"map\" style=\"width:100%;height:100%;position:relative;overflow:hidden;\"></div>\r\n");
      out.write("\t\t\t\t\t\t    <div id=\"menu_wrap\" class=\"bg_white\">\r\n");
      out.write("\t\t\t\t\t \t   </div>\r\n");
      out.write("\t\t\t\t\t\t\t    <div class=\"hAddr\">\r\n");
      out.write("\t\t\t\t\t\t        <span class=\"title\">?????????????????? ????????? ????????????</span>\r\n");
      out.write("\t\t\t\t\t\t        <span id=\"centerAddr\"></span>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<script type=\"text/javascript\" src=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=86abc3ded66eb29aaab5915248a36ab4&libraries=services\"></script>\r\n");
      out.write("\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\tvar mapContainer = document.getElementById('map'), // ????????? ????????? div \r\n");
      out.write("\t\t\t\t\t\t\t    mapOption = {\r\n");
      out.write("\t\t\t\t\t\t\t        center: new kakao.maps.LatLng(37.566826, 126.9786567), // ????????? ????????????\r\n");
      out.write("\t\t\t\t\t\t\t        level: 1 // ????????? ?????? ??????\r\n");
      out.write("\t\t\t\t\t\t\t    };  \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t// ????????? ???????????????    \r\n");
      out.write("\t\t\t\t\t\t\tvar map = new kakao.maps.Map(mapContainer, mapOption); \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t// ??????-?????? ?????? ????????? ???????????????\r\n");
      out.write("\t\t\t\t\t\t\tvar geocoder = new kakao.maps.services.Geocoder();\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tvar marker = new kakao.maps.Marker(), // ????????? ????????? ????????? ???????????????\r\n");
      out.write("\t\t\t\t\t\t\t    infowindow = new kakao.maps.InfoWindow({zindex:1}); // ????????? ????????? ?????? ????????? ????????? ????????????????????????\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t\t\t// ?????? ?????? ??????????????? ????????? ???????????? ?????? ?????? ????????? ???????????????\r\n");
      out.write("\t\t\t\t\t\t\tsearchAddrFromCoords(map.getCenter(), displayCenterInfo);\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t// ????????? ???????????? ??? ?????? ?????? ????????? ?????? ??????????????? ??????????????? ???????????? ???????????????\r\n");
      out.write("\t\t\t\t\t\t\tkakao.maps.event.addListener(map, 'click', function(mouseEvent) {\r\n");
      out.write("\t\t\t\t\t\t\t    searchDetailAddrFromCoords(mouseEvent.latLng, function(result, status) {\r\n");
      out.write("\t\t\t\t\t\t\t        if (status === kakao.maps.services.Status.OK) {\r\n");
      out.write("\t\t\t\t\t\t\t        \t\r\n");
      out.write("\t\t\t\t\t\t\t            var detailAddr = !!result[0].road_address ? '<div>????????? : ' + result[0].road_address.address_name + '</div>' : '';\r\n");
      out.write("\t\t\t\t\t\t\t            detailAddr += '<div>?????? ?????? : ' + result[0].address.address_name + '</div>';\r\n");
      out.write("\t\t\t\t\t\t\t            \r\n");
      out.write("\t\t\t\t\t\t\t            var MapAddresss = '<div class=\"bAddr\">' +\r\n");
      out.write("\t\t\t\t\t\t\t                            '<span class=\"title\">????????? ????????????</span>' + \r\n");
      out.write("\t\t\t\t\t\t\t                            detailAddr + \r\n");
      out.write("\t\t\t\t\t\t\t                        '</div>';\r\n");
      out.write("\t\t\t\t\t\t\t                        \r\n");
      out.write("\t\t\t\t\t\t\t            $(\"#MapAddress\").val(mouseEvent)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t           // var markerSpace = document.getElementById(\"makerSpace\");\r\n");
      out.write("\t\t\t\t\t\t\t            var test = document.getElementsByName(\"postLatitude\")[0];\r\n");
      out.write("\t\t\t\t\t\t\t            \r\n");
      out.write("\t\t\t\t\t\t\t            var afterString = detailAddr.slice(detailAddr.indexOf(\">\")+1, detailAddr.lastIndexOf(\"<\"));\r\n");
      out.write("\t\t\t\t\t\t\t           // makerSpace.innerHTML = detailAddr;\r\n");
      out.write("\t\t\t\t\t\t\t         \ttest.value = afterString;\r\n");
      out.write("\t\t\t\t\t\t\t            \r\n");
      out.write("\t\t\t\t\t\t\t         \t\r\n");
      out.write("\t\t\t\t\t\t\t            \r\n");
      out.write("\t\t\t\t\t\t\t            // ????????? ????????? ????????? ??????????????? \r\n");
      out.write("\t\t\t\t\t\t\t            marker.setPosition(mouseEvent.latLng);\r\n");
      out.write("\t\t\t\t\t\t\t            marker.setMap(map);\r\n");
      out.write("\t\t\t\t\t\t\t            \r\n");
      out.write("\t\t\t\t\t\t\t            // ?????????????????? ????????? ????????? ?????? ????????? ?????? ??????????????? ???????????????\r\n");
      out.write("\t\t\t\t\t\t\t            infowindow.setContent(MapAddress);\r\n");
      out.write("\t\t\t\t\t\t\t            \r\n");
      out.write("\t\t\t\t\t\t\t            \r\n");
      out.write("\t\t\t\t\t\t\t        }   \r\n");
      out.write("\t\t\t\t\t\t\t        \r\n");
      out.write("\t\t\t\t\t\t\t    });\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t// ?????? ????????? ?????? ????????? ???????????? ??? ?????? ?????? ????????? ?????? ?????? ????????? ??????????????? ???????????? ???????????????\r\n");
      out.write("\t\t\t\t\t\t\tkakao.maps.event.addListener(map, 'idle', function() {\r\n");
      out.write("\t\t\t\t\t\t\t    searchAddrFromCoords(map.getCenter(), displayCenterInfo);\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tfunction searchAddrFromCoords(coords, callback) {\r\n");
      out.write("\t\t\t\t\t\t\t    // ????????? ????????? ?????? ????????? ???????????????\r\n");
      out.write("\t\t\t\t\t\t\t    geocoder.coord2RegionCode(coords.getLng(), coords.getLat(), callback);         \r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tfunction searchDetailAddrFromCoords(coords, callback) {\r\n");
      out.write("\t\t\t\t\t\t\t    // ????????? ????????? ?????? ?????? ????????? ???????????????\r\n");
      out.write("\t\t\t\t\t\t\t    geocoder.coord2Address(coords.getLng(), coords.getLat(), callback);\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t// ?????? ??????????????? ?????? ??????????????? ?????? ??????????????? ???????????? ???????????????\r\n");
      out.write("\t\t\t\t\t\t\tfunction displayCenterInfo(result, status) {\r\n");
      out.write("\t\t\t\t\t\t\t    if (status === kakao.maps.services.Status.OK) {\r\n");
      out.write("\t\t\t\t\t\t\t        var infoDiv = document.getElementById('centerAddr');\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t        for(var i = 0; i < result.length; i++) {\r\n");
      out.write("\t\t\t\t\t\t\t            // ???????????? region_type ?????? 'H' ?????????\r\n");
      out.write("\t\t\t\t\t\t\t            if (result[i].region_type === 'H') {\r\n");
      out.write("\t\t\t\t\t\t\t                infoDiv.innerHTML = result[i].address_name;\r\n");
      out.write("\t\t\t\t\t\t\t                break;\r\n");
      out.write("\t\t\t\t\t\t\t            }\r\n");
      out.write("\t\t\t\t\t\t\t        }\r\n");
      out.write("\t\t\t\t\t\t\t    }    \r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</script>\r\n");
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
