package logica.aulas.aula05;

public class OperadoresLogicos {

	public static void main(String[] args) {
	
		boolean verificaSenha = true;
		boolean verificaEmail = true;
		
		boolean logicaE = verificaEmail && verificaSenha;
		System.out.println(logicaE);
		
		boolean logicaOU = true || false;
		System.out.println(logicaOU);
		
		boolean negacao = !true;
		System.out.println(negacao);
		
		System.out.println(" ");
		// OPERADORES DE STRINGS
		
		String nome1 = "Joana";
		String nome2 = "Joanaa";
		String nome3 = new String("Joana");
		
		System.out.println(nome1 == nome3);
		System.out.println(nome1.equals(nome3));
		
	}

}
