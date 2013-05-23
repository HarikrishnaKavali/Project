<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles/link.css" />
<title>SubModuleMenu</title>
</head>
<body>
<table border=0>

			<s:if test='link=="usersmanagment"'>
			
				<% String usersmanagment = (String) session.getAttribute("usersmanagment");
					if (usersmanagment != null) 
					{
						String uinsert = (String) session.getAttribute("uinsert");
						if (uinsert != null) 
						{%> 
					<tr><td><a href="<s:url value="users/UserRegistration.jsp"  />"target="main" class="button">userinsert</a>  
						<%}%></td></tr>
					<%String uupdate = (String) session.getAttribute("uupdate");
						if (uupdate != null) 
						{%> 
					<tr><td><a href="<s:url value="users/UserUpdate.jsp" />"target="main" class="button">userupdate</a> </td></tr>
				<%}
						String uview = (String) session.getAttribute("uview");
						if (uview != null) 
						{%> 
					<tr><td><a href="<s:url value="users/UserView.jsp" />"target="main" class="button">useruview</a></td></tr> 
				<%}%>
					<%String udelete = (String) session.getAttribute("udelete");
						if (udelete != null) 
						{%> 
					<tr><td><a href="<s:url value="users/UserDelete.jsp"  />"target="main" class="button">userdelete</a> 
				<%}%></td></tr>
				<%}%></s:if>
				<s:elseif test='link=="studentmanagment"'>
				<%String studentmanagment = (String) session.getAttribute("studentmanagment");
					if (studentmanagment != null) 
					{
						String sinsert = (String) session.getAttribute("sinsert");
						if (sinsert != null) 
						{%> 
						<tr><td><a href="<s:url value="users/UserRegistration.jsp"  />"target="main">studentinsert</a>  
						<%}%></td></tr>
						<%String supdate = (String) session.getAttribute("supdate");
						if (supdate != null) 
						{%> 
					<tr><td><a href="<s:url value="Login.jsp"  />"target="main">studentupdate</a> 
				<%}%></td></tr>
				<%String sview = (String) session.getAttribute("sview");
						if (sview != null) 
						{%> 
					<tr><td><a href="<s:url value="Login.jsp"  />"target="main">studentuview</a> 
				<%}%>
				
					<%String udelete = (String) session.getAttribute("sdelete");
						if (udelete != null) 
						{%> 
					<tr><td><a href="<s:url value="Login.jsp"  />"target="main">studentudelete</a> 
				<%}%></td></tr>
				<%}%></s:elseif>
				<s:elseif test='link=="employeemanagment"'>
				<% 
				String employeemanagment = (String) session.getAttribute("employeemanagment");
					if (employeemanagment != null) 
					{
						String einsert = (String) session.getAttribute("einsert");
						if (einsert != null) 
						{%> 
					<tr><td><a href="<s:url value="users/UserRegistration.jsp"/>"target="main" >Employeeinsert</a>  
						<%}%></td></tr>
					<%String eupdate = (String) session.getAttribute("eupdate");
						if (eupdate != null) 
						{%> 
					<tr><td><a href="<s:url value="Login.jsp"  />"target="main">Employeeupdate</a> 
				<%}%></td></tr>
				<%String eview = (String) session.getAttribute("eview");
						if (eview != null) 
						{%> 
					<tr><td><a href="<s:url value="Login.jsp"  />"target="main">Employeeuview</a> 
				<%}%></td></tr>
				
					<%String edelete = (String) session.getAttribute("edelete");
						if (edelete != null) 
						{%> 
					<tr><td><a href="<s:url value="Login.jsp"  />"target="main">Employeeudelete</a> 
				<%}%></td></tr>
				<%}%>
				</s:elseif>
				
				<s:elseif test='link=="facultymanagment"'>
				<% 
				String facultymanagment = (String) session.getAttribute("facultymanagment");
					if (facultymanagment != null) 
					{
						String finsert = (String) session.getAttribute("finsert");
						if (finsert != null) 
						{%> 
					<tr><td><a href="<s:url value="users/UserRegistration.jsp"/>"target="main" >Facultyinsert</a>  
						<%}%></td></tr>
					<%String fupdate = (String) session.getAttribute("fupdate");
						if (fupdate != null) 
						{%> 
					<tr><td><a href="<s:url value="Login.jsp"  />"target="main">Facultyupdate</a> 
				<%}%></td></tr>
				<%String fview = (String) session.getAttribute("fview");
						if (fview != null) 
						{%> 
					<tr><td><a href="<s:url value="Login.jsp"  />"target="main">Facultyview</a> 
				<%}%></td></tr>
				
					<%String fdelete = (String) session.getAttribute("fdelete");
						if (fdelete != null) 
						{%> 
					<tr><td><a href="<s:url value="Login.jsp"  />"target="main">Facultydelete</a> 
				<%}%></td></tr>
				<%}%>
				</s:elseif>
				
				<s:elseif test='link=="batchmanagment"'>
				<% 
				String batchmanagment = (String) session.getAttribute("batchmanagment");
					if (batchmanagment != null) 
					{
						String binsert = (String) session.getAttribute("binsert");
						if (binsert != null) 
						{%> 
					<tr><td><a href="<s:url value="users/UserRegistration.jsp"/>"target="main" >Batchinsert</a>  
						<%}%></td></tr>
					<%String bupdate = (String) session.getAttribute("bupdate");
						if (bupdate != null) 
						{%> 
					<tr><td><a href="<s:url value="Login.jsp"  />"target="main">Batchupdate</a> 
				<%}%></td></tr>
				<%String bview = (String) session.getAttribute("bview");
						if (bview != null) 
						{%> 
					<tr><td><a href="<s:url value="Login.jsp"  />"target="main">Batchview</a> 
				<%}%></td></tr>
				
					<%String bdelete = (String) session.getAttribute("bdelete");
						if (bdelete != null) 
						{%> 
					<tr><td><a href="<s:url value="Login.jsp"  />"target="main">Batchdelete</a> 
				<%}%></td></tr>
				<%}%>
				</s:elseif>
				
				<s:elseif test='link=="coursemanagment"'>
				<% 
				String coursemanagment = (String) session.getAttribute("coursemanagment");
					if (coursemanagment != null) 
					{
						String cinsert = (String) session.getAttribute("cinsert");
						if (cinsert != null) 
						{%> 
					<tr><td><a href="<s:url value="users/UserRegistration.jsp"/>"target="main" >Courseinsert</a>  
						<%}%></td></tr>
					<%String cupdate = (String) session.getAttribute("cupdate");
						if (cupdate != null) 
						{%> 
					<tr><td><a href="<s:url value="Login.jsp"  />"target="main">Courseupdate</a> 
				<%}%></td></tr>
				<%String cview = (String) session.getAttribute("cview");
						if (cview != null) 
						{%> 
					<tr><td><a href="<s:url value="Login.jsp"  />"target="main">Courseview</a> 
				<%}%></td></tr>
				
					<%String cdelete = (String) session.getAttribute("cdelete");
						if (cdelete != null) 
						{%> 
					<tr><td><a href="<s:url value="Login.jsp"  />"target="main">Coursedelete</a> 
				<%}%></td></tr>
				<%}%>
				</s:elseif>
				
				<s:elseif test='link=="exammanagment"'>
				<% 
				String exammanagment = (String) session.getAttribute("exammanagment");
					if (exammanagment != null) 
					{
						String exinsert = (String) session.getAttribute("exinsert");
						if (exinsert != null) 
						{%> 
					<tr><td><a href="<s:url value="users/UserRegistration.jsp"/>"target="main" >Examinsert</a>  
						<%}%></td></tr>
					<%String exupdate = (String) session.getAttribute("exupdate");
						if (exupdate != null) 
						{%> 
					<tr><td><a href="<s:url value="Login.jsp"  />"target="main">Examupdate</a> 
				<%}%></td></tr>
				<%String exview = (String) session.getAttribute("exview");
						if (exview != null) 
						{%> 
					<tr><td><a href="<s:url value="Login.jsp"  />"target="main">Examview</a> 
				<%}%></td></tr>
				
					<%String exdelete = (String) session.getAttribute("exdelete");
						if (exdelete != null) 
						{%> 
					<tr><td><a href="<s:url value="Login.jsp"  />"target="main">Examdelete</a> 
				<%}%></td></tr>
				<%}%>
				</s:elseif>
				
				<s:elseif test='link=="librarymanagment"'>
				<% 
				String librarymanagment = (String) session.getAttribute("librarymanagment");
					if (librarymanagment != null) 
					{
						String liinsert = (String) session.getAttribute("liinsert");
						if (liinsert != null) 
						{%> 
					<tr><td><a href="<s:url value="users/UserRegistration.jsp"/>"target="main" >Libraryinsert</a>  
						<%}%></td></tr>
					<%String liupdate = (String) session.getAttribute("liupdate");
						if (liupdate != null) 
						{%> 
					<tr><td><a href="<s:url value="Login.jsp"  />"target="main">Libraryupdate</a> 
				<%}%></td></tr>
				<%String liview = (String) session.getAttribute("liview");
						if (liview != null) 
						{%> 
					<tr><td><a href="<s:url value="Login.jsp"  />"target="main">Libraryview</a> 
				<%}%></td></tr>
				
					<%String lidelete = (String) session.getAttribute("lidelete");
						if (lidelete != null) 
						{%> 
					<tr><td><a href="<s:url value="Login.jsp"  />"target="main">Librarydelete</a> 
				<%}%></td></tr>
				<%}%>
				</s:elseif>
				
				<s:elseif test='link=="labmanagement"'>
				<% 
				String labmanagement = (String) session.getAttribute("labmanagement");
					if (labmanagement != null) 
					{
						String lainsert = (String) session.getAttribute("lainsert");
						if (lainsert != null) 
						{%> 
					<tr><td><a href="<s:url value="users/UserRegistration.jsp"/>"target="main" >Labinsert</a>  
						<%}%></td></tr>
					<%String laupdate = (String) session.getAttribute("laupdate");
						if (laupdate != null) 
						{%> 
					<tr><td><a href="<s:url value="Login.jsp"  />"target="main">Labupdate</a> 
				<%}%></td></tr>
				<%String laview = (String) session.getAttribute("laview");
						if (laview != null) 
						{%> 
					<tr><td><a href="<s:url value="Login.jsp"  />"target="main">Labview</a> 
				<%}%></td></tr>
				
					<%String ladelete = (String) session.getAttribute("ladelete");
						if (ladelete != null) 
						{%> 
					<tr><td><a href="<s:url value="Login.jsp"  />"target="main">Labdelete</a> 
				<%}%></td></tr>
				<%}%>
				</s:elseif>
</table>
</body>
</html>