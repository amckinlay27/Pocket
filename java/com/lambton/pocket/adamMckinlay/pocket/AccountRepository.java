package com.lambton.pocket.adamMckinlay.pocket;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Accounts, Integer>{
	@Query("SELECT a FROM Accounts a WHERE a.accNum = ?1 AND a.clientID = ?2")
	Accounts getAccount(Integer accNum, Integer clientID);
	
	@Query("SELECT a FROM Accounts a WHERE a.clientID = ?1")
	List<Accounts> getAccountsByClientId(Integer clientID);
	
	@Query("SELECT a FROM Accounts a")
	List<Accounts> getAllAccounts();
	
	@Transactional
	@Modifying
	@Query("DELETE FROM Accounts")
	void deleteAllAccounts();
}
