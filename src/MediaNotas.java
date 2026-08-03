//wesley neves batista

import java.util.Scanner;

public class MediaNotas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double soma = 0;
		int contador = 0;
		
		System.out.println("Informe as notas do aluno (ou digite um numero negativo para encerrar): ");
		
		while(true) {
			System.out.print("Digite uma nota: ");
			double nota = scanner.nextDouble();
			
			if(nota < 0) {
				break;
			}
			
			soma += nota;
			contador++;
		}
		System.out.println("Resultado final: ");
		
		if(contador > 0) {
			double media = soma / contador;
		
			System.out.printf("Media das notas: %.2f\n", media);
			
			if(media >= 7) {
				System.out.println("Situação: Aprovado");
			}else {
				System.out.println("Situação: Reprovado");
			}
		}else {
			System.out.println("Nenhuma nota valida digitada.");
		}
		
		scanner.close();
	}
}
