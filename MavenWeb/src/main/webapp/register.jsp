<%@page import="com.bridgeit.model.User"%>
<%@page import="com.bridgeit.dao.UserDao"%>

<jsp:useBean id="userinfo" class="com.bridgeit.model.User">
</jsp:useBean>
<jsp:setProperty property="*" name="userinfo" />

You have enterted below details:<br> 
<jsp:getProperty property="name" name="userinfo"/><br> 
<jsp:getProperty property="password" name="userinfo"/><br> 
<jsp:getProperty property="email" name="userinfo" /><br>


<%-- <%
	int i = UserDao.register(userinfo);
	if (i > 0)
		out.print("You are successfully registered");
%> --%>