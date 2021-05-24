package br.com.carro;

public class Carro {
	
	private String Marca;
	private String Modelo;
	private int ano;
	private int qntPortas;
	
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getQntPortas() {
		return qntPortas;
	}
	public void setQntPortas(int qntPortas) {
		this.qntPortas = qntPortas;
	}
}
