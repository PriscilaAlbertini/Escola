package br.edu.priscila.escola.entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "disciplina")
public class Disciplina {

	@Id
	@GeneratedValue	(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private String ementa;
	private Integer limite;
	private Integer cargahoraria;
	@ManyToOne
	@JoinColumn(name = "id_professor", referencedColumnName = "id")
	private Professor professor;
	@ManyToOne
	@JoinColumn(name = "id_diasemana", referencedColumnName = "id")
	private DiaSemana diaSemana;
//	@OneToMany(cascade = CascadeType.ALL)	
//	private List<CursoDisciplina> vCurso;
//	@ManyToMany(cascade = CascadeType.ALL)
//	    @JoinTable(name = "cursodisciplina",
//	        joinColumns = @JoinColumn(name = "id_disciplina"),
//	        inverseJoinColumns = @JoinColumn(name = "id_curso")
//	    )	
	@ManyToMany(mappedBy = "vDisciplina", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	    private List<Curso> vCurso;	
	
}
