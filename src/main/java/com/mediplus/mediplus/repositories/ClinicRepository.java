package com.mediplus.mediplus.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mediplus.mediplus.model.Clinic;

@Repository
public interface ClinicRepository extends MongoRepository<Clinic, String>{

	
}
