package br.com.lucas.pessoa;

import java.util.List;
import java.util.Scanner;

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
 		System.out.println("--- Pessoas Cadastradas ---");
		
		System.out.printf("| %20s | %4s | %5s | %6s | %12s | %10s | %15s | %6s | %15s | %12s | %15s | %10s | %6s | \n", "Nome", "Ano", "Idade", "Altura", "País", "siglaDoPais", "nomeDoEstado", "uf", "nomeDaCidade", "nomeDoBairro", "nomeDaRua", "complemento", "numero");
		
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.printf("| %20s | %4d | %5d | %6.2f | %12s | %10s | %15s | %6s | %15s | %12s | %15s | %10s | %6s | \n" ,
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

	
	}

