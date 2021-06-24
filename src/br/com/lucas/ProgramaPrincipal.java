package br.com.lucas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.lucas.pessoa.Pessoa;
import br.com.lucas.pessoa.PessoaController;
import br.com.senai.loja.Venda;
import br.com.senai.loja.VendaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		List<Produto> produtos = new ArrayList<Produto>();
		List<Venda> vendas = new ArrayList<Venda>();
		
		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoController = new ProdutoController();
		VendaController vendacontroller = new VendaController();
		
		Produto produto = new Produto(
				"Abacate",
				2.5,
				35,
				2.5 * 35
				);
		produtos.add(produto);

		boolean sair = false;

		do  {
			ProgramaPrincipal.menu();

			int opcao = pessoaController.leOpcao();

			switch (opcao) {
			case 1:
				pessoas.add(pessoaController.cadastrarPessoa());
				break;
				
			case 2:
				pessoaController.ListarPessoas(pessoas);
				break;
			
			case 3:
				produtos.add(produtoController.cadastrarProduto());
				break;
				
			case 4:
				produtoController.ListarProdutos(produtos);
				break;
			
			case 5:
				produtoController.editarProduto(produtos);
				break;
			
			case 6:
				produtoController.excluirProduto(produtos);
				break;
			
			case 7:
				pessoaController.editarPessoa(pessoas);
				break;
				
			case 8:
				pessoaController.excluirPessoa(pessoas);
				break;
				
			case 9:
				vendacontroller.listarVenda(vendas);
				break;
	
			case 10:
				vendas.add(vendacontroller.cadastrarVenda(produtos, pessoas));
				break;
				
			case 11:
				sair = true;
				break;
			
				
				
			default:
				System.out.println("Opção inválida!");
				break;
			}

		} while (!sair);

		System.out.println("Sistema finalizado!");

	}
	public void pessoaMenu () {
		System.out.println("");
	}
	public static void menu() {
		System.out.println("\n--- Menu ---");
		System.out.println("1) Pessoa");
		System.out.println("2) Produto");
		System.out.println("3) Venda");
		System.out.println("4) Sair do sistema");
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Insira a opção desejada: ");
		int opcao = tec.nextInt();
	
	}

}
