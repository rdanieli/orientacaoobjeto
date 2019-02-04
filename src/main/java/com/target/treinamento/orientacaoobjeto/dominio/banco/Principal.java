package com.target.treinamento.orientacaoobjeto.dominio.banco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

import com.target.treinamento.orientacaoobjeto.dominio.mamifero.Cartao;
import com.target.treinamento.orientacaoobjeto.dominio.mamifero.Mastercard;
import com.target.treinamento.orientacaoobjeto.dominio.mamifero.Visa;

public class Principal {
	public static void main(String[] args) {

		try {
			new Principal().inicializa();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void inicializa() throws IOException {
		List<String> list = lerArquivo();
		List<Transacao> transacaoes = new ArrayList<Transacao>();

		for (String linha : list) {

			String[] linhaQuebrada = linha.split(";");

			Transacao transacao = new Transacao();

			transacao.setBandeira(linhaQuebrada[0]);
			transacao.setOperacao(Integer.valueOf(linhaQuebrada[1]));
			transacao.setValor(Double.valueOf(linhaQuebrada[2]));
			transacao.setNomeCliente(linhaQuebrada[3]);

			transacaoes.add(transacao);
		}

		processaTransacoes(transacaoes);
	}

	private void processaTransacoes(List<Transacao> transacaoes) throws IOException {

		BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/instrutor/saidaTransacoes.txt", false));

		NumberFormat format = DecimalFormat.getInstance(Locale.US);
		format.setMinimumFractionDigits(2);
		format.setMaximumFractionDigits(2);

		// interação sobre todas as transações
		for (Transacao transacao : transacaoes) {

			// Utilizo o valueOf para obter o Enum, baseado no nome da bandeira
			Taxas meuEnum = Taxas.valueOf(transacao.getBandeira().toUpperCase());

			// Obtenho o cartão selecionado baseado na informação do arquivo
			Cartao cartao = meuEnum.getCartao();

			Double novoValor = 0.0;

			// Verifico qual a operação o usuário selecionou
			if (transacao.getOperacao() == 1) {

				// Executo a chamada da interface débito, passando o valor
				novoValor = cartao.debito(transacao.getValor());

			} else if (transacao.getOperacao() == 2) {

				// Executo a chamada da interface crédito, passando o valor
				novoValor = cartao.credito(transacao.getValor());

			}

			writer.append(meuEnum.getNome())
					.append(";")
					.append(transacao.getOperacao().toString())
					.append(";")
					.append(format.format(novoValor))
					.append(";")
					.append(transacao.getNomeCliente());

			writer.newLine();
		}

		writer.flush();
		writer.close();
	}

	private List<String> lerArquivo() throws IOException {
		InputStream inputStream = new FileInputStream("C:/Users/instrutor/transacoes.txt");

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

		List<String> minhasLinhas = new ArrayList<String>();

		while (true) {
			String linha = bufferedReader.readLine();
			if (linha != null) {
				minhasLinhas.add(linha);
			} else {
				break;
			}
		}

		return minhasLinhas;
	}
}
