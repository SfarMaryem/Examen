package com.example.demo.dto;


	import lombok.*;
	import org.springframework.data.annotation.Id;

	@ToString
	@AllArgsConstructor
	@NoArgsConstructor
	@Data
	public class BilletDTO {
		@Id
	     String billetId;
		
	     String eleveId;
	     Double note;
	     
	     
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
	     
		 // Custom builder
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
	        
	        
	        public BilletDTO build() {
	        	BilletDTO billetDTO = new BilletDTO();
	        	billetDTO.setBilletId(this.billetId);
	        	billetDTO.setEleveId(this.eleveId);
	        	billetDTO.setNote(this.note); 
	            return billetDTO;
	        }
	}
}
