package util;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			return new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Error Not create SesstionFactory");
			e.printStackTrace();
			return null;
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public static void shutdown(SessionFactory se) {
		try {
			if(se != null) {
				se.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
