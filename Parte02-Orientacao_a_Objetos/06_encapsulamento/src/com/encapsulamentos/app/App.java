package com.encapsulamentos.app;
import java.util.Scanner;
import com.encapsulamentos.models.PessoaFisica; 
import com.encapsulamentos.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica(null, null, null, null  );
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null);

        empresa.setNomeFantasia("Funerario e Restaurante Presunto Fresco - O Morto de Ontem é o Prato de Hoje!");
        empresa.setCnpj("12.345.678/0001-90");
        empresa.setEmail("contato@funerariopresuntofresco.com");
        empresa.setTelefone("(11) 98765-4321");

        System.out.println("Informe o nome do cliente: ");
        usuario.setNome(sc.nextLine());
        System.out.println("Informe o CPF do cliente: ");   
        usuario.setCpf(sc.nextLine());
        System.out.println("Informe o email do cliente: ");
        usuario.setEmail(sc.nextLine());
        System.out.println("Informe o telefone do cliente: ");
        usuario.setTelefone(sc.nextLine());

        //saída de dados do cliente
        System.out.println("\nDados do Cliente:");
        System.out.println("Nome: " + usuario.getNome()); 
        System.out.println("CPF: " + usuario.getCpf());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Telefone: " + usuario.getTelefone());
        
        // saída de dados da empresa
        System.out.println("\nDados da Empresa:");
        System.out.println("Nome Fantasia: " + empresa.getNomeFantasia());
        System.out.println("CNPJ: " + empresa.getCnpj());
        System.out.println("Email: " + empresa.getEmail());
        System.out.println("Telefone: " + empresa.getTelefone());

        
      
        sc.close();
    }
}
