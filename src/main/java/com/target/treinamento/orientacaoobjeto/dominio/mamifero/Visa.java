package com.target.treinamento.orientacaoobjeto.dominio.mamifero;

public class Visa implements Cartao {

	public void debito(Double valor) {
		System.out.println("Utilizando o cartão Visa pagando no débito R$"+valor );
	}

	public void credito(Double valor) {
		System.out.println("Utilizando o cartão Visa pagando no crédito R$"+valor );
	}

	

}
