package ScannerDoUsuario;

import java.util.Scanner; // Importa a classe Scanner para receber dados do usuário

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
         * Scanner: É uma classe utilizada para permitir que o programa receba dados inseridos pelo usuário via teclado.
         *
         * Objetivo da aula: Criar um ninja a partir dos dados fornecidos pelo usuário e validar se ele é maior ou menor de idade para participar de missões fora da aldeia.
         */

        // Criação de um objeto Scanner para capturar entradas do teclado
        Scanner caixaDeTexto = new Scanner(System.in);

        // Solicita ao usuário que insira o nome do ninja
        System.out.println("Escreva o nome do ninja:");
        String nomeDoNinja = caixaDeTexto.nextLine(); // Captura o nome digitado pelo usuário
        System.out.println("O nome do ninja é: " + nomeDoNinja); // Exibe o nome fornecido

        // Solicita ao usuário que insira a idade do ninja
        System.out.println("Escreva a idade do ninja:");
        int idadeDoNinja = caixaDeTexto.nextInt(); // Captura a idade digitada pelo usuário
        System.out.println("A idade do " + nomeDoNinja + " é: " + idadeDoNinja + " anos");

        // Valida se o ninja é maior ou menor de idade
        if (idadeDoNinja >= 18) {
            // Caso a idade seja 18 ou mais, o ninja pode ir para missões fora da aldeia
            System.out.println("O ninja " + nomeDoNinja + " já é maior de idade e pode ir para missões fora da aldeia!");
        } else {
            // Caso contrário, o ninja ainda é menor de idade e não pode participar dessas missões
            System.out.println("O ninja " + nomeDoNinja + " ainda não é maior de idade, então não pode ir para missões fora da aldeia!");
        }

        // Fecha o Scanner para liberar recursos do sistema
        caixaDeTexto.close();
    }
}
