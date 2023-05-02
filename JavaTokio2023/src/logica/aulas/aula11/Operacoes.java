package logica.aulas.aula11;

public class Operacoes {

	public static double somar(double a, double b) {
		return a + b;
	}
	
	public static double operacao(char op, double n1, double n2) {
		if (op == '+' ) {
			return somar(n1, n2);
		}
		return -1;
	}
	
}
