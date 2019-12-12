/* Adam McKinlay - c0656685
 * 2019-12-12
 */
$(document).ready(function(){
   $("#account").text(localStorage.getItem("openAccount"));
   $("#email").text(localStorage.getItem("email"));
});

