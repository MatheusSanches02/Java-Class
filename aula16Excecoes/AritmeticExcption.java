package aula16Excecoes;

public class AritmeticExcption {

	public static void main(String[] args) {
		
		int a, b, result;
		
		try 
		{
		a = 42;
		b = 0;
		result = a / b; // vai gerar um erro pela divis�o por 0
		}
		catch(ArithmeticException e) 
		{
			System.err.println("Divis�o por 0");
		}
		
				
	}

}
