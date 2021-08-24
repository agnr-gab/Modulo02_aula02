package br.com.zup;

public class Aula2_Exemplo3 {
    public static void main(String[] args) {
        float quantidadeHorasTrabalhadas = 450;
        float salarioHora = 6.91F;

        //Calcular o salário bruto
        float salarioBruto = quantidadeHorasTrabalhadas * salarioHora;

        System.out.println("Você trabalhou " + quantidadeHorasTrabalhadas + " horas essa semana. Seu salário por hora é R$ " + salarioHora);
        System.out.println("Seu salário bruto será R$ " + salarioBruto );
    }

}
