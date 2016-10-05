/**
 * Created by ASUS on 2016/10/5.
 */
$(document).ready(function(){

    $("#sign").click(animate).mouseover(function(){
        $("#sign").css({"background-color":"#A55"});
    }).mouseout(function(){
        $("#sign").css({"background-color":"#060"});
    });
});

function animate(){
    $("#title").html("sign in successfully");
}