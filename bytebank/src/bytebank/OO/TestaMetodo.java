package bytebank.OO;

public class TestaMetodo {
	
	public static void main(String[] args) {
		//Invocação de métodos:
		Conta contaPaulo = new Conta();
		contaPaulo.saldo = 100;
		contaPaulo.deposita(50);
		System.out.println(contaPaulo.saldo);
		
		boolean conseguiuRetirar = contaPaulo.saca(20); 
		System.out.println(contaPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		boolean sucessoTransferencia = contaMarcela.transfere(300, contaPaulo);
		if (sucessoTransferencia) {
			System.out.println("Tranferência feita com sucesso!");
		} else {
			System.out.println("Faltou dinheiro.");
		}
		System.out.println(contaMarcela.saldo);
		System.out.println(contaPaulo.saldo);
		
		contaPaulo.titular = "Paulo Silveira";
		System.out.println("Titular: " + contaPaulo.titular);
	}

}
