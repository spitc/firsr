<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!doctype html>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title><spring:message code="hello.world" text="Error happened on server" /></title>
    <script type="text/javascript" src="project/project.nocache.js"></script>
</head>
<body>
<span style="float: right">
    <a href="?lang=en">en</a> 
    | 
    <a href="?lang=iw">iw</a>
</span>
    <!-- OPTIONAL: include this if you want history support -->
    <iframe src="javascript:''" id="__gwt_historyFrame" tabIndex='-1'
            style="position: absolute; width: 0;height: 0; border: 0;"></iframe>

    <!-- RECOMMENDED if your web app will not function without JavaScript enabled -->
    <noscript>
        <div style="width: 22em; position: absolute; left: 50%; margin-left: -11em; color: red;
                background-color: white; border: 1px solid red; padding: 4px; font-family: sans-serif;">
            Your web browser must have JavaScript enabled
            in order for this application to display correctly.
        </div>
    </noscript>
</body>
</html>
