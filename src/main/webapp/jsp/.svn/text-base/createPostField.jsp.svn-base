<%@taglib prefix="s" uri="/struts-tags" %>

<div id= "CreatePostField">
	<s:form action="CreatePost">
		<s:checkbox label="Anonymous" name="anonymous"/> </br>
		<s:textfield name="topic" label="Enter a topic" /> </br>
		<s:textarea cols="40" rows="10" name="content" label="Enter some text!"/>  </br>
		<s:submit />  </br>
	</s:form>
</div>

<script>
function togglePageElementVisibility(what)
{
    var obj = typeof what == 'object'
        ? what : document.getElementById(what);

    if (obj.style.display == 'none')
        obj.style.display = 'block';
    else
        obj.style.display = 'none';
    return false;
}
window.onload = togglePageElementVisibility(CreatePostField);
</script>