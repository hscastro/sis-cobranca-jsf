package br.ce.cobranca.factory;

import java.util.List;

import br.ce.cobranca.dao.Contas;
import br.ce.cobranca.hibernate.ContaDAOHibernate;
import br.ce.cobranca.model.Conta;

public class DAOContaFactory {	

	private static Contas<Conta> contas = new ContaDAOHibernate();	
	
	
	public static boolean salvar(Conta conta) {
		return contas.salvar(conta);
	}
	
	public static boolean excluir(Conta conta) {
		return contas.excluir(conta);
	}
	
	public static List<Conta> listar() {
		return contas.listar();
	}
	
}
