package com.target.treinamento.collecations;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.target.treinamento.orientacaoobjeto.dominio.banco.MeuDado;
import com.target.treinamento.orientacaoobjeto.dominio.mamifero.Cartao;
import com.target.treinamento.orientacaoobjeto.dominio.mamifero.Mastercard;
import com.target.treinamento.orientacaoobjeto.dominio.mamifero.Visa;

public class Principal {
	
	public static void main(String[] args) {
		
		Integer[] array = new Integer[] {
				15,-25,12,9,20,45,19,74,-45,0,0,0,1,22,1,2
		};
		
		List<Integer> minhaLista = Arrays.asList(array);
		
		//Reverter
		Collections.reverse(minhaLista);
		
		System.out.println(minhaLista);
		
		//Duplicar
		List<Integer> minhaNovaLista = new ArrayList<Integer>(minhaLista);
		
		System.out.println(minhaNovaLista);
		
		//Orderar
		Collections.sort(minhaNovaLista);
		
		System.out.println(minhaNovaLista);
		
		//Obtem item na posição 10
		System.out.println(minhaNovaLista.get(10));
				
		//LinkedList
		LinkedList<Integer> linkedList = new LinkedList<Integer>(minhaNovaLista);
		
		Iterator<Integer> iterator = linkedList.descendingIterator();
		
		while(iterator.hasNext()) {
			Integer elemento = iterator.next();
			
			System.out.print(elemento + ",");
		}
		
		
		List<MeuNovoDado<String>> dados = new ArrayList<MeuNovoDado<String>>();
		
		
		
		dados.add(new MeuNovoDado<String>());
		
		dados.get(0).comunica();
//		for (Cartao cartao : dados) {
//			cartao.credito(22.5);
//		}
		
		
		
	}
	
	
	public static class MeuNovoDado<T> extends MeuDado<T> implements Cartao {
		
		public void comunica() {
			
		}

		public Double debito(Double valor) {
			// TODO Auto-generated method stub
			return null;
		}

		public Double credito(Double valor) {
			// TODO Auto-generated method stub
			return null;
		}
	}
}
