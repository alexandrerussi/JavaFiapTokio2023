package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double notaA = sc.nextDouble();
		double notaB = sc.nextDouble();
		
		double mediaPond = (notaA * 0.4) + (notaB * 0.6);
		
		System.out.println("Media pond: " + mediaPond);
		
	}

}
