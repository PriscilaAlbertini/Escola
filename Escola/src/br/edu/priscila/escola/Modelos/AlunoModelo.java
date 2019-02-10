package br.edu.priscila.escola.Modelos;

import br.edu.priscila.escola.VO.AlunoVO;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class AlunoModelo extends AbstractTableModel{

    private Object[][] tabela;
    private String[] colunas = {"Código", "Matrícula", "Nome", "RG", "CPF"};
    Class[] types = new Class[]{
        java.lang.String.class, java.lang.String.class,
        java.lang.String.class, java.lang.String.class,
        java.lang.String.class
    };
    private List lista;
    private AlunoVO objeto;

    public AlunoModelo(List<AlunoVO> lista) {
        this.lista = lista;
        filtrar();
    }
    
    private void filtrar() {
        tabela = new Object[lista.size()][colunas.length];
        int i = 0;
        while (i < lista.size()) {
            objeto = (AlunoVO) lista.get(i);
            tabela[i][0] = objeto.getId();
            tabela[i][1] = objeto.getMatricula();
            tabela[i][2] = objeto.getNome();
            tabela[i][3] = objeto.getRg();
            tabela[i][4] = objeto.getCpf();
            i++;
        }
    }
    
    @Override
    public int getRowCount() {
        return tabela.length;
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return tabela[rowIndex][columnIndex];
    }
    
    @Override
    public String getColumnName(int col) {
        return colunas[col];
    }

    @Override
    public Class getColumnClass(int c) {
        return types[c];
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }
    
}
