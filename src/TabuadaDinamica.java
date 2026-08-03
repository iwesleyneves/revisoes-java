import java.util.Scanner;

public class TabuadaDinamica {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Informe um numero de 1 a 10: ");
		numero = scanner.nextInt();
		if(numero > 10 || numero < 1) {
			System.out.println("Por favor informe um numero inteiro entre 1 e 10!");
		} else {
			for(int i = 1; i <= 10; i++) {
				System.out.println(numero+" x " + i + " = " +(numero * i));
			}
		}
		scanner.close();
	}
}
