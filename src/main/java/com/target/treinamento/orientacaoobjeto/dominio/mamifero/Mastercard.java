package com.target.treinamento.orientacaoobjeto.dominio.mamifero;

import com.target.treinamento.orientacaoobjeto.dominio.banco.Taxas;

public class Mastercard implements Cartao { //OPÇÃO

	public Double debito(Double valor) {
		System.out.println("Utilizando o cartão Mastercard pagando no débito R$"+valor );
		
		return valor - (Taxas.MASTER.getValorTaxa() * valor) - (valor * Taxas.MASTER.getCofins());
	}

	public Double credito(Double valor) {
		System.out.println("Utilizando o cartão Mastercard pagando no crédito R$"+valor );
		
		return valor - (Taxas.MASTER.getValorTaxa() * valor) - (valor * Taxas.MASTER.getCofins());
	}

}
