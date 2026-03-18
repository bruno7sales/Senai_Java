package com.atividade01.app;
import  java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String nome;
        double idade;
        double peso;
        double altura;
        double imc;

        Scanner sc = new Scanner (System.in);

        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();
        System.out.println("Informe sua idade: ");
        idade = sc.nextDouble();
        System.out.println("Informe seu peso: ");
        peso = sc.nextDouble();
        System.out.println("Informe sua altura: ");
        altura = sc.nextDouble();

        
        imc = peso/(altura * altura);

        System.out.println("Seu IMC é de: " + imc);

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
        
        sc.close();
        // Crie um programa que receba do usuario: nome, peso e altura
        // Exiba na tela o valor do seu IMC e seu diagnostico
    }
}
