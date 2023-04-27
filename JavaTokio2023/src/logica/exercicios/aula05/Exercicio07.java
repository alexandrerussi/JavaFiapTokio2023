package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double valorProduto = entrada.nextDouble();
		double valorPago = entrada.nextDouble();
		
		double troco = valorPago - valorProduto;
		
		System.out.println("o troco e de: " + troco);
		
	}

}
