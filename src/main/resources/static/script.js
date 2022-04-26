
function hentKunde(){
    const kunde = {
        navn: $("#navn").val(),
        adresse: $("#adresse").val(),
        telefonnr: $("#telefon").val(),
        epost: $("#epost").val(),
    };
     // jQuery-AJAX-call
    $.get("/", kunde, function(data){
        $("#utnavn").html(data.navn);
        $("#utadresse").html(data.adresse);
        $("#uttlf").html(data.telefonnr);
        $("#utepost").html(data.epost);
    });
}