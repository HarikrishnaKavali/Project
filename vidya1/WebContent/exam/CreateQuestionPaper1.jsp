<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Creating Question Paper</title>
</head>
<body>
	<sx:head />
	<s:form action="writingQuestionPaper" name="myForm" method="get" >
		<table align="center">
			<s:textfield name="examcode" key="exam.code" requiredLabel="true"/>
			<sx:datetimepicker displayFormat="dd-MMM-yyy" name="conductingDate" requiredLabel="true" 
				key="exam.date"  />
			<s:select name="examHours" headerKey="" headerValue="Hours" 
				key="exam.hours" requiredLabel="true"  
				list="{'00','01','02','03'}" />
			<s:select name="examMinutes" headerKey="" headerValue="Minutes"
				key="exam.minutes" requiredLabel="true"
				list="{'00','05','10','15','20','25','30','35','40','45','50','55'}" />
			<tr>
				<td></td>
				<td><s:submit align="center" /></td>
				<td></td>
			</tr>
		</table>

	</s:form>
</body>
</html>