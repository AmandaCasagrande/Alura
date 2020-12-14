package GettersSetters;

public class TestaGetSet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		Cliente titularConta = conta.getTitular();
		titularConta.setProfissao("Programador");
		
		System.out.println(titularConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
	}
}
