package br.fai.projeto01;

public class Main {

	public static void main(String[] args) {
		
		Main app; // null
		app.start();

	}
	
	private void start() {
		
		int idade = 15;
		
		System.out.println("A idade � de" + idade + "anos.");
		
		idade += 5; // idade = idade + 5
		idade *= 2;
		
		System.out.println("Resultado 1: " + idade);
		
		idade -= 5;
		
		System.out.println("Resultado 2: " + idade);
		
		 if (idade > 20) {
			 System.out.println("a idade � maior que 20");
		 }else {
			 System.out.println("a idade � menor que 20");
		 }
	}
}
