<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>  
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
	<title>Main Page</title>
	<!-- jQuery, bootstrap CDN -->
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="http://code.jquery.com/jquery-migrate-1.2.1.js"></script> <!-- msie 문제 해결 -->
	<script src="http://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/latest/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/latest/css/bootstrap.min.css">
	<link rel="stylesheet" href="http://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
</head>
<body>
	<label>* Spring Security Test(Form, Basic)</label><br>
	<form name='TransTest' id='tForm' method='get' action='http://localhost:8080/admin/main'>
		<p><button name='subject' type='submit'>관리자 페이지 이동(form)</button></p>
	</form>
	<form name='TransTest' id='tForm' method='get' action='http://localhost:8080/admin/user'>
		<p><button name='subject' type='submit'>일반 페이지 이동</button></p>
	</form>
	<form name='TransTest' id='tForm' method='get' action='http://localhost:8080/admin/mainbasic'>
		<p><button name='subject' type='submit'>관리자 페이지 이동(basic)</button></p>
	</form>
	
</body>
</html>
