package br.edu.priscila.escola.VO;

public class FormacaoVO {
    private String id;
    private String descricao;
    private String cargahoraria;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getCargaHoraria() {
        return cargahoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargahoraria = cargaHoraria;
    }
}
