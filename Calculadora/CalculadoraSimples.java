package Calculadora;

import java.util.Scanner;


/* Operações matemáticas:
 *  - (x) adição
 *  - (x) subtração
 *  - (x) multiplicação
 *  - (x) divisão
 *  
 *  Métodos Operacionais:
 *  - (x) menu
 *  - (x) entrada de dados
 *  - (x) imprimir o resultado
 *  - controlador
 */

public class CalculadoraSimples {
	
	Scanner input = new Scanner(System.in);
	
	public int menu()
	{
		int op;
		do 
		{
		System.out.println("*--Menu--*");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("Opção: ");
		op = input.nextInt();
		}while(op < 1 || op > 4);
		
		return op;
	}
	
	public double entradaDados()
	{
		double num;
		System.out.println("*--Entrada de Dados--*");
		System.out.println("Numero: ");
		num = input.nextDouble();
		return num;
	}
	
	public double adicao(double n1, double n2)
	{
		double resultado;
		System.out.println("*--Adição--*");
		resultado = n1 + n2;
		return resultado;
	}
	
	public double subtracao(double n1, double n2)
	{
		double resultado;
		System.out.println("*--Subtração--*");
		resultado = n1 - n2;
		return resultado;
	}
	
	public double multiplicacao(double n1, double n2)
	{
		double resultado;
		System.out.println("*--Multiplicação--*");
		resultado = n1 * n2;
		return resultado;
	}
	
	public double divisao(double n1, double n2)
	{
		double resultado;
		System.out.println("*--Divisão--*");
		resultado = n1 / n2;
		return resultado;
	}
	
	public void imprimeResultado(double resultado)
	{
		System.out.println("*--Imprime Resultado--*");
		System.out.println("Resultado: " + resultado);
	}
	
	public double controlador(double n1, double n2, int op)
	{
		System.out.println("*--Controlador--*");
		double resultado;
		
		switch(op)
		{
		case 1:
			resultado = adicao(n1,n2);
			break;
		case 2: 
			resultado = subtracao(n1, n2);
			break;
		case 3:
			resultado = multiplicacao(n1, n2);
			break;
		case 4:
			resultado = divisao(n1, n2);
			break;
		default:
			resultado = 0;
		}
		return resultado;
	}
	
	
}
