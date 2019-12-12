/* Adam McKinlay - c0656685
 * 2019-12-12
 */
$(document).ready(function(){
   $(".account_type").text(localStorage.getItem("openAccount"));
   $("#acc_Type").val(localStorage.getItem("openAccount"));
   $("#submit").click(function(){
	   var emailAdd = $("#email").val();
       localStorage.setItem("email", emailAdd);
   });
});

