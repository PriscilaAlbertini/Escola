package br.edu.priscila.escola.entidade;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "curso")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private Integer duracao;
	private Integer quantidadealunos;
	private Integer cargahoraria;
	@ManyToOne
	@JoinColumn(name = "id_periodo", referencedColumnName = "id")
	private Periodo periodo;
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<CursoDisciplina> vCursoDisciplina;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "cursodisciplina", 
	joinColumns = @JoinColumn(name = "id_curso", referencedColumnName="id"), 
	inverseJoinColumns = @JoinColumn(name = "id_disciplina", referencedColumnName="id"))
	private List<Disciplina> vDisciplina;

}
