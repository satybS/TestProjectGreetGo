var ajaxUrl = 'ajax/stars/';
var datatableApi;

function updateTable() {
    $.ajax({
        type: "GET",
        url: ajaxUrl,
        success: updateTableByData
    });
}

$(function () {
    datatableApi = $('#datatable').DataTable(extendsOpts({
        "columns": [
            {
                "data": "name",
            },
            {
                "data": "coordinate1"
            },
            {
                "data": "coordinate2"
            },
            {
                "data": "starType"
            },
            {
                "data": "discoverer"
            },
            {
                "defaultContent": "",
                "orderable": false,
                "render": renderEditBtn
            },
            {
                "defaultContent": "",
                "orderable": false,
                "render": renderDeleteBtn

            }
        ],
        "order": [
            [
                0,
                "desc"
            ]
        ],
        "initComplete": makeEditable
    }));

});

