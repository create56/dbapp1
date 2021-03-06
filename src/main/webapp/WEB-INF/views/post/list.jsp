<%@page import="com.korea.dbapp.domain.post.Post"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">

	<c:forEach var="post" items="${postsEntity.content}">
		<div class="card">
			<div class="card-body">
				<h4 class="card-title">${post.title}</h4>
				<a href="/post/${post.id}" class="btn btn-primary">상세보기</a>
			</div>
		</div>
		<br/>
		<!-- End of Card -->
	</c:forEach>
	<!-- disabled -->
	<ul class="pagination"> 
 		 <li class="page-item disabled"><a class="page-link" href="?page=${postsEntity.number-1}">Previous</a></li>
  		<li class="page-item"><a class="page-link" href="?page=${postsEntity.number+1}">Next</a></li>
</ul>

</div>
<!-- End Of Container -->

<%@ include file="../layout/footer.jsp"%>