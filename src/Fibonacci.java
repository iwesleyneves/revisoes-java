import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        
        do {
            System.out.print("Digite um número maior que zero: ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("O número precisa ser maior que zero. Tente novamente!\n");
            }
        } while (n <= 0);

        System.out.println("\nOs " + n + " primeiros termos da Sequência de Fibonacci:");

        long primeiro = 0;
        long segundo = 1;

        for (int i = 1; i <= n; i++) {
            
            System.out.print(primeiro + (i < n ? ", " : "\n"));

            long proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        scanner.close();
    }
}
	
