/**
 * 
 */
package Aula18_JavaDoc;

/**
 * @author Matheus Sanches
 * @version 1.0.0
 * @since Release 02 da aplica��o - 28/09/2021
 * 
 */
public class Exemplo2 {
	
	private String matricula;
	private double salario;
	
	/**
	 * M�todo para retorno da matricula do funcion�rio
	 * @return String - numero da matr�cula
	 */
	
	public String getMatricula() {
		return this.matricula;
	}
	
	/**
	 * M�todo para retorno do sal�rio do funcion�rio
	 * @return double - valor do sal�rio
	 */
	
	public double getSalario() {
		return this.salario;
	}
	
	/**
	 * M�todo para calculo da di�ria com base no sal�rio do funcion�rio
	 * dividido pelo m�s comercial de 30 dias para efeito de calculo 
	 * de custo para viagem.
	 * @author Matheus Sanches
	 * @param diasViagem - int da dura��o da viagem 
	 * @param valorDeslocamento - double valor total da viagem (despesas)
	 * @return double - valor da di�ria (total)
	 */
	
	public double calculaAjudaCusto(int diasViagem, double valorDeslocamento) 
			throws ArithmeticException{
		try {
			return (this.salario / 30) * diasViagem + valorDeslocamento;
		}
		catch(ArithmeticException e) {
			return 0.0;
		}
	}
	
	/**
	 * M�todo para calcular o valor da bonifica��o:
	 * Vendas < 25000.00, bonifica��o de 5%
	 * > 25000.00, bonifica��o de 10%
	 * @author Matheus Sanches
	 * @param valorVendas - valor total das vendas no mes 
	 * @return double - valor da bonifica��o
	 */
	
	public double calculaBonificacao(double valorVendas) {
		if(valorVendas < 25000.00) {
			return salario * 0.05;
		}
		else {
			return this.salario*0.10;
		}
	}
	
}
