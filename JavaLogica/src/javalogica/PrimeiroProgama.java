package javalogica;

import java.util.Scanner;

public class PrimeiroProgama {

	public static void main(String[] args) {
	    
		System.out.println("Ol� Mundo com HACK!");
		
		String nome = "Jo�o Victor";
		System.out.println (nome);
		System.out.println("Oi, " + nome);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome:");
		String nome2 = entrada.nextLine();
		System.out.println(nome2 + ", Seja bem vindo");
		
		int idade = 17;
		
		System.out.print("Digite sua idade:");
		idade = entrada.nextInt();
		
		System.out.println("");
		
		System.out.println("Ol�, " + nome2 + " voc� tem " + idade + " Anos");
		
		entrada.close();
	}

}
