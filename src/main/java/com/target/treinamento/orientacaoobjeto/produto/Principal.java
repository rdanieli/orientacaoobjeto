package com.target.treinamento.orientacaoobjeto.produto;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		
		List<Produto> produtos = criaListaDeProdutos();
				
		ControleBusca controleBusca = new ControleBusca();
		controleBusca.setProdutos(produtos);
		Produto p = controleBusca.buscarPorCodigo(854.51);
		Produto p1 = controleBusca.buscarPorCodigo(5544);
		System.out.println(String.format("%s -> %s", p.getDescricao(), p.getCodigo().getIdentificador()));
		System.out.println(String.format("%s -> %s", p1.getDescricao(), p1.getCodigo().getIdentificador()));
		System.out.println(controleBusca.buscarPorCodigo("MILK001").getDescricao());
		
	}

	private static List<Produto> criaListaDeProdutos() {
		Produto tv = new Produto(new Codigo<String>("CKM001F19"), "TV", 5);
		
		Produto radio = new Produto(new Codigo<String>("CKI0018F"), "Radio", 2);
		
		Produto monitor = new Produto(new Codigo<Integer>(12154), "Monitor", 1);
		
		Produto vc = new Produto(new Codigo<Integer>(5544), "VideoCassete", 2);
		
		Produto tcd = new Produto(new Codigo<Double>(121.54), "TocaCD", 7);
		
		Produto banana = new Produto("Banana", 8);
		banana.setCodigo(new Codigo<Double>(854.51));
		
		Produto leite = new Produto("Leite", 4);
		leite.setCodigo(new Codigo<String>("MILK001"));
		
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(tv);
		produtos.add(radio);
		produtos.add(monitor);
		produtos.add(vc);
		produtos.add(tcd);
		produtos.add(banana);
		produtos.add(leite);
		return produtos;
	}
}
