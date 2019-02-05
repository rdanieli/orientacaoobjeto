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

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		return true;
	}
	
	
}
