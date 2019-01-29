package com.target.treinamento.orientacaoobjeto.dominio.mamifero;

import java.util.Scanner;

public class Pagamento {
	public static void main(String[] args) {
		Pagamento pgto = new Pagamento();
		pgto.inicializa();
	}

	private void inicializa() {
		System.out.println("Informe a bandeira desejada:");
		System.out.println("[1] - Visa");
		System.out.println("[2] - Mastercard");
		Integer bandeira = lerEntrada();
		
		Cartao cartao = null;
		
		if(bandeira == 1) {
			cartao = new Visa();
		} else if (bandeira == 2){
			cartao = new Mastercard();
		} else {
			System.out.println("Bandeira não aceita.");
		}
		
		if(cartao != null) {
			cartao.credito(1000d);
		}
		
	}
	
	private Integer lerEntrada() {
		return new Scanner(System.in).nextInt();
	}
	
}
