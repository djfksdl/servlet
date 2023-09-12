<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Melong2</title>
<!-- 부트스트랩 -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
<style>
a, a:hover{
text-decoration:none;}
header{height:80px;}
nav{height:50px;}
.contents{min-height:500px;}
footer{height:200px}
li{list-style:none;}
</style>
</head>
<body>
	<%-- 아티스트 정보 --%>
			<div class="d-flex mt-4 border border-success p-3">
				<%-- 이미지 --%>
				<div>
					<img src="https://cdnimg.melon.co.kr/cm2/artistcrop/images/002/61/143/261143_20210325180240_org.jpg?61e575e8653e5920470a38d1482d7312/melon/optimize/90" width="150" alt="앨범 표지">				
				</div>
				<%-- 곡 정보 --%>
				<div class="ml-3">
					<h3>삐삐</h3>
					<div>가수</div>
					<div>앨범정보</div>
				</div>
			</div>
			<%-- 가사 목록 영역 --%>
			<div class="mt-3">
				<h4 class="font-weight-bold">가사</h4>
				<hr>
				<div>가사 정보 없음</div>
			</div>
</body>
</html>