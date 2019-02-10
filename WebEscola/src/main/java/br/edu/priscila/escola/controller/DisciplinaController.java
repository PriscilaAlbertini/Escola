package br.edu.priscila.escola.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.priscila.escola.entidade.Disciplina;
import br.edu.priscila.escola.service.DisciplinaService;

@RestController
public class DisciplinaController {
	@Autowired
	DisciplinaService service;

	@RequestMapping(value = "/consultartodasdisciplinas", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String consultarTodos() {
		return service.consultarTodos();
	}
	
	@RequestMapping(value = "/salvardisciplina", method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String salvar(@RequestBody Disciplina disciplina) {
		
		return service.salvar(disciplina);
	}
	
	@RequestMapping(value = "/consultardisciplinacurso", method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String consultarPorCurso(@RequestParam Long id) {
		
		return service.consultarPorCurso(id);
	}
}
