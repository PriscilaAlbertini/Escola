package br.edu.priscila.escola.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import br.edu.priscila.escola.entidade.Curso;
import br.edu.priscila.escola.entidade.Disciplina;
import br.edu.priscila.escola.repository.DisciplinaRepository;

@Service
public class DisciplinaService {

	@Autowired
	DisciplinaRepository repository;
	
	public String consultarTodos() {
		String jsonString = "";
		List<Disciplina> vConsulta = (List<Disciplina>) repository.consultarTodos();
		
		Gson gson = new Gson();
		
		jsonString = gson.toJson(vConsulta);
		
		return jsonString;
	}
	
	public String salvar(Disciplina disciplina) {
		repository.save(disciplina);
		
		
		return "Salvou!";
	}
	

	public String consultarPorCurso(Long id) {
		String jsonString = "";
		List<Disciplina> vConsulta = (List<Disciplina>) repository.consultarPorCurso(id);
		
		Gson gson = new Gson();
		
		jsonString = gson.toJson(vConsulta);
		
		return jsonString;
	}	
}
