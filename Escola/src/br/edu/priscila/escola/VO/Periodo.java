package br.edu.priscila.escola.VO;

public enum Periodo {

    SELECIONAR(0, "SELECIONAR"),
    MATUTINO(1, "MATUTINO"),
    VESPERTINO(2, "VESPERTINO"),
    NOTURNO(3, "NOTURNO"),
    INTEGRAL(4, "INTEGRAL");

    private int id;
    private String descricao;
        
    private Periodo(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    
    public static String getById(int id) {
        return Periodo.values()[id].getDescricao();
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
    
    
}
