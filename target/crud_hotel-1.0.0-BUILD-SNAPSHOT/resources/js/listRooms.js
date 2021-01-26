function addRoom() {
    $('#roomDialog').dialog("option", "title", 'Add Room');
    $('#roomDialog').dialog('open');
}

function editRoom(id) {

    $.get("get/" + id, function(result) {

        $("#roomDialog").html(result);

        $('#roomDialog').dialog("option", "title", 'Edit Room');

        $("#roomDialog").dialog('open');

    });
}

function resetDialog(form) {

    form.find("input").val("");
}

$(document).ready(function() {

    $('#roomDialog').dialog({

        autoOpen : false,
        position : 'center',
        modal : true,
        resizable : false,
        width : 440,
        buttons : {
            "Save" : function() {
                $('#roomForm').submit();
            },
            "Cancel" : function() {
                $(this).dialog('close');
            }
        },
        close : function() {

            resetDialog($('#roomForm'));

            $(this).dialog('close');
        }
    });

});
