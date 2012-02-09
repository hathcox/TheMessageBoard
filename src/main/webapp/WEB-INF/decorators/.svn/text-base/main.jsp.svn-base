<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@taglib prefix="page" uri="http://www.opensymphony.com/sitemesh/page" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title><decorator:title default="Struts Starter"/></title>
    <link href="<s:url value='/styles/main.css'/>" rel="stylesheet" type="text/css" media="all"/>
    <link href="<s:url value='/struts/niftycorners/niftyCorners.css'/>" rel="stylesheet" type="text/css"/>
    <link href="<s:url value='/struts/niftycorners/niftyPrint.css'/>" rel="stylesheet" type="text/css" media="print"/>
    <script src="http://ajax.googleapis.com/ajax/libs/dojo/1.6.0/dojo/dojo.xd.js"></script>
    <decorator:head/>
</head>
<body id="page-home">
    <div id="page">
    	Logged In: <s:property value="#session.login"/> </br>
    	As: <s:property value="#session.user" />
        <div id="header" class="clearfix">
        	THE MESSAGE BOARD
            <hr />
        </div>
        
        <div id="content" class="clearfix">
            <div id="main">
            	<h3>Welcome!</h3>
            	<decorator:body/>
                <hr />
            </div>
            
            <div id="sub">
            	<h3>Sub Content</h3>
            </div>
            
            
            <div id="nav">
                <div class="wrapper">
                <h3>Navigation bar</h3>
                <ul class="clearfix">
                     <li><a href="/TheMessageBoard/jsp/index.jsp">Index</a></li>
                     <li><a href="/TheMessageBoard/jsp/loginUser.jsp">Login</a></li>
                     <li><a href="/TheMessageBoard/jsp/logoutUser.jsp">Logout</a></li>
                     <li class="last"><a href="/TheMessageBoard/jsp/registerUser.jsp">Register</a></li>
                </ul>
                </div>
                <hr />
            </div>
        </div>
        
        <div id="footer" class="clearfix">
            The Message Board &copy; 2011
        </div>
        
    </div>
    
    <div id="extra1">&nbsp;</div>
    <div id="extra2">&nbsp;</div>
</body>
</html>
