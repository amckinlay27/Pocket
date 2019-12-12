package com.lambton.pocket.adamMckinlay.pocket;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Integer>{
	@Query("SELECT u FROM Users u WHERE u.clientID = ?1")
	Users getUserByClientId(Integer clientId);
	
	@Query("SELECT u FROM Users u WHERE u.email = ?1")
	Users getUserByEmail(String clientId);
	
	@Query("SELECT email FROM Users u WHERE u.email = ?1")
	String getUserEmailByEmail(String email);
	
	@Query("SELECT loginAttempts FROM Users u WHERE u.email = ?1")
	Integer getLoginAttemptsByEmail(String email);
	
	@Query("SELECT userID FROM Users u WHERE u.email = ?1")
	Integer getUserIDByEmail(String email);
	
	@Query("SELECT password FROM Users u WHERE u.email = ?1")
	String getPasswordByEmail(String email);
	
	@Query("SELECT clientID FROM Users u WHERE u.email = ?1")
	Integer getClientIdByEmail(String email);
	
	@Query("SELECT u FROM Users u")
	List<Users> getAllUsers();
	
	@Transactional
	@Modifying
	@Query("UPDATE Users u SET u.loginAttempts = ?1 WHERE u.email = ?2")
	void updateLoginAttemptsByEmail(Integer loginAttempts, String email);
	
	@Transactional
	@Modifying
	@Query("DELETE FROM Users")
	void deleteAllUsers();
}
