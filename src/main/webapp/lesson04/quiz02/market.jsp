<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- bootstrap CDN -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
<style>
	.header{
		height:50px;
	}
	.nav{
		height:50px;
	}
	li{
		list-style:none;
	}
	footer{
		height:50px;
	}
</style>
</head>
<body>
	<div class="container">
		<header class="bg-danger text-center">
			<h1 class="text-white">HONG당무 마켓</h1>
			<nav>
				<ul class="nav nav-fill text-white">
					<li class="nav-item">리스트</li>
					<li class="nav-item">물건 올리기</li>
					<li class="nav-item">마이페이지</li>
				</ul>
			</nav>
		</header>
		<section class="bg-warning">
		<div class="d-flex justify-content-between">
			<div class="border">
				<img src="https://cdn.pixabay.com/photo/2014/09/24/14/29/macbook-459196_1280.jpg" width="200">
				<p><b>[팝니다] 맥북 프로 팔아요</b></p>
				<p>1800000원</p>
				<p class="text-danger">최준</p>
			</div>
		</div>
		<div class="d-flex justify-content-between">
			<div class="border">
				<img src="https://cdn.pixabay.com/photo/2014/09/24/14/29/macbook-459196_1280.jpg" width="200">
				<p><b>[팝니다] 맥북 프로 팔아요</b></p>
				<p>1800000원</p>
				<p class="text-danger">최준</p>
			</div>
		</div>
		</section>
		<footer class="bg-light text-center">
		Copyright © marondal 2021
		</footer>
		
		
	</div>
</body>
</html>