package br.edu.priscila.escola.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.priscila.escola.service.CursoService;
import br.edu.priscila.escola.vo.CursoVO;

@RestController
public class CursoController {
	@Autowired
	CursoService service;

	@RequestMapping(value = "/consultartodoscursos", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String consultarTodos() {
		return service.consultarTodos();
	}
	
	@RequestMapping(value = "/salvarcurso", method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String salvar(@RequestBody CursoVO curso) {
		
		return service.salvar(curso);
	}
	
	
}
