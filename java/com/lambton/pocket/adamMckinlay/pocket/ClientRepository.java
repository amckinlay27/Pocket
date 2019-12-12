package com.lambton.pocket.adamMckinlay.pocket;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Integer>{
	@Query("SELECT c FROM Client c WHERE c.id = ?1")
	Client getClient(Integer clientId);
	
	@Query("SELECT c FROM Client c")
	List<Client> getAllClients();
	
	@Query("SELECT firstName || lastName AS Name FROM Client c WHERE c.id = ?1")
	String getClientFullNameByID(Integer id);
	
	@Transactional
	@Modifying
	@Query("DELETE FROM Client")
	void deleteAllClients();
	
	@Query("SELECT sin FROM Client c WHERE c.sin = ?1")
	Integer getClientSINBySIN(Integer sin);
}
