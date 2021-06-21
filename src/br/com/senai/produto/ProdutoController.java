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
	    produto.setNomeDoproduto(tec.next());
	    
	    System.out.println("Informe o valor unitário do produto: ");
	    produto.setValorUnitarioDoProduto(tec.nextDouble());
	    
	    System.out.println("Insira a quantidade do produto: ");
	    produto.setQuantidadeDoProduto(tec.nextInt());
	    
	   	produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto());  
		return produto;
		
	}
	
	public List<Produto> ListarProdutos(List<Produto> produtos){
		
		if(produtos.isEmpty()) {
			System.out.println("Não possui produtos cadastrados.");
			return null;
		}
		
		System.out.println("--- Produtos cadastrados ---");
		System.out.printf("| %2s | %10s | %13s | %10s | %9s | \n ", "Id", "Nome", "ValorUnitário", "Quantidade", "Total" );
		for(int i = 0; i < produtos.size(); i++) {
			System.out.printf("| %2d | %10s | R$ %7.2f | %13d | %6.2f \n",
					i + 1,
					produtos.get(i).getNomeDoproduto(),
					produtos.get(i).getValorUnitarioDoProduto(),
					produtos.get(i).getQuantidadeDoProduto(),
					produtos.get(i).getValorTotalDoProduto());
			
		}
		return produtos;
	}
	
	public List<Produto> editarProduto(List<Produto> produtos) {
		
		Produto produto = new Produto();
		ListarProdutos(produtos);
		
		if(produtos.isEmpty()) {
			return null;
		}
		
		System.out.println("Informe o ID do produto para editar: ");
		int idProduto = tec.nextInt() -1;
		
		System.out.println("1) Nome do produto");
		System.out.println("2) Quantidade de produto");
		System.out.println("3) Valor unitário do produto");
		System.out.println("Informe o campo para ser editado");
		int opcao = tec.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("--- EDITAR O NOME DO PRODUTO ---");
			System.out.println("Informe o novo nome do produto: ");
			produto.setNomeDoproduto(tec.next());
			
			produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
			produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
			produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto()); 
			
			produtos.set(idProduto, produto);
			
			break;
		
		case 2:
			System.out.println("--- EDITAR A QUANTIDADE DE PRODUTO ---");
			System.out.println("Informe a nova quantidade: ");
			produto.setQuantidadeDoProduto(tec.nextInt());
			
			produto.setNomeDoproduto(produtos.get(idProduto).getNomeDoproduto());
			produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
			produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto()); 
			
			produtos.set(idProduto, produto);
			break;
		
		case 3:
			System.out.println("--- EDITAR O VALOR UNITÁRIO DO PRODUTO ---");
			System.out.println("Informe o novo valor: ");
			produto.setValorUnitarioDoProduto(tec.nextDouble());
			
			produto.setNomeDoproduto(produtos.get(idProduto).getNomeDoproduto());
			produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
			produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto()); 
			
			produtos.set(idProduto, produto);
			break;
		
		default:
			System.out.println("Opção inválida!");
			break;
		}
		
		return produtos;
	}
	
	public void excluirProduto(List<Produto> produtos) {
		
		ListarProdutos(produtos);
		
		if(produtos.isEmpty()) {
			return;
		}
		
		System.out.println("--- EXCLUIR PRODUTO ---");
		System.out.println("Informe o Id do produto para excluir: ");
		int idProduto = tec.nextInt() - 1;
		
		if(produtos.size() <= idProduto) {
			System.out.println("Produto não cadastrado.");
			return;
		}
		produtos.remove(idProduto);
	}
}
