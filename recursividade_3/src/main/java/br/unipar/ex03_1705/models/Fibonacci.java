package br.unipar.ex03_1705.models;

import java.util.ArrayList;

public class Fibonacci {
    
    public int fibonacci(int vlr){
        if(vlr==0 || vlr==1){
            return vlr;
        }else{
            return fibonacci(vlr-1) + fibonacci(vlr-2);
        }
    }
}
