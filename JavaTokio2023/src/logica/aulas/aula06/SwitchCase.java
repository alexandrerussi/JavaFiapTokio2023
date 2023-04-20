package logica.aulas.aula06;

public class SwitchCase {

	public static void main(String[] args) {

		int escolhaDoUsuario = 0;
		
		switch (escolhaDoUsuario) {
			case 0:
				System.out.println("Sair do programa");
				break;
			case 1:
				System.out.println("Entrar no programa");
				break;
			default:
				System.out.println("Erro");
		}
		
	}

}
