package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
//		Neste problema, deve-se ler o nome de uma peça que chamaremos de peça1, o 
//		número de peças1 que o usuário quer, o valor unitário de cada peça1, o nome de uma 
//		peça2, o número de peças2 e o valor unitário de cada peça2. Após, calcule e mostre o 
//		valor a ser pago.

		
		Scanner entrada = new Scanner(System.in);
		
		// PEÇA 1
		System.out.print("Digite o nome da peca 1: ");
		String nomePeca1 = entrada.nextLine();
		
		System.out.print("Escolha a qtd de pecas 1: ");
		int qtdPecas1 = Integer.parseInt(entrada.nextLine());
		
		System.out.print("Valor unitario de cada peca 1: ");
		double valorPeca1 = Double.parseDouble(entrada.nextLine());
		
		System.out.println(" ");
		
		// PEÇA 2
		System.out.print("Digite o nome da peca 2: ");
		String nomePeca2 = entrada.nextLine();
		
		System.out.print("Escolha a qtd de pecas 2: ");
		int qtdPecas2 = Integer.parseInt(entrada.nextLine());
		
		System.out.print("Valor unitario de cada peca 2: ");
		double valorPeca2 = Double.parseDouble(entrada.nextLine());
		
		double valorPago1 = qtdPecas1 * valorPeca1;
		double valorPago2 = qtdPecas2 * valorPeca2;
		
		double valorTotal = valorPago1 + valorPago2;
		
		System.out.println(" ");
		System.out.printf("Valor a ser pago pela %s: %.2f \n",nomePeca1,  valorPago1);
		System.out.printf("Valor a ser pago pela %s: %.2f \n",nomePeca2, valorPago2);
		System.out.printf("Valor total a ser pago: %.2f", valorTotal);
		
		
	}

}
