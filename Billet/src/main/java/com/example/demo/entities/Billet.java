package com.example.demo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "billet")
public class Billet {
    @Id
    private String billetId;
    private String eleveId;
    private Double note;

public Billet() {
	super();
}

public Billet(String billetId, String eleveId, Double note) {
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


public static Builder builder() {
    return new Builder();
}

public static class Builder {
    private String billetId;
    private String eleveId;
    private Double note;

    public Builder billetId(String billetId) {
        this.billetId = billetId;
        return this;
    }

    public Builder eleveId(String eleveId) {
        this.eleveId = eleveId;
        return this;
    }

    public Builder note(Double note) {
        this.note = note;
        return this;
    }



    public Billet build() {
        return new Billet(billetId, eleveId, note);
    }
}
}