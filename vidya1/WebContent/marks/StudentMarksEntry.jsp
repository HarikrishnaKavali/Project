<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student marks entry form</title>
</head>
<body>

	<s:head />
	<s:form action="examaction">
	<s:textfield name="studentname" key="exam.stdname" />
	<s:textfield name="studentid" key="exam.stdid" />
	<s:select list="" name="studentclass"></s:select>
	<s:select list="" name="examdate" />
	<s:textfield name="firstlanguage" key="exam.firstlanguage" />
	<s:textfield name="hindhi" key="exam.hindhi" />
	<s:textfield name="english" key="exam.english" />
	<s:textfield name="mathematics" key="exam.mathematics" />
	<s:textfield name="science" key="exam.science" />
	<s:textfield name="social" key="exam.social" />
	</s:form>
</body>
</html>