package br.edu.priscila.escola.VO;

public enum DiaSemana {
    
    SELECIONAR(0, "SELECIONAR"),
    SEGUNDA_FEIRA(1, "SEGUNDA-FEIRA"),
    TERCA_FEIRA(2, "TERÇA-FEIRA"),
    QUARTA_FEIRA(3, "QUARTA-FEIRA"),
    QUINTA_FEIRA(4, "QUINTA-FEIRA"),
    SEXTA_FEIRA(5, "SEXTA-FEIRA"),
    SABADO_FEIRA(6, "SÁBADO");

    private int id;
    private String descricao;
        
    private DiaSemana(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    
    public static String getById(int id) {
        return DiaSemana.values()[id].getDescricao();
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
