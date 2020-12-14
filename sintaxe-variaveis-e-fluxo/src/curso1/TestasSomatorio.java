package curso1;

public class TestasSomatorio {
	
	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		
		while (contador <= 10) {
			total += contador;
			contador ++;
		}
		System.out.println(total);
	}
}
