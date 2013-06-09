<%@page import="com.lorven.vidya.exam.beans.ReadingQuestionPaperBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%ArrayList<ReadingQuestionPaperBean> al=(ArrayList<ReadingQuestionPaperBean>)request.getAttribute("questions");
	
if(al!=null)
{%>
	
	<table width="100%" height="100%" border="1" >
	<tr>
		<th align="left"><font color="red">code</font></th>
		<th align="left"><font color="red">date</font></th>
		<th align="left"><font color="red">hh</font></th>
		<th align="left"><font color="red">mm</font></th>
		<th align="left"><font color="red">question</font></th>
		<th align="left"><font color="red">ans type</font></th>
		<th align="left"><font color="red">option1</font></th>
		<th align="left"><font color="red">option2</font></th>
		<th align="left"><font color="red">option3</font></th>
		<th align="left"><font color="red">option4</font></th>
		<th align="left"><font color="red">option5</font></th>
	</tr>

	
	<% ReadingQuestionPaperBean beans=null;
	for(ReadingQuestionPaperBean bean:al)
	{%>
		<tr><td><%=bean.getExamCode() %></td>
		<td><%=bean.getExamDate() %></td>
		<td><%=bean.getTime_hours() %></td>
		<td><%=bean.getTime_minutes() %></td>
		<td><%=bean.getQuestion() %></td>
		<td><%=bean.getAnswer_type() %></td>
		<td><%=bean.getOption1() %></td>
		<td><%=bean.getOption2() %></td>
		<td><%=bean.getOption3() %></td>
		<td><%=bean.getOption4() %></td>
		<td><%=bean.getOption5() %></td></tr>
		
		<%beans=bean;
	}
}
%>
</table>


success
</body>
</html>