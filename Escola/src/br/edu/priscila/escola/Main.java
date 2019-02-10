package br.edu.priscila.escola;

import br.edu.priscila.escola.Banco.Banco;
import javax.swing.UIManager;

public class Main {

    public static void main(String args[]) {
        new Banco();
        
        try {

            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        
        Menu menu = new Menu();
        menu.setVisible(true);
        
    }
    
    
    
}
