package Condicionais;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
         * Laços de Repetição:
         * - São usados para executar repetidamente um bloco de código, seja um número definido de vezes ou até que uma condição seja atendida.
         *
         * Tipos de laços abordados:
         * - while: Executa enquanto a condição for verdadeira.
         * - for: Ideal para repetir um número conhecido de vezes, controlado por uma variável de contador.
         *
         * Objetivo da aula:
         * - Demonstrar o funcionamento básico dos laços de repetição em Java utilizando o conceito de clones das sombras do Naruto.
         */

        // Declaração das variáveis
        int numeroDeClones = 0; // Contador que inicia com 0
        int numeroMaximoDeClones = 40; // Número máximo de clones permitidos

        // Exemplo do laço WHILE
        // O laço 'while' continuará enquanto 'numeroDeClones' for menor ou igual ao 'numeroMaximoDeClones'
        while (numeroDeClones <= numeroMaximoDeClones) {
            numeroDeClones++; // Incrementa o contador de clones em 1
            System.out.println("O Naruto fez um clone das sombras " + numeroDeClones);
            // Exibe o número atual de clones criados
        }

        // Exemplo do laço FOR
        // O laço 'for' inicia em 0 e continua até alcançar o valor de 'numeroMaximoDeClones'
        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("Contagem no laço FOR: " + i);
            // Exibe o número atual da contagem no laço 'for'
        }

        /*
         * Explicação:
         * - No 'while', a condição é avaliada antes de cada repetição. O código no bloco só será executado enquanto a condição for verdadeira.
         * - No 'for', você tem uma estrutura mais controlada, onde declara o contador, a condição de parada e o incremento em uma única linha.
         * - Ambos os laços são úteis, mas a escolha entre eles depende da lógica e da necessidade do programa.
         */
    }
}
