<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>USERS CHEAK</title>
<script type="text/javascript">	
function ckSum11(ckBx) {
	var pNode = ckBx.parentNode;
	if (pNode.getAttributeNode("usersManagment"))
		return whipAll();
	!ckBx.checked ? backLash() : countLashings();
	function whipAll() {
		var boxes = pNode.getElementsByTagName("INPUT"), i = 1, bool = boxes[0].checked, ckd = pNode
				.getElementsByTagName("UL")[0].attributes["checkedcount"];
		for (; i < boxes.length; i++)
			boxes[i].checked = bool;
		bool ? ckd.nodeValue = boxes.length - 1 : ckd.nodeValue = 0;
	}
	function backLash() {
		pNode = pNode.parentNode;
		pNode.parentNode.getElementsByTagName("INPUT")[0].checked = false;
		var counter = +pNode.getAttribute("checkedcount") - 1;
		pNode.attributes["checkedcount"].nodeValue = counter;
	}
	function countLashings() {
		pNode = pNode.parentNode;
		var counter = +pNode.getAttribute("checkedcount") + 1, boxes = pNode.parentNode
				.getElementsByTagName("INPUT");
		if (counter == boxes.length - 1)
			boxes[0].checked = true;
		pNode.attributes["checkedcount"].nodeValue = counter;
	}
}

	
	function ckSum(ckBx) {
		var pNode = ckBx.parentNode;
		if (pNode.getAttributeNode("StudentManagment"))
			return whipAll();
		!ckBx.checked ? backLash() : countLashings();
		function whipAll() {
			var boxes = pNode.getElementsByTagName("INPUT"), i = 1, bool = boxes[0].checked, ckd = pNode
					.getElementsByTagName("UL")[0].attributes["checkedcount"];
			for (; i < boxes.length; i++)
				boxes[i].checked = bool;
			bool ? ckd.nodeValue = boxes.length - 1 : ckd.nodeValue = 0;
		}
		function backLash() {
			pNode = pNode.parentNode;
			pNode.parentNode.getElementsByTagName("INPUT")[0].checked = false;
			var counter = +pNode.getAttribute("checkedcount") - 1;
			pNode.attributes["checkedcount"].nodeValue = counter;
		}
		function countLashings() {
			pNode = pNode.parentNode;
			var counter = +pNode.getAttribute("checkedcount") + 1, boxes = pNode.parentNode
					.getElementsByTagName("INPUT");
			if (counter == boxes.length - 1)
				boxes[0].checked = true;
			pNode.attributes["checkedcount"].nodeValue = counter;
		}
	}

	function ckSum1(ckBx) {
		var pNode = ckBx.parentNode;
		if (pNode.getAttributeNode("EmployeeManagment"))
			return whipAll();
		!ckBx.checked ? backLash() : countLashings();
		function whipAll() {
			var boxes = pNode.getElementsByTagName("INPUT"), i = 1, bool = boxes[0].checked, ckd = pNode
					.getElementsByTagName("UL")[0].attributes["checkedcount"];
			for (; i < boxes.length; i++)
				boxes[i].checked = bool;
			bool ? ckd.nodeValue = boxes.length - 1 : ckd.nodeValue = 0;
		}
		function backLash() {
			pNode = pNode.parentNode;
			pNode.parentNode.getElementsByTagName("INPUT")[0].checked = false;
			var counter = +pNode.getAttribute("checkedcount") - 1;
			pNode.attributes["checkedcount"].nodeValue = counter;
		}
		function countLashings() {
			pNode = pNode.parentNode;
			var counter = +pNode.getAttribute("checkedcount") + 1, boxes = pNode.parentNode
					.getElementsByTagName("INPUT");
			if (counter == boxes.length - 1)
				boxes[0].checked = true;
			pNode.attributes["checkedcount"].nodeValue = counter;
		}
	}

	function ckSum2(ckBx) {
		var pNode = ckBx.parentNode;
		if (pNode.getAttributeNode("FacultyManagment"))
			return whipAll();
		!ckBx.checked ? backLash() : countLashings();
		function whipAll() {
			var boxes = pNode.getElementsByTagName("INPUT"), i = 1, bool = boxes[0].checked, ckd = pNode
					.getElementsByTagName("UL")[0].attributes["checkedcount"];
			for (; i < boxes.length; i++)
				boxes[i].checked = bool;
			bool ? ckd.nodeValue = boxes.length - 1 : ckd.nodeValue = 0;
		}
		function backLash() {
			pNode = pNode.parentNode;
			pNode.parentNode.getElementsByTagName("INPUT")[0].checked = false;
			var counter = +pNode.getAttribute("checkedcount") - 1;
			pNode.attributes["checkedcount"].nodeValue = counter;
		}
		function countLashings() {
			pNode = pNode.parentNode;
			var counter = +pNode.getAttribute("checkedcount") + 1, boxes = pNode.parentNode
					.getElementsByTagName("INPUT");
			if (counter == boxes.length - 1)
				boxes[0].checked = true;
			pNode.attributes["checkedcount"].nodeValue = counter;
		}
	}

	function ckSum3(ckBx) {
		var pNode = ckBx.parentNode;
		if (pNode.getAttributeNode("BatchManagment"))
			return whipAll();
		!ckBx.checked ? backLash() : countLashings();
		function whipAll() {
			var boxes = pNode.getElementsByTagName("INPUT"), i = 1, bool = boxes[0].checked, ckd = pNode
					.getElementsByTagName("UL")[0].attributes["checkedcount"];
			for (; i < boxes.length; i++)
				boxes[i].checked = bool;
			bool ? ckd.nodeValue = boxes.length - 1 : ckd.nodeValue = 0;
		}
		function backLash() {
			pNode = pNode.parentNode;
			pNode.parentNode.getElementsByTagName("INPUT")[0].checked = false;
			var counter = +pNode.getAttribute("checkedcount") - 1;
			pNode.attributes["checkedcount"].nodeValue = counter;
		}
		function countLashings() {
			pNode = pNode.parentNode;
			var counter = +pNode.getAttribute("checkedcount") + 1, boxes = pNode.parentNode
					.getElementsByTagName("INPUT");
			if (counter == boxes.length - 1)
				boxes[0].checked = true;
			pNode.attributes["checkedcount"].nodeValue = counter;
		}
	}

	function ckSum4(ckBx) {
		var pNode = ckBx.parentNode;
		if (pNode.getAttributeNode("CourseManagment"))
			return whipAll();
		!ckBx.checked ? backLash() : countLashings();
		function whipAll() {
			var boxes = pNode.getElementsByTagName("INPUT"), i = 1, bool = boxes[0].checked, ckd = pNode
					.getElementsByTagName("UL")[0].attributes["checkedcount"];
			for (; i < boxes.length; i++)
				boxes[i].checked = bool;
			bool ? ckd.nodeValue = boxes.length - 1 : ckd.nodeValue = 0;
		}
		function backLash() {
			pNode = pNode.parentNode;
			pNode.parentNode.getElementsByTagName("INPUT")[0].checked = false;
			var counter = +pNode.getAttribute("checkedcount") - 1;
			pNode.attributes["checkedcount"].nodeValue = counter;
		}
		function countLashings() {
			pNode = pNode.parentNode;
			var counter = +pNode.getAttribute("checkedcount") + 1, boxes = pNode.parentNode
					.getElementsByTagName("INPUT");
			if (counter == boxes.length - 1)
				boxes[0].checked = true;
			pNode.attributes["checkedcount"].nodeValue = counter;
		}
	}

	function ckSum5(ckBx) {
		var pNode = ckBx.parentNode;
		if (pNode.getAttributeNode("ExamManagment"))
			return whipAll();
		!ckBx.checked ? backLash() : countLashings();
		function whipAll() {
			var boxes = pNode.getElementsByTagName("INPUT"), i = 1, bool = boxes[0].checked, ckd = pNode
					.getElementsByTagName("UL")[0].attributes["checkedcount"];
			for (; i < boxes.length; i++)
				boxes[i].checked = bool;
			bool ? ckd.nodeValue = boxes.length - 1 : ckd.nodeValue = 0;
		}
		function backLash() {
			pNode = pNode.parentNode;
			pNode.parentNode.getElementsByTagName("INPUT")[0].checked = false;
			var counter = +pNode.getAttribute("checkedcount") - 1;
			pNode.attributes["checkedcount"].nodeValue = counter;
		}
		function countLashings() {
			pNode = pNode.parentNode;
			var counter = +pNode.getAttribute("checkedcount") + 1, boxes = pNode.parentNode
					.getElementsByTagName("INPUT");
			if (counter == boxes.length - 1)
				boxes[0].checked = true;
			pNode.attributes["checkedcount"].nodeValue = counter;
		}
	}

	function ckSum6(ckBx) {
		var pNode = ckBx.parentNode;
		if (pNode.getAttributeNode("LibraryManagment"))
			return whipAll();
		!ckBx.checked ? backLash() : countLashings();
		function whipAll() {
			var boxes = pNode.getElementsByTagName("INPUT"), i = 1, bool = boxes[0].checked, ckd = pNode
					.getElementsByTagName("UL")[0].attributes["checkedcount"];
			for (; i < boxes.length; i++)
				boxes[i].checked = bool;
			bool ? ckd.nodeValue = boxes.length - 1 : ckd.nodeValue = 0;
		}
		function backLash() {
			pNode = pNode.parentNode;
			pNode.parentNode.getElementsByTagName("INPUT")[0].checked = false;
			var counter = +pNode.getAttribute("checkedcount") - 1;
			pNode.attributes["checkedcount"].nodeValue = counter;
		}
		function countLashings() {
			pNode = pNode.parentNode;
			var counter = +pNode.getAttribute("checkedcount") + 1, boxes = pNode.parentNode
					.getElementsByTagName("INPUT");
			if (counter == boxes.length - 1)
				boxes[0].checked = true;
			pNode.attributes["checkedcount"].nodeValue = counter;
		}
	}
	
	function ckSum12(ckBx) {
		var pNode = ckBx.parentNode;
		if (pNode.getAttributeNode("LabManagement"))
			return whipAll();
		!ckBx.checked ? backLash() : countLashings();
		function whipAll() {
			var boxes = pNode.getElementsByTagName("INPUT"), i = 1, bool = boxes[0].checked, ckd = pNode
					.getElementsByTagName("UL")[0].attributes["checkedcount"];
			for (; i < boxes.length; i++)
				boxes[i].checked = bool;
			bool ? ckd.nodeValue = boxes.length - 1 : ckd.nodeValue = 0;
		}
		function backLash() {
			pNode = pNode.parentNode;
			pNode.parentNode.getElementsByTagName("INPUT")[0].checked = false;
			var counter = +pNode.getAttribute("checkedcount") - 1;
			pNode.attributes["checkedcount"].nodeValue = counter;
		}
		function countLashings() {
			pNode = pNode.parentNode;
			var counter = +pNode.getAttribute("checkedcount") + 1, boxes = pNode.parentNode
					.getElementsByTagName("INPUT");
			if (counter == boxes.length - 1)
				boxes[0].checked = true;
			pNode.attributes["checkedcount"].nodeValue = counter;
		}
	}
