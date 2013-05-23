<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <link rel="stylesheet" type="text/css" href="styles/style1.css" /> -->
<title>UserUpdate</title>
</head>
<body>
	<center>
		<s:form action="/uesrsupdate" method="post" validate="true" >
			<table align="center">
				<s:head />
				<s:textfield name="username" key="uesrreg.username" />
				<s:submit value="search" align="right"/>
			</table>
		</s:form>
	</center>
</body>
<%String result=(String)request.getAttribute("result");
	
		if(result!=null)
		{%>
			
			<center><font color="red" size="3"><%=result %></font></center>
		<%}%>
</html>