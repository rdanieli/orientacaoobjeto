package com.target.treinamento.orientacaoobjeto.abstracao;

public class ControleBonificacao {
	
	private Double totalEmBonificacoes = 0.0;
	
	public void registra(Funcionario funcionario) {
		this.totalEmBonificacoes += funcionario.getValorTotalFuncionarioComBonificacao();
	}
	
	public Double getTotalEmBonificacoes() {
		return this.totalEmBonificacoes;
	}
}
