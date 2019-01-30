package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Principal {
	public static void main(String[] args) {
		Integer entrada = 1;
		
		System.err.println(Taxas.valueOf(1).getCodigo());
		
		System.out.println(	Taxas.VISA.getNome() );
		System.out.println( Taxas.VISA.getValorTaxa() );
		System.out.println( Taxas.VISA.getCofins() );
	}
}
