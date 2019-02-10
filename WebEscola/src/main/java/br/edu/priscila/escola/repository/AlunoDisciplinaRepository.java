package br.edu.priscila.escola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.edu.priscila.escola.entidade.Aluno;
import br.edu.priscila.escola.entidade.AlunoDisciplina;

public interface AlunoDisciplinaRepository extends CrudRepository<AlunoDisciplina, Long> {

	@Query("SELECT ad FROM AlunoDisciplina ad")
	public List<Aluno> consultarTodos();
	
}
