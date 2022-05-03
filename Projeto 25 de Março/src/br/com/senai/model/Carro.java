package br.com.senai.model;

public class Carro

{
    //atributos
    public int id;
    public String modelo;
    public String placa;
    public String cor;
    public int ano;

    public void Imprimir()
    {
        System.out.println("Id " + id);
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }





}