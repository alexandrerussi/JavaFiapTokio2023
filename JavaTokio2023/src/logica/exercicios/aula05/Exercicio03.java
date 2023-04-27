package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Selecione seu genero da seguinte forma:");
		System.out.println("[M] - Masculino");
		System.out.println("[F] - Feminino");
		System.out.println("[O] - Outro");
		System.out.println("[N] - Não responder");
		
		char genero = sc.nextLine().charAt(0);
		
		System.out.printf("Olá, %s! Você escolheu a seguinte opção de gênero: %s", nome, genero);
		
	}

}
