package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
	
		//Leia 2 valores A e B, que correspondem a 2 notas de um aluno. A seguir calcule e 
		// informe a média ponderada do aluno
		
		Scanner sc = new Scanner(System.in);
		
		double notaA = sc.nextDouble();
		double notaB = sc.nextDouble();
		
		double media = (notaA + notaB) / 2;
		
		System.out.println("media: " + media);
			
	}

}
