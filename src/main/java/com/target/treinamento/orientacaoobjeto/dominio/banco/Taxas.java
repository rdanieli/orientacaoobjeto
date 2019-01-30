package com.target.treinamento.orientacaoobjeto.dominio.banco;

public enum Taxas {
	VISA("Visa", 0.05, 0.001),
	MASTER_CARD("Master Card", 0.1, 0.002);
	
	
	private String nome;
	private Double valorTaxa; 
	private Double cofins;
	
	Taxas(String nome, Double valorTaxa, Double cofins){
		this.nome = nome;
		this.valorTaxa = valorTaxa;
		this.cofins = cofins;
	}

	public String getNome() {
		return nome;
	}

	public Double getValorTaxa() {
		return valorTaxa;
	}

	public Double getCofins() {
		return cofins;
	}
}
