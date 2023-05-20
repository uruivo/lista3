package listExerc3;
import java.util.Scanner;
public class list14 {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o número de termos da série: ");
	        int numTerms = scanner.nextInt();

	        int[] series = new int[numTerms];

	        // Preenche a série com os valores iniciais conhecidos
	        series[0] = 2;
	        series[1] = 7;
	        series[2] = 3;
	        series[3] = 4;

	        // Gera os valores da série a partir do 5º termo
	        for (int i = 4; i < numTerms; i++) {
	            if (i % 3 == 1) {
	                series[i] = series[i - 2] * 3;
	            } else if (i % 3 == 2) {
	                series[i] = series[i - 2] * 4;
	            } else {
	                series[i] = series[i - 2] * 7;
	            }
	        }

	        // Mostra os valores da série
	        System.out.println("Série gerada:");
	        for (int i = 0; i < numTerms; i++) {
	            System.out.print(series[i] + " ");
	        }
	        System.out.println();

	        scanner.close();
	    }
	}


