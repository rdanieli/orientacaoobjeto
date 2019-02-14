package com.target.treinamento.orientacaoobjeto.abstracao;

public abstract class Funcionario {
	private Double bonificacao = 1.2;
	
	//opcional a sobreescrita
	public Double getBonificacao() {
		return bonificacao;
	}
	
	//Obrigatório a implementação
	public abstract Double getSalario();
	
	public Double getValorTotalFuncionarioComBonificacao() {
		return getSalario() * getBonificacao();
	}
}	
