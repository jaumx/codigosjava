package javalogica;

import java.util.Scanner;

public class PrimeiroProgama {

	public static void main(String[] args) {
	    
		System.out.println("Olá Mundo com HACK!");
		
		String nome = "João Victor";
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
		
		System.out.println("Olá, " + nome2 + " você tem " + idade + " Anos");
		
		entrada.close();
	}

}
