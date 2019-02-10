package br.edu.priscila.escola.VO;

public class PeriodoVO {

    private int id;
    private String descricao;
        
    public PeriodoVO(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
    
    
}
