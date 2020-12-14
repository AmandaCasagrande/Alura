
public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente nico = new Gerente();
		nico.setNome("Nico");
		nico.setCpf("00.000.111");
		nico.setSalario(2598.0);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}

}
