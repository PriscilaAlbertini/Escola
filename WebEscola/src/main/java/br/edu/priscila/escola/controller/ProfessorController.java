package br.edu.priscila.escola.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.priscila.escola.entidade.Professor;
import br.edu.priscila.escola.service.ProfessorService;

@RestController
public class ProfessorController {
	@Autowired
	ProfessorService service;

	@RequestMapping(value = "/consultartodosprofessores", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String consultarTodos() {
		return service.consultarTodos();
	}
	
	@RequestMapping(value = "/salvarprofessor", method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String salvar(@RequestBody Professor professor) {
		
		return service.salvar(professor);
	}
	
	@RequestMapping(value = "/consultarprofessorid", method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String getById(@RequestBody Long id) {
		
		return service.getById(id);
	}
}
