package br.com.senai.produto;

//CLASSE
public class Produto {
	
	//ATRIBUTOS
	private String nomeDoproduto;
	private double valorUnitarioDoProduto;
	private int quantidadeDoProduto;
	private double valorTotalDoProduto;
	
	
	//CONSTRUTOR
	public Produto() {		
	}
	
	public Produto(String nomeDoproduto, double valorUnitarioDoProduto, int quantidadeDoProduto,
			double valorTotalDoProduto) {
		super();
		this.nomeDoproduto = nomeDoproduto;
		this.valorUnitarioDoProduto = valorUnitarioDoProduto;
		this.quantidadeDoProduto = quantidadeDoProduto;
		this.valorTotalDoProduto = valorTotalDoProduto;
	}
	
	//METODOS
	public String getNomeDoproduto() {
		return nomeDoproduto;
	}
	public void setNomeDoproduto(String nomeDoproduto) {
		this.nomeDoproduto = nomeDoproduto;
	}
	public double getValorUnitarioDoProduto() {
		return valorUnitarioDoProduto;
	}
	public void setValorUnitarioDoProduto(double valorUnitarioDoProduto) {
		this.valorUnitarioDoProduto = valorUnitarioDoProduto;
	}
	public int getQuantidadeDoProduto() {
		return quantidadeDoProduto;
	}
	public void setQuantidadeDoProduto(int quantidadeDoProduto) {
		this.quantidadeDoProduto = quantidadeDoProduto;
	}
	public double getValorTotalDoProduto() {
		return valorTotalDoProduto;
	}
	public void setValorTotalDoProduto(double valorTotalDoProduto) {
		this.valorTotalDoProduto = valorTotalDoProduto;
	}
	
	
	

}
