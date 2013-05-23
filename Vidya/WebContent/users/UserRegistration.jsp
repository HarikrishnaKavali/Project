<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>USER REGISTRATION FORM</title>
</head>
<body>
	<center>
		<s:form action="/uesrreg" method="post" validate="true">
			<table align="center">
			<s:head/>
				<s:textfield name="firstname" key="userreg.firstname"/>
				<s:textfield name="lastname" key="userreg.lastname"/>
				<s:textfield name="username" key="uesrreg.username" />
				<s:password name="password" key="uesrreg.password"/>
				<s:password name="repassword" key="uesrreg.repassword" />
				<s:textfield name="passwordhint" key="uesrreg.passwordhint" />
				<s:textfield name="email" key="userreg.email"/>
				<s:submit align="right"/>
			</table>
		</s:form>
	</center>
</body>
</html>