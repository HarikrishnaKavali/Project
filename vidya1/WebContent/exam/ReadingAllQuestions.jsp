<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form action="readingQuestions">

		<display:table id="data" name="sessionScope.CourseIndexForm.courseList"	requestURI="/viewcourseindex.do" pagesize="10">
			<display:column property="courseid" title="course id" sortable="true" />
			<display:column property="coursename" title="Course name" sortable="true" />
			<display:column property="coursefee" title="Course fee"	sortable="true" />
			<display:column property="description" title="description" sortable="true" />
		</display:table>

	</s:form>
</body>
</html>