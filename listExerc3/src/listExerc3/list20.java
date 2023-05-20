package listExerc3;
import java.util.Scanner;
public class list20 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int quantidade = 15;
	        int menorNumero = Integer.MAX_VALUE;
	        int maiorNumero = Integer.MIN_VALUE;
	        int soma = 0;
	        int quantidadePares = 0;
	        int quantidadeDivisiveisPor5 = 0;

	        System.out.println("Digite " + quantidade + " números:");

	        for (int i = 0; i < quantidade; i++) {
	            int numero = scanner.nextInt();

	            // Verifica o menor número
	            if (numero < menorNumero) {
	                menorNumero = numero;
	            }

	            // Verifica o maior número
	            if (numero > maiorNumero) {
	                maiorNumero = numero;
	            }

	            // Calcula a soma dos números
	            soma += numero;

	            // Verifica se o número é par
	            if (numero % 2 == 0) {
	                quantidadePares++;
	            }

	            // Verifica se o número é divisível por 5
	            if (numero % 5 == 0) {
	                quantidadeDivisiveisPor5++;
	            }
	        }

	        double media = (double) soma / quantidade;

	        System.out.println("Menor número digitado: " + menorNumero);
	        System.out.println("Maior número digitado: " + maiorNumero);
	        System.out.println("Média dos números digitados: " + media);
	        System.out.println("Quantidade de números pares: " + quantidadePares);
	        System.out.println("Quantidade de números divisíveis por 5: " + quantidadeDivisiveisPor5);

	        scanner.close();
	    }
	}


