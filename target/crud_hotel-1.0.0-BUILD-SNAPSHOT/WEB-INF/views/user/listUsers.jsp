<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>STP.CRUD_Hotel.Clients</title>

<link rel="stylesheet"
	href='<c:url value="/web-resources/lib/bootstrap-3.3.6/css/bootstrap.min.css"/>'>
	
<link rel="stylesheet"
	href='<c:url value="/web-resources/lib/jquery/jquery-ui-1.10.4.custom.css"/>'>

	<link rel="stylesheet"
		  href='<c:url value="/web-resources/css/style.css"/>'>

<style type="text/css">
th {
	text-align: left
}
</style>


</head>

<body>
	<div style="width: 95%; margin: 0 auto;">

		<div id="userDialog" style="display: none;">
			<%@ include file="userForm.jsp"%>
		</div>

		<div class="header">

			<img src='<c:url value="/web-resources/images/head.png"/>' style="width: 100%;
                                          height: auto;
                                          background-size: cover;">
			<div id="navbar">
				<a href="{{route('ajaxjournals.index')}}">Журнал регистрации гостей</a>
				<a href="{{route('ajaxrooms.index')}}">Номера</a>
				<a class="active" href="/user/listUsers">Клиенты</a>
			</div>

		</div>

		<br><br>
		<button class="btn btn-success" onclick="addUser()">
			<span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Add Client
		</button>
		<br>
		<div class="table-responsive">
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th width="4%">№</th>
					<th width="12%">Surname</th>
					<th width="12%">Name</th>
					<th width="12%">Lastname</th>
					<th width="12%">Mail</th>
					<th width="12%">Comment</th>
					<th width="12%"></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${userList}" var="user" varStatus="loopCounter">
					<tr>
						<td><c:out value="${loopCounter.count}" /></td>
						<td><c:out value="${user.surname}" /></td>
						<td><c:out value="${user.name}" /></td>
						<td><c:out value="${user.lastname}" /></td>
						<td><c:out value="${user.mail}" /></td>
						<td><c:out value="${user.comment}" /></td>

						<td><nobr>
								<button class="btn btn-primary"
									onclick="editUser(${user.id});">

									<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Edit
								</button>

								<a class="btn btn-primary"
									onclick="return confirm('Are you sure you want to delete this client?');"
									href="delete/${user.id}">
									<span class="glyphicon glyphicon-trash" aria-hidden="true"></span> Delete
								</a>

							</nobr></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>

	</div>

	<!--  It is advised to put the <script> tags at the end of the document body so they don't block rendering of the page -->
	<script type="text/javascript"
		src='<c:url value="/web-resources/lib/jquery/jquery-1.10.2.js"/>'></script>
	<script type="text/javascript"
		src='<c:url value="/web-resources/lib/jquery/jquery-ui-1.10.4.custom.js"/>'></script>
	<script type="text/javascript"
		src='<c:url value="/web-resources/lib/jquery/jquery.ui.datepicker.js"/>'></script>
	<script type="text/javascript"
		src='<c:url value="/web-resources/lib/bootstrap-3.3.6/js/bootstrap.min.js"/>'></script>
	<script type="text/javascript"
		src='<c:url value="/web-resources/js/listUsers.js"/>'></script>
</body>
</html>