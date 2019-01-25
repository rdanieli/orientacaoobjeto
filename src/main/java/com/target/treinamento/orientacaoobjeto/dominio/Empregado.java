package com.target.treinamento.orientacaoobjeto.dominio;

public class Empregado {
	private String nome;
	private String cargo;
	private Double salario;

	public Empregado(String nome, String cargo, Double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.setSalario(salario);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		
		if("Gerente".equals(this.cargo)) {
		
			Double valorReajuste = salario * 0.1;
			
			this.salario = salario + valorReajuste;
			
		} else {
			
			this.salario = salario;
			
		}
	}
}
