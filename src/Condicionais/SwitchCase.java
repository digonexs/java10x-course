package Condicionais;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        /*
         * SwitchCase:
         * - É uma estrutura de controle que avalia o valor de uma variável e executa um bloco de código correspondente ao caso (case) correspondente.
         * - Quando nenhum dos casos é válido, o bloco "default" é executado.
         *
         * Objetivo da aula:
         * - Solicitar ao usuário que escolha entre os personagens de um menu e exibir o personagem escolhido.
         */

        // Criação do objeto Scanner para capturar entrada de dados do usuário pelo teclado
        Scanner scanner = new Scanner(System.in);

        // Apresentando opções ao usuário
        System.out.println("Escolha um personagem:");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        // Capturando a escolha do usuário e armazenando na variável 'escolhaDoUsuario'
        int escolhaDoUsuario = scanner.nextInt();
        System.out.println("Sua escolha foi o número: " + escolhaDoUsuario);

        // Estrutura switch-case para tratar a escolha do usuário
        switch (escolhaDoUsuario) {
            case 1: // Caso o usuário escolha 1
                System.out.println("Você escolheu o Naruto Uzumaki");
                break; // Finaliza a execução após atender ao caso
            case 2: // Caso o usuário escolha 2
                System.out.println("Você escolheu o Sasuke Uchiha");
                break; // Finaliza a execução após atender ao caso
            case 3: // Caso o usuário escolha 3
                System.out.println("Você escolheu a Sakura Haruno");
                break; // Finaliza a execução após atender ao caso
            default: // Caso o usuário digite um número inválido
                System.out.println("O número escolhido é inválido. Tente novamente!");
                break;
        }

        // Fechando o objeto Scanner para liberar recursos
        scanner.close();
    }
}
