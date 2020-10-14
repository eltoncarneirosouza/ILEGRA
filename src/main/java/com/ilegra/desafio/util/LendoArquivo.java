package com.ilegra.desafio.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class LendoArquivo {
	private String path;

	public LendoArquivo() {

	}

	public LendoArquivo(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Set<String> visualizarDiretorio() {
		Set<String> lista = new HashSet<String>();
		String dir = System.getProperty("user.home") + "/Downloads/";
		File file = new File(dir);
		File afile[] = file.listFiles();
		int i = 0;
		for (int j = afile.length; i < j; i++) {
			File arquivos = afile[i];
			lista.add(dir + arquivos.getName());
		}
		return lista;
	}

	public void leitura() throws Exception {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (true) {
			if (linha != null) {
				String[] quebra = linha.split("Ç");
				for (String string : quebra) {
					System.out.println(string);
				}

			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
	}
}
