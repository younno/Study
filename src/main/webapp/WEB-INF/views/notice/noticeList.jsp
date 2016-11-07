<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 			uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="page" 		uri="http://www.opensymphony.com/sitemesh/page" %>
<%@ taglib prefix="decorator" 	uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@ page session="false" %>
<script type="text/javascript">
	$( document ).ready(function() {
	  	//더보기 클릭 이벤트
		$("#more").click(function(event){
	  		fnAddList();
	  	});
	  	//목록 클릭 이벤트
	  	$("#close").click(function(event){
	  		$("#detail li").html("");
	  		$("#detailTop").hide();
	  		$("#listTop").show();
	  	});
	  	
	  	$("#more").click();
	});
	
	function fnDetail(seq){
		var _url = '../notice/ajax/noticeList';
  		var _params = "type=1&pageNo=1&seq="+seq;
  	
	  	//validatino check.....
	  	$("#pageNo").val();
	  	
	  	fnNotieceCall(_url,_params, function _callback(resp){
	  		if(resp.length <= 0) return;
			$("#listTop").hide();
	  		$("#detail").find("#title").html(resp[0].TITLE);
	  		$("#detail").find("#instdt").html(fnToDate(resp[0].INSTDT));
	  		$("#detail").find("#content").html(resp[0].CONTENT);
	  		$("#detailTop").show();
	  	});
	}
	
	function fnAddList(){
		var _url = '../notice/ajax/noticeList';
		var _params = "type=1&pageNo="+$("#pageNo").val();
  		
	  	//validatino check.....
	  	$("#pageNo").val();
	  	
	  	fnNotieceCall(_url,_params, function _callback(resp){
	  		if(resp.length <= 0) return;
  	    	var currPage = 1+Number($("#pageNo").val());
  	      	$("#pageNo").val(currPage);
  	      	$("#currPage").html(currPage);
  	        
  	        var _list = $("#list");
  	        for(var i=0;i<resp.length;++i){
  	 	        var _layout = $("#default").clone();
  	 	        _layout.find("a").attr("href","javascript:fnDetail("+resp[i].SEQ+");").html(resp[i].TITLE);
  	 	      	_layout.find("#content").html(resp[i].CONTENT);
  	 	        _list.prepend(_layout.show());
  	        } 
	  	});
	}
	
	function fnNotieceCall(_url, _params, _callback){
		$.ajax({
	  	    method: "get",
	  	    dataType: "json",
	  	    url: _url,
	  	    data: _params,   
	  	    success: function(resp, status, jqXHR) {
	  	    	_callback(resp);	  	    	
	  	    },
	  	    error: function(jqXHR, textStatus, errorThrown) {
	  	        alert("err=" + errorThrown);
	  	    }
	  	});
	}
			
</script>
<input type="hidden" id="pageNo" value="1"/>


<div id="listTop">
	공지사항 목록 <br>
	현재페이지 : <label id="currPage">1</label> <input type="button" id="more" value="더보기" /><br>
	<div id="list">
	</div>
</div>
	


<ul id="default" style="display:none;">	
	<li id="title"><a href=""></a></li>
	<li id="content"></li>	
</ul>


<div id="detailTop" style="display:none;">
	공지사항 상세페이지<br>
	<div id="detail">
		<input type="button" id="close" value="목록" />
		<ul>
			<li id="title"></li>
			<li id="instdt"></li>
			<li id="content"></li>
		</ul>
	</div>
</div>

<!-- 상세 -->
<form id="detailFrom" name="detailFrom" action="<c:url value="/user/detail"/>" method="POST"> 
<input type="hidden" name="user_id" id="user_id" value=""/> 
</form>
<!-- 상세 -->

