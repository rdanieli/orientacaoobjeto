package com.target.treinamento.orientacaoobjeto.abstracao;

public class ControleBonificacao {
	
	private Double totalEmBonificacoes = 0.0;
	
	public void registra(Funcionario funcionario) {
		totalEmBonificacoes += funcionario.getBonificacao() * funcionario.getSalario();
	}
	
	public Double getTotalEmBonificacoes() {
		return totalEmBonificacoes;
	}
}
