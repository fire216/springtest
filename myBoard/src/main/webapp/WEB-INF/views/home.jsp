<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Hwas 게시판</title>
</head>
<body>

	<a href="/board/write">글 작성</a>
	<a href="/board/list">글 목록</a>
	<a href="/board/listPage">글 목록 + 페이지</a>
	<a href="/board/listSearch">글 목록 + 페이지 + 검색</a>

	<form role="form" method="post" autocomplete="off">
		<p>
			<label for="userId">아이디</label> 
			<input type="text" id="userId"name="userId" />
		</p>
		<p>
			<label for="userPass">비밀번호</label> 
			<input type="password" id="userPass" name="userPass" />
		</p>
		<p>
			<button type="submit">로그인</button>
		</p>
		<p>
			<a href="/member/register">회원가입</a>
		</p>
	</form>

</body>
</html>
