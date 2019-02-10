package br.edu.priscila.escola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.priscila.escola.entidade.DiaSemana;

public interface DiaSemanaRepository extends CrudRepository<DiaSemana, Long> {

	@Query("SELECT d FROM DiaSemana d")
	public List<DiaSemana> consultarTodos();
	
}
