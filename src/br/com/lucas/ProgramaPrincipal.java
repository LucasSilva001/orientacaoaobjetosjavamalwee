package br.com.lucas.pessoa;

import java.util.ArrayList;
import java.util.List;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		PessoaController pessoaController = new PessoaController();

		boolean sair = false;

		do {
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

			default:
				System.out.println("Opção inválida!");
				break;
			}

		} while (!sair);

		System.out.println("Sistema finalizado!");

	}

}
