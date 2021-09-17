package com.example.nameapp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface NameService extends JpaRepository<Name,Long>{
	
	
	@Query(value = "SELECT * FROM NAME", nativeQuery = true)
	List<Name> retrieveAllNames();

}
