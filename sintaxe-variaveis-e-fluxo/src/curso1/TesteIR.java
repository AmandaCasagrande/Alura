package curso1;

public class TesteIR {

	public static void main(String[] args) {
		
		double salario = 3300.0;
		double novoSalario;
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("IR � 7.5%");
			novoSalario = salario - 142;
			System.out.println("Novo sal�rio: " + novoSalario);
		}
		
		if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("IR � 15%");
			novoSalario = salario - 350;
			System.out.println("Novo sal�rio: " + novoSalario);
		}
		
		if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("IR � 22.5%");
			novoSalario = salario - 636;
			System.out.println("Novo sal�rio: " + novoSalario);
		}
	}
}
