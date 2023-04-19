package com.hospital.mymavenhospital;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<patient,Integer> {
	
	}
	
	
