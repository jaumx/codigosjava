
package javalogica;

import java.util.Scanner;

public class Aula05exErcicio01 {

	public static void main(String[] args) {
	
		System.out.println("EXERCICIO 1");
		
		String nomeCompleto = "Joao Victor Trindade Vieira";
		String endereco = "Jardim Guanabara, 558";
		String cep = "04860-280";
		String cpf = "497133838-18";
		String telefone = "11 97244-7981";
		
		System.out.println(nomeCompleto);
		System.out.println(endereco);
		System.out.println(cep);
		System.out.println(cpf);
		System.out.println(telefone);
		
		System.out.println("EXERCICIO 2");
		
		 
		int num1 = 10;
		float num2 = 1.5f;
		double num3 = 30.5;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		System.out.println(".............");
		
		String str1 = Integer.toString(num1);
		String str2 = Float.toString(num2);
		String str3 = Double.toString(num3);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		 System.out.println("......................");
		System.out.println("EXERCICIO 3");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = entrada.nextLine();
		System.out.println("Digite se genero (M) (F) (O) (N)");
		char genero = entrada.nextLine().charAt(0);
		System.out.println(genero);
		
		System.out.println("Seja bem vindo(a)," +nome);
		System.out.println("Você escolheu o seguinte genero: " +genero);
		
		System.out.println("................");
		System.out.println("EXERCICIO 4");
		
		
		
		
		
		
		
		
		
		
	}

}
