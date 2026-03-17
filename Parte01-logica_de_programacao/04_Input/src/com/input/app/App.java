package com.input.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Declaração de variáveis
        String nome;
        String email;
        int idade;
        double altura;
        
        // Crie objeto que recebe os dados do usuário
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Informe o seu Nome: ");
        nome = sc.nextLine();
        System.out.println("Informe a sua Idade: ");
        idade = sc.nextInt();
        System.out.println("Informe a sua Altura em metros: ");
        altura = sc.nextDouble();

        // Limpeza de buffer
        sc.nextLine();

        System.out.println("Informe o seu E-mail: ");
        email = sc.nextLine();

        // Saída de dados
        System.out.println("Nome:" + nome);
        System.out.println("Idade:" + idade);
        System.out.println("Altura:" + altura + "metros.");
        System.out.println("E-mail:" + email);

        // Fecha objeto
        sc.close();

    }
}
