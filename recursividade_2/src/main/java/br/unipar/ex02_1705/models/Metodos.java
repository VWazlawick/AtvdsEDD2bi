package br.unipar.ex02_1705.models;

import javax.swing.JOptionPane;

public class Metodos {
    
    public int fatorial(int vlrFatorial){
        int total = vlrFatorial;
        if(vlrFatorial<=1){
            return 1;
        }else{
            total = fatorial(vlrFatorial-1)*vlrFatorial;
            return total;
        }
            
        
    }
}
