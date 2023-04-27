package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		char operacao = entrada.next().charAt(0);
		
		
		switch (operacao) {

			case '+':
				System.out.println(num1 + num2);
				break;
			case '-':
				System.out.println(num1 - num2);
				break;
			case '*':
				System.out.println(num1 * num2);
				break;
			case '/':
				System.out.println(num1 / num2);
				break;
		}
		
	}

}
