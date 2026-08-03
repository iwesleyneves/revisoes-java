//wesley neves batista

import java.util.Scanner;

public class SorteadorAdvinhador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numeroSorteado = (int) (Math.random() * 50) + 1;
		
		int palpite = 0;
		
		System.out.println("Jogo de Advinhação\n");
		
		while(palpite != numeroSorteado) {
			System.out.println("Digite um numero: ");
			palpite = scanner.nextInt();
			
			if(palpite > numeroSorteado) {
				System.out.println("Muito alto!");
			} else if (palpite < numeroSorteado) {
				System.out.println("Muito baixo!");
			} else {
				System.out.println("Acertou!");
			}
		}
		
		scanner.close();
	}
}
