package br.edu.priscila.escola.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import br.edu.priscila.escola.entidade.Aluno;
import br.edu.priscila.escola.entidade.Professor;
import br.edu.priscila.escola.repository.ProfessorRepository;

@Service
public class ProfessorService {

	@Autowired
	ProfessorRepository repository;

	public String consultarTodos() {
		String jsonString = "";
		List<Professor> vConsulta = (List<Professor>) repository.consultarTodos();

		Gson gson = new Gson();

		jsonString = gson.toJson(vConsulta);

		return jsonString;
	}

	public String salvar(Professor professor) {
		repository.save(professor);

		return "Salvou!";
	}

	public String getById(Long id) {
		String jsonString = "";
		Professor professor = repository.getById(id);
		Gson gson = new Gson();

		jsonString = gson.toJson(professor);

		return jsonString;
	}
}
