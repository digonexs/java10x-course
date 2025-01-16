package Arrays;

public class Array {
    public static void main(String[] args) {

        /*
         * Arrays:
         * - Um array é uma estrutura de dados que armazena vários valores do mesmo tipo.
         * - Cada valor dentro de um array é chamado de elemento e é acessado por um índice (que começa em 0).
         *
         * Objetivo da aula:
         * - Demonstrar a criação e manipulação de um array.
         * - Armazenar nomes de ninjas em um array e exibi-los.
         */

        // Declaração de um array de Strings chamado 'ninjas' com capacidade para 4 elementos
        String[] ninjas = new String[4];

        // Atribuição de valores aos índices do array
        ninjas[0] = "Naruto Uzumaki"; // Primeiro elemento (índice 0)
        ninjas[1] = "Sasuke Uchiha"; // Segundo elemento (índice 1)
        ninjas[2] = "Sakura Haruno"; // Terceiro elemento (índice 2)
        ninjas[3] = "Hinata Hyuga";  // Quarto elemento (índice 3)

        // Exibindo os valores do array no console
        System.out.println(ninjas[0]); // Exibe "Naruto Uzumaki"
        System.out.println(ninjas[1]); // Exibe "Sasuke Uchiha"
        System.out.println(ninjas[2]); // Exibe "Sakura Haruno"
        System.out.println(ninjas[3]); // Exibe "Hinata Hyuga"
    }
}
