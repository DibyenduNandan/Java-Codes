package utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
	
	public static EntityManager connectWithDB() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("PU");
		EntityManager em= emf.createEntityManager();
		System.out.println("Entity Manager Created"+" "+emf);
		return em;
	}

}
