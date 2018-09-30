package com.mediplus.mediplus.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mediplus.mediplus.model.Hospital;

@Repository
public interface HospitalRepository extends MongoRepository<Hospital,String> {

}
