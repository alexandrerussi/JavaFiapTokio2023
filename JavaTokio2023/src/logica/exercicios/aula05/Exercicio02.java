package logica.exercicios.aula05;

public class Exercicio02 {

	public static void main(String[] args) {

//		▪ Elabore um programa que declare um número inteiro, float e double.
//		▪ Atribua valores à essas 3 variáveis.
//		▪ Exiba no terminal os 3 valores como números.
//		▪ Agora, converta esses 3 números para String e exiba novamente
		
		int numInt = 2;
		float numFloat = 2.5f;
		double numDouble = 5.0;
		
		System.out.printf("%d %.2f %.2f \n", numInt, numFloat, numDouble);
		
		String numIntStr = Integer.toString(numInt);
		String numFloatStr = Float.toString(numFloat);
		String numDoubleStr = Double.toString(numDouble);
		
		System.out.printf("%s %s %s", numIntStr, numFloatStr, numDoubleStr);

	}

}
