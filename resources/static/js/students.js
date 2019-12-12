/* Adam McKinlay - c0656685
 * 2019-12-12
 */
$(document).ready(function(){
    $("#Smart_Student_Pocket_Checking").click(function(){
        localStorage.setItem("openAccount", "Smart Student Pocket Checking");
    });
    
    $("#Student_Pocket_Chequing").click(function(){
        localStorage.setItem("openAccount", "Student Pocket Chequing");
    });
    
    $("#Student_Pocket_Chequing_plus").click(function(){
        localStorage.setItem("openAccount", "Student Pocket Chequing+");
    });
    
    $("#Student_Pocket_Savings").click(function(){
        localStorage.setItem("openAccount", "Student Pocket Savings");
    });
    
    $("#Student_Pocket_Investing").click(function(){
        localStorage.setItem("openAccount", "Student Pocket Investing");
    });
    
    $("#Student_Pocket_Investing_plus").click(function(){
        localStorage.setItem("openAccount", "Student Pocket Investing+");
    });
});