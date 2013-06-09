<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>

<html>
<head>

<sx:head />
</head>
<body>

	<s:form action="questionPaperAction" method="post" enctype="multipart/form-data">
		<s:textfield name="examcode" key="exam.code" />
		<s:select name="examtype" key="exam.examtype"   headerKey="Select" headerValue="Select Exam"
			list="{'Sliptest','Unittest1','Unittest2','Unittest3','Unittest4','Unittest5','Unittest6','Quartyearly','Halfyearly','Grandtest','Speltests','Prefinal','Anual'}"></s:select>
		<s:select name="subject" key="exam.subject" headerValue="Select Subject" headerKey="Select Subject"
			list="{'First Language','Hindhi','English','Mathematics','Science','Social'}" />
		<s:textfield name="incharge" key="exam.incharge" />
		<sx:datetimepicker name="date" key="exam.date"
			displayFormat="dd-MMM-yyyy" value="%{'today'}" />
		<s:file name="uploadFile" key="exam.file"/>
		<sx:submit />

	</s:form>

</body>
</html>