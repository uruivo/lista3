package listExerc3;
import java.util.Scanner;
public class list11 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        double grade;
	        do {
	            System.out.print("Digite a nota do aluno (entre 0 e 10): ");
	            grade = scanner.nextDouble();

	            if (grade < 0 || grade > 10) {
	                System.out.println("Valor inválido. A nota deve estar entre 0 e 10. Tente novamente.");
	            }
	        } while (grade < 0 || grade > 10);

	        if (grade >= 6) {
	            System.out.println("Aluno aprovado.");
	        } else if (grade >= 5) {
	            System.out.println("Aluno em recuperação.");
	        } else {
	            System.out.println("Aluno reprovado.");
	        }

	        scanner.close();
	    }
	}


