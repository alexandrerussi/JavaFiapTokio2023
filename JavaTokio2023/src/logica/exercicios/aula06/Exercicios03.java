package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicios03 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double notaA = entrada.nextDouble();
		double notaB = entrada.nextDouble();
		double notaC = entrada.nextDouble();
		double notaD = entrada.nextDouble();
		
		double media = (notaA + notaB + notaC + notaD) / 4;
		
		System.out.println("Media: " + media);
		
		if (media >= 7) {
			System.out.println("Aprovado");
		} else if (media >= 5 && media < 7) {
			System.out.println("Recuperacao");
		} else {
			System.out.println("Reprovado");
		}
		
	}

}
