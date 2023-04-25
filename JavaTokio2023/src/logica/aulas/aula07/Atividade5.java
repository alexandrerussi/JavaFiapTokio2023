package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		
		System.out.println("Digite a qtd de produtos");
		int qtdProdutos = tec.nextInt();
		
		for (int i = 1; i <= qtdProdutos; i++) {
			System.out.println("Produto " + i);
		}
		
	}

}
