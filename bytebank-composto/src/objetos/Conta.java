package objetos;

public class Conta {
	//atributos de um objeto:
	private double saldo;
	int agencia, numero;
	Cliente titular;
	
	//método sem retorno:
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	//método com retorno:
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
	
	//Getter:
	public double getSaldo() {
		return this.saldo;
	}

}
