<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hwas 게시판</title>
</head>
<body>

	<div id="root">
		<header>
			<%@include file="include/header.jsp"%>
		</header>
		<hr />
		<nav>
			<%@include file="include/nav.jsp"%>
		</nav>
		<hr />

		<section id="container">
		<c:if test="${msg != 'login_error' }">
			<form role="form" method="post" autocomplete="off">
				<p>
					<label for="title">글 제목</label><input type="text" id="title"
						name="title" />
				</p>
				<p>
					<label for="title">글 내용</label>
					<textarea id="content" name="content"></textarea>
				</p>
				<p>
					<label for="title">작성자</label>
					<input type="text" id="writer" name="writer" value="${member.userName}" readonly="readonly" />
				</p>
				<p>
					<button type="submit">작성</button>
				</p>
			</form>
		</c:if>
		
		<c:if test="${msg == 'login_error'}">
			<p>로그인을 하셔야 글을 작성할 수 있습니다.</p>
			
			<p><a href="/">홈으로</a></p>
		</c:if>
		
		</section>
		<hr />
		<footer>
			<%@include file="include/footer.jsp"%>
		</footer>
	</div>

</body>
</html>