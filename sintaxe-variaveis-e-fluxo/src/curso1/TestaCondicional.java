package curso1;

public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade = 16;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos.");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voc� est� acompanhado, pode entrar.");
			} else {
				System.out.println("N�o � permitido sua entrada.");
			}
		}
	}
}
