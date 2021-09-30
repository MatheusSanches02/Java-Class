/**
 * 
 */
package Aula18_JavaDoc;

/**
 * @author Matheus Sanches
 *
 */
public class Exemplo1 {

	public int atr1;
	/**
	 * @return the atr1
	 */
	public int getAtr1() {
		return atr1;
	}

	/**
	 * @param atr1 the atr1 to set
	 */
	public void setAtr1(int atr1) {
		this.atr1 = atr1;
	}

	/**
	 * @return the atr2
	 */
	public String getAtr2() {
		return atr2;
	}

	/**
	 * @param atr2 the atr2 to set
	 */
	public void setAtr2(String atr2) {
		this.atr2 = atr2;
	}

	private String atr2;
	
	/** The cube method print cube of giben number*/
	
	/**
	 * 
	 * @param n the n to set
	 */
	public void cube(int n) {
		System.out.println(n*n*n);
	}
}
