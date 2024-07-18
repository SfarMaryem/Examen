package com.example.demo.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;




@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EleveDTO {
	 
	@Id
	    
	int eleveId;
    String name;
	String email;
	Long age;
	public int getEleveId() {
		return eleveId;
	}
	public void setEleveId(int eleveId) {
		this.eleveId = eleveId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}

	// Eleve builder
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
    	private int eleveId;
        private String name;
    	private String email;
    	private Long age;

    
    public Builder eleveId(int eleveId) {
        this.eleveId = eleveId;
        return this;
    }
        
        public Builder name(String name) {
            this.name = name;
            return this;
        }
     
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        
        public Builder age(Long age) {
            this.age = age;
            return this;
        }
        
        public EleveDTO build() {
        	EleveDTO eleveDTO = new EleveDTO();
        	eleveDTO.setEleveId(this.eleveId);
        	eleveDTO.setName(this.name);
        	eleveDTO.setEmail(this.email); 
        	eleveDTO.setAge(this.age);
            return eleveDTO;
        }
    }}
	



