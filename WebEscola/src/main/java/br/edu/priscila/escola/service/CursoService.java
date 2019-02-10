package br.edu.priscila.escola.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import br.edu.priscila.escola.entidade.Curso;
import br.edu.priscila.escola.entidade.Disciplina;
import br.edu.priscila.escola.repository.CursoRepository;
import br.edu.priscila.escola.vo.CursoVO;

@Service
public class CursoService {

	@Autowired
	CursoRepository repository;

	public String consultarTodos() {
		String jsonString = "";
		List<Curso> vConsulta = (List<Curso>) repository.consultarTodos();

		Gson gson = new Gson();

		jsonString = gson.toJson(vConsulta);

		return jsonString;
	}

	public String salvar(CursoVO cursovo) {
		Curso curso = new Curso();
		curso.setCargahoraria(cursovo.getCargahoraria());
		curso.setDescricao(cursovo.getDescricao());
		curso.setDuracao(cursovo.getDuracao());
		curso.setPeriodo(cursovo.getPeriodo());
		curso.setQuantidadealunos(cursovo.getQuantidadealunos());
		curso.setVDisciplina(new Gson().fromJson(cursovo.getVDisciplina(),
                new TypeToken<List<Disciplina>>() {}.getType()));
		
		
		
		repository.save(curso);

		return "Salvou!";
	}

}
