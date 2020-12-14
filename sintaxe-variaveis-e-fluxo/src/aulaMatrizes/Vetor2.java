package aulaMatrizes;

public class Vetor2 {
	
	public static void main(String[] args) {
		String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
				"Jul", "Ago", "Set", "Out", "Nov", "Dez"};
		int totalDias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int contador = 0; contador < mes.length; contador++) {
			System.out.println("O mês de " + mes[contador] + " tem " + 
					totalDias[contador] + " dias ao todo.");
				
		}
	}

}
