package listExerc3;
import java.util.Scanner;
public class list18 {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número de três dígitos: ");
	        int numero = scanner.nextInt();

	        // Obtém cada dígito do número
	        int digito1 = numero / 100;         // Obtém o dígito da centena
	        int digito2 = (numero / 10) % 10;   // Obtém o dígito da dezena
	        int digito3 = numero % 10;          // Obtém o dígito da unidade

	        // Gera o número invertido
	        int numeroInvertido = digito3 * 100 + digito2 * 10 + digito1;

	        System.out.println("Número invertido: " + numeroInvertido);

	        scanner.close();
	    }
	}

