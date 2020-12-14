package curso1;

public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade = 16;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos.");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você está acompanhado, pode entrar.");
			} else {
				System.out.println("Não é permitido sua entrada.");
			}
		}
	}
}
