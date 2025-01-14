package TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*
         * Dados Primitivos:
         * - Em Java, os dados primitivos são os tipos básicos fornecidos pela linguagem.
         * - Eles são usados para armazenar valores simples e possuem tamanhos fixos na memória.
         * - Exemplos de dados primitivos e seus valores máximos:
         *   - byte: números inteiros pequenos (1 byte), vai de -128 a 127.
         *   - short: números inteiros um pouco maiores que byte (2 bytes), vai de -32.768 a 32.767.
         *   - int: números inteiros comuns (4 bytes), vai de -2.147.483.648 a 2.147.483.647.
         *   - long: números inteiros grandes (8 bytes), vai de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807.
         *   - float: números decimais de precisão simples (4 bytes), vai de aproximadamente ±3.40282347E+38F (valor máximo positivo).
         *   - double: números decimais de precisão dupla (8 bytes), vai de aproximadamente ±1.79769313486231570E+308 (valor máximo positivo).
         *   - char: um único caractere (2 bytes).
         *   - boolean: valores lógicos (true ou false) (1 bit).
         *
         * Objetivo da aula: Criar um ninja - Naruto - apenas com dados primitivos.
         */

        // Declaração de variáveis usando tipos de dados primitivos:

        // Um número short que representa a idade de uma pessoa.
        short idade = 16;

        // Um número decimal que representa a altura em metros.
        double altura = 1.65;

        // Um caractere que armazena a inicial de um nome.
        char inicial = 'N';

        // Um valor booleano que indica se a pessoa está viva (true ou false).
        boolean vivo = true;

        // Um número inteiro grande que representa o saldo bancário.
        // Nota: Adicionamos o sufixo 'L' para indicar que é do tipo long.
        Long saldoBancario = 299550999L;

        // Exibindo os valores armazenados nas variáveis:
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Inicial do nome: " + inicial);
        System.out.println("Está vivo: " + vivo);
        System.out.println("Saldo bancário: " + saldoBancario);
    }
}
