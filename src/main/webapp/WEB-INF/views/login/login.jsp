<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 			uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="page" 		uri="http://www.opensymphony.com/sitemesh/page" %>
<%@ taglib prefix="decorator" 	uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@ page session="false" %>

<script type="text/javascript">
	$( document ).ready(function() {
		//로그인
		$("#btnLogin").click(function(e){
			
			if(!$("#vchUSER_ID").val()) {
				$("#vchUSER_ID").focus();
				return alert("아이디를 입력하세요.");
			}
			if(!$("#vchPASSWORD").val()) {
				$("#vchPASSWORD").focus();
				return alert("비밀번호를 입력하세요.");
			}
			$("#frm").attr({
				action : "/Study/login/proc"
			}).submit();
		});
		
		//회원가입
		$("#btnAddMember").click(function(e){
			
		});
		
		//ID 찾기
		$("#btnFindId").click(function(e){

		});
		
		//비밀번호 찾기
		$("#btnFindPw").click(function(e){

		});
		
	});
	
</script>

<form id="frm" name="frm" method="post">

<input type="text" id="vchUSER_ID" name="vchUSER_ID" placeholder="아이디" value="kan56"/><br>
<input type="password" id="vchPASSWORD" name="vchPASSWORD" placeholder="비밀번호" value="asdf1234"/><br> 
<input type="button" id="btnLogin" value="로그인"/><br>
<br>
<input type="button" id="btnFindId" value="아이디찾기"/>
<input type="button" id="btnFindPw" value="비밀번호찾기"/>
<input type="button" id="btnAddMember" value="회원가입"/>
<br>

</form>

<form id="nonFrm" method="get">
</form>



