package aula16Excecoes;

import java.util.Random;

// Exemplo com muitos catch
public class MultiCatch {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		try {
			int a = r.nextInt();
			System.out.println("a: " + a);
			int b = 42/a;
			int[] c = {1};
			c[42] = 99;
		}
		catch (ArithmeticException e) {
			System.out.println("Divisão por zero: " + e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Indice fora do array: " + e);
		}
	}

}
