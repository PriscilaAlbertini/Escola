package br.edu.priscila.escola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.priscila.escola.entidade.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long> {

	@Query("SELECT c FROM Curso c")
	public List<Curso> consultarTodos();
	
}
