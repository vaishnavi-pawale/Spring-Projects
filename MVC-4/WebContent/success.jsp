<%@page import="com.Entity.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">


function edit(){
	alert("edit function called!!!!")
}


function delete(){
	alert("delete function called!!!!")
}

</script>

</head>
<body>

	<h1>Successfully login</h1>

	<%
		List<Employee> liemp = (List<Employee>) request.getAttribute("msg");
	%>

	<!-- <h4>${msg}</h4> -->

	<form name="mypage">

		<table border="2" style="color: green">

			<thead>
				<tr>
					<td>Select</td>
					<td>EmployeeID</td>
					<td>EmployeeName</td>
					<td>EmployeeHeight</td>
					<td>EmployeeAddress</td>
					<td>EmployeeAge</td>
					<td>EmployeeNumber</td>
					<td>EmployeeDOB</td>
					<td>Edit</td>
					<td>Delete</td>

				</tr>
			</thead>

			<tbody>

				<tr>
					<%
						for (Employee emp : liemp) {
					%>
					<td><input type="radio" name="eid" value="<%=emp.getEid()%>"></td>
					<td><%=emp.getEid()%></td>
					<td><%=emp.getEname()%></td>
					<td><%=emp.getEheight()%></td>
					<td><%=emp.getEaddress()%></td>
					<td><%=emp.getEage()%></td>
					<td><%=emp.getEmob()%></td>
					<td><%=emp.getEdob()%></td>
					<td><button value="submit" onclick="edit()">Edit</button></td>
					<td><button value="submit" onclick="delete()">Delete</button></td>
				</tr>
				<%
					}
				%>

			</tbody>

		</table>


	</form>


</body>
</html>