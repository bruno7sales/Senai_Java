package com.calculadora.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        double result;
        String operator;
        

        //Entrada de Dados
        System.out.println("Informe o 1° numero: ");
        num1 = sc.nextDouble();
        System.out.println("Informe o 2° numero: ");
        num2 = sc.nextDouble();

        //Limpeza de buffer
        sc.nextLine();

        //Menu
        System.out.println("Informe a opção desejada: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        operator = sc.nextLine();

        //Verificar a opção desejada
        switch (operator) {

            case "1":
                result = num1 + num2;
                System.out.println("O valor da soma é: " + result);
                break;

                case "2":
                result = num1 - num2;

                System.out.println("O valor da subtração é: " + result);
                break;

                case "3":
                result = num1 * num2;
                System.out.println("O valor da multiplicação é: " + result);
                break;

                case "4":
                result = num1/num2;
                System.out.println("O valor da divisão é: " + result);
                break;
        
            default:
                System.out.println("Operação inválida.");
            
        }


        sc.close();
    }
}
