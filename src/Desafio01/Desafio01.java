package Desafio01;

public class Desafio01 {
    public static void main(String[] args) {
        /*
         * Desafio 01: Crie um programa que represente três ninjas da Vila da Folha (Konoha)
         * de "Naruto" e suas respectivas missões. Cada ninja tem um nome, uma idade e uma
         * missão atribuída a ele, com o nome da missão, nível de dificuldade e status de conclusão.
         *
         * Extra:
         * Use condicionais para verificar se o ninja pode concluir a missão baseado na sua idade:
         * - Altere o status da missão para "concluída" ou "não concluída" de acordo com essa lógica e
         * imprima o resultado.
         * - Altere o status da missão para "concluída" ou "não concluída" de acordo com essa lógica
         * e imprima o resultado.
         * - Ninjas menores de 15 anos só podem concluir missões de nível C ou D. Ninjas com 15 anos
         * ou mais podem concluir missões de qualquer nível.
         */

        // Minha solução:

        System.out.println("-------------------------------------");
        System.out.println("MINHA SOLUÇÃO:");
        System.out.println("-------------------------------------");

        String nomeNinja01 = "Naruto Uzumaki";
        short idadeNinja01 = 15;
        String missaoNinja01 = "Ganhar 2 lutas";
        short nivelDificuldadeMissaoNinja01 = 2;
        boolean missaoConcluidaNinja01 = false;

        String nomeNinja02 = "Sasuke Uchiha";
        short idadeNinja02 = 16;
        String missaoNinja02 = "Escalar uma montanha";
        short nivelDificuldadeMissaoNinja02 = 1;
        boolean missaoConcluidaNinja02 = false;

        String nomeNinja03 = "Sakura Haruno";
        short idadeNinja03 = 14;
        String missaoNinja03 = "Fugir de um vilão";
        short nivelDificuldadeMissaoNinja03 = 3;
        boolean missaoConcluidaNinja03 = false;

        System.out.println("O ninja 01: " + nomeNinja01 + " de " + idadeNinja01 + " anos de idade, tem a missão de " + missaoNinja01 + "!");
        System.out.println("O ninja 02: " + nomeNinja02 + " de " + idadeNinja02 + " anos de idade, tem a missão de " + missaoNinja02 + "!");
        System.out.println("A ninja 03: " + nomeNinja03 + " de " + idadeNinja03 + " anos de idade, tem a missão de " + missaoNinja03 + "!");

        if(missaoConcluidaNinja01 == false && idadeNinja01 >= 15){
            System.out.println("O ninja 1: " + nomeNinja01 + " pode concluir a sua missão de " + missaoNinja01 + ".");
            missaoConcluidaNinja01 = true;
            System.out.println("Missão concluída!");
        }else{
            System.out.println("O ninja 1: " + nomeNinja01 + " não pode concluir a sua missão de " + missaoNinja01 + ".");
            System.out.println("Missão não concluída!");
        }

        if(missaoConcluidaNinja02 == false && idadeNinja02 >= 15){
            System.out.println("O ninja 2: " + nomeNinja02 + " pode concluir a sua missão de " + missaoNinja02 + ".");
            missaoConcluidaNinja02 = true;
            System.out.println("Missão concluída!");
        }else{
            System.out.println("O ninja 2: " + nomeNinja02 + " não pode concluir a sua missão de " + missaoNinja02 + ".");
            System.out.println("Missão não concluída!");
        }

        if(missaoConcluidaNinja03 == false && idadeNinja03 >= 15){
            System.out.println("A ninja 3: " + nomeNinja03 + "pode concluir a sua missão de " + missaoNinja03 + ".");
            missaoConcluidaNinja03 = true;
            System.out.println("Missão concluída!");
        }else{
            System.out.println("A ninja 3: " + nomeNinja03 + " não pode concluir a sua missão de " + missaoNinja03 + ".");
            System.out.println("Missão não concluída!");
        }

        // Solução professor:

        System.out.println("-------------------------------------");
        System.out.println("SOLUÇÃO PROFESSOR:");
        System.out.println("-------------------------------------");

        String nomeNinja1 = "Naruto Uzumaki";
        int idade = 16;
        String missao = "Encontrar o bandido";
        String statusDaMissao = "Em adamento";
        char nivelDaMissao = 'A';

        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("idade do ninja: " + idade);
        System.out.println("Missão do ninja: " + missao);
        System.out.println("Status da missão: " + statusDaMissao);
        System.out.println("Nível da missão: " + nivelDaMissao);

        if(idade < 15){
            if(nivelDaMissao == 'C' || nivelDaMissao == 'D'){
                statusDaMissao = "Missão concluída!";
                System.out.println(statusDaMissao);
            }else{
                statusDaMissao = "Missão não concluída!";
                System.out.println(statusDaMissao);
            }
        }else{
            statusDaMissao = "Missão concluída!";
            System.out.println(statusDaMissao);
        }

        System.out.println("-------------------------------------");

        String nomeNinja2 = "Sasuke Uchiha";
        int idade2 = 16;
        String missao2 = "Reconhecimento da aldeia";
        String statusDaMissao2 = "Em adamento";
        char nivelDaMissao2 = 'S';

        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("idade do ninja: " + idade2);
        System.out.println("Missão do ninja: " + missao2);
        System.out.println("Status da missão: " + statusDaMissao2);
        System.out.println("Nível da missão: " + nivelDaMissao2);

        if(idade < 15){
            if(nivelDaMissao2 == 'C' || nivelDaMissao2 == 'D'){
                statusDaMissao2 = "Missão concluída!";
                System.out.println(statusDaMissao2);
            }else{
                statusDaMissao2 = "Missão não concluída!";
                System.out.println(statusDaMissao2);
            }
        }else{
            statusDaMissao2 = "Missão concluída!";
            System.out.println(statusDaMissao2);
        }

        System.out.println("-------------------------------------");

        String nomeNinja3 = "Sakura Haruno";
        int idade3 = 16;
        String missao3 = "Curar feridos da guerra";
        String statusDaMissao3= "Concluído";
        char nivelDaMissao3 = 'D';

        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("idade do ninja: " + idade3);
        System.out.println("Missão do ninja: " + missao3);
        System.out.println("Status da missão: " + statusDaMissao3);
        System.out.println("Nível da missão: " + nivelDaMissao3);

        if(idade < 15){
            if(nivelDaMissao3 == 'C' || nivelDaMissao3 == 'D'){
                statusDaMissao3 = "Missão concluída!";
                System.out.println(statusDaMissao3);
            }else{
                statusDaMissao3 = "Missão não concluída!";
                System.out.println(statusDaMissao3);
            }
        }else{
            statusDaMissao3 = "Missão concluída!";
            System.out.println(statusDaMissao3);
        }

        System.out.println("-------------------------------------");
    }
}
