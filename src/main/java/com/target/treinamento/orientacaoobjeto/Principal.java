package com.target.treinamento.orientacaoobjeto;

import com.target.treinamento.orientacaoobjeto.dominio.Empregado;
import com.target.treinamento.orientacaoobjeto.dominio.banco.Conta;
import com.target.treinamento.orientacaoobjeto.dominio.banco.Pessoa;
import com.target.treinamento.orientacaoobjeto.dominio.banco.Transferencia;

public class Principal {

	public static void main(String[] args) {
		
		Principal principal = new Principal();
		principal.inicializa();
		
		
	}

	private void inicializa() {
		
		Conta contaOrigem = new Conta();
		contaOrigem.setPessoa(new Pessoa("Alfredo", "654654"));
		contaOrigem.setSaldo(0.0);
		contaOrigem.setNumero(1716);
		
		Conta contaDestino = new Conta();
		contaDestino.setPessoa(new Pessoa("João", "12545544"));
		contaDestino.setSaldo(0.0);
		contaDestino.setNumero(1715);
		
		try {
			Conta minhaContaClonada = (Conta) contaOrigem.clone();

			System.out.println(contaOrigem.equals(minhaContaClonada));
			System.out.println(contaDestino.equals(minhaContaClonada));
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		
		
		Transferencia novaTransferencia = new Transferencia(1, contaOrigem, contaDestino, 100.0, "TEF");
		novaTransferencia.transferir();
		
		novaTransferencia.exibirDados();
		
	}
	
}
