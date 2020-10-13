package com.ilegra.desafio.simula;

import com.ilegra.desafio.entity.Cliente;
import com.ilegra.desafio.entity.Vendedor;
import com.ilegra.desafio.util.GeradorDeTexto;

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
	}

}
