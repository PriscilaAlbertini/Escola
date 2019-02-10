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
@Table(name = "alunodisciplina")
public class AlunoDisciplina {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "id_aluno", referencedColumnName = "id")
	private Aluno aluno;
	@ManyToOne
	@JoinColumn(name = "id_disciplina", referencedColumnName = "id")
	private Disciplina disciplina;
	@ManyToOne
	@JoinColumn(name = "id_diasemana", referencedColumnName = "id")
	private DiaSemana diasemana;
}
