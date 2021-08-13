package Calculadora;

public class Teste {

	public static void main(String[] args) {
		CalculadoraSimples calc = new CalculadoraSimples();
		
		int op = calc.menu();
		double n1 = calc.entradaDados();
		double n2 = calc.entradaDados();
		double result = calc.controlador(n1, n2, op);
		calc.imprimeResultado(result);

	}

}
