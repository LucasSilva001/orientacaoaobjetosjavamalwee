package br.com.lucas.pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.lucas.ProgramaPrincipal;
import br.com.senai.produto.Produto;

public class PessoaController {
	
	
	private Scanner tec;
	
	public PessoaController() {
		tec = new Scanner(System.in);
				
	}
	
	public int leOpcao() {
		System.out.println("> ");
		return tec.nextInt();
	}
	
	
	
	public Pessoa cadastrarPessoa() {
		Pessoa pessoa = new Pessoa();
		
		System.out.println("--- CADASTRAR PESSOA ---");
		System.out.println("Informe o nome: ");
		tec.nextLine();
		pessoa.setNome(tec.nextLine());
		
		System.out.println("Informe o ano de nascimento: ");
		pessoa.setAnoDeNascimento(tec.nextInt());
		
		System.out.println("Informe a altura: ");
		pessoa.setAltura(tec.nextDouble());
		
		System.out.println("Informe o país: ");
		tec.nextLine();
		pessoa.setNomeDoPais(tec.nextLine());
		
		System.out.println("Informe a sigla do país: ");
		pessoa.setSiglaDoPais(tec.next());
		
		System.out.println("Nome do estado: ");
		tec.nextLine();
		pessoa.setNomeDoEstado(tec.nextLine());
		
		System.out.println("UF: ");
		pessoa.setUf(tec.next());
		
		System.out.println("Nome da cidade: ");
		tec.nextLine();
		pessoa.setNomeDaCidade(tec.nextLine());
		
		System.out.println("Nome do bairro: ");
		pessoa.setNomeDoBairro(tec.nextLine());
		
		System.out.println("Nome da rua: ");
		pessoa.setNomeDaRua(tec.nextLine());
		
		System.out.println("Complemento: ");
		pessoa.setComplemento(tec.nextLine());
	
		System.out.println("Número: ");
		pessoa.setNumero(tec.next());
		
		return pessoa;
		
	}
	
	public List<Pessoa> ListarPessoas(List<Pessoa> pessoas){
		
		if(pessoas.isEmpty()) {
			System.out.println("Não possui dados cadastrados.");
			return null;	
		}
		
		
 		System.out.println("--- Pessoas Cadastradas ---");
		
		System.out.printf("| %2s | %20s | %4s | %5s | %6s | %12s | %10s | %15s | %6s | %15s | %12s | %15s | %10s | %6s | \n", "Id", "Nome", "Ano", "Idade", "Altura", "País", "siglaDoPais", "nomeDoEstado", "uf", "nomeDaCidade", "nomeDoBairro", "nomeDaRua", "complemento", "numero");
		
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.printf("| %2d | %20s | %4d | %5d | %6.2f | %12s | %10s | %15s | %6s | %15s | %12s | %15s | %10s | %6s | \n" ,
					i + 1,
					pessoas.get(i).getNome(),
					pessoas.get(i).getAnoDeNascimento(),
					pessoas.get(i).getIdade(),
					pessoas.get(i).getAltura(),
					pessoas.get(i).getNomeDoPais(),
					pessoas.get(i).getSiglaDoPais(),
					pessoas.get(i).getNomeDoEstado(),
					pessoas.get(i).getUf(),
					pessoas.get(i).getNomeDaCidade(),
					pessoas.get(i).getNomeDoBairro(),
					pessoas.get(i).getNomeDaRua(),
					pessoas.get(i).getComplemento(),
					pessoas.get(i).getNumero());
					
			
		}
		
		return pessoas;
	}
	
	public List<Pessoa> editarPessoa(List<Pessoa> pessoas) {
		
		Pessoa pessoa = new Pessoa();
		ListarPessoas(pessoas);
		
		if(pessoas.isEmpty()) {
			return null;
		}
		
		System.out.println("informe o Id do cliente para editar: ");
		int idPessoa = tec.nextInt() - 1;
		
		System.out.println("1) Nome da pessoa");
		System.out.println("2) Ano de nascimento");
		System.out.println("3) Altura");
		System.out.println("4) País");
		System.out.println("5) Sigla do País");
		System.out.println("6) Nome do estado");
		System.out.println("7) Uf");
		System.out.println("8) Cidade");
		System.out.println("9) Bairro");
		System.out.println("10) Rua");
		System.out.println("11) Complemento");
		System.out.println("12) Número da casa");
		int opcao = tec.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("EDITAR NOME DA PESSOA");
			System.out.println("Insira o novo nome: ");
			tec.nextLine();
			pessoa.setNome(tec.next());
			
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 2:
			System.out.println("EDITAR ANO DE NASCIMENTO");
			System.out.println("Insira o novo ano: ");
			pessoa.setAnoDeNascimento(tec.nextInt());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 3:
			System.out.println("EDITAR ALTURA");
			System.out.println("Insira a nova altura: ");
			pessoa.setAltura(tec.nextDouble());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 4:
			System.out.println("EDITAR PAÍS");
			System.out.println("Insira o novo país");
			pessoa.setNomeDoPais(tec.nextLine());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 5:
			System.out.println("EDITAR SIGLA DO PAÍS");
			System.out.println("Insira o nova sigla: ");
			pessoa.setSiglaDoPais(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 6:
			System.out.println("EDITAR ESTADO");
			System.out.println("Insira o novo estado: ");
			tec.nextLine();
			pessoa.setNomeDoEstado(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 7:
			System.out.println("EDITAR UF");
			System.out.println("Insira o novo Uf: ");
			pessoa.setUf(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 8:
			System.out.println("EDITAR CIDADE");
			System.out.println("Insira a nova cidade: ");
			tec.nextLine();
			pessoa.setNomeDaCidade(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 9:
			System.out.println("EDITAR BAIRRO");
			System.out.println("Insira o novo bairro: ");
			tec.nextLine();
			pessoa.setNomeDoBairro(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 10:
			System.out.println("EDITAR RUA");
			System.out.println("Insira a nova rua: ");
			tec.nextLine();
			pessoa.setNomeDaRua(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 11:
			System.out.println("EDITAR COMPLEMENTO");
			tec.nextLine();
			pessoa.setComplemento(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());

			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 12:
			System.out.println("EDITAR NÚMERO DA CASA");
			System.out.println("Insira o novo número da casa: ");
			pessoa.setNumero(tec.next());
			
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		}	
		
		return pessoas;
	}
	
	public void excluirPessoa(List<Pessoa> pessoas) {
		
		ListarPessoas(pessoas);
		
		if(pessoas.isEmpty()) {
			
			return;
		}
		
		System.out.println("--- EXCLUIR PESSOA ---");
		System.out.println("Selecione o Id da pessoa a ser excluída: ");
		int idPessoa = tec.nextInt() - 1;
		
		if(pessoas.size() <= idPessoa) {
			System.out.println("Pessoa não cadastrada.");
			return;
		}
		
		
		pessoas.remove(idPessoa);
		
	}
	public void menu() {	
		
		System.out.println("\nMenu");
		System.out.println("1) Cadastrar");
		System.out.println("2) Listar");
		System.out.println("3) Excluir");
		int opcao = tec.nextInt();
		
		boolean sair = true;
		
		do {
			switch(opcao) {
		
		case 1:
			pessoas.add(cadastrarPessoa());
			
			break;
			
		case 2:
			
			break;
		
		case 3:
			
		}
	} while(!sair);
}
}
