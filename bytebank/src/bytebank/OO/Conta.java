package bytebank.OO;

public class Conta {
	//atributos de um objeto:
	double saldo;
	int agencia, numero;
	String titular;
	
	//m�todo sem retorno:
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	//m�todo com retorno:
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

}
