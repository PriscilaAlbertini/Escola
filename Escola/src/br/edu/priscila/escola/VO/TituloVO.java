package br.edu.priscila.escola.VO;

public class TituloVO {
    private int id;
    private String descricao;

    public TituloVO(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
