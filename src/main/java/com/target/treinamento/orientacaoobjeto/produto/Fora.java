package com.target.treinamento.orientacaoobjeto.produto;

import com.target.treinamento.orientacaoobjeto.dominio.banco.Pessoa;

interface MinhaInterface {
	void foo();
}

public class Fora {

	static MinhaInterface minhaInterface = new MinhaInterface() {
		
		public void foo() {
			System.out.println("Minha Classe Anonima");
		}
	}; 
	
	
	Pessoa pessoa = new Pessoa() {
		@Override
		public String toString() {
			return "meu novo to string";
		};
		
		{
			nome = "Pedro";
		}
		
	};
	
	
	
	interface MinhaNovaInterface {
		void foo();
	}
	
	public void foo() {
		
	}
	
	public static class Dentro {
		private void foo() {
			
		}
		public static class MaisDentro {
			private void foo() {
				
			}
			public class Dentro2 {
				private void foo() {
					
				}
				class Dentro34 {
					private void foo() {
						
					}
				}
			}
		}
	}
	
}
