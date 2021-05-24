package br.com.carro;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();
		
		carro1.setMarca("KYA");
		carro1.setModelo("Sorento");
		carro1.setAno(2004);
		carro1.setQntPortas(2);
		
		carro2.setMarca("BMW");
		carro2.setModelo("Tourer");
		carro2.setAno(2016);
		carro2.setQntPortas(4);
		
		carro3.setMarca("CHEVROLET");
		carro3.setModelo("Tracker");
		carro3.setAno(2007);
		carro3.setQntPortas(4);
		
		carro4.setMarca("PEUGEOT");
		carro4.setModelo("Expert");
		carro4.setAno(2014);
		carro4.setQntPortas(2);
		
		System.out.println("--- Carro1 ---");
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getAno());
		System.out.println(carro1.getQntPortas());
		System.out.println("---------------------");
		
		System.out.println("--- Carro2 ---");
		System.out.println(carro2.getMarca());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getAno());
		System.out.println(carro2.getQntPortas());
		System.out.println("---------------------");
		
		System.out.println("--- Carro3 ---");
		System.out.println(carro3.getMarca());
		System.out.println(carro3.getModelo());
		System.out.println(carro3.getAno());
		System.out.println(carro3.getQntPortas());
		System.out.println("---------------------");
		
		System.out.println("--- Carro4 ---");
		System.out.println(carro4.getMarca());
		System.out.println(carro4.getModelo());
		System.out.println(carro4.getAno());
		System.out.println(carro4.getQntPortas());
		System.out.println("---------------------");
	}

}
