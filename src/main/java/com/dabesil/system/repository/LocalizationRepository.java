package com.dabesil.system.repository;

import java.util.List;

import com.dabesil.system.domain.Localization;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalizationRepository extends MongoRepository<Localization, String>{

    List<Localization> findByCidade(String name);
}
