package br.com.zup;

public class Aula2_Lista01_Exercicio5 {
    public static void main(String[] args) {
        // 5 - Faça um programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.

       float temperaturaFa = 96.8F;
       float conversaoFToC = (temperaturaFa - 32) * 5/9;
        System.out.println("A temperatura em Fahrenheit " + temperaturaFa + " em Celsius é: " + conversaoFToC);

    }
}
