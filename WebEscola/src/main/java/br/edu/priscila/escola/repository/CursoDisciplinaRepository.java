package br.edu.priscila.escola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.priscila.escola.entidade.CursoDisciplina;

public interface CursoDisciplinaRepository extends CrudRepository<CursoDisciplina, Long> {

	@Query("SELECT cd FROM CursoDisciplina cd")
	public List<CursoDisciplina> consultarTodos();
	
}
