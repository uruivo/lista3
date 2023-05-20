package listExerc3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class list13 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        double referenceValue;
	        do {
	            System.out.print("Digite o valor de referência: ");
	            referenceValue = scanner.nextDouble();
	            if (referenceValue <= 0) {
	                System.out.println("Valor de referência inválido. Digite novamente.");
	            }
	        } while (referenceValue <= 0);

	        List<Double> consumedKwList = new ArrayList<>();
	        List<Integer> consumerTypeList = new ArrayList<>();

	        System.out.println("Digite a quantidade de kw consumida por cada consumidor:");
	        System.out.println("Para encerrar, digite 0.");

	        int consumerCount = 1;
	        double totalBilling = 0;
	        int countBetween500And1000 = 0;

	        while (true) {
	            System.out.print("Consumidor " + consumerCount + ": ");
	            double consumedKw = scanner.nextDouble();
	            if (consumedKw == 0) {
	                break;
	            }

	            consumedKwList.add(consumedKw);

	            int consumerType;
	            do {
	                System.out.print("Tipo de consumidor (1 - residencial, 2 - comercial, 3 - industrial): ");
	                consumerType = scanner.nextInt();
	                if (consumerType < 1 || consumerType > 3) {
	                    System.out.println("Tipo de consumidor inválido. Digite novamente.");
	                }
	            } while (consumerType < 1 || consumerType > 3);

	            consumerTypeList.add(consumerType);

	            double kwValue = referenceValue / 8;
	            double finalValue = consumedKw * kwValue;
	            double totalValue;

	            if (consumerType == 1) {
	                totalValue = finalValue * 1.05;
	            } else if (consumerType == 2) {
	                totalValue = finalValue * 1.1;
	            } else {
	                totalValue = finalValue * 1.15;
	            }

	            totalBilling += totalValue;

	            if (totalValue >= 500 && totalValue <= 1000) {
	                countBetween500And1000++;
	            }

	            consumerCount++;
	        }

	        System.out.println("Valor de cada kw: R$ " + (referenceValue / 8));
	        System.out.println("Faturamento geral da empresa: R$ " + totalBilling);
	        System.out.println("Quantidade de consumidores que pagam entre R$ 500,00 e R$ 1.000,00: " + countBetween500And1000);

	        scanner.close();
	    }
	}


