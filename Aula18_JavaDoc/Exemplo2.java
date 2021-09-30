/**
 * 
 */
package Aula18_JavaDoc;

/**
 * @author Matheus Sanches
 * @version 1.0.0
 * @since Release 02 da aplicação - 28/09/2021
 * 
 */
public class Exemplo2 {
	
	private String matricula;
	private double salario;
	
	/**
	 * Método para retorno da matricula do funcionário
	 * @return String - numero da matrícula
	 */
	
	public String getMatricula() {
		return this.matricula;
	}
	
	/**
	 * Método para retorno do salário do funcionário
	 * @return double - valor do salário
	 */
	
	public double getSalario() {
		return this.salario;
	}
	
	/**
	 * Método para calculo da diária com base no salário do funcionário
	 * dividido pelo mês comercial de 30 dias para efeito de calculo 
	 * de custo para viagem.
	 * @author Matheus Sanches
	 * @param diasViagem - int da duração da viagem 
	 * @param valorDeslocamento - double valor total da viagem (despesas)
	 * @return double - valor da diária (total)
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
	 * Método para calcular o valor da bonificação:
	 * Vendas < 25000.00, bonificação de 5%
	 * > 25000.00, bonificação de 10%
	 * @author Matheus Sanches
	 * @param valorVendas - valor total das vendas no mes 
	 * @return double - valor da bonificação
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
