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
    <!-- 联网版本 -->
    <!-- 引入elementui样式 -->
    <link href="https://cdn.bootcdn.net/ajax/libs/element-ui/2.15.14/theme-chalk/index.css" rel="stylesheet">
    <!-- 必须先引入vue，再引入elementui -->
    <script src="https://cdn.jsdelivr.net/npm/vue@2.7.9"></script>
    <!-- 引入elementui组件库-->
    <script src="https://cdn.bootcdn.net/ajax/libs/element-ui/2.15.14/index.js"></script>
</head>

<body>
<!-- 头文件 -->
<%@ include file="../command/head.jsp" %>
<!-- /头文件 -->

<div id="outerBox">
    <el-button type="primary">提交</el-button>
</div>


<!-- 尾文件 -->
<%@ include file="../command/foot.jsp" %>
<!-- 尾文件 -->

</body>
<script>
    new Vue({
        el: '#outerBox'
    })
</script>
</html>
