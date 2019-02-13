package com.target.treinamento.orientacaoobjeto.produto;

public interface Busca {
	
	<T> Produto buscarPorCodigo(T id);
}
