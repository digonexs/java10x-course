package Condicionais;

public class IFeElse {
    public static void main(String[] args) {

        /*
        * Condicionais:
        * - if: Executa um bloco de código se a condição for verdadeira.
        * - else if: Verifica uma condição alternativa, caso a condição do 'if' seja falsa.
        * - else: Executa um bloco de código se nenhuma das condições anteriores (if e else if) for verdadeira.
        *
        * Objetivo da aula: Passar o ninja de nível de acordo com o número de missões que ele concluiu, utilizando estruturas condicionais IF e ELSE.
        */

        String nome = "Naruto Uzumaki";
        int idade = 16;
        boolean hokage = false;
        short missoesConcluidas = 10;

        // Estrutura condicional para determinar o rank do ninja
        if (missoesConcluidas == 15 && idade > 15) {
            // Se o ninja completou exatamente 15 missões e tem mais de 15 anos, ele é promovido a Chunnin
            System.out.println(nome + " está no rank: Chunnin");
        } else if (missoesConcluidas >= 20) {
            // Caso a primeira condição não seja atendida, verificamos se o ninja completou 20 ou mais missões
            System.out.println(nome + " está no rank: Jounin");
        } else {
            // Se nenhuma das condições anteriores for atendida, o ninja está no rank Gennin
            System.out.println(nome + " está no rank: Gennin");
        }
    }
}
