<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>This is the first Board</title>
</head>
<body>
<%@ include file="../createPostField.jsp" %>

 <s:iterator value="posts" var="post">
 inside!!
	<s:property value="topic" /> </br>
	<s:property value="content" /> </br>
	<s:property value="privacy" /> </br>
	
	<s:property value="#post.topic" /> </br>
	<s:property value="#post.content" /> </br>
	<s:property value="#post.privacy" /> </br>

</s:iterator>

</body>
</html>