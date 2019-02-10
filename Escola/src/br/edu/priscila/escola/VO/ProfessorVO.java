package br.edu.priscila.escola.VO;

public class ProfessorVO extends PessoaVO{
    private TituloVO titulo;
    
    public TituloVO getTitulo() {
        return titulo;
    }

    public void setTitulo(TituloVO titulo) {
        this.titulo = titulo;
    }

}
