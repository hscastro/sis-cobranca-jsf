package br.ce.cobranca.dao;

import java.util.List;

public interface Contas<E> {
	
	public abstract boolean salvar(E e);
	public abstract boolean excluir(E e);
	public abstract E buscar(E e);
	public abstract List<E> listar();
}
