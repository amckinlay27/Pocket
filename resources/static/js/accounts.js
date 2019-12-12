/* Adam McKinlay - c0656685
 * 2019-12-12
 */
$(document).ready(function(){
    $("#Smart_Pocket_Checking").click(function(){
        localStorage.setItem("openAccount", "Smart Pocket Checking");
    });
    
    $("#Pocket_Chequing").click(function(){
        localStorage.setItem("openAccount", "Pocket Chequing");
    });
    
    $("#Pocket_Chequing_plus").click(function(){
        localStorage.setItem("openAccount", "Pocket Chequing+");
    });
    
    $("#Pocket_Savings").click(function(){
        localStorage.setItem("openAccount", "Pocket Savings");
    });
    
    $("#Pocket_Investing").click(function(){
        localStorage.setItem("openAccount", "Pocket Investing");
    });
    
    $("#Pocket_Investing_plus").click(function(){
        localStorage.setItem("openAccount", "Pocket Investing+");
    });
});

