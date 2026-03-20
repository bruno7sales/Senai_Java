package com.catraca.app;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String nome;
        double peso;
        double altura;
        int opcao = 0;
        double imc;


        //Laço de Repetição
        do{
            System.out.println("Deseja registrar nova entrada? ");
            System.out.println("1 - Registrar entrada.");
            System.out.println("2 - Sair do progama.");
            opcao = sc.nextInt();

            if (opcao == 1) {

                sc.nextLine();

                System.out.println("Qual o nome do cliente? ");
                nome = sc.nextLine();

                System.out.println("Qual o peso do paciente? ");
                peso = sc.nextDouble();
                
                System.out.println("Qual a altura do paciente?");
                altura = sc.nextDouble();

                
                imc = peso / (altura * altura);

                
                System.out.println("Sabemos que o IMC do paciente é de:" + imc);

                System.out.println("Deseja consultar parametros para essa taxa? ");
                System.out.println("Digite '1' para sim e '2' para não.");

                
                if (opcao == 1) {

                    if (imc < 18.5) {
                        System.out.println(" Você está abaixo do peso!");
                    } 
                    else if (imc < 25 ) {
                        System.out.println("Você está com o IMC ideal! ");
                        
                    }
                    else if (imc < 30) {
                        System.out.println("Você está com sobre-peso ou obesidade nivel 1.");
                        
                    }
                    else if (imc < 40) {
                        System.out.println("Você esta com sobre-peso nivel 2.");
                        
                    }
                    else if (imc > 40) {
                        System.out.println("Procure um padre ou pastor, porque só Jesus na causa.");
                        
                    }
                }
            }
                
        } while(opcao !=2);

        System.out.println("Até Depois!!");

        sc.close();
    }
    
}
