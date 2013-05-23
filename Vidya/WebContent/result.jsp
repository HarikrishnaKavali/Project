<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1" --%>
<%--     pageEncoding="ISO-8859-1"%> --%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<%-- <%@taglib prefix="s" uri="/struts-tags"%> --%>
<!-- <html> -->
<!-- <head> -->
<!-- <title>usersDetails</title> -->
<!-- </head> -->
<!-- <body> -->
<%-- <s:iterator value="list1"> --%>
<%-- <s:property value="firstname"/> --%>
<%-- <s:property value="lastname"/> --%>
<%-- <s:property value="username"/> --%>
<%-- <s:property value="password"/> --%>
<%-- <s:property value="uinsert"/> --%>
<%-- <s:property value="uupdate"/> --%>
<%-- </s:iterator> --%>
<!-- </body> -->
<!-- </html> -->


<%@page import="com.lorvenit.vidya.users.beans.UsersRegistrationBeans"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.ArrayList" %>
<html>
<head>
<title>usersDetails</title>
</head>
<body>
<% ArrayList list=(ArrayList) request.getAttribute("users"); 

if(list !=null)
{
	for(int i=0; i<list.size(); i++)
	{
		UsersRegistrationBeans st=(UsersRegistrationBeans)list.get(i);
%>
<table align="center">
<tr><td align="right"><font color="red">FirstName:</font></td>
<td align="left"><%=st.getFirstname()%></td>
</tr>
<tr><td align="right"><font color="red">LastName:</font></td>
<td align="left"><%=st.getLastname()%></td>
</tr>

<tr><td align="right"><font color="red">UserName:</font></td>
<td align="left"><%=st.getUsername()%></td>
</tr>

<tr><td align="right"><font color="red">PassWord:</font></td>
<td align="left"><%=st.getPassword()%></td>
</tr>

<tr><td align="right"><font color="red">RePassWord:</font></td>
<td align="left"><%=st.getRepassword()%></td>
</tr>

<tr><td align="right"><font color="red">PassWordHint:</font></td>
<td align="left"><%=st.getPasswordhint()%></td>
</tr>

<tr><td align="right"><font color="red">EmailId:</font></td>
<td align="left"><%=st.getEmail()%></td>
</tr>

<tr><td align="right"><font color="red">USERSMANAGMENT:</font></td>
<td align="left"><font color="blue"><%=st.getUsersmanagment()%></font></td>
</tr>

<tr><td align="right"><font color="green">insert:</font></td>
<td align="left"><%=st.getUinsert()%></td>
</tr>

<tr><td align="right"><font color="green">update:</font></td>
<td align="left"><%=st.getUupdate()%></td>
</tr>

<tr><td align="right"><font color="green">view:</font></td>
<td align="left"><%=st.getUview()%></td>
</tr>

<tr><td align="right"><font color="green">delete:</font></td>
<td align="left"><%=st.getUdelete()%></td>
</tr>

<tr><td align="right"><font color="red">STUDENTMANAGMENT:</font></td>
<td align="left"><font color="blue"><%=st.getStudentmanagment()%></font></td>
</tr>

<tr><td align="right"><font color="green">insert:</font></td>
<td align="left"><%=st.getSinsert()%></td>
</tr>

<tr><td align="right"><font color="green">update:</font></td>
<td align="left"><%=st.getSupdate()%></td>
</tr>

<tr><td align="right"><font color="green">view:</font></td>
<td align="left"><%=st.getSview()%></td>
</tr>

<tr><td align="right"><font color="green">delete:</font></td>
<td align="left"><%=st.getSdelete()%></td>
</tr>

<tr><td align="right"><font color="red">FACULTYMANAGMENT:</font></td>
<td align="left"><font color="blue"><%=st.getFacultymanagment()%></font></td>
</tr>

<tr><td align="right"><font color="green">insert:</font></td>
<td align="left"><%=st.getFinsert()%></td>
</tr>

<tr><td align="right"><font color="green">update:</font></td>
<td align="left"><%=st.getFupdate()%></td>
</tr>

<tr><td align="right"><font color="green">view:</font></td>
<td align="left"><%=st.getFview()%></td>
</tr>

<tr><td align="right"><font color="green">delete:</font></td>
<td align="left"><%=st.getFdelete()%></td>
</tr>

<tr><td align="right"><font color="red">EMPLOYEEMANAGMENT:</font></td>
<td align="left"><font color="blue"><%=st.getEmployeemanagment()%></font></td>
</tr>

<tr><td align="right"><font color="green">insert:</font></td>
<td align="left"><%=st.getEinsert()%></td>
</tr>

<tr><td align="right"><font color="green">update:</font></td>
<td align="left"><%=st.getEupdate()%></td>
</tr>

<tr><td align="right"><font color="green">view:</font></td>
<td align="left"><%=st.getEview()%></td>
</tr>

<tr><td align="right"><font color="green">delete:</font></td>
<td align="left"><%=st.getEdelete()%></td>
</tr>

<tr><td align="right"><font color="red">BATCHMANAGMENT:</font></td>
<td align="left"><font color="blue"><%=st.getBatchmanagment()%></font></td>
</tr>

<tr><td align="right"><font color="green">insert:</font></td>
<td align="left"><%=st.getBinsert()%></td>
</tr>

<tr><td align="right"><font color="green">update:</font></td>
<td align="left"><%=st.getBupdate()%></td>
</tr>

<tr><td align="right"><font color="green">view:</font></td>
<td align="left"><%=st.getBview()%></td>
</tr>

<tr><td align="right"><font color="green">delete:</font></td>
<td align="left"><%=st.getBdelete()%></td>
</tr>

<tr><td align="right"><font color="red">COURSEMANAGMENT:</font></td>
<td align="left"><font color="blue"><%=st.getCoursemanagment()%></font></td>
</tr>

<tr><td align="right"><font color="green">insert:</font></td>
<td align="left"><%=st.getCinsert()%></td>
</tr>

<tr><td align="right"><font color="green">update:</font></td>
<td align="left"><%=st.getCupdate()%></td>
</tr>

<tr><td align="right"><font color="green">view:</font></td>
<td align="left"><%=st.getCview()%></td>
</tr>

<tr><td align="right"><font color="green">delete:</font></td>
<td align="left"><%=st.getCdelete()%></td>
</tr>

<tr><td align="right"><font color="red">EXAMMANAGMENT:</font></td>
<td align="left"><font color="blue"><%=st.getExammanagment()%></font></td>
</tr>

<tr><td align="right"><font color="green">insert:</font></td>
<td align="left"><%=st.getExinsert()%></td>
</tr>

<tr><td align="right"><font color="green">update:</font></td>
<td align="left"><%=st.getExupdate()%></td>
</tr>

<tr><td align="right"><font color="green">view:</font></td>
<td align="left"><%=st.getExview()%></td>
</tr>

<tr><td align="right"><font color="green">delete:</font></td>
<td align="left"><%=st.getExdelete()%></td>
</tr>

<tr><td align="right"><font color="red">LABMANAGMENT:</font></td>
<td align="left"><font color="blue"><%=st.getLabmanagement()%></font></td>
</tr>

<tr><td align="right"><font color="green">insert:</font></td>
<td align="left"><%=st.getLainsert()%></td>
</tr>

<tr><td align="right"><font color="green">update:</font></td>
<td align="left"><%=st.getLaupdate()%></td>
</tr>

<tr><td align="right"><font color="green">view:</font></td>
<td align="left"><%=st.getLaview()%></td>
</tr>

<tr><td align="right"><font color="green">delete:</font></td>
<td align="left"><%=st.getLadelete()%></td>
</tr>

<tr><td align="right"><font color="red">LIBRARYMANAGMENT:</font></td>
<td align="left"><font color="blue"><%=st.getLibrarymanagment()%></font></td>
</tr>

<tr><td align="right"><font color="green">insert:</font></td>
<td align="left"><%=st.getLiinsert()%></td>
</tr>

<tr><td align="right"><font color="green">update:</font></td>
<td align="left"><%=st.getLiupdate()%></td>
</tr>

<tr><td align="right"><font color="green">view:</font></td>
<td align="left"><%=st.getLiview()%></td>
</tr>

<tr><td align="right"><font color="green">delete:</font></td>
<td align="left"><%=st.getLidelete()%></td>
</tr>

</table>

<%}} %>
</body>
</html> 