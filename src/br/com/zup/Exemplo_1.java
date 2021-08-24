package br.com.zup;

public class Exemplo_1 {
    public static void main(String[] args) {
        System.out.println("Aula 02 - Introdução ao JAVA");
        int idade_do_usuario = 28;
        String nomeDoUsuario = "Arê";

        //Printando as variaveis declaradas
        System.out.print("Olá, meu nome é ");
        System.out.print(nomeDoUsuario);
        System.out.print(" e minha idade é ");
        System.out.print(idade_do_usuario);
        System.out.println(" anos");

        //Printando de forma concatenada as variaveis declaradas
        System.out.println("Olá, meu nome é " + nomeDoUsuario + " e minha idade é " + idade_do_usuario + " anos");
    }
}

