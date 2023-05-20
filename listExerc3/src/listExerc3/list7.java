package listExerc3;
import java.util.Scanner;
public class list7 {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o primeiro termo da sequência: ");
	        int firstTerm = scanner.nextInt();
	        
	        System.out.print("Digite o último termo da sequência: ");
	        int lastTerm = scanner.nextInt();
	        
	        int commonDifference = firstTerm > lastTerm ? -5 : 5; // Diferença comum entre os termos
	        int n = (lastTerm - firstTerm) / commonDifference + 1; // Número de termos a serem somados
	        int sum = 0;

	        for (int i = 0; i < n; i++) {
	            int term = firstTerm + (i * commonDifference);
	            sum += term;
	        }

	        System.out.println("A soma dos termos da sequência é: " + sum);
	        
	        scanner.close();
	    }
	}


