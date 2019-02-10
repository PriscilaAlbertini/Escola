package br.edu.priscila.escola;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class EscolaApplication {

	@RequestMapping("/")
	@ResponseBody
	public String conectado() {
		return "Priscila está conectada!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(EscolaApplication.class, args);
	}
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/escola");
		dataSource.setUsername("postgres");
		dataSource.setPassword("root");
		
		return dataSource;
	}

}

