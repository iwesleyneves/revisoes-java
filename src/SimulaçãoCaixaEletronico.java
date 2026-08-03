import java.util.Scanner;

public class SimulaçãoCaixaEletronico {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double saldo = 1000.00;
        double valorSaque;

        System.out.println("=== CAIXA ELETRÔNICO ===");
        System.out.printf("Saldo inicial disponível: R$ %.2f%n", saldo);

        while (saldo > 0) {
            System.out.print("\nDigite o valor para saque ou Digite 0 para sair: R$ ");
            valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Operação cancelada pelo usuário.");
                break; 
            }


            if (valorSaque < 0) {
                System.out.println("Valor inválido! Digite um valor positivo.");
            }

            else if (valorSaque > saldo) {
                System.out.println("Saldo insuficiente! Seu saldo atual é R$ " + String.format("%.2f", saldo));
            } 
           
            else {
                saldo -= valorSaque; 
                System.out.printf("Saque de R$ %.2f realizado com sucesso!%n", valorSaque);
                System.out.printf("Novo saldo: R$ %.2f%n", saldo);
            }

            if (saldo == 0) {
                System.out.println("\nSeu saldo zerou! O programa será encerrado.");
            }
        }

        System.out.println("\nObrigado por utilizar o caixa eletrônico!");
        scanner.close();
    }
}
