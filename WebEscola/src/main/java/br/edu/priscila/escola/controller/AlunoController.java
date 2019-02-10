package br.edu.priscila.escola.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.priscila.escola.entidade.Aluno;
import br.edu.priscila.escola.service.AlunoService;

@RestController
public class AlunoController {
	
	@Autowired
	AlunoService service;

	@RequestMapping(value = "/consultartodosalunos", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String consultarTodos() {
		return service.consultarTodos();
	}
	
	@RequestMapping(value = "/salvaraluno", method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String salvar(@RequestBody Aluno aluno) {
		
		return service.salvar(aluno);
	}
		
}
