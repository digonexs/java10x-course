package Desafio02;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        /*
         * Você foi encarregado pelo Hokage para gerenciar o
         * cadastro de ninjas na Vila da Folha. Sua missão é criar
         * um sistema simples em Java para cadastrar novos
         * ninjas e listar todos os ninjas cadastrados.
         */

        //MINHA SOLUÇÃO

        // Array que vai armazenar os ninjas
        String[] ninjas = new String[3];
        int quantidadeNinjaCadastrado = 0; // Contador para controlar quantos ninjas foram cadastrados.

        // Criando variavel de entrada de dados.
        Scanner scanner = new Scanner(System.in);

        // Laço que vai rodar enquanto o usuário não escolher a opção de sair
        while (true) {
            // Exibindo o menu
            System.out.println("=========================");
            System.out.println("       Menu Ninja        ");
            System.out.println("=========================");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            // Criando variavel que armazena a opção escolhida pelo usuário
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumindo o '\n' deixado pelo nextInt()

            // Condicional para interação com menu
            switch (opcao) {
                case 1:
                    if (quantidadeNinjaCadastrado < ninjas.length) {
                        // Verificando se há espaço para cadastrar mais ninjas
                        System.out.print("Digite o nome do ninja: ");
                        ninjas[quantidadeNinjaCadastrado] = scanner.nextLine();
                        quantidadeNinjaCadastrado++; // Incrementando o contador de ninjas cadastrados
                    } else {
                        System.out.println("Não há mais espaço para cadastrar ninjas!");
                    }
                    break;
                case 2:
                    // Verificando se há ninjas cadastrados antes de tentar listar
                    if (quantidadeNinjaCadastrado == 0) {
                        System.out.println("Nenhum ninja cadastrado!");
                    } else {
                        // Listando todos os ninjas cadastrados
                        System.out.println("Lista de Ninjas Cadastrados:");
                        for (int i = 0; i < quantidadeNinjaCadastrado; i++) {
                            System.out.println(i + 1 + ". " + ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    System.exit(0); // Finaliza a execução do programa
                    break;
                default:
                    System.out.println("Opção Inválida");
            }


            //SOLUÇÃO PROFESSOR

            //Entrada de dados
            Scanner scanner2 = new Scanner(System.in);

            // Fazer o array
            int NUMERO_MAX = 3;
            String[] ninjas2 = new String[NUMERO_MAX];

            // Contadores
            int ninjasCadastrados = 0;
            int opcao2 = 0;

            while (opcao2 != 3) {

                // MENU
                System.out.println("\n===== Menu Ninja =====");
                System.out.println("1. Cadastrar Ninja");
                System.out.println("2. Listar Ninjas");
                System.out.println("3. Sair");
                System.out.print("Escolha uma opção: ");
                opcao2 = scanner.nextInt();
                scanner2.nextLine();

                switch (opcao2) {
                    case 1:
                        if (ninjasCadastrados < NUMERO_MAX) {
                            System.out.println("Digite o nome do ninja para cadastro: ");
                            String nomeNinja = scanner2.nextLine();
                            ninjas2[ninjasCadastrados] = nomeNinja;
                            // Somando mais um ninja na minha lista
                            ninjasCadastrados++;
                            System.out.println("Ninja cadastrado com sucesso");
                        } else {
                            System.out.println("A lista de ninjas esta cheia, impossivel cadastrar um novo ninja");
                        }
                        break;
                    case 2:
                        if (ninjasCadastrados == 0) {
                            System.out.println("Nenhum ninja encontrado");
                        } else {
                            System.out.println("============ Lista de ninjas ============");
                            for (int i = 0; i < ninjas2.length ; i++) {
                                System.out.println(ninjas2[i]);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Estamos saindo o programa...Aguarde");
                        break;
                    default:
                        System.out.println("Essa opcao nao é valida.");
                        break;
                }
            }
        }
    }
}
