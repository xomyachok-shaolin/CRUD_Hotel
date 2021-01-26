function addJournal() {
    $('#journalDialog').dialog("option", "title", 'Add Journal');
    $('#journalDialog').dialog('open');
}

function editJournal(id) {

    $.get("get/" + id, function(result) {

        $("#journalDialog").html(result);

        $('#journalDialog').dialog("option", "title", 'Edit Journal');

        $("#journalDialog").dialog('open');

    });
}

function resetDialog(form) {

    form.find("input").val("");
}

$(document).ready(function() {

    $('#journalDialog').dialog({

        autoOpen : false,
        position : 'center',
        modal : true,
        resizable : false,
        width : 440,
        buttons : {
            "Save" : function() {
                $('#journalForm').submit();
            },
            "Cancel" : function() {
                $(this).dialog('close');
            }
        },
        close : function() {

            resetDialog($('#journalForm'));

            $(this).dialog('close');
        }
    });

});
