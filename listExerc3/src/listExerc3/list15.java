package listExerc3;
import java.util.Scanner;
public class list15 {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número para calcular a tabuada: ");
	        int numero = scanner.nextInt();

	        System.out.println("Tabuada de " + numero + ":");

	        for (int i = 1; i <= 10; i++) {
	            int resultado = numero * i;
	            System.out.println(numero + " x " + i + " = " + resultado);
	        }

	        scanner.close();
	    }
	}


