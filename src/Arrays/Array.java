package Arrays;

public class Array {
    public static void main(String[] args) {

        /*
         * Arrays:
         * - Um array é uma estrutura de dados que armazena vários valores do mesmo tipo.
         * - Cada valor em um array é chamado de elemento e pode ser acessado pelo índice correspondente (o índice começa em 0).
         * - Arrays têm tamanho fixo, definido no momento da sua criação.
         *
         * Objetivo da aula:
         * - Demonstrar a criação, inicialização e manipulação de arrays.
         * - Mostrar os valores padrão atribuídos aos arrays quando os elementos não são explicitamente inicializados.
         */

        // Declaração e inicialização de um array de Strings chamado 'ninjas' com capacidade para 5 elementos
        String[] ninjas = new String[5];

        // Atribuição de valores aos primeiros 4 índices do array
        ninjas[0] = "Naruto Uzumaki"; // Primeiro elemento (índice 0)
        ninjas[1] = "Sasuke Uchiha"; // Segundo elemento (índice 1)
        ninjas[2] = "Sakura Haruno"; // Terceiro elemento (índice 2)
        ninjas[3] = "Hinata Hyuga";  // Quarto elemento (índice 3)

        // Tentativa de acessar o índice 4 (ainda não inicializado, deve exibir 'null')
        System.out.println(ninjas[0]); // Exibe "Naruto Uzumaki"
        System.out.println(ninjas[1]); // Exibe "Sasuke Uchiha"
        System.out.println(ninjas[2]); // Exibe "Sakura Haruno"
        System.out.println(ninjas[3]); // Exibe "Hinata Hyuga"
        System.out.println(ninjas[4]); // Exibe "null", pois o índice 4 não foi inicializado

        // Declaração e inicialização de um array de inteiros com capacidade para 2 elementos
        int[] idades = new int[2];
        idades[0] = 15; // Inicializando o primeiro elemento

        // Exibição dos valores do array 'idades'
        System.out.println(idades[0]); // Exibe "15" (inicializado manualmente)
        System.out.println(idades[1]); // Exibe "0" (valor padrão para int)

        // Declaração e inicialização de um array de números decimais (double) com 1 elemento
        double[] flutuante = new double[1];

        // Exibição do valor padrão do array 'flutuante'
        System.out.println(flutuante[0]); // Exibe "0.0" (valor padrão para double)

        // Declaração e inicialização de um array de valores booleanos com 1 elemento
        boolean[] verdadeiroOuFalso = new boolean[1];

        // Exibição do valor padrão do array 'verdadeiroOuFalso'
        System.out.println(verdadeiroOuFalso[0]); // Exibe "false" (valor padrão para boolean)
    }
}
