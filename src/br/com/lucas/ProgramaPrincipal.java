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
		

		boolean sair = false;

		do  {
			pessoaController.menu();

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

			default:
				System.out.println("Opção inválida!");
				break;
			}

		} while (!sair);

		System.out.println("Sistema finalizado!");

	}

}
