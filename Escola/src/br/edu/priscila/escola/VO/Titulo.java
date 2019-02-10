package br.edu.priscila.escola.VO;

public enum Titulo {
    
    SELECIONAR(0, "SELECIONAR"),
    DOUTOR(1, "DOUTOR"),
    MESTRE(2, "MESTRE"),
    ESPECIALISTA(3, "ESPECIALISTA"),
    GRADUADO(4, "GRADUADO");

    private final int id;
    private final String descricao;
        
    private Titulo(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public static String getById(int id) {
        return Titulo.values()[id].getDescricao();
    }
    
    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
