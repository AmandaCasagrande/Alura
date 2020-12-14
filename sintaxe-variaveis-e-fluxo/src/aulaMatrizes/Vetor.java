package aulaMatrizes;

public class Vetor {
	
	public static void main(String[] args) {
		int n[] = new int[4];
		n[0] = 3;
		n[1] = 5;
		n[2] = 8;
		n[3] = 2;
		
		int m[] = {2, 5, 8, 2, 7, 9};
		System.out.println("Todas de casas de m: " + m.length);
		for (int c = 0; c <= m.length - 1; c++) {
			System.out.println("Na posição " + c + " temos o valor " + m[c] + " ");
		}
	}
}
