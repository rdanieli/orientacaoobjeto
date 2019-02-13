package com.target.treinamento.orientacaoobjeto.produto;

import java.util.ArrayList;
import java.util.List;

public class ControleBusca implements Busca {

	List<Produto> produtos = new ArrayList<Produto>();
	
	public <T> Produto buscarPorCodigo(T id) {
		
		for (Produto produto : produtos) {

			if (produto.getCodigo().getIdentificador().equals(id)) {

				return produto;

			}
		}
		
		return null;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
