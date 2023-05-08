package logica.exercicios.aula08;

public class Exercicio06 {

	public static void main(String[] args) {
		
		int min = 0;
		int max = 101;
		int numSorteado = 0;
		
//		double numSorteado = 0;
		int qtdPrimos = 0;
		
		// SORTEIO DE 10 NUMEROS PARA TESTAR
		for (int i = 0; i < 10; i++) {
			numSorteado = (int) (min + Math.random() * (max - min));
			System.out.println(numSorteado);
			
			int divisor = 2;
			
			while (numSorteado % divisor != 0) {
				divisor++;
			}
			
			if (divisor == numSorteado) {
				qtdPrimos++;
			}
		}
		
		System.out.println("\nQtd primos: " + qtdPrimos);
		
	}

}
