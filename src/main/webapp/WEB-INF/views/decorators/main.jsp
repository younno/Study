<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 			uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="page" 		uri="http://www.opensymphony.com/sitemesh/page" %>
<%@ taglib prefix="decorator" 	uri="http://www.opensymphony.com/sitemesh/decorator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<meta name="viewport" content="user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width">
<meta charset="UTF-8">
<meta name="Author" content="">
<meta name="Keywords" content="">
<meta name="Description" content="">
<title>Study</title>

<script type="text/javascript" src='/Study/resources/js/common.js' ></script>
<script type="text/javascript" src='/Study/resources/js/jquery-1.11.2.min.js' ></script>

<script type="text/javascript">

function goLogin(){
		window.location = '/Study/login';
	}
	
	function goLogOut(){
		window.location = "/Study/logOut";
	}
	
	function goHome(){
		window.location = "/Study/goHome";
	}
	
	function goSitemap(){
		window.location = "/Study/resources/html/sitemap.html";
	}
</script>
<decorator:head>
</decorator:head>

</head>
<body>
<div class="wrap main_type">
	<decorator:body />
</div>
<c:if test="${not empty ERR_MSG }">
	<script type="text/javascript">alert('<c:out value="${ERR_MSG}"/>') </script>	
</c:if>
</body>
</html>
