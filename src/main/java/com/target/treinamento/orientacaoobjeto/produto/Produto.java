package com.target.treinamento.orientacaoobjeto.produto;

public class Produto {
	
	private Codigo codigo;
	
	private String descricao;
	
	private Integer quantidade;
	
	
	public Produto(String descricao, Integer quantidade) {
		super();
		this.descricao = descricao;
		this.quantidade = quantidade;
	}
	
	public Produto(Codigo codigo, String descricao, Integer quantidade) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}



	public Codigo getCodigo() {
		return codigo;
	}

	public void setCodigo(Codigo codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", quantidade=" + quantidade + "]";
	}
}
