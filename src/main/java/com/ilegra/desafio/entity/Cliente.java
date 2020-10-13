package com.ilegra.desafio.entity;

public class Cliente {
	private String identificador;
	private String cnpj;
	private String nome;
	private String areaNegogio;

	public Cliente(String identificador, String cnpj, String nome, String areaNegogio) {
		this.identificador = identificador;
		this.cnpj = cnpj;
		this.nome = nome;
		this.areaNegogio = areaNegogio;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAreaNegogio() {
		return areaNegogio;
	}

	public void setAreaNegogio(String areaNegogio) {
		this.areaNegogio = areaNegogio;
	}

	@Override
	public String toString() {
		return this.identificador+"Ç"+this.cnpj+"Ç"+this.nome+"Ç"+this.areaNegogio;
	}

}
