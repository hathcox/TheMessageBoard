<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>This page is used to generate new Boards</title>
<!-- Admin Only Page! -->
</head>
	<body>
		<s:form action = "createBoard">
			<s:textarea label="Please Enter a description for your board!" name="description"/>
			<s:textfield label="Please Enter the name for your Board!" name="name"/>	
		</s:form> 
	</body>
</html>