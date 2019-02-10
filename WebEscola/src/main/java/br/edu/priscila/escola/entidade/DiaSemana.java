package br.edu.priscila.escola.entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "diasemana")
public class DiaSemana {

	@Id
	@GeneratedValue
	private Long id;
	private String descricao;
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<Disciplina> vDisciplina;
}
