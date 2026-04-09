package com.composicao.app;
import com.composicao.models.Pessoa;
import com.composicao.models.Veiculo;   
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pessoa motorista = new Pessoa(null, null, null, null, null);
        Veiculo carro = new Veiculo(null, null, null, null, null, null, motorista);

        // Entrada de dados do motorista
        System.out.println("Digite o nome do motorista:");
        String nome = sc.nextLine();
        System.out.println("Digite o CPF do motorista:");
        String cpf = sc.nextLine();
        System.out.println("Digite o telefone do motorista:");
        String telefone = sc.nextLine();
        System.out.println("Digite o email do motorista:");
        String email = sc.nextLine();
        System.out.println("Digite a CNH do motorista:");
        String cnh = sc.nextLine();

        // Configurando os dados do motorista
        motorista.setNome(nome);
        motorista.setCpf(cpf);
        motorista.setTelefone(telefone);
        motorista.setEmail(email);
        motorista.setCpf(cnh);

        // Entrada de dados do veículo
        System.out.println("Digite o fabricante do veículo:");
        String fabricante = sc.nextLine();
        System.out.println("Digite o modelo do veículo:");
        String modelo = sc.nextLine();
        System.out.println("Digite a placa do veículo:");
        String placa = sc.nextLine();
        System.out.println("Digite o ano do veículo:");
        String ano = sc.nextLine();
        System.out.println("Digite a cor do veículo:");
        String cor = sc.nextLine();
        System.out.println("Digite o Renavam do veículo:");
        String Renavam = sc.nextLine();

        //Associando o motorista ao veículo
        carro.setMotorista(motorista);

        //Informando os dados do veículo e do motorista
        System.out.println("\nDados do Veículo:");  
        System.out.println("Fabricante: " + carro.getFabricante());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Renavam: " + carro.getRenavam());
        System.out.println("\nDados do Motorista:");
        System.out.println("Nome: " + motorista.getNome());
        System.out.println("CPF: " + motorista.getCpf());
        System.out.println("Telefone: " + motorista.getTelefone());
        System.out.println("Email: " + motorista.getEmail());
        System.out.println("CNH: " + motorista.getCnh());
        System.out.println("\nInformações completas do veículo:");
        carro.exibirInformacoes();
         


        sc.close();
    }
    
}
