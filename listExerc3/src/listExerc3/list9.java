package listExerc3;
import java.util.Scanner;
public class list9 {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o salário de Carlos: ");
	        double carlosSalary = scanner.nextDouble(); // Salário de Carlos
	        
	        double joaoSalary = carlosSalary / 3.0; // Salário de João
	        
	        double carlosBalance = carlosSalary; // Saldo inicial de Carlos
	        double joaoBalance = joaoSalary; // Saldo inicial de João
	        
	        double carlosInterestRate = 0.02; // Taxa de juros da aplicação de Carlos (2% ao mês)
	        double joaoInterestRate = 0.05; // Taxa de juros da aplicação de João (5% ao mês)
	        
	        int months = 0; // Quantidade de meses
	        
	        while (joaoBalance < carlosBalance) {
	            carlosBalance += carlosBalance * carlosInterestRate; // Atualização do saldo de Carlos com juros
	            joaoBalance += joaoBalance * joaoInterestRate; // Atualização do saldo de João com juros
	            months++; // Incremento da quantidade de meses
	        }
	        
	        System.out.println("Levará " + months + " meses para o valor pertencente a João igualar ou ultrapassar o valor pertencente a Carlos.");
	        
	        scanner.close();
	    }
	}


