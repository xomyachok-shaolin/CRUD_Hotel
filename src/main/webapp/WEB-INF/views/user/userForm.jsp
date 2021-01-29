<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="utf-8"%>

<c:url var="actionUrl" value="save" />

<form:form id="userForm" commandName="user" method="post"
	action="${actionUrl }" class="form-horizontal" accept-charset="utf-8">

    <div class="form-group">
        <label for="surname" class="col-xs-4 control-label">Surname</label>
        <div class="col-xs-8">
            <form:input path="surname" placeholder="Surname" maxlength="15"
                        class="form-control" />
        </div>
    </div>

	<div class="form-group">
		<label for="name" class="col-xs-4 control-label">Name</label>
		<div class="col-xs-8">
			<form:input name="name" id="name" path="name"
				placeholder="Name" maxlength="15" class="form-control" />
		</div>
	</div>

    <div class="form-group">
        <label for="lastname" class="col-xs-4 control-label">Lastname</label>
        <div class="col-xs-8">
            <form:input name="lastname" path="lastname" placeholder="Lastname"
                        class="form-control" />

        </div>
    </div>

    <div class="form-group">
		<label for="mail" class="col-xs-4 control-label">Mail</label>
		<div class="col-xs-8">
			<form:input path="mail" placeholder="Mail" class="form-control" />
		</div>
	</div>

	<div class="form-group">
		<label for="comment" class="col-xs-4 control-label">Comment</label>
		<div class="col-xs-8">
			<form:input path="comment" placeholder="Comment" class="form-control" />
		</div>
	</div>

	<form:input path="id" type="hidden" />
</form:form>