</script> 
</head>
<body>
<form action="usersUpdate.action" >
	<ul class="ckList">
			<li usersManagment><input type="checkbox" name= "usersmanagment" onclick="ckSum11(this)"/><font color="red"><b>UsersManagment</b></font>
				<ul class="ckList">
					<li><input type="checkbox" name="uinsert"  onclick="ckSum11()"/> <font color="green"><b>Insert</b></font> &nbsp;&nbsp;
					<input type="checkbox" name="uupdate"  onclick="ckSum11()"/><font color="green"><b>Update</b></font>&nbsp;&nbsp;
					<input type="checkbox" name="uview"    onclick="ckSum11()"/><font color="green"><b>view</b></font>&nbsp;&nbsp;
					<input type="checkbox" name="udelete"  onclick="ckSum11()"/><font color="green"><b>Delete</b></font>&nbsp;&nbsp;</li>
 				</ul></li>
 				
			<li StudentManagment><input type="checkbox" name= "studentmanagment" onclick="ckSum(this)"/><font color="red"><b>StudentManagment</b></font>
				<ul class="ckList" >
					<li><input type="checkbox" name="sinsert"  onclick="ckSum()"/><font color="green"><b>Insert</b></font> &nbsp;&nbsp;
					<input type="checkbox" name="supdate"  onclick="ckSum()"/><font color="green"><b>Update</b></font>&nbsp;&nbsp;
					<input type="checkbox" name="sview"    onclick="ckSum()"/><font color="green"><b>view</b></font>&nbsp;&nbsp;
					<input type="checkbox" name="sdelete"  onclick="ckSum()"/><font color="green"><b>Delete</b></font>&nbsp;&nbsp;</li>
 				</ul></li>
 				
			<li EmployeeManagment><input type="checkbox" name="employeemanagment" onclick="ckSum1(this)"/><font color="red"><b>EmployeeManagment</b></font>
				<ul class="ckList" >
					<li><input type="checkbox" name="einsert" onclick="ckSum1()"/><font color="green"><b>Insert</b></font> &nbsp;&nbsp;
					<input type="checkbox" name="eupdate" onclick="ckSum1()"/><font color="green"><b>Update</b></font>&nbsp;&nbsp;
					<input type="checkbox" name="eview"   onclick="ckSum1()"/><font color="green"><b>view</b></font>&nbsp;&nbsp;
					<input type="checkbox" name="edelete" onclick="ckSum1()"/><font color="green"><b>Delete</b></font>&nbsp;&nbsp;</li>
				</ul></li>
				
			<li FacultyManagment><input type="checkbox" name="facultymanagment" onclick="ckSum2(this)"/><font color="red"><b>FacultyManagment</b></font>
				<ul class="ckList">
					<li><input type="checkbox" name="finsert" onclick="ckSum2()"/><font color="green"><b>Insert</b></font> &nbsp;&nbsp;
					<input type="checkbox" name="fupdate" onclick="ckSum2()"/><font color="green"><b>Update</b></font>&nbsp;&nbsp;
					<input type="checkbox" name="fview"   onclick="ckSum2()"/><font color="green"><b>view</b></font>&nbsp;&nbsp;
					<input type="checkbox" name="fdelete" onclick="ckSum2()"/><font color="green"><b>Delete</b></font>&nbsp;&nbsp;</li>
			</ul></li>
				
			<li BatchManagment><input type="checkbox" name="batchmanagment"     onclick="ckSum3(this)"/><font color="red"><b>BatchManagment</b></font>
				<ul class="ckList" >
					<li><input type="checkbox" name="binsert" onclick="ckSum3()"/><font color="green"><b>Insert</b></font> &nbsp;&nbsp;
					<input type="checkbox" name="bupdate" onclick="ckSum3()"/><font color="green"><b>Update</b></font>&nbsp;&nbsp;
					<input type="checkbox" name="bview"   onclick="ckSum3()"/><font color="green"><b>view</b></font>&nbsp;&nbsp;
					<input type="checkbox" name="bdelete" onclick="ckSum3()"/><font color="green"><b>Delete</b></font>&nbsp;&nbsp;</li>
				</ul></li>
				
			<li CourseManagment><input type="checkbox" name="coursemanagment" onclick="ckSum4(this)"/><font color="red"><b>CourseManagment</b></font>
				<ul class="ckList" >
					<li><input type="checkbox" name="cinsert" onclick="ckSum4()"/><font color="green"><b>Insert</b></font> &nbsp;&nbsp;
					<input type="checkbox" name="cupdate" onclick="ckSum4()"/><font color="green"><b>Update</b></font>&nbsp;&nbsp;
					<input type="checkbox" name="cview"   onclick="ckSum4()"/><font color="green"><b>view</b></font>&nbsp;&nbsp;
					<input type="checkbox" name="cdelete" onclick="ckSum4()"/><font color="green"><b>Delete</b></font>&nbsp;&nbsp;</li>
				</ul></li>

			<li ExamManagment><input type="checkbox" name="exammanagment" onclick="ckSum5(this)"/><font color="red"><b>ExamManagment</b></font>
				<ul class="ckList" >
					<li><input type="checkbox" name="exinsert" onclick="ckSum5()"/><font color="green"><b>Insert</b></font> &nbsp;&nbsp;
					<input type="checkbox" name="exupdate" onclick="ckSum5()"/><font color="green"><b>Update</b></font>&nbsp;&nbsp;
					<input type="checkbox" name="exview"   onclick="ckSum5()"/><font color="green"><b>view</b></font>&nbsp;&nbsp;
					<input type="checkbox" name="exdelete"  onclick="ckSum5()"/><font color="green"><b>Delete</b></font>&nbsp;&nbsp;</li>
				</ul></li>

			<li LibraryManagment><input type="checkbox" name="librarymanagment" onclick="ckSum6(this)"/> <font color="red"><b>LibraryManagment</b></font>
				<ul class="ckList" >
					<li><input type="checkbox" name="liinsert" onclick="ckSum6()"/><font color="green"><b>Insert</b></font> &nbsp;&nbsp;
					<input type="checkbox" name="liupdate" onclick="ckSum6()"/><font color="green"><b>Update</b></font>&nbsp;&nbsp;
					<input type="checkbox" name="liview"   onclick="ckSum6()"/><font color="green"><b>view</b></font>&nbsp;&nbsp;
					<input type="checkbox" name="lidelete" onclick="ckSum6()"/><font color="green"><b>Delete</b></font>&nbsp;&nbsp;</li>
				</ul></li>
				
				<li LabManagement><input type="checkbox" name= "labmanagement" onclick="ckSum12(this)"/><font color="red"><b>LabManagement</b></font>
				<ul class="ckList">
					<li><input type="checkbox"  name="lainsert"  onclick="ckSum12()"/> <font color="green"><b>Insert</b></font> &nbsp;&nbsp;
					<input type="checkbox" name="laupdate"  onclick="ckSum12()"/><font color="green"><b>Update</b></font>&nbsp;&nbsp;
					<input type="checkbox" name="laview"    onclick="ckSum12()"/><font color="green"><b>view</b></font>&nbsp;&nbsp;
					<input type="checkbox" name="ladelete"  onclick="ckSum12()"/><font color="green"><b>Delete</b></font>&nbsp;&nbsp;</li>
 				</ul></li>
		</ul>	
			<input type="submit" value="update"/>		
	</form>
</body>
</html>