<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>USERS UPDATE</title>
</head>
<body>
	<center>
		<s:iterator value="list" var="user">
		<s:form action="/usersupdateretrive" method="post" validate="true">
			<table align="center">
			<s:head/>
				<s:textfield name="firstname" key="userreg.firstname" value="%{#user.firstname}"/>
				<s:textfield name="lastname" key="userreg.lastname" value="%{#user.lastname}"/>
				<s:textfield name="username" key="uesrreg.username" value="%{#user.username}"/>
				<s:textfield name="password" key="uesrreg.password" value="%{#user.password}"/>
				<s:textfield name="repassword" key="uesrreg.repassword" value="%{#user.repassword}"/>
				<s:textfield name="passwordhint" key="uesrreg.passwordhint" value="%{#user.passwordhint}"/>
				<s:textfield name="email" key="userreg.email" value="%{#user.email}"/>
				<s:submit align="right"/>
			</table>
		</s:form>
		</s:iterator>
	</center>
</body>

</html>
