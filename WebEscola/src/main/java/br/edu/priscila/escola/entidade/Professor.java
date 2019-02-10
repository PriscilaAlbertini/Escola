package br.edu.priscila.escola.entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "professor")
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Long rg;
	private Long cpf;
	@ManyToOne
	@JoinColumn(name = "id_titulo", referencedColumnName = "id")
	private Titulo titulo;
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<Disciplina> vDisciplina;
	
}
