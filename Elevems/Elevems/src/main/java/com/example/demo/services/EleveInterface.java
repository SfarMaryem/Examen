package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.EleveDTO;
import com.example.demo.entities.Eleve;

public interface EleveInterface {
	List<Eleve> findAll();
	//EleveDTO findById(String id);
	EleveDTO createEleve(EleveDTO eleveDto);
	//EleveDTO updateEleve(EleveDTO eleveDto);
    //void deleteById(String id);
}
