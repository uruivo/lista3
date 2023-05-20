package listExerc3;
import java.util.Scanner;
public class list17 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int totalTimes = 5;
	        int totalJogadores = 15;

	        int jogadoresMenor18 = 0;
	        double somaIdades = 0;
	        double somaAlturas = 0;
	        int jogadoresMais80Kg = 0;
	        int totalJogadoresCampeonato = totalTimes * totalJogadores;

	        for (int i = 1; i <= totalTimes; i++) {
	            System.out.println("Time " + i + ":");

	            double somaIdadesTime = 0;

	            for (int j = 1; j <= totalJogadores; j++) {
	                System.out.println("Jogador " + j + ":");

	                System.out.print("Idade: ");
	                int idade = scanner.nextInt();
	                if (idade < 18) {
	                    jogadoresMenor18++;
	                }
	                somaIdades += idade;
	                somaIdadesTime += idade;

	                System.out.print("Peso (em kg): ");
	                double peso = scanner.nextDouble();
	                if (peso > 80) {
	                    jogadoresMais80Kg++;
	                }

	                System.out.print("Altura (em metros): ");
	                double altura = scanner.nextDouble();
	                somaAlturas += altura;

	                System.out.println();
	            }

	            double mediaIdadesTime = somaIdadesTime / totalJogadores;
	            System.out.println("Média das idades do time " + i + ": " + mediaIdadesTime);
	        }

	        int percentualMais80Kg = (jogadoresMais80Kg * 100) / totalJogadoresCampeonato;
	        double mediaIdades = somaIdades / totalJogadoresCampeonato;
	        double mediaAlturas = somaAlturas / totalJogadoresCampeonato;

	        System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + jogadoresMenor18);
	        System.out.println("Média das alturas de todos os jogadores do campeonato: " + mediaAlturas);
	        System.out.println("Percentual de jogadores com mais de 80 Kg: " + percentualMais80Kg + "%");

	        scanner.close();
	    }
	}




