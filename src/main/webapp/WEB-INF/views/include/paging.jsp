<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
		<c:set var="tp" value="${(paging.totalCount/paging.listSize)+(1-((paging.totalCount/paging.listSize)%1))%1}" />
		<c:set var="sp" value="${(((paging.pageNo/10)+(1-((paging.pageNo/10)%1))%1)-1)*10+1}" />
		<c:set var="pageNum" value="${(paging.pageNo * paging.listSize) - paging.listSize}"/>
		<c:choose>
			<c:when test="${(sp+9)<=tp}">
				<c:set var="ep" value="${sp+9}" />
			</c:when>
			<c:otherwise>
				<c:set var="ep" value="${tp}" />
			</c:otherwise>
		</c:choose>
		
		<c:if test="${paging.totalCount > 0 }">
		<table>
			<tr>
				<td>
				<c:choose>
					<c:when test="${paging.pageNo>1}">
						<a href="javascript:goPage('1')" class="ctrl_btn">
							<!-- <img src="/common/images/comm/btn/btn_pg_fst.gif" alt="처음 페이지" /> -->
							처음
						</a>
					</c:when>
					<c:otherwise>
						<!-- <img src="/common/images/comm/btn/btn_pg_fst.gif" alt="처음 페이지" /> -->
						처음
					</c:otherwise>
				</c:choose>			
				
				<c:choose>
					<c:when test="${sp>10}">
						<a href="javascript:goPage(${sp-1})" class="ctrl_btn mr">
							<!-- <img src="/common/images/comm/btn/btn_pg_prv.gif" alt="이전 페이지" /> -->
							이전
						</a>
					</c:when>
					<c:otherwise>
						<!-- <img src="/common/images/comm/btn/btn_pg_prv.gif" alt="이전 페이지" /> -->
						이전
					</c:otherwise>
				</c:choose>				
				
		
				<c:forEach var="i" begin="${sp}" end="${ep}" step="1">
					<c:if test="${i == paging.pageNo}">
						<strong><a href="#">${i} </a></strong>
					</c:if>
					<c:if test="${i != paging.pageNo}">
						<a href="javascript:goPage(${i})">${i}</a>&nbsp; 
					</c:if>
				</c:forEach>
			
				<c:choose>
					<c:when test="${ep<tp}">
						<a href="javascript:goPage(${ep+1})" class="ctrl_btn ml">
						<!-- <img src="/common/images/comm/btn/btn_pg_nxt.gif" alt="다음 페이지" />-->
						다음
						</a>
					</c:when>
					<c:otherwise>
						 <!-- <img src="/common/images/comm/btn/btn_pg_nxt.gif" alt="다음 페이지" /> -->
						 다음
					</c:otherwise>
				</c:choose>				
				
				<c:choose>
					<c:when test="${paging.pageNo<tp}">
						<a href="javascript:goPage(${tp})" class="ctrl_btn">
						<!-- <img src="/common/images/comm/btn/btn_pg_lst.gif" alt="마지막 페이지" /> -->
						마지막
						</a>
					</c:when>
					<c:otherwise>
						<!-- <img src="/common/images/comm/btn/btn_pg_lst.gif" alt="마지막 페이지" /> -->
						마지막
					</c:otherwise>
				</c:choose>
				</td>
			<tr>
		</table>
		</c:if>
<br>