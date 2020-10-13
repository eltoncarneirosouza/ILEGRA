package com.ilegra.desafio.entity;

import java.util.HashSet;
import java.util.Set;

public class Venda {
	private Integer venda;
	private Set<Item> item = new HashSet<Item>();
	private Vendedor vendedor;

	public Venda(Integer venda, Set<Item> item, Vendedor vendedor) {
		this.venda = venda;
		this.item = item;
		this.vendedor = vendedor;
	}

	public Integer getVenda() {
		return venda;
	}

	public void setVenda(Integer venda) {
		this.venda = venda;
	}

	public Set<Item> getItem() {
		return item;
	}

	public void setItem(Set<Item> item) {
		this.item = item;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

}
