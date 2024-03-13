<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="service.deskstate.DeskstateService" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>订单</title>
</head>

<body>
<!-- 头文件 -->
<%@ include file="../command/head.jsp" %>
<!-- /头文件 -->

<!--/ 首页显示收银员 -->
<div class="row">
    <div class="col-lg-12">
        <h2></h2>
    </div>
</div>
<hr/>
<!-- /首页显示收银员 -->

<!-- 桌位显示 -->
<div class="row text-center pad-top desklist" style="display: none;">
    <%

        //页面每隔30秒自动链接至另一页面
        response.setHeader("refresh", "15;URL=/desklist.html?show=desk");

    %>
    <c:forEach items="${desks1}" var="desk">
        <!-- desk -->
        <c:if test="${!(desk.status==1&&desk.foodstate==2)}">
            <div class="col-lg-2 col-md-2 col-sm-2 col-xs-6 " style="width:200px">

                <div class="div-square" style="width:100%;">
                    <a class="btn"
                       href="${pageContext.request.contextPath}/deskinfo.html?show=desk&id=${desk.id}"
                       style="display: table-row">
                        <i class="fa fa-circle-o-notch fa-5x"

                           <c:if test="${desk.status==1 }">style="color: #e8134b;" </c:if>
                           <c:if test="${desk.status==2 }">style="color: #2da0d2;" </c:if>
                        ></i>
                        <h4>出餐号${desk.id }</h4>

                        <h4>学号</h4>
                        <h4>${desk.deskCode }</h4>
                        <h5><c:if test="${desk.status==1 }"><span style="color:#D6EF52;">[待点餐/出餐]</span></c:if>
                            <c:if test="${desk.status==2 }"><span style="color:red;">[未买单]</span></c:if></h5>

                    </a>

                    <a
                            href="${pageContext.request.contextPath}/desklist.html?show=desk&deldeskCode=${desk.deskCode}"
                            style="display: table-row">
                        <c:if test="${desk.foodstate==1}"><span
                                style="color:#e01b22; border: hidden;font-weight: bold;font-size: 20px">出餐</span></c:if>
                    </a>

                    <c:if test="${desk.deskInfo_details!=null}">
                        <table style="text-align: center;width: 100%">
                            <tr style="border: #d20215 1px solid;font-weight: bold">
                                <td>菜品</td>
                                <td>数量</td>
                            </tr>
                            <c:forEach items="${desk.deskInfo_details}" var="list">
                                <tr style="border: #d20215 1px solid">
                                    <td style="font-size: 15px;word-wrap: break-word">${list.dishName}</td>
                                    <td style="font-size: 15px">${list.dishNum}</td>
                                </tr>
                            </c:forEach>
                        </table>

                    </c:if>
                </div>
            </div>
        </c:if>
        <!-- /desk -->
    </c:forEach>
</div>
<!-- /桌位显示 -->

<!-- 尾文件 -->
<%@ include file="../command/foot.jsp" %>
<script type="text/javascript">
    $(function () {
        $(".desklist").slideDown(500);
    });
</script>
<!-- 头文件 -->
</body>
</html>
