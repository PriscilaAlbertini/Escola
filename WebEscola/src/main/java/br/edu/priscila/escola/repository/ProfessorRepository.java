package br.edu.priscila.escola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.priscila.escola.entidade.Professor;

public interface ProfessorRepository extends CrudRepository<Professor, Long	> {

	@Query("SELECT p FROM Professor p")
	public List<Professor> consultarTodos();
	
	@Query("SELECT p FROM Professor p WHERE p.id = ?1")
	public Professor getById(Long id);
	
}
