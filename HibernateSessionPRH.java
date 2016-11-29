package com.codiscope.jaks.triggers.java.hibr;
 
import javax.servlet.http.HttpServletRequest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionPRH {
	HttpServletRequest request = null;

	public void test() {
		Session session = null;
		try {
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();
			
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			session.close();
		} finally {
			session.close();
		}
	}
}
