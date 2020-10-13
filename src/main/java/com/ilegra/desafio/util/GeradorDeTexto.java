package com.ilegra.desafio.util;

import java.io.FileWriter;
import java.io.PrintWriter;

public class GeradorDeTexto {
	private String texto;
	private String nomeArquivo;

	public GeradorDeTexto(String texto, String nomeArquivo) {
		this.texto = texto;
		this.nomeArquivo = nomeArquivo;
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void gerandoArquivo() throws Exception {
		String dir = System.getProperty("user.home") + "/Downloads/" + this.nomeArquivo;
		FileWriter arquivo;
		arquivo = new FileWriter(dir);
		PrintWriter gravarArq = new PrintWriter(arquivo);
		gravarArq.printf(this.texto);
		arquivo.close();

	}
}
