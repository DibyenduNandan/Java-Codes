package utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Driver {

	public static  EntityManager getConnect() {


		EntityManagerFactory factory =Persistence.createEntityManagerFactory("PU");
		EntityManager em=factory.createEntityManager();
		return em;
	}

}
