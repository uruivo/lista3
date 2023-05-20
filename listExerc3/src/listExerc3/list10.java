package listExerc3;
import java.util.Scanner;
public class list10 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int positiveSum = 0; // Soma dos números positivos
	        int negativeCount = 0; // Quantidade de números negativos

	        int number;
	        do {
	            System.out.print("Digite um número inteiro (0 para sair): ");
	            number = scanner.nextInt();

	            if (number > 0) {
	                positiveSum += number;
	            } else if (number < 0) {
	                negativeCount++;
	            }
	        } while (number != 0);

	        System.out.println("A soma dos números positivos é: " + positiveSum);
	        System.out.println("A quantidade de números negativos é: " + negativeCount);

	        scanner.close();
	    }
	}


