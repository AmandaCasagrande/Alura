

public abstract class Conta {
	//atributos de um objeto:
	protected double saldo;
	private int agencia, numero;
	private Cliente titular;
	private static int total; // static: da classe;
	
	//construtor - rotina de inicializa��o:
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de contas � " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando uma conta " + this.numero);
	}
	
	//m�todo sem retorno:
	public abstract void deposita(double valor);
	
	//m�todo com retorno:
	public void saca(double valor) throws SaldoInsuficienteException{
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + "," + " Valor: " + valor);
		}
		this.saldo -= valor;
	}
	
	//M�todo:
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
		this.saca (valor);
		destino.deposita(valor);
	}
	
	//Getter:
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int novoNumero) {
		if (numero <= 0) {
			System.out.println("N�o pode valor negativo.");
			return;
		}
		this.numero = novoNumero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("N�o pode valor negativo.");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
}
