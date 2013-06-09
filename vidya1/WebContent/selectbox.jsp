<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Creating Question Paper</title>
<script type="text/javascript">
	function show(obj) {
		no = obj.options[obj.selectedIndex].value;
		count = obj.options.length;
		for (i = 1; i < count; i++)
			document.getElementById('myDiv' + i).style.display = 'none';
		if (no > 0)
			document.getElementById('myDiv' + no).style.display = 'block';
	}
</script>
</head>
<body>
	<sx:head />
	<s:form action="writingQuestionPaper" name="myForm" method="get">
		<table>
			<s:textfield name="examcode" key="exam.code" />
			<sx:datetimepicker displayFormat="dd-MMM-yyy" name="conductingDate"
				key="exam.date" value="%{'today'}" />
			<s:select name="examHours" headerKey="Hours" headerValue="Hours"
				key="exam.hours"
				list="{'00','01','02','03','04','05','06','07','08','09','10','11','12'}" />
			<s:select name="examMinutes" headerKey="Minutes" headerValue="Minutes"
				key="exam.minutes"
				list="{'00','05','10','15','20','25','30','35','40','45','50','55'}" />
			<s:textarea rows="2" cols="50" key="exam.question" name="question" />

			<tr>
				<td></td>
				<td><s:text name="exam.answerType"></s:text> <select
					onChange="show(this)" name="answerType">
						<option value="0">Select</option>
						<option value="1">Single Answer</option>
						<option value="2">Multiple Answer</option>
						<option value="3">Text Type</option>
				</select>
					<div id="myDiv1" style="display: none">

						<table>
							<tr>
								<td>A:</td>
								<td><input type="radio" name="correctAnswer" value="A"></td>
								<td><input type="text" name="option1" size="57"></td>
							</tr>
							<tr>
								<td>B:</td>
								<td><input type="radio" name="correctAnswer" value="B"></td>
								<td><input type="text" name="option2" size="57"></td>
							</tr>
							<tr>
								<td>C:</td>
								<td><input type="radio" name="correctAnswer" value="C"></td>
								<td><input type="text" name="option3" size="57"></td>
							</tr>
							<tr>
								<td>D:</td>
								<td><input type="radio" name="correctAnswer" value="D"></td>
								<td><input type="text" name="option4" size="57"></td>
							</tr>
							<tr>
								<td>E:</td>
								<td><input type="radio" name="correctAnswer" value="E"></td>
								<td><input type="text" name="option5" size="57"></td>
							</tr>
						</table>

					</div>
					<div id="myDiv2" style="display: none">
						<table>
							<tr>
								<td>A:</td>
								<td><input type="checkbox" name="checkbox1" value="A"></td>
								<td><input type="text" name="option6" size="57"></td>
							</tr>
							<tr>
								<td>B:</td>
								<td><input type="checkbox" name="checkbox2" value="B"></td>
								<td><input type="text" name="option7" size="57"></td>
							</tr>
							<tr>
								<td>C:</td>
								<td><input type="checkbox" name="checkbox3" value="C"></td>
								<td><input type="text" name="option8" size="57"></td>
							</tr>
							<tr>
								<td>D:</td>
								<td><input type="checkbox" name="checkbox4" value="D"></td>
								<td><input type="text" name="option9" size="57"></td>
							</tr>
							<tr>
								<td>E:</td>
								<td><input type="checkbox" name="checkbox5" value="E"></td>
								<td><input type="text" name="option10" size="57"></td>
						</table>

					</div>
					<div id="myDiv3" style="display: none">
						<textarea rows="5" cols="50" name="eassayAnswer"></textarea>
					</div></td>
			</tr>
			<tr>
				<td></td>
				<td><s:submit align="center" /></td>
				<td></td>
			</tr>
		</table>

	</s:form>
</body>
</html>