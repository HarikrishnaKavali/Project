<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% session.setAttribute("usersmanagment", request.getAttribute("usersmanagment"));
	session.setAttribute("uinsert", request.getAttribute("uinsert"));
	session.setAttribute("uupdate", request.getAttribute("uupdate"));
	session.setAttribute("uview", request.getAttribute("uview"));
	session.setAttribute("udelete", request.getAttribute("udelete")); 
	
	session.setAttribute("studentmanagment", request.getAttribute("studentmanagment"));
session.setAttribute("sinsert", request.getAttribute("sinsert"));
session.setAttribute("supdate", request.getAttribute("supdate"));
session.setAttribute("sview", request.getAttribute("sview"));
session.setAttribute("sdelete", request.getAttribute("sdelete"));

session.setAttribute("facultymanagment", request.getAttribute("facultymanagment"));
session.setAttribute("finsert", request.getAttribute("finsert"));
session.setAttribute("fupdate", request.getAttribute("fupdate"));
session.setAttribute("fview", request.getAttribute("fview"));
session.setAttribute("fdelete", request.getAttribute("fdelete"));

session.setAttribute("employeemanagment", request.getAttribute("employeemanagment"));
session.setAttribute("einsert", request.getAttribute("einsert"));
session.setAttribute("eupdate", request.getAttribute("eupdate"));
session.setAttribute("eview", request.getAttribute("eview"));
session.setAttribute("edelete", request.getAttribute("edelete"));

session.setAttribute("batchmanagment", request.getAttribute("batchmanagment"));
session.setAttribute("binsert", request.getAttribute("binsert"));
session.setAttribute("bupdate", request.getAttribute("bupdate"));
session.setAttribute("bview", request.getAttribute("bview"));
session.setAttribute("bdelete", request.getAttribute("bdelete"));

session.setAttribute("coursemanagment", request.getAttribute("coursemanagment"));
session.setAttribute("cinsert", request.getAttribute("cinsert"));
session.setAttribute("cupdate", request.getAttribute("cupdate"));
session.setAttribute("cview", request.getAttribute("cview"));
session.setAttribute("cdelete", request.getAttribute("cdelete"));

session.setAttribute("exammanagment", request.getAttribute("exammanagment"));
session.setAttribute("exinsert", request.getAttribute("exinsert"));
session.setAttribute("exupdate", request.getAttribute("exupdate"));
session.setAttribute("exview", request.getAttribute("exview"));
session.setAttribute("exdelete", request.getAttribute("exdelete"));

session.setAttribute("librarymanagment", request.getAttribute("librarymanagment"));
session.setAttribute("liinsert", request.getAttribute("liinsert"));
session.setAttribute("liupdate", request.getAttribute("liupdate"));
session.setAttribute("liview", request.getAttribute("liview"));
session.setAttribute("lidelete", request.getAttribute("lidelete"));

session.setAttribute("labmanagement", request.getAttribute("labmanagement"));
session.setAttribute("lainsert", request.getAttribute("lainsert"));
session.setAttribute("laupdate", request.getAttribute("laupdate"));
session.setAttribute("laview", request.getAttribute("laview"));
session.setAttribute("ladelete", request.getAttribute("ladelete"));%>
	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MENU</title>
</head>
<frameset rows="09%,91%" >
	<frame src="ModuleMenu.jsp">
	<frameset cols="15%,85%">
		<frame name="leftmain">
		<frame name="main">
	</frameset>
</frameset>
</html>