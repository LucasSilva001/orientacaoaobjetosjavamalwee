package br.com.senai.produto;

import java.util.List;
import java.util.Scanner;

public class ProdutoController {
	
	private Scanner tec;
	
	public ProdutoController() {
		tec = new Scanner(System.in);
	}
	
	public Produto cadastrarProduto() {
	    Produto produto = new Produto();
	    
	    System.out.println("--- CADASTRAR PRODUTO ---");
	    System.out.println("Informe o nome do produto:");
	    tec.nextLine();
	    produto.setNomeDoproduto(tec.nextLine());
	    
	    System.out.println("Informe o valor unitário do produto: ");
	    produto.setValorUnitarioDoProduto(tec.nextDouble());
	    
	    System.out.println("Insira a quantidade do produto: ");
	    produto.setQuantidadeDoProduto(tec.nextInt());
	    produto.setValorTotalDoProduto(produto.getValorTotalDoProduto() * produto.getQuantidadeDoProduto());
	   	   	    
		return produto;
		
	}
	
	public List<Produto> ListarProdutos(List<Produto> produtos){
		System.out.println("--- Produtos cadastrados ---");
		System.out.printf("| %15s | %6.2s | %3s | \n ", "Nome", "ValorUnitário", "Quantidade");
		for(int i = 0; i < produtos.size(); i++) {
			System.out.printf("| %15s | %6.2f | %3s | \n ",
					produtos.get(i).getNomeDoproduto(),
					produtos.get(i).getValorUnitarioDoProduto(),
					produtos.get(i).getQuantidadeDoProduto(),
					produtos.get(i).getValorTotalDoProduto());
			
		}
		return produtos;
	}

}
