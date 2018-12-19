package br.ce.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ce.cobranca.services.HibernateUtil;

public class TestConnection {
	
	@Test
	public void tesConexao() {
		assertEquals(HibernateUtil.getSessionFactory().equals(null), null);		
	}
}
