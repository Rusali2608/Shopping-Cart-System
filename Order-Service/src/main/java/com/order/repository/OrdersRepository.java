package com.order.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.order.model.Orders;

@Repository
public interface OrdersRepository extends MongoRepository<Orders, Integer> {

}
