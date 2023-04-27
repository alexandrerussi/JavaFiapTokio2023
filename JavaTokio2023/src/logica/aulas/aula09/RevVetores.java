package logica.aulas.aula09;

public class RevVetores {

	public static void main(String[] args) {
		
		int[] numeros = {10, 20, 5, 3};
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Pos: %d -- Valor: %d\n", i, numeros[i]);
		}
		
		// UM FOR UM POUQUINHO DIFERENTE.....
		
		for (int num: numeros) {
			if (num != 20) {
				System.out.println(num);
			}
		}
		
	}

}
