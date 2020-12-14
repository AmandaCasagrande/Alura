package teste.base;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.base.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager(); //CRUD
		
		Usuario usuario = em.find(Usuario.class, 1L);
		System.out.println(usuario.getNome());
		
		em.close();
		emf.close();
	}
}
