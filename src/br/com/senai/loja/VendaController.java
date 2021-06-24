package br.com.senai.loja;

import java.util.List;
import java.util.Scanner;

import br.com.lucas.pessoa.Pessoa;
import br.com.lucas.pessoa.PessoaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;

public class VendaController {
	
	private Scanner tec;
	private ProdutoController produtoController;
	private PessoaController pessoaController;
	
	public VendaController() {
		tec = new Scanner(System.in);
		produtoController = new ProdutoController();
		pessoaController = new PessoaController();
	}
	
	public int leOpcao() {
		System.out.println("> ");
		return tec.nextInt();
	}
	
	public List<Venda> listarVenda(List<Venda> vendas) {
		
		System.out.println("--- VENDAS REALIZADAS ---");
		
		System.out.printf("| %10s | %10s | %4s | %6s |\n",
				"Cliente", "Produto", "Qtd", "Valor");
		
		for(int i = 0; i < vendas.size(); i++) {
			System.out.printf("| %10s | %10s | %4d | %6.2f |\n",
					vendas.get(i).getPessoa().getNome(),
					vendas.get(i).getProduto().getNomeDoproduto(),
					vendas.get(i).getQuantidade(),
					vendas.get(i).getValor()
					);
		}
		
		return vendas;
	}
	
	public Venda cadastrarVenda(List<Produto> produtos, List<Pessoa> pessoas) {
		
		if(produtos.isEmpty() || pessoas.isEmpty()) {
			System.out.println("Impossível realizar vendas sem PRODUTOS ou PESSOAS cadastradas.");
			return null;
		}
		
		produtoController.ListarProdutos(produtos);
		pessoaController.ListarPessoas(pessoas);
		
		Venda venda = new Venda();
		Produto produto = new Produto();
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Informe o Id da pessoa: ");
		int idPessoa = tec.nextInt();
		
		pessoa.setNome(pessoas.get(idPessoa).getNome());
		pessoa.setAltura(pessoas.get(idPessoa).getAltura());
		pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
		
		venda.setPessoa(pessoa);
		
		System.out.println("Informe o Id do produto: ");
		int idproduto = tec.nextInt() - 1;
		
		produto.setNomeDoproduto(produtos.get(idproduto).getNomeDoproduto());
		produto.setQuantidadeDoProduto(produtos.get(idproduto).getQuantidadeDoProduto());
		produto.setValorUnitarioDoProduto(produtos.get(idproduto).getValorUnitarioDoProduto());
		produto.setValorTotalDoProduto(produtos.get(idproduto).getValorTotalDoProduto());
		
		venda.setProduto(produto);
		
		System.out.println("informe a quantidade desejada: ");
		venda.setQuantidade(tec.nextInt());
		
		venda.setValor(produto.getValorUnitarioDoProduto()* venda.getQuantidade());
		
		
		return venda;
	}

}
