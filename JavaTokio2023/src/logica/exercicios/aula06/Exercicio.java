package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int num = entrada.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
	}

}
