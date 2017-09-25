<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>武林秘籍展览厅</title>
</head>
<body>
	<h1 align="center">欢迎光临武林秘籍管理系统</h1>

	<c:if test="${empty LoginName}">
		<h2 align="center">
			游客您好，如果想查看武林秘籍请 <a href="Login.jsp">登录</a>
		</h2>
	</c:if>


	<c:if test="${not empty LoginName}">
		<h2 align="center">
			${LoginName}您好，欢迎登陆
		</h2>

	</c:if>

	<h4>
		<a href="${pageContext.request.contextPath }/Login.jsp" onclick="out"
			id="out">退出系统</a>
	</h4>
	<hr>
	<div id="comment">
		<h3>普通武功秘籍</h3>
		<ul>
			<li><a href="level1/1.jsp">罗汉拳</a></li>
			<li><a href="level1/2.jsp">武当长拳</a></li>
			<li><a href="level1/3.jsp">全真剑法</a></li>
		</ul>
	</div>

	<c:if test="${not empty LoginName}">
		<div id="up">
			<h3>高级武功秘籍</h3>
			<ul>
				<li><a href="level2/1.jsp">太极拳</a></li>
				<li><a href="level2/2.jsp">七伤拳</a></li>
				<li><a href="level2/3.jsp">穿云纵</a></li>
			</ul>

			<h3>绝世武功秘籍</h3>
			<ul>
				<li><a href="level3/1.jsp">葵花宝典</a></li>
				<li><a href="level3/2.jsp">龟派气功</a></li>
				<li><a href="level3/3.jsp">独孤九剑</a></li>
			</ul>
		</div>
	</c:if>
</body>
</html>