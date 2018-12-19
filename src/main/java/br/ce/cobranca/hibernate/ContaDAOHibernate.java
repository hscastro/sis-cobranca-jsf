package br.ce.cobranca.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import br.ce.cobranca.dao.Contas;
import br.ce.cobranca.model.Conta;
import br.ce.cobranca.services.HibernateUtil;

public class ContaDAOHibernate implements Contas<Conta> {
	
	private Session session = null;
	
	public ContaDAOHibernate() {
		this.session = HibernateUtil.getSessionFactory().openSession();
	}

	@Override
	public boolean salvar(Conta conta) {
		try {
			if(conta instanceof Conta) {				
				session.getTransaction().begin();
				session.save(conta);
				session.getTransaction().commit();
				
				return true;			
			}			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean excluir(Conta conta) {
		try {
			if(conta instanceof Conta) {
				session.getTransaction().begin();				
				session.delete(conta);
				session.getTransaction().commit();				
				return true;			
			}			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;	
	}

	@Override
	public Conta buscar(Conta conta) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Conta> listar() {		
		List<Conta> contas = null;
		Query query = null;
		session.getTransaction().begin();
		query = session.createQuery("From Conta");
		contas = query.list();
		session.getTransaction().commit();
		return  contas;
	}

}
