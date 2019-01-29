package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Pessoa {
	private String nome;
	private String rg;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String rg) {
		super();
		this.nome = nome;
		this.rg = rg;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Pessoa novaPessoa = new Pessoa(this.nome, this.rg);
		return novaPessoa;
	}
}
