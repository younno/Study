<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 			uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="page" 		uri="http://www.opensymphony.com/sitemesh/page" %>
<%@ taglib prefix="decorator" 	uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%--@ page session="false" --%>

<script src="/Study/resources/js/swiper.jquery.min.js" type="text/javascript" ></script>
<script src="/Study/resources/js/ui-common.js" type="text/javascript" ></script>

<script type="text/javascript">

	function fnNotice(){
		$("#frm").attr({
			action : '/Study/notice/noticeList'
			, method : "post"
		});
		$("#frm").submit();
	}
	
</script>

<!-- content -->
	Login 성공 <input type="button" value="게시판이동" onclick="fnNotice();"/>
<form id="frm" ></form>