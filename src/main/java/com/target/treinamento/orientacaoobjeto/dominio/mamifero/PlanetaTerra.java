package com.target.treinamento.orientacaoobjeto.dominio.mamifero;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlanetaTerra {

	public static void main(String[] args) {
		PlanetaTerra pt = new PlanetaTerra();
		pt.inicializa(1);
	}
	
	public void inicializa(Integer operacao) {
		Mamifero mamifero;
		
		if(operacao == 1) {
			mamifero = new Leao();
		} else {
			mamifero = new Golfinho();
		}
		
	}
	
}
