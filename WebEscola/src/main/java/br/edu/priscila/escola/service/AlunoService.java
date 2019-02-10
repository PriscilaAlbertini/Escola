package br.edu.priscila.escola.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import br.edu.priscila.escola.entidade.Aluno;
import br.edu.priscila.escola.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository repository;
	
	public String consultarTodos() {
		String jsonString = "";
		List<Aluno> vAluno = (List<Aluno>) repository.consultarTodos();
		
		Gson gson = new Gson();
		
		jsonString = gson.toJson(vAluno);
		
		return jsonString;
	}

	public String salvar(Aluno aluno) {
		repository.save(aluno);
		
		
		return "Salvou!";
	}
		
}
