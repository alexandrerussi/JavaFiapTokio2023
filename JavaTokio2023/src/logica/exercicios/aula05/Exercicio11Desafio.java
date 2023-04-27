package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio11Desafio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idadeEmDias = entrada.nextInt();
		
		// 8732 dias
		// 23 anos
		// 11 meses
		// 7 dias
		
		int anos = (int) idadeEmDias / 365;
		System.out.println("Idade em anos: " + anos);
		
		int restoDias = idadeEmDias % 365;
		
		int meses = (int) restoDias / 30;
		System.out.println("Idade em meses: " + meses);
		
		int dias = restoDias % 30;
		System.out.println("Idade em dias: " + dias);
		
		entrada.close();
		
	}

}
