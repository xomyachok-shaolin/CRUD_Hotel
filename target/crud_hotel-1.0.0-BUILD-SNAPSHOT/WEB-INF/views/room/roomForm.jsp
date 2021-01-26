<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="utf-8"%>

<c:url var="actionUrl" value="save" />

<form:form id="roomForm" commandName="room" method="post"
	action="${actionUrl }" class="form-horizontal" accept-charset="utf-8">

    <div class="form-group">
        <label for="number" class="col-xs-4 control-label">Number</label>
        <div class="col-xs-8">
            <form:input path="number" placeholder="Number" maxlength="15"
                        class="form-control" />
        </div>
    </div>

	<div class="form-group">
		<label for="capacity" class="col-xs-4 control-label">Capacity</label>
		<div class="col-xs-8">
			<form:input type="number" name="capacity" id="capacity" path="capacity"
				placeholder="Capacity" maxlength="15" class="form-control" />
		</div>
	</div>

    <div class="form-group">
        <label for="comfortable" class="col-xs-4 control-label">Comfortable</label>
        <div class="col-xs-8">
			<select class="browser-default custom-select form-control" id="comfortable" name="comfortable" value="" maxlength="50" required="">
				<option selected>Enter comfortable</option>
				<option value="Обычный">Обычный</option>
				<option value="Полулюкс">Полулюкс</option>
				<option value="Люкс">Люкс</option>
			</select>
        </div>
    </div>

    <div class="form-group">
		<label for="price" class="col-xs-4 control-label">Price</label>
		<div class="col-xs-8">
			<form:input type="number" path="price" placeholder="Price" class="form-control" />
		</div>
	</div>

	<form:input path="id" type="hidden" />
</form:form>