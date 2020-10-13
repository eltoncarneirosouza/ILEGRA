package com.ilegra.desafio.entity;

public class Vendedor {
	private String identificador;
	private String cpf;
	private String nome;
	private double salario;

	public Vendedor(String identificador, String cpf, String nome, double salario) {
		this.identificador = identificador;
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return identificador+"Ç"+cpf+"Ç"+nome+"Ç"+salario;
	}

}
