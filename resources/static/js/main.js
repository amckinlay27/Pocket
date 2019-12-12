/* Adam McKinlay - c0656685
 * 2019-12-12
 */
$(document).ready(function(){
    navTabOpen = function(id){
        var i, tabcontent, tablinks;
        tabcontent = document.getElementsByClassName("dropdown-content");
        for (i = 0; i < tabcontent.length; i++) {
          tabcontent[i].style.display = "none";
        }
        tablinks = document.getElementsByClassName("dropdown");
        for (i = 0; i < tablinks.length; i++) {
          tablinks[i].className = tablinks[i].className.replace(" active", "");
        }
        
        $("#"+id).show();
    };
    
    $("#personal_drop").click();
    openCloseMenu = function(obj){
        obj.classList.toggle("change");
        
        var menu = document.getElementById("mobile_menu");
        var home = document.getElementById("home_section");
        if(menu.style.display === "block"){
            $(menu).css('display','none');
            $(home).css('display','block');
        }else{
            $(home).css('display','none');
            $(menu).css('display','block');
        }
    };
    
    openPersonalSub = function(obj){
        $(obj).toggleClass("display");
        if($(obj).attr("class") !== "display"){
            $(".subp").slideDown();
            $(obj).css("background-color","rgba(24, 189, 24, 0.5)");
        }else{
            $(".subp").slideUp();
            $(obj).css("background-color","white");
        }
    }
    
    openBusinessSub = function(obj){
        $(obj).toggleClass("display");
        
        if($(obj).attr("class") !== "display"){
            $(".subb").slideDown();
            $(obj).css("background-color","rgba(0, 122, 224, 0.5)");
        }else{
            $(".subb").slideUp();
            $(obj).css("background-color","white");
        }
    }
    
    $("#person_sub").click();
    $("#bus_sub").click();
});

