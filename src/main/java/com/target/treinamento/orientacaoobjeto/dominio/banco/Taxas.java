package com.target.treinamento.orientacaoobjeto.dominio.banco;

public enum Taxas {
	VISA(1, "Visa", 0.05, 0.001),
	MASTER_CARD(2, "Master Card", 0.1, 0.002);
	
	private Integer codigo;
	private String nome;
	private Double valorTaxa; 
	private Double cofins;
	
	Taxas(Integer codigo, String nome, Double valorTaxa, Double cofins){
		this.codigo = codigo;
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
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public static Taxas valueOf(Integer codigo) {
		for(Taxas taxa : Taxas.values()) {
			if(codigo.equals(taxa.getCodigo())) {
				return taxa;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		return "[nome:"+this.nome+"] [taxa:"+this.valorTaxa+"] [cofins:"+this.cofins+"]";
	}
}
