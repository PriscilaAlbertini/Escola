package br.edu.priscila.escola.Classe;

import javax.swing.JOptionPane;

public class PriException extends Exception {

    public PriException(String message) {
        
        JOptionPane.showMessageDialog(null, message, "Alerta", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    
    
}
