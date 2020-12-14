package bytebank.OO;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Saldo: R$" + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Saldo: R$" + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("Saldo Segunda Conta: R$" + segundaConta.saldo);
		segundaConta.agencia = 3342;
		System.out.println("Agência Segunda Conta: " + segundaConta.agencia);
		
		
	}
}
