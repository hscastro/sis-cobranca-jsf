package br.ce.cobranca.services;

import org.hibernate.cfg.*;
import org.hibernate.SessionFactory;


public class HibernateUtil {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();

	@SuppressWarnings("deprecation")
	private static SessionFactory buildSessionFactory() {
		
		try {			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");		
			//System.out.println("Conectado!");
			return cfg.buildSessionFactory();	
			
		}catch(Throwable t) {
			System.out.println("A criação da conexão falhou!");
		}		
		
		return null;
	}
	
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
