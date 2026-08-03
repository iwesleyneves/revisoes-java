import java.util.Scanner;

public class EstatisticaTurma {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int totalAlunos;

	        do {
	            System.out.print("Informe a quantidade de alunos na turma: ");
	            totalAlunos = scanner.nextInt();

	            if (totalAlunos <= 0) {
	                System.out.println("Erro: A quantidade de alunos deve ser maior que zero!\n");
	            }
	        } while (totalAlunos <= 0);
	        
	        int maiorIdade = Integer.MIN_VALUE; 
	        int menorIdade = Integer.MAX_VALUE; 
	        int somaIdades = 0;

	        for (int i = 1; i <= totalAlunos; i++) {
	            System.out.print("Digite a idade do " + i + "º aluno: ");
	            int idade = scanner.nextInt();

	            somaIdades += idade;
	            
	            if (idade > maiorIdade) {
	                maiorIdade = idade;
	            }

	            if (idade < menorIdade) {
	                menorIdade = idade;
	            }
	        }

	        double mediaIdade = (double) somaIdades / totalAlunos;

	        System.out.println("\n=== ESTATÍSTICAS DA TURMA ===");
	        System.out.println("Maior idade: " + maiorIdade + " anos");
	        System.out.println("Menor idade: " + menorIdade + " anos");
	        System.out.printf("Média de idade da turma: %.2f anos%n", mediaIdade);

	        scanner.close();
	    }
	} 

