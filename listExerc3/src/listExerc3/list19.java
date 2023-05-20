package listExerc3;
import java.util.Scanner;
public class list19 {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int maiorValor = Integer.MIN_VALUE; // Inicializa com o menor valor possível
	        int menorValor = Integer.MAX_VALUE; // Inicializa com o maior valor possível

	        System.out.println("Digite valores positivos inteiros (Digite um valor negativo para encerrar):");

	        while (true) {
	            int valor = scanner.nextInt();

	            if (valor < 0) {
	                break; // Encerra o loop se o valor for negativo
	            }

	            if (valor > maiorValor) {
	                maiorValor = valor;
	            }

	            if (valor < menorValor) {
	                menorValor = valor;
	            }
	        }

	        System.out.println("Maior valor: " + maiorValor);
	        System.out.println("Menor valor: " + menorValor);

	        scanner.close();
	    }
	}

