package com.lista_de_filmes.app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        String nome;
        double idade;
        String usuario;

        Scanner sc = new Scanner (System.in);


        System.out.println("Qual o seu nome?");
        nome = sc.nextLine();

        System.out.println(nome + ", agora me fale sua idade.");
        idade = sc.nextDouble();
        sc.nextLine();
        System.out.println(nome + ", estamos quase lá, agora me diga seu nome de usuário.");

        usuario = sc.nextLine();

        System.out.println("\n" + usuario + " seu login foi validado! Aproveite a lista abaixo: \n");
        System.out.println("Sala 01 - A Roda Quadrada. - Livre"); 
        System.out.println("Sala 02 - A volta dos que não foram. - 12 anos");
        System.out.println("Sala 03 - Poeira em alto mar. - 14 anos");
        System.out.println("Sala 04 - As tranças do Rei Careca. - 16 anos");
        System.out.println("Sala 05 - A vingança do Peixe Frito. - 18 anos\n");

        //O usuário deverá escolher o filme desejado. Se tiver a idade minima para ver o filme, o programa imprime o ingreço e encerra. Se não tiver a idade minima o programa aparece com mensagem de idade impropria e reexibe a lista de filmes.
                 


    }

}
