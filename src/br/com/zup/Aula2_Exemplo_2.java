package br.com.zup;

public class Aula2_Exemplo_2 {
    public static void main(String[] args) {
        //Armazenar os valores em memória
        int numero1 = 1;
        int numero2 = 1;

        //Criando a operação de soma
        int resultadoDaSoma = numero1 + numero2;
        int resultadoDaSubtração = numero1 - numero2;
        int resultadoDaMultiplicacao = numero1 * numero2;
        int resultadoDaDivisao = numero1 / numero2;


        //Exibindo o resultado da soma
        System.out.println("O resultado da soma é " + resultadoDaSoma);

        //Exibindo o resultado da subtração
        System.out.println("O resultado da subtração é " + resultadoDaSubtração);

        //Exibindo o resultado da multiplicação
        System.out.println("O resultado da multiplicação é " + resultadoDaMultiplicacao);

        //Exibindo o resultado da divisão
        System.out.println("O resultado da divisão é " + resultadoDaDivisao);

    }
}