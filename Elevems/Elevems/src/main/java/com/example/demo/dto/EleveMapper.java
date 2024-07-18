package com.example.demo.dto;

import com.example.demo.entities.Eleve;


public class EleveMapper {

	    // Converts Eleve entity to EleveDTO
	    public static EleveDTO entityToDTO(Eleve eleve) {
	        if (eleve == null) {
	            return null;
	        }

	        return EleveDTO.builder()
	                         .eleveId(Integer.parseInt(eleve.getId())) // Assuming the id is stored as String and needs to be converted to int
	                         .age(eleve.getAge())
	                         .email(eleve.getEmail())
	                         .name(eleve.getName())
	                         .build();
	    }

	    // Converts Eleve entity to EleveDTO, with additional processing from another EleveDTO
	    public static EleveDTO entityToDTO(Eleve eleve, EleveDTO eleveDTO) {
	        if (eleve == null) {
	            return null;
	        }

	        return EleveDTO.builder()
	                         .eleveId(Integer.parseInt(eleve.getId())) // Assuming the id is stored as String and needs to be converted to int
	                         .name(eleve.getName())
	                         .email(eleve.getEmail())
	                         .age(eleve.getAge())
	                         .build();
	    }

	    // Converts EleveDTO to Eleve entity
	    public static Eleve dtoToEntity(EleveDTO dto) {
	        if (dto == null) {
	            return null;
	        }

	        return new Eleve(
	                         String.valueOf(dto.getEleveId()), // Assuming the id needs to be converted to String
	                         dto.getName(),
	                         dto.getEmail(),
	                         dto.getAge()
	        );
	    }
	}
