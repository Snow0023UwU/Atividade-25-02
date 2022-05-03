package br.com.senai.model;

public class Pessoa {

    public static void main (String[]args){

    }
    public String nome;
    public int idade;

    public String getNome(){

        return nome;
    }

    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade; }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }
}
