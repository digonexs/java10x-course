package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
         * Dados Não Primitivos:
         * - São tipos de dados mais complexos que podem armazenar múltiplos valores ou até comportamentos (métodos).
         * - Exemplos comuns de dados não primitivos:
         *   - String: Uma sequência de caracteres.
         *   - Array: Uma coleção de múltiplos valores do mesmo tipo.
         *   - Class: Definições de objetos personalizados com propriedades e métodos.
         *   - Enum: Conjunto fixo de constantes.
         *
         * Objetivo da aula: Criar um ninja (nome "Naruto Uzumaki") e atribuir métodos para manipulação de seu nome.
         * Neste código, vamos usar a classe String para demonstrar como podemos manipular texto.
         */

        // Criação de uma variável String contendo o nome do ninja
        String nome = "Naruto Uzumaki"; // A variável 'nome' armazena a sequência de caracteres "Naruto Uzumaki"

        // Atribuindo a String 'nome' à nova variável, convertendo para caixa alta (letras maiúsculas)
        String nomeCaixaAlta = nome.toUpperCase(); // O método toUpperCase() converte todos os caracteres em 'nome' para maiúsculas
        // Exibindo o nome original (sem transformação) e o nome em caixa alta (com todas as letras maiúsculas)
        System.out.println("Nome sem caixa alta: " + nome);
        System.out.println("Nome em caixa alta: " + nomeCaixaAlta);

        // Criação de uma variável String contendo o nome da aldeia
        String aldeia = "Aldeia da Folha"; // A variável 'aldeia' armazena a sequência de caracteres "Aldeia da Folha"

        // Atribuindo a String 'aldeia' à nova variável, convertendo para caixa baixa (letras minúsculas)
        String aldeiaCaixaBaixa = aldeia.toLowerCase(); // O método toLowerCase() converte todos os caracteres em 'aldeia' para minúsculas
        // Exibindo o nome da aldeia original (sem transformação) e o nome da aldeia em caixa baixa (com todas as letras minúsculas)
        System.out.println("Aldeia está não está toda em caixa baixa: " + aldeia);
        System.out.println("Aldeia está toda em caixa baixa: " + aldeiaCaixaBaixa);

        /*
         * Explicação dos métodos utilizados:
         * - toUpperCase(): Converte todos os caracteres da String para maiúsculas.
         * - toLowerCase(): Converte todos os caracteres da String para minúsculas.
         * Esses métodos são exemplos de como manipular dados do tipo String, que é um tipo de dado não primitivo em Java.
         */
    }
}
