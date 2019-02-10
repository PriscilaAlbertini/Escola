package br.edu.priscila.escola.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "titulo")
public class Titulo {

	@Id
	@GeneratedValue	
	private Long id;
	private String descricao;
	
}
