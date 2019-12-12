/* Adam McKinlay - c0656685
 * 2019-12-12
 */
$(document).ready(function(evt){
	var counter =0;
   $("#home_section a").click(function(){
       $(this).toggleClass("display");
       if($(this).attr("class") !== "display"){
           $(this).next(".transactions").slideDown(1000);
       }else{
           $(this).next(".transactions").slideUp(1000);
       }
   });
   
   $("#home_section a").click();
});
