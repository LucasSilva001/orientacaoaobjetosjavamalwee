package br.com.lucas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.lucas.pessoa.Pessoa;
import br.com.lucas.pessoa.PessoaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		List<Produto> produtos = new ArrayList<Produto>();

		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoController = new ProdutoController();
		
		Produto produto = new Produto(
				"Abacate",
				2.5,
				35,
				2.5 * 35
				);
		produtos.add(produto);

		boolean sair = false;

		do  {
			menu();

			int opcao = pessoaController.leOpcao();

			switch (opcao) {
			case 1:
				pessoas.add(pessoaController.cadastrarPessoa());
				break;
				
			case 2:
				pessoaController.ListarPessoas(pessoas);
				break;
				
			case 9:
				sair = true;
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
				
			default:
				System.out.println("Opção inválida!");
				break;
			}

		} while (!sair);

		System.out.println("Sistema finalizado!");

	}
	public static void menu() {
		System.out.println("\n--- Menu ---");
		System.out.println("1) Cadastrar pessoa");
		System.out.println("2) Listar pessoas cadastradas");
		System.out.println("3) Cadastrar produto");
		System.out.println("4) Listar produtos cadastrados");
		System.out.println("5) Editar produto");
		System.out.println("6) Excluir produto");
		System.out.println("7) Editar pessoa");
		System.out.println("8) Excluir pessoa");
		System.out.println("9) Sair do sistema");
		System.out.println("---------------------");
	}

}
