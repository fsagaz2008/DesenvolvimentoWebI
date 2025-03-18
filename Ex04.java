import java.util.Scanner;
public class Ex04 {
      public static void main(String[] args) {
        // Criação do Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Leitura do nome da pessoa
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        // Leitura da idade da pessoa
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        // Exibição do nome e idade no console
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        // Fechando o Scanner
        scanner.close();
    }
}


