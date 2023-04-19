package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// PEÇA 1
		
		System.out.print("Digite o nome da peça 1: ");
		String nomePeca1 = entrada.nextLine();
		
		System.out.println("Digite o numero pecas 1: ");
		int numPecas1 = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Nome da peça 1: " + nomePeca1);
		System.out.println("Num de peças 1: " + numPecas1);
		
	}

}
