package tn.enicarthage;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FacturationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacturationServiceApplication.class, args);
	}

	
	@Bean
	CommandLineRunner start(BillRepository facturationRepository) {
	return args->{
		facturationRepository.save(new Bill(Long.valueOf(17845),Long.valueOf(120),"Foulen","23/12/2022","Produit"));
		facturationRepository.save(new Bill(Long.valueOf(11475),Long.valueOf(500),"Foulen","23/12/2022","Réparation"));
		facturationRepository.save(new Bill(Long.valueOf(20145),Long.valueOf(1400),"Foulen","23/12/2022","Achat Pc"));
	};
	}
}
