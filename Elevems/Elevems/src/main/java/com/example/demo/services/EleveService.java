package com.example.demo.services;

import com.example.demo.entities.Eleve;
import com.example.demo.repositories.EleveRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
 
@Service
public class EleveService {
 
    @Autowired
    private EleveRepo eleveRepository;
 
    // Method to create a new Eleve
    public Eleve createEleve(Eleve eleve) {
        return eleveRepository.save(eleve);
    }
 
    // Method to list all Eleves
    public List<Eleve> listEleves() {
        return eleveRepository.findAll();
    }
}


