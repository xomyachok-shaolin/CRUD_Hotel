<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="utf-8"%>

<c:url var="actionUrl" value="save" />

<form:form id="journalForm" commandName="journal" method="post"
	action="${actionUrl }" class="form-horizontal" accept-charset="utf-8">

    <div class="form-group">
        <label for="dateIncome" class="col-xs-4 control-label">Date Income</label>
        <div class="col-xs-8">
            <form:input type="date" path="dateIncome" maxlength="15"
                        class="form-control" />
        </div>
    </div>

	<div class="form-group">
		<label class="col-xs-4 control-label">Room</label>
		<div class="col-xs-8">
			<form:select path="roomsByRoomId.id" class="form-control" >
				<form:option value="">Нет комнаты</form:option>
				<form:options items="${rooms}" itemValue="id" itemLabel="number" />
			</form:select>
		</div>

	</div>

    <div class="form-group">
		<label class="col-xs-4 control-label">Client</label>
		<div class="col-xs-8">
			<form:select path="usersByUserId.id" class="form-control" >
				<form:option value="">Нет клиента</form:option>
				<form:options items="${users}" itemValue="id" itemLabel="mail" />
			</form:select>
		</div>
    </div>

	<div class="form-group">
		<label for="dateExport" class="col-xs-4 control-label">Date Export</label>
		<div class="col-xs-8">
			<form:input type="date" path="dateExport" maxlength="15"
						class="form-control" />
		</div>
	</div>

	<form:input path="id" type="hidden" />
</form:form>