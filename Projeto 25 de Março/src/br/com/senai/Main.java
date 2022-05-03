package br.com.senai;

import br.com.senai.model.Carro;

public class Main {

    public static void main(String [] args){
        //Criar carro
        Carro l = new Carro();
        //Atribuição dos valores nos atributos
        l.id = 101010;
        l.modelo = "jeep";
        l.placa = "LU2030";
        l.cor = "Prata";
        l.ano = 2022;

        System.out.println("Id: " + l.id
                +"\nModelo: " + l.modelo
                +"\nPlaca: " + l.placa
                +"\nCor: " + l.cor
                +"\nAno: "+ l.ano + "\n\n");





        Carro p = new Carro();
        p.id = 205060;
        p.modelo = "Camaro";
        p.placa = "PA5030";
        p.cor = "Amarelo";
        p.ano = 2010;

//        System.out.println("Id: " + p.id
  //              +"\nModelo: " + p.modelo
    //            +"\nPlaca: " + p.placa
      //          +"\nCor: " + p.cor
        //        +"\nAno: "+ p.ano);
        p.Imprimir();
    }



}
