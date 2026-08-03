
//wesley neves batista
import java.util.Scanner;

public class ContadorParesImpares {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int pares = 0, impares = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("Digite o "+i+"°numero: ");
			int numero = scanner.nextInt();
			
			if(numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		
		scanner.close();
		
		System.out.println("Quantidade de numeros pares: "+pares);
		System.out.println("Quantidade de numeros impares: "+impares);
	}
	
	
}
