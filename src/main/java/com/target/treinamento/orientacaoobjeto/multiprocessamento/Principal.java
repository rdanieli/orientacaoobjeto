package com.target.treinamento.orientacaoobjeto.multiprocessamento;

public class Principal {
	
	class Dado {
		public synchronized void exibir(String mensagem) {
			System.out.print("["+mensagem);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			System.out.println("]");
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
			dado.exibir(str);		
		}
	}
		
	public static void main(String[] args) {
		new Principal().inicializa();
	}

	private void inicializa() {
		Dado dado = new Dado();
		
		ThreadExemplo t1 = new ThreadExemplo(dado, "Olá");
		ThreadExemplo t2 = new ThreadExemplo(dado, "Meu");
		ThreadExemplo t3 = new ThreadExemplo(dado, "Mundo");
	}
}
