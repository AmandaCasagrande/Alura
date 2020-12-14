package teste.base;

import infra.DAO;
import modelo.base.Produto;

public class novoProduto {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto("Monitor 23", 789.98);
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		dao.incluirAtomico(produto).fechar();
		
		System.out.println("ID do produto: " + produto.getId());
	}

}
