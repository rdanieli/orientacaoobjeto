package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Principal {
	public static void main(String[] args) {
		String entrada = "visa";
		
		//Taxas.
		
		System.out.println(	Taxas.VISA.getNome() );
		System.out.println( Taxas.VISA.getValorTaxa() );
		System.out.println( Taxas.VISA.getCofins() );
	}
}
