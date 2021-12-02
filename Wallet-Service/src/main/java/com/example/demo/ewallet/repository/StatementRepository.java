package com.example.demo.ewallet.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.ewallet.model.Statement;

public interface StatementRepository extends MongoRepository<Statement, String>{
	
}
