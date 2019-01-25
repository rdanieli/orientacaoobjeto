package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Transferencia {
	
	private Integer id;
	private Conta contaOrigem;
	private Conta contaDestino;
	private Double valor;
	private String tipo;

	public Transferencia(Integer id, Conta contaOrigem, Conta contaDestino, Double valor, String tipo) {
		super();
		this.id = id;
		this.contaOrigem = contaOrigem;
		this.contaDestino = contaDestino;
		this.valor = valor;
		this.tipo = tipo;
	}

	public Transferencia() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Conta getContaOrigem() {
		return contaOrigem;
	}

	public void setContaOrigem(Conta contaOrigem) {
		this.contaOrigem = contaOrigem;
	}

	public Conta getContaDestino() {
		return contaDestino;
	}

	public void setContaDestino(Conta contaDestino) {
		this.contaDestino = contaDestino;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void transferir() {
		// TODO Auto-generated method stub
		
	}

	public void exibirDados() {
		// TODO Auto-generated method stub
		
	}
	
}
