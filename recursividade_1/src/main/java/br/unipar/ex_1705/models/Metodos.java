package br.unipar.ex_1705.models;

public class Metodos {

    public void soma(int numero,int contagem){
        if(contagem>50){
            System.out.println("Cabo");
        }else{
            System.out.println(numero);
            try{
            Thread.sleep(200);
            }catch(InterruptedException ex){            
             }
            contagem = contagem + 1;
            soma(numero+contagem,contagem);
        }
        
        }
    }
