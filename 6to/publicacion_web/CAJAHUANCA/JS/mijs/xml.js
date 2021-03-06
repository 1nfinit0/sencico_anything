$(document).ready(function () {
    $("#headerTitle").hide(300).show(1500);
    showFoodMenu();
});

function showFoodMenu() {
    $.ajax({
        type: "GET",
        url: "../../XML/capas.xml",
        dataType: "xml",
        error: function (e) {
            alert("Se produjo un error al procesar el archivo XML");
            console.log("Lectura XML fallida: ", e);
        },
        success: function (response) {
            $("ul").children().remove();
            $(response).find("map").each(function () {
                var _name = '' + $(this).find('wms').text();
                $("ul").append('<li>' + _name + '</li>');
            });
        }
    });
}