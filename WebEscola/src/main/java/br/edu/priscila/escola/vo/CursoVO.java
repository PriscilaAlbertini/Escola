package br.edu.priscila.escola.vo;

import br.edu.priscila.escola.entidade.Periodo;
import lombok.Data;

@Data
public class CursoVO {
	private Long id;
	private String descricao;
	private Integer duracao;
	private Integer quantidadealunos;
	private Integer cargahoraria;
	private Periodo periodo;
	private String vDisciplina;
}
