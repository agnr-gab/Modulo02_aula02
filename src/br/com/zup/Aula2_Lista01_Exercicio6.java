package br.com.zup;

public class Aula2_Lista01_Exercicio6 {
    public static void main(String[] args) {
        //6 - Faça um Programa que receba o quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê respectivamente:
        //a. Salário bruto.
        //b. Quanto pagou ao INSS.
        //c. Quanto pagou ao sindicato.
        //d. Qual o salário líquido do funcionário.

        float quantidadeHorasTrabalhadas = 450;
        float salarioHora = 6.91F;

        //Calcular o salário bruto
        float salarioBruto = quantidadeHorasTrabalhadas * salarioHora;

        System.out.println("Você trabalhou " + quantidadeHorasTrabalhadas + "  Seu salário por hora é R$ " + salarioHora);
        System.out.println("Seu salário bruto será R$ " + salarioBruto + " reais");


    }
}
