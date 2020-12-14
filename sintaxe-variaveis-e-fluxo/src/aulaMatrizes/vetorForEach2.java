package aulaMatrizes;

import java.util.Arrays;

public class vetorForEach2 {
	//Vetor em ordem:
	public static void main(String[] args) {
		double v[] = {3.5, 2.75, 9, -4.5};
		Arrays.sort(v);
		for (double valor: v) {
			System.out.print(valor + " ");
		}
	}
}
