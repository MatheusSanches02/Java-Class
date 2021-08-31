package aula16Excecoes;

public class AritmeticExcption {

	public static void main(String[] args) {
		
		int a, b, result;
		
		try 
		{
		a = 42;
		b = 0;
		result = a / b; // vai gerar um erro pela divisão por 0
		}
		catch(ArithmeticException e) 
		{
			System.err.println("Divisão por 0");
		}
		
				
	}

}
