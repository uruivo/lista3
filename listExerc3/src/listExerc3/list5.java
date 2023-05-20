package listExerc3;
import java.util.Scanner;
public class list5 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite um número para calcular o fatorial: ");
	        int number = scanner.nextInt();
	        
	        int factorial = 1;

	        for (int i = number; i >= 1; i--) {
	            factorial *= i;
	        }

	        System.out.println("O fatorial de " + number + " é igual a: " + factorial);
	        
	        scanner.close();
	    }
	}


