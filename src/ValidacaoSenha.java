//wesley neves batista

import java.util.Scanner;

public class ValidacaoSenha {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String senha = "Java123";
		String senhaPedida;
		
		
		
		do {
			System.out.println("Digite a senha de aceso: ");
			senhaPedida = scanner.nextLine();
			
			if(!senhaPedida.equals(senha)) {
				System.out.println("Senha inválida, tente novamente.\n");
			}
			
		} while(!senhaPedida.equals(senha));
		
		System.out.println("Acesso concedido!!");
		
		scanner.close();
	}
}
