package br.edu.priscila.escola.VO;

import java.util.List;

public class CursoVO extends FormacaoVO{

    private String duracao;
    private String quantidadealunos;
    private PeriodoVO periodo;
    private String vDisciplina;

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getQtdAlunos() {
        return quantidadealunos;
    }

    public void setQtdAlunos(String qtdAlunos) {
        this.quantidadealunos = qtdAlunos;
    }

    public PeriodoVO getPeriodo() {
        return periodo;
    }

    public void setPeriodo(PeriodoVO periodo) {
        this.periodo = periodo;
    }

    public String getvDisciplina() {
        return vDisciplina;
    }

    public void setvDisciplina(String vDisciplina) {
        this.vDisciplina = vDisciplina;
    }

    
}
