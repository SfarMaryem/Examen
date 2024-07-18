package com.example.demo.services;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.dto.BilletDTO;
import com.example.demo.entities.Billet;
import com.example.demo.repositories.BilletRepo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BilletService {

	@Autowired
    private BilletRepo billetRepository;

    public List<Billet> findAll() {
        return billetRepository.findAll();
    }

    public Optional<Billet> findById(String id) {
        return billetRepository.findById(id);
    }

    public Billet save(Billet billet) {
        return billetRepository.save(billet);
    }

    public void deleteById(String id) {
    	billetRepository.deleteById(id);
    }
}