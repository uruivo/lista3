package listExerc3;

public class list6 {
	    public static void main(String[] args) {
	        int n = 15; // Número de termos a serem somados
	        int firstTerm = 5; // Primeiro termo da sequência
	        int commonDifference = 5; // Diferença comum entre os termos
	        int sum = 0;

	        for (int i = 0; i < n; i++) {
	            int term = firstTerm + (i * commonDifference);
	            sum += term;
	        }

	        System.out.println("A soma dos 15 primeiros termos da sequência é: " + sum);
	    }
	}


