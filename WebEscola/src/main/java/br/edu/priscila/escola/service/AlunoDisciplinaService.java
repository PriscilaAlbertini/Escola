package br.edu.priscila.escola.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.priscila.escola.repository.AlunoDisciplinaRepository;

@Service
public class AlunoDisciplinaService {
	
	@Autowired
	AlunoDisciplinaRepository repository;

}
