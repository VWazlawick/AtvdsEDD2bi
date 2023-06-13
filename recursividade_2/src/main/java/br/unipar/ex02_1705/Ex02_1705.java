package br.unipar.ex02_1705;

import br.unipar.ex02_1705.models.Metodos;
import javax.swing.JOptionPane;

public class Ex02_1705 {

    public static void main(String[] args) {
     int fatorial;
     
     String input = JOptionPane.showInputDialog("Informe o número para ser feito o fatorial:");
     fatorial = Integer.parseInt(input);
     
        Metodos m1 = new Metodos();
        
        JOptionPane.showMessageDialog(null, m1.fatorial(fatorial));
     
     
    }
}
