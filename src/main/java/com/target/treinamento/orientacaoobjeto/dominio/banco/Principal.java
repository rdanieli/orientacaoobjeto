package com.target.treinamento.orientacaoobjeto.dominio.banco;

import java.io.FileNotFoundException;
import java.util.Scanner;

import com.target.treinamento.orientacaoobjeto.dominio.mamifero.Cartao;
import com.target.treinamento.orientacaoobjeto.dominio.mamifero.Mastercard;
import com.target.treinamento.orientacaoobjeto.dominio.mamifero.Visa;

public class Principal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String entradaUsuario = scanner.next();
		
		try {
			Integer a = Integer.valueOf("5");
			
			Integer b = Integer.valueOf(entradaUsuario);
	
			System.out.println(a / b);
		} catch(NumberFormatException e) {
			System.out.println("Meu amigo, você informou um valor inválido, entre somente com números inteiros");
		} catch (ArithmeticException exception) {
			System.out.println("não foi possível efetuar o calculo");
		}
		
	}
	
	public void meuMetodoComExcecaoChecado(Double value) throws FileNotFoundException {
		throw new FileNotFoundException("Este arquivo não foi encontrado");
	}
	
	public void meuMetodoSemChecar() {
		throw new IllegalArgumentException("Este arquivo não foi encontrado");
	}
}
