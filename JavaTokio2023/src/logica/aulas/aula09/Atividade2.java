package logica.aulas.aula09;

public class Atividade2 {
	public static void main(String[] args) {
		
		int[][] matriz = new int[4][5];
		
		int qtdLinhas = matriz.length;
		int qtdColunas = matriz[3].length;
		
		System.out.println("linhas: " + qtdLinhas);
		System.out.println("colunas: " + qtdColunas);
		
		
		for (int i = 0; i < qtdLinhas; i ++) {
			for (int j = 0; j < qtdColunas; j++) {
				matriz[i][j] = 5;
			}
		}
		
		for (int i = 0; i < qtdLinhas; i ++) {
			for (int j = 0; j < qtdColunas; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
