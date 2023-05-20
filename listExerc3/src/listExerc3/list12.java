package listExerc3;
import java.util.Scanner;
public class list12 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int option;

	        do {
	            System.out.println("----- Menu de opções -----");
	            System.out.println("1. Imposto");
	            System.out.println("2. Novo salário");
	            System.out.println("3. Classificação");
	            System.out.println("4. Finalizar o programa");
	            System.out.print("Digite a opção desejada: ");
	            option = scanner.nextInt();

	            switch (option) {
	                case 1:
	                    System.out.print("Digite o salário do funcionário: ");
	                    double salary1 = scanner.nextDouble();
	                    double tax1;
	                    if (salary1 <= 1500) {
	                        tax1 = 5;
	                    } else if (salary1 <= 3000) {
	                        tax1 = 10;
	                    } else {
	                        tax1 = 15;
	                    }
	                    double taxValue1 = salary1 * (tax1 / 100);
	                    System.out.println("Valor do imposto: R$ " + taxValue1);
	                    break;
	                case 2:
	                    System.out.print("Digite o salário do funcionário: ");
	                    double salary2 = scanner.nextDouble();
	                    double newSalary;
	                    if (salary2 > 4500) {
	                        newSalary = salary2 + 250;
	                    } else if (salary2 > 3000) {
	                        newSalary = salary2 + 200;
	                    } else if (salary2 > 2000) {
	                        newSalary = salary2 + 150;
	                    } else {
	                        newSalary = salary2 + 130;
	                    }
	                    System.out.println("Novo salário: R$ " + newSalary);
	                    break;
	                case 3:
	                    System.out.print("Digite o salário do funcionário: ");
	                    double salary3 = scanner.nextDouble();
	                    if (salary3 > 3000) {
	                        System.out.println("Classificação: Bem remunerado");
	                    } else {
	                        System.out.println("Classificação: Mal remunerado");
	                    }
	                    break;
	                case 4:
	                    System.out.println("Finalizando o programa...");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Digite novamente.");
	            }
	            System.out.println();
	        } while (option != 4);

	        scanner.close();
	    }
	}


