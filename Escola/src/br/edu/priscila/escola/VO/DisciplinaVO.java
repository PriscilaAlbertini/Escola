package br.edu.priscila.escola.VO;

public class DisciplinaVO extends FormacaoVO {

    private String ementa;
    private String limite;
    private ProfessorVO professor;
    private DiaSemanaVO diasemana;

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getLimite() {
        return limite;
    }

    public void setLimite(String limiteVagas) {
        this.limite = limiteVagas;
    }

    public ProfessorVO getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorVO professor) {
        this.professor = professor;
    }

    public DiaSemanaVO getDiaSemana() {
        return diasemana;
    }

    public void setDiaSemana(DiaSemanaVO diaSemana) {
        this.diasemana = diaSemana;
    }

}
