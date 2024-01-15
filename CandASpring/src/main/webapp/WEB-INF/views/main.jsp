<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<Link href="./resources/css/main.css" rel="stylesheet">
<title>CandAProject</title>
</head>
<body>
	<nav class="nav">
	<!-- nav 바에서 Main으로 이동하는 부분 -->
		<a class="nav-content" href="./home">Home</a>
		
		<p class="border-left">
		
		<p class="border-left">
		
	<!-- nav 바에서 각 프로젝트로 연결되는 부분 -->
		<a class="nav-content" href="#">생각하기</a>
		<a class="nav-content" href="#">만들기</a>
		<a class="nav-content" href="#">공유하기</a>
		<a class="nav-content" href="#">커뮤니티</a>
		
		<p class="border-left">
		
	<!-- 로그인 페이지로 이동하는 부분 -->
		<a class="nav-content" href="./login">로그인</a>
	</nav>
	<div class="container container-column">
		<div class="main-title">
			<h1>${mainText}</h1>
		</div>
		<div class="container">
	<!-- <c: forEach items="${ProjectList}" var="project">
				<a class="project-Box" href="#">
					<img class="main-img" src="<c:url value="/resources/images/Img.png"/>" >
					<p class="project-name">${project.projectName}</p>
					<p class="project-content">${project.projectContent}</p>
				</a>
			</c: forEach> -->		
			
		
			
			
		</div>
		
	</div>
	
	
</body>
</html>