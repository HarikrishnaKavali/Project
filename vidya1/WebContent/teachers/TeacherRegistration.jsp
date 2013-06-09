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
	
	<s:form action="teacherRegistrationAction"  method="post">
		<s:textfield name="firstname" key="teacher.firstname" />
		<s:textfield name="lastname" key="teacher.lastname" />
		<sx:datetimepicker name="dob" key="teacher.dob" displayFormat="dd-MMM-yyyy" value="%{'today'}" />
		<sx:datetimepicker name="joindate" key="teacher.joindate" displayFormat="dd-MMM-yyyy" value="%{'today'}" />
		<s:textfield name="experience" key="teacher.experience" />
		<s:textfield name="email" key="teacher.email" />
		<s:textfield name="phoneno" maxlength="10" key="teacher.phno" />
		<s:textarea cols="16" rows="3" name="address" maxlength="100"
			key="teacher.address" />

		<sx:submit value="submit" name="submit" />

	</s:form>

</body>
</html>