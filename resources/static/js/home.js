/* Adam McKinlay - c0656685
 * 2019-12-12
 */
$(document).ready(function(){
    openTab = function(id, id2){
        var i, tabcontent, tablinks, headings;
        tabcontent = document.getElementsByClassName("tabcontent");
        for (i = 0; i < tabcontent.length; i++) {
          tabcontent[i].style.display = "none";
        }
        tablinks = document.getElementsByClassName("tablinks");
        for (i = 0; i < tablinks.length; i++) {
          tablinks[i].className = tablinks[i].className.replace(" active", "");
        }
        
        headings = document.getElementsByClassName("mobile_tab_heading");
        for(i=0; i<headings.length; i++){
            headings[i].style.display ="none";
        }
        $("#"+id).fadeIn(2000);
        $("#"+id2).fadeIn(2000);
        
        if(("#"+id) === "#personal"){
            $("#"+id+" i").css("color","green");
            $("#"+id2).css("color","green");
        }else{
            $("#"+id+" i").css("color","blue");
            $("#"+id2).css("color","blue");
        }
    };
    
    $("#defaultOpen").click();
    
    //$("#mobile_quick_links").mobile_tabs();
});

