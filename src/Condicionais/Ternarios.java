package Condicionais;

public class Ternarios {
    public static void main(String[] args) {

        /*
         * Operador Ternário:
         * - O operador ternário é uma forma simplificada de escrever uma estrutura condicional (if/else).
         * - Sintaxe: variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;
         *
         * Objetivo da Aula:
         * - Demonstrar como utilizar o operador ternário para atribuir valores a uma variável com base em uma condição.
         */

        // Definindo o número de missões realizadas pelo ninja
        short numeroDeMissoes = 1; // Número de missões concluídas pelo ninja

        // Usando o operador ternário para definir o nível do ninja com base no número de missões
        String nivelDoNinja = (numeroDeMissoes >= 10)
                ? "Esse ninja está com mais de 10 missões concluídas"
                : "Esse ninja não tem mais de 10 missões concluídas.";

        // Exibindo o resultado
        System.out.println(nivelDoNinja);

        /*
         * Explicação:
         * - A condição (numeroDeMissoes >= 10) é avaliada:
         *   - Se for verdadeira, o valor "Esse ninja está com mais de 10 missões concluídas" será atribuído à variável 'nivelDoNinja'.
         *   - Se for falsa, o valor "Esse ninja não tem mais de 10 missões concluídas." será atribuído.
         * - O operador ternário é útil para escrever condições simples de forma mais compacta, mas deve ser usado com cautela para evitar perda de clareza em condições complexas.
         */
    }
}
