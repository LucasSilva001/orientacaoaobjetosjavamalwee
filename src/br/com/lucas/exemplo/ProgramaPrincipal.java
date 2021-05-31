package br.com.lucas.exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		Pessoa pessoa4 = new Pessoa();
		
		//Johnatan
		//Mayara
		//Lívia
		//Anthony
		
		pessoa1.setNome("Lucas");
		pessoa1.setAnoDeNascimento(2004);
		pessoa1.setSexo("M");
		
		pessoa2.setNome("Mayara");
		pessoa2.setAnoDeNascimento(1994);
		pessoa2.setSexo("F");
		
		pessoa3.setNome("Lívia");
		pessoa3.setAnoDeNascimento(1998);
		pessoa3.setSexo("F");
		
		pessoa4.setNome("Anthony");
		pessoa4.setAnoDeNascimento(2004);
		pessoa4.setSexo("M");
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		
		System.out.println("--- PESSOAS com FOR ---");
		for (int i = 0; i < pessoas.size(); i++) {
			System.out.println(pessoas.get(i));
			System.out.println("############################");
		}
		//  System.out.println("--- PESSOAS com FOR ---");
		//  for (int i = 0; i < pessoas.size(); i++) {
		//	System.out.println(pessoas.get(i).getNome());
		//	System.out.println(pessoas.get(i).getAnoDeNascimento());
		//	System.out.println(pessoas.get(i).getSexo());
		//	System.out.println("############################");
		
		System.out.println("--- PESSOAS CADASTRADAS ---");
		for(Pessoa people : pessoas) {
			System.out.println(people.getNome());
			System.out.println(people.getAnoDeNascimento());
			System.out.println(people.getSexo());
			System.out.println("-------------------------");
			
		}
		
		System.out.println("--- PESSOAS com ForEach lambda ---");
		pessoas.forEach(aluno -> {
			System.out.println(aluno.getNome());
			System.out.println(aluno.getAnoDeNascimento());
			System.out.println(aluno.getSexo());
			System.out.println("**************************");
		});
	
		Scanner tec = new Scanner(System.in);
		
	System.out.println("--- Tabuada ---");
	MetodoController metodoController = new MetodoController();
	metodoController.multiplicar();
	
	System.out.println("--- Soma de dois valores ---");
	System.out.println("A soma dá: " + metodoController.somar());
	
	System.out.println("--- Subtração de valores por Parâmetro ---");
	System.out.println("Informe o primeiro valor: ");
	int valor1 = tec.nextInt();
	System.out.println("Informe o segundo valor: ");
	int valor2 = tec.nextInt();
	
	System.out.println("A subtração dá: " + metodoController.subtrair(valor1, valor2));
	
	}
}
