Project Requirements
1) A page with a form where users have to input information, must have at least 3 fields for the user to fill out.
	  See: templates->user->open.html
	
	
	
2) The Form must be validated on the server side (for every field).
	  See(Entities): Account.java / Client.java / Transactions.java / Users.java 



3) Contents from the form should be persisted if it passes validation.
	  See(Controller): OpenAccountContoller.java



4) A page that users can go to that lists the items created from the form in requirement 1 using Templates/Thymeleaf.
	See(Controller): LoginSessionController.java
	  See(HTML):     templates->user->user.html



5) Must take an optional get param to filter the list by an attribute (see springs @RequestParam) - this API should either filter the results from 
   the database with Streams (you can make a stream out of a collection of iterables) or by using methods in the CrudRepository (e.x findByParamName()).
	  See(Controller): LoginSessionController.java
	  See(Repository): AccountRepository.java / ClientRepository.java / TransactionRepository.java / UserRepository.java
   
   
   
6) There must be an API that returns the number of page hits since the server was online (resets back to 0 whenever the server is turned off - aka not stored in a database).
	  See(Entity): PageCounter.java
	  See(Bean):   PageCounterConfig.java
	  
	  
	  
7) This api should be called asynchronously every 3 seconds and the results displayed on every page.
	  See(Controller): PocketController.java
	  See(Task):       SchedualTask.java
	  See(Main):       PocketApplication.java
	  
	  
	  
8) There must be at-least 1 dependency injected into two different locations in the project.
	  See(Controller): LoginSessionController.java / OpenAccountController.java / AdminController.java / PocketController.java
	  
	  
	  
9) Data/Object Classes should have unit tests.
	  See(JUnit): src/test/java/TestEntities.java
	  
	  
	  
	  
NOTE: Best experience in mobile version.	  
	  
	  
	  
	  
	  
	  
	  