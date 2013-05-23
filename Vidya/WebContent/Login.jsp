<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles/style1.css" />
<title>LOGIN</title>
</head>
<body>

<s:form action="/loginaction" method="post" validate="true" >
<br><br><br><br><br>
<table align="right">
<s:head/>
<s:textfield name="username" key="login.username"/>
<s:password name="password" key="login.Password" />
<s:submit align="center"/>
</table>
</s:form>
</body>
</html>