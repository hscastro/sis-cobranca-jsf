package br.ce.cobranca.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.ce.cobranca.factory.DAOContaFactory;
import br.ce.cobranca.model.Conta;

@ManagedBean(name = "contaBean")
@ViewScoped
public class ContaBean {
	
	private Conta conta = new Conta();
	
	private List<Conta> lista = new ArrayList<Conta>();
	
	public ContaBean() {
		lista = DAOContaFactory.listar();
	}

	
	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public String salvar() {
		DAOContaFactory.salvar(conta);
		this.conta = new Conta();		
		return "Conta salva com sucesso!";
	}

	public String excluir() {
		DAOContaFactory.excluir(this.conta);
		this.conta = new Conta();
		return "Conta excluída com sucesso!";
	}
	
	public List<Conta> getLista() {
		return lista;
	}
	
	
}
