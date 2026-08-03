//marley
import java.util.Scanner;

public class CalculadoraComMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
         
            System.out.println("\n=== MENU CALCULADORA ===");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();

                switch (opcao) {
                    case 1:
                        double soma = num1 + num2;
                        System.out.printf("Resultado da Soma: %.2f%n", soma);
                        break;

                    case 2:
                        double subtracao = num1 - num2;
                        System.out.printf("Resultado da Subtração: %.2f%n", subtracao);
                        break;

                    case 3:
                        double multiplicacao = num1 * num2;
                        System.out.printf("Resultado da Multiplicação: %.2f%n", multiplicacao);
                        break;

                    case 4:
                       
                        if (num2 != 0) {
                            double divisao = num1 / num2;
                            System.out.printf("Resultado da Divisão: %.2f%n", divisao);
                        } else {
                            System.out.println("Erro: Não é possível dividir por zero!");
                        }
                        break;
                }
            } else if (opcao == 5) {
                System.out.println("Saindo do programa...");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}