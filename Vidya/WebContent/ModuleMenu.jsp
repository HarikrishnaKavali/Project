<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%-- <link href="<s:url value ="/styles/link.css"/>" rel="stylesheet" type="text/css"/> --%>
<link rel="stylesheet" type="text/css" href="styles/common_18072012.css" />
<title>ModuleMenu</title>
</head>
<body bgcolor="#eeeeee">
	<table border=0>
		<tr><td>
				<%String usersmanagment = (String) session.getAttribute("usersmanagment");

					if (usersmanagment != null) 
					{
					%> 
					<s:url id="usersmanagment" action="link">
					<s:param name="link">usersmanagment</s:param>
					</s:url>
					<s:a href="%{usersmanagment}" target="leftmain" cssClass="dropD">usersmanagment</s:a>
<%-- 					<a href="<s:url value="SubModuleMenu.jsp"  />"target="leftmain"  class="button" >Usersmanagment</a> --%>
					
				<%}%>
			</td>
			<td>
				<%String studentmanagment = (String) session.getAttribute("studentmanagment");
					if (studentmanagment != null) 
					{ 
					%>
					<s:url id="studentmanagment" action="link">
					<s:param name="link">studentmanagment</s:param>
					</s:url>
					<s:a href="%{studentmanagment}" target="leftmain" cssClass="dropD">studentmanagment</s:a>
<%-- 					<a href="<s:url value="SubModuleMenu1.jsp"  />"target="leftmain" class="button">Studentmanagment</a>  --%>
					
				<%}%>
			</td>
			<td>
				<%String employeemanagment = (String) session.getAttribute("employeemanagment");
					if (employeemanagment != null) 
					{ 
					%>
					<s:url id="employeemanagment" action="link">
					<s:param name="link" >employeemanagment</s:param>
					</s:url>
					<s:a href="%{employeemanagment}" target="leftmain" cssClass="dropD">employeemanagment</s:a>
<%-- 					<a href="<s:url value="SubModuleMenu2.jsp"  />"target="leftmain" class="button">Employeemanagment</a>  --%>
				<%}%>
			</td>
			<td>
				<%String facultymanagment = (String) session.getAttribute("facultymanagment");
					if (facultymanagment != null) 
					{%> 
						<s:url id="facultymanagment" action="link">
					<s:param name="link">facultymanagment</s:param>
					</s:url>
					<s:a href="%{facultymanagment}" target="leftmain" cssClass="dropD">facultymanagment</s:a>
<%-- 					<a href="<s:url value="SubModuleMenu.jsp"  />"target="leftmain" class="button">Facultymanagment</a>  --%>
				<%}%>
			</td>
			<td>
				<%String batchmanagment = (String) session.getAttribute("batchmanagment");
					if (batchmanagment != null) 
					{%> 
						<s:url id="batchmanagment" action="link">
					<s:param name="link">batchmanagment</s:param>
					</s:url>
					<s:a href="%{batchmanagment}" target="leftmain" cssClass="button">batchmanagment</s:a> 
				<%}%>
			</td>
			<td>
				<%String coursemanagment = (String) session.getAttribute("coursemanagment");
					if (coursemanagment != null) 
					{%> 
						<s:url id="coursemanagment" action="link">
					<s:param name="link">coursemanagment</s:param>
					</s:url>
					<s:a href="%{coursemanagment}" target="leftmain" cssClass="button">coursemanagment</s:a> 
				<%}%>
			</td>
			<td>
				<%String exammanagment = (String) session.getAttribute("exammanagment");
					if (exammanagment != null) 
					{%> 
						<s:url id="exammanagment" action="link">
					<s:param name="link">exammanagment</s:param>
					</s:url>
					<s:a href="%{exammanagment}" target="leftmain" cssClass="button">exammanagment</s:a>
				<%}%>
			</td>
			<td>
				<%String librarymanagment = (String) session.getAttribute("librarymanagment");
					if (librarymanagment != null) 
					{%> 
						<s:url id="librarymanagment" action="link">
					<s:param name="link">librarymanagment</s:param>
					</s:url>
					<s:a href="%{librarymanagment}" target="leftmain" cssClass="button">librarymanagment</s:a>
				<%}%>
			</td>
			<td>
				<%String labmanagement = (String) session.getAttribute("labmanagement");
					if (labmanagement != null) 
					{%> 
						<s:url id="labmanagement" action="link">
					<s:param name="link">labmanagement</s:param>
					</s:url>
					<s:a href="%{labmanagement}" target="leftmain" cssClass="button">labmanagement</s:a>
				<%}%>
			</td></tr>
	</table>
</body>
</html>