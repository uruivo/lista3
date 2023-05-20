package listExerc3;
import java.util.Scanner;
public class list4 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o valor do último termo da sequência: ");
	        int lastTerm = scanner.nextInt();
	        
	        int sum = 0;

	        for (int i = 1; i <= lastTerm; i++) {
	            sum += i;
	        }

	        System.out.println("A soma dos termos da sequência é: " + sum);
	        
	        scanner.close();
	    }
	}


