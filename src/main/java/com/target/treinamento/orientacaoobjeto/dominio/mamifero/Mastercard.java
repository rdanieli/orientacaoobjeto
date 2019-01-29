package com.target.treinamento.orientacaoobjeto.dominio.mamifero;

public class Mastercard implements Cartao { //OPÇÃO

	public void debito(Double valor) {
		System.out.println("Utilizando o cartão Mastercard pagando no débito R$"+valor );
		
	}

	public void credito(Double valor) {
		System.out.println("Utilizando o cartão Mastercard pagando no crédito R$"+valor );
		
	}

}
