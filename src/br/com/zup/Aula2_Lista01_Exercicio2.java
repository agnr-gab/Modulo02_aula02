package br.com.zup;

public class Aula2_Lista01_Exercicio2 {
    public static void main(String[] args) {
        // 2 - Faça um programa que receba 4 notas bimestrais e mostre a média aritmética.
        float nota1 = 10F;
        float nota2 = 8.8F;
        float nota3 = 7.6F;
        float nota4 = 5.5F;

        float notasBimestres = nota1 + nota2 + nota3 + nota4;
        float mediaBimestral = notasBimestres / 4;

        System.out.println("Sua média é" + notasBimestres);
    }

}
