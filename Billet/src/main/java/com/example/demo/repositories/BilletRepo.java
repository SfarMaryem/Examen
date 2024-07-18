package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entities.Billet;

public interface BilletRepo extends MongoRepository<Billet, String> {
	
}

