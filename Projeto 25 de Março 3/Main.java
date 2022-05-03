package br.senai;

import br.senai.model.Pessoas;

public class Main {

    public static void main(String[] agrs) {

    Pessoas carlos = new Pessoas();
    carlos.setNome("Carlos Silva");
    carlos.setSalario(6300);

    Pessoas ana = new Pessoas();
    ana.setNome("Ana Marques");
    ana.setSalario(6700);

    Pessoas media = new Pessoas();
    ana.setMedia(6500);

    System.out.println("Dados do primeiro funcionário:");
    System.out.println("Nome: " + carlos.getNome());
    System.out.println("Salário: " + carlos.getSalario());
    System.out.println("Dados do segundo funcionário:");
    System.out.println("Nome: " + ana.getNome());
    System.out.println("Salário: " + ana.getSalario());
    System.out.println("Salário médio: " + media.getMedia());

    }
}
