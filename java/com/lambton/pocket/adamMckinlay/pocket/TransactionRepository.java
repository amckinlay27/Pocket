package com.lambton.pocket.adamMckinlay.pocket;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transactions, Integer>{
	@Query("SELECT t FROM Transactions t WHERE t.clientID = ?1 AND t.accountID = ?2")
	List<Transactions> getAllTransactionsByClientAccountIds(Integer clientID, Integer accID);
	
	@Query("SELECT t FROM Transactions t")
	List<Transactions> getAllTransactions();
	
	@Transactional
	@Modifying
	@Query("DELETE FROM Transactions")
	void deleteAllTransactions();
}
