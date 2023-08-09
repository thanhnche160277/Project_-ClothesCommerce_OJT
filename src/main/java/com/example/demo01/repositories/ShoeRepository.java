package com.example.demo01.repositories;

import com.example.demo01.models.Shoe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoeRepository extends MongoRepository<Shoe,String> {
    public Shoe findOneById(String id);
}
