package logica.aulas.aula07;

import java.util.Scanner;

public class WhileLaco {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		
//		int i = 10;
//		
//		while (i >= 1) {
//			System.out.println("Olá mundo " + i);
//			i--;
//		}
//		
//		
		
//		String jogar = "sim";
//		
//		while (jogar.equals("sim")) {
//			System.out.println("Repete ou inicia o jogo");
//			
//			System.out.print("Deseja jogar novamente?");
//			jogar = entrada.nextLine();
//		}
//		
//		System.out.println("oi");
		
		
		// MODIFICADORES DE LAÇO
		
		int i = 0;
		
		while (i < 10) {
			i++;
			
			if (i == 3 || i == 5) {
				continue;
			}
			
			if (i == 7) {
				break;
			}
			
			System.out.println("Cambalhota " + i);
		}
		
		System.out.println("Fim do programa");
		
	}

}
