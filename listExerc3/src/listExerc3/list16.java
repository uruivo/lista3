package listExerc3;

public class list16 {
	    public static void main(String[] args) {
	        for (int numero = 1; numero <= 10; numero++) {
	            System.out.println("Tabuada do " + numero + ":");

	            for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
	                int resultado = numero * multiplicador;
	                System.out.println(numero + " x " + multiplicador + " = " + resultado);
	            }

	            System.out.println(); // linha em branco entre as tabuadas
	        }
	    }
	}


