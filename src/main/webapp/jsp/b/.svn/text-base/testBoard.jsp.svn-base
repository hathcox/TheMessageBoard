<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>This is a Test Board!</title>
</head>
<b>This is a test Board! Below you can see the posts and comments!</b>
<body>
<div id="board">

<input type="button" value="Let me Post!" onclick="javascript:togglePageElementVisibility(CreatePostField)" />
<input type="button" value="Let me Comment!" onclick="javascript:togglePageElementVisibility(CreateCommentField)" />


 <s:iterator value="posts">
 	<div class="post">
		<p><s:property value="content" />
		</br>
		<i><s:property value="postID"/></i></p>
	</div>
	</br>
	 <s:iterator value="comments">
	 	<s:if test="postOwner == postID">
			<div class="comment">
				<s:property value="content" />
			</div>
		</br>
		</s:if>
	</s:iterator>
</s:iterator>

<%@ include file="/jsp/createPostField.jsp" %>
<%@ include file="/jsp/createCommentField.jsp" %>


</div>
</body>
</html>