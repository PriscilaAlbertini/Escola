package br.edu.priscila.escola.Modelos;

import br.edu.priscila.escola.VO.DisciplinaVO;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class DisciplinaCursoModelo extends AbstractTableModel{

    private Object[][] tabela;
    private String[] colunas = {"Código", "Descrição"};
    Class[] types = new Class[]{
        java.lang.String.class, java.lang.String.class
    };
    private List lista;
    private DisciplinaVO objeto;

    public DisciplinaCursoModelo(List<DisciplinaVO> lista) {
        this.lista = lista;
        filtrar();
    }
    
    private void filtrar() {
        tabela = new Object[lista.size()][colunas.length];
        int i = 0;
        while (i < lista.size()) {
            objeto = (DisciplinaVO) lista.get(i);
            tabela[i][0] = objeto.getId();
            tabela[i][1] = objeto.getDescricao();
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
