public class Ex01 {
    public static void main(String[] args) {
        // a) Declaração de variáveis
        int numeroInteiro = 10;       // Exemplo de valor numérico inteiro
        double numeroReal = 20.5;    // Exemplo de valor numérico real
        boolean valorLogico = true;  // Exemplo de valor do tipo lógico
        String valorLiteral = "Olá, mundo!"; // Exemplo de valor do tipo literal

        // Exibir valores das variáveis
        System.out.println("Valor inteiro: " + numeroInteiro);
        System.out.println("Valor real: " + numeroReal);
        System.out.println("Valor lógico: " + valorLogico);
        System.out.println("Valor literal: " + valorLiteral);

        // b) Declaração e inicialização de um vetor de 5 posições
        int[] vetor = {1, 2, 3, 4, 5};

        // Exibir valores do vetor
        System.out.println("\nVetor:");
        System.out.println("Posição 0: " + vetor[0]);
        System.out.println("Posição 1: " + vetor[1]);
        System.out.println("Posição 2: " + vetor[2]);
        System.out.println("Posição 3: " + vetor[3]);
        System.out.println("Posição 4: " + vetor[4]);

        // c) Declaração e inicialização de uma matriz 3x2
        String[][] matriz = {
            {"A1", "A2"},
            {"B1", "B2"},
            {"C1", "C2"}
        };
   
       
        // Exibir valores da matriz
        System.out.println("\nMatriz:");
        System.out.println("Posição [0][0]: " + matriz[0][0]);
        System.out.println("Posição [0][1]: " + matriz[0][1]);
        System.out.println("Posição [1][0]: " + matriz[1][0]);
        System.out.println("Posição [1][1]: " + matriz[1][1]);
        System.out.println("Posição [2][0]: " + matriz[2][0]);
        System.out.println("Posição [2][1]: " + matriz[2][1]);
    }
}
