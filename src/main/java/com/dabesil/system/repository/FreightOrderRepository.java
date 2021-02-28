package com.dabesil.system.repository;

import java.util.List;

import com.dabesil.system.domain.FreightOrder;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreightOrderRepository extends MongoRepository<FreightOrder, String>{

    List<FreightOrder> findByRemetenteLikeIgnoreCase(String name);
}
