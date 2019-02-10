package br.edu.priscila.escola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.priscila.escola.entidade.Aluno;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Long> {
	
	@Query("SELECT a FROM Aluno a")
	public List<Aluno> consultarTodos();

}
