package com.target.treinamento.orientacaoobjeto.dominio;

import java.util.List;

//Objeto - Plain Java Old Object
public class Turma {

	//Atributos da classe
	private String nome;

	public Turma() {
		nome = "Juliano";
	}
	
	public Turma(String nome) {
		
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
