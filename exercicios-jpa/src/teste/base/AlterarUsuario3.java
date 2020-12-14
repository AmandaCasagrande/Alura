package teste.base;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.base.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		//Atualização no Banco de Dados;
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 3L);
		em.detach(usuario);
		usuario.setNome("Leonardo Leitão");
		
		em.merge(usuario);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}
}
