package com.example.demo.ewallet.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.ewallet.daolayer.EwalletService;
import com.example.demo.ewallet.model.Ewallet;

public interface EwalletRepository extends MongoRepository<Ewallet, String> {

}
