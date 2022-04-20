package fiap.ponto.tokio.logica.exercicio;

public class Aula05Relacionais {

	public static void main(String[] args) {
		
		
		System.out.println(5 < 2);
		
		int num1 = 40;
		
		System.out.println(num1 !=67);
		System.out.println(num1 != 40);
		System.out.println(false);
		
		int num2 = 32;
		
		System.out.println(num1 <= num2);
		
		boolean comparacao = num1 >= num2;
		
		System.out.println(comparacao);
		
		boolean verdadeiro = true;
		boolean falso = false; 
		
		boolean logicaE = verdadeiro && falso;
		System.out.println("logicaE:" + logicaE);
		
		boolean logicaOU = true || true;
		System.out.println(logicaOU);
		
		boolean negacao = !true;
		System.out.println(negacao);
		
		System.out.println("..................");
		//COMPARAR STRINGS 
		
		String nome1 = "joao";
		String nome2 = "joao";
		String nome3 = new String ("joao");
		
		
		
		System.out.println(nome1 == nome2);
		System.out.println(nome1 == nome3);
		System.out.println(nome1.equals(nome3));
		System.out.println(nome1.equalsIgnoreCase(nome3));
		
		
		
		
		
	}

}
