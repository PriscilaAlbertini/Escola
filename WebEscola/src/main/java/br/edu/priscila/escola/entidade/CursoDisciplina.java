package br.edu.priscila.escola.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "cursodisciplina")
public class CursoDisciplina {
	@Id
	@GeneratedValue	(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "id_curso", referencedColumnName = "id")
	private Curso curso;
	@ManyToOne
	@JoinColumn(name = "id_disciplina", referencedColumnName = "id")
	private Disciplina disciplina;
	@ManyToOne
	@JoinColumn(name = "id_diasemana", referencedColumnName = "id")
	private DiaSemana diasemana;
	@ManyToOne
	@JoinColumn(name = "id_periodo", referencedColumnName = "id")
	private Periodo periodo;
}
