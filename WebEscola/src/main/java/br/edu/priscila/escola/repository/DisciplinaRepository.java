package br.edu.priscila.escola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.priscila.escola.entidade.DiaSemana;
import br.edu.priscila.escola.entidade.Disciplina;

public interface DisciplinaRepository extends CrudRepository<Disciplina, Long> {

	@Query("SELECT d FROM Disciplina d")
	public List<Disciplina> consultarTodos();
	
	@Query("SELECT d FROM Disciplina d INNER JOIN d.vCurso c WHERE c.id = ?1")
	public List<Disciplina> consultarPorCurso(Long id);
	
}
