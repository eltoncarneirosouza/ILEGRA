package com.ilegra.desafio.entity;

public class Item {
	private long id;
	private String item;
	private long quantidade;

	public Item(long id, String item, long quantidade) {
		this.id = id;
		this.item = item;
		this.quantidade = quantidade;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(long quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", item=" + item + ", quantidade=" + quantidade + "]";
	}

}
