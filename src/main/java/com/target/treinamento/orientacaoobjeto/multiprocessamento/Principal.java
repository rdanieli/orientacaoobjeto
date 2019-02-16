package com.target.treinamento.orientacaoobjeto.multiprocessamento;

import com.target.treinamento.orientacaoobjeto.abstracao.Funcionario;

public class Principal {
	
	class Dado {
		int valor;
		public Dado(int i) {
			this.valor = i;
		}

		public void exibir(String mensagem) {
			soma += valor;
		}
	}
	
	
	class ThreadExemplo extends Thread {
		String str;
		Dado dado;
		public ThreadExemplo(Dado dado, String str) {
			this.dado = dado;
			this.str = str;	
			start();
		}
		
		@Override
		public void run() {
			synchronized (dado) {
				dado.exibir(str);
			}		
		}
	}
		
	public static void main(String[] args) {
		new Principal().reflections();
	}

	int soma; 
	
	private void inicializa() {
		ThreadExemplo t1 = new ThreadExemplo(new Dado(1), "Olá");
		ThreadExemplo t2 = new ThreadExemplo(new Dado(2), "Meu");
		ThreadExemplo t3 = new ThreadExemplo(new Dado(3), "Mundo");
		ThreadExemplo t4 = new ThreadExemplo(new Dado(4), "Mundo");
		ThreadExemplo t5 = new ThreadExemplo(new Dado(5), "Mundo");
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(soma);
	}
	
	private void reflections() {
		try {
			Funcionario funcionario = (Funcionario) Class.forName("com.target.treinamento.orientacaoobjeto.abstracao.Gerente").newInstance();
			
			System.out.println(funcionario);
			
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
