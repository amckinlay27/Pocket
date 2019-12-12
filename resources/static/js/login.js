/* Adam McKinlay - c0656685
 * 2019-12-12
 */
$(document).ready(function(){
    openCloseMenu = function(obj){
        obj.classList.toggle("change");
        
        var menu = document.getElementById("mobile_menu");
        var home = document.getElementById("home_section");
        if(menu.style.display === "block"){
            $(menu).css('display','none');
            $("body").css('background-color','rgba(24, 189, 24, 0.2)');
            $(home).css('display','block');
        }else{
            $(home).css('display','none');
            $("body").css('background-color','white');
            $(menu).css('display','block');
        }
    };
});

