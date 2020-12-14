package objetos;

public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "111.111.111-11";
		paulo.profissao = "Programador";
		
		Conta contaPaulo = new Conta();
		contaPaulo.deposita(100);
		
		// Associa o cliente Paulo a conta contaPaulo;
		contaPaulo.titular = paulo;
		System.out.println(contaPaulo.titular.nome);
		
	}
}
