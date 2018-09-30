package com.mediplus.mediplus.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mediplus.mediplus.model.Doctor;

@Repository
public interface DoctorRepository extends MongoRepository<Doctor,String>{
	
}
