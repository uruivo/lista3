package listExerc3;

public class list8 {
	    public static void main(String[] args) {
	        int currentYear = 2023;
	        int initialYear = 2010;
	        double initialSalary = 1000.00;
	        double salary = initialSalary;
	        double increasePercentage = 0.015;

	        for (int year = initialYear + 1; year <= currentYear; year++) {
	            increasePercentage *= 2;
	            double increaseAmount = salary * increasePercentage;
	            salary += increaseAmount;
	        }

	        System.out.println("O salário atual do funcionário em " + currentYear + " é: R$" + salary);
	    }
	}


