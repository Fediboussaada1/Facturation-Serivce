package tn.enicarthage;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Bill {

	@Id
	private long reference;
	private long sum;
	private String supplierName;
	private String date;
	private String type;
	
}
