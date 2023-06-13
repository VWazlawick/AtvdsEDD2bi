package br.unipar.ex03_1705;

import br.unipar.ex03_1705.models.Fibonacci;
import javax.swing.JOptionPane;

public class Ex03_1705 {

    public static void main(String[] args) {
        int fibonacci;
        
        String input = JOptionPane.showInputDialog("Informe até qual digito deseja ver?");
        fibonacci = Integer.parseInt(input);
        
        Fibonacci f1 = new Fibonacci();
        System.out.println(f1.fibonacci(fibonacci));
    }
}
