package Aula14Vetores;

import java.util.Scanner;

public class ImprimePositivo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int tamanho;
		System.out.println("Qual o tamanho do vetor: ");
		tamanho = input.nextInt();
		int numeros[] = new int[tamanho];
		int count = 0;
		
		for(int i = 0; i< numeros.length; i++) {
			numeros[i] = input.nextInt();
			if(numeros[i] > 0) {
				count++;
			}
		}
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] > 0) {
				System.out.printf("Numeros positivos: %d ", numeros[i]);
			}
		}

		System.out.printf("Quantidade de positivos: %d", count);

	}

}
