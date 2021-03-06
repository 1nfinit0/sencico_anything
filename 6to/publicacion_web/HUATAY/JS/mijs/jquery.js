$(document).ready(function () {
    $("#headerTitle").hide(300).show(1500);
    showFoodMenu();
});

function showFoodMenu() {
    $.ajax({
        type: "GET",
        url: "../../assets/capas.xml",
        dataType: "xml",
        error: function (e) {
            alert("Se produjo un error al procesar el archivo XML");
            console.log("Lectura XML fallida: ", e);
        },
        success: function (response) {
            $("ul").children().remove();
            $(response).find("file").each(function () {
                let fila = $('<tr>');
                fila.append($(`<td>${$(this).find('wms').text()}</td>`));
                fila.append($(`<td>${$(this).find('url').text()}</td>`));

                $('tbody').append(fila);
            });
        }
    });
}