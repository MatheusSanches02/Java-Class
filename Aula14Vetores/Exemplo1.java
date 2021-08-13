package Aula14Vetores;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//permitir a entrada pelo usuario (tamanho)
		int tamanho;
		System.out.println("Digite o tamanho da lista: ");
		tamanho = input.nextInt();
		int vetor[] = new int[tamanho];
		int i, num;
		
		//preenche o vetor com os valores de i 
		for(i = 0; i < tamanho; i++) {
			System.out.printf("v[%d]: ", i);
			//permitir a entrada de dados pelo usuario(elemento)
			vetor[i] = input.nextInt();
			//imprime o vetor
			//System.out.printf("v[%d]: %d \n", i, vetor[i]);
			
		}
		
		

	}

}
