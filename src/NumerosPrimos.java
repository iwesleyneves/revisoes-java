import java.util.Scanner;

public class NumerosPrimos {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int numero;

	        do {
	            System.out.print("Digite um número inteiro e positivo: ");
	            numero = scanner.nextInt();

	            if (numero <= 0) {
	                System.out.println("Por favor, digite um número maior que zero!\n");
	            }
	        } while (numero <= 0);

	        int totalDivisores = 0;

	        for (int i = 1; i <= numero; i++) {
	            if (numero % i == 0) {
	                totalDivisores++; 
	            }
	        }

	        if (totalDivisores == 2) {
	            System.out.println("O número " + numero + " É PRIMO!");
	        } else {
	            System.out.println("O número " + numero + " NÃO É PRIMO! (Possui " + totalDivisores + " divisores)");
	        }

	        scanner.close();
	    }
	}