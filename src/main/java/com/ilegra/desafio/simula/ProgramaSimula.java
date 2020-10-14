package com.ilegra.desafio.simula;

import java.util.HashSet;
import java.util.Set;

import com.ilegra.desafio.entity.Cliente;
import com.ilegra.desafio.entity.Vendedor;
import com.ilegra.desafio.util.GeradorDeTexto;
import com.ilegra.desafio.util.LendoArquivo;

public class ProgramaSimula {

	public static void main(String[] args) throws Exception {
		Vendedor vendedor = new Vendedor("001", "046.785.785.90", "Marcos Del Ponte", 5000.00);
		String texto = vendedor.toString();
		String arquivo = "vendedor.txt";
		GeradorDeTexto vendedorTexto = new GeradorDeTexto(texto, arquivo);
		vendedorTexto.gerandoArquivo();

		Cliente cliente = new Cliente("002", "13213213215216", "React SA", "Tecnologia");
		String textoCliente = cliente.toString();
		String arquivoCliente = "cliente.txt";
		GeradorDeTexto clienteTexto = new GeradorDeTexto(textoCliente, arquivoCliente);
		clienteTexto.gerandoArquivo();

		Set<String> arquivosLeitura = new HashSet<String>();
		LendoArquivo leitura = new LendoArquivo();
		Set<String> lista = leitura.visualizarDiretorio();
		lista.forEach(dados -> {
			String arquivos = dados.toString();
			if (arquivos.contains(".txt")) {
				arquivosLeitura.add(dados);
			}
		});

		arquivosLeitura.forEach(lendo -> {
			String path = lendo.toString();
			LendoArquivo leituraArquivo = new LendoArquivo(path);
			try {
				leituraArquivo.leitura();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

}
