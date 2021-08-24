package br.com.zup;

public class Aula2_Lista01_Exercicio4 {
    public static void main(String[] args) {
       // 4 - Faça um Programa que recebe o quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

        float quantidadeHorasTrabalhadas = 450;
        float salarioHora = 6.91F;

        //Calcular o salário bruto
        float salarioBruto = quantidadeHorasTrabalhadas * salarioHora;

        System.out.println("Você trabalhou " + quantidadeHorasTrabalhadas + "  Seu salário por hora é R$ " + salarioHora);
        System.out.println("Seu salário bruto será R$ " + salarioBruto + " reais");

    }

}
