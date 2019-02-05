package com.target.treinamento.collecations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

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
		
	}
}
