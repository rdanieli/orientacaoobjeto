package com.target.treinamento.orientacaoobjeto.produto;

public class Codigo<T> {
	
	private T identificador;

	public Codigo(T identificador) {
		super();
		this.identificador = identificador;
	}

	public T getIdentificador() {
		return identificador;
	}

	public void setIdentificador(T identificador) {
		this.identificador = identificador;
	}

	@Override
	public String toString() {
		return "Codigo [identificador=" + identificador + "]";
	}
	
	@Override
	public boolean equals(Object arg0) {
		return identificador.equals(arg0);
	}
}
