package com.example.demo.dto;

import org.springframework.data.annotation.Id;
import lombok.*;

import java.time.LocalDate;

@ToString
@Builder
public class BilletDTO {
    @Id
    private String billetId;
    private String eleveId;
    private Double note;
	public BilletDTO() {
		
	}
	public BilletDTO(String billetId, String eleveId, Double note) {
		super();
		this.billetId = billetId;
		this.eleveId = eleveId;
		this.note = note;
	}
	public String getBilletId() {
		return billetId;
	}
	public void setBilletId(String billetId) {
		this.billetId = billetId;
	}
	public String getEleveId() {
		return eleveId;
	}
	public void setEleveId(String eleveId) {
		this.eleveId = eleveId;
	}
	public Double getNote() {
		return note;
	}
	public void setNote(Double note) {
		this.note = note;
	}

}
