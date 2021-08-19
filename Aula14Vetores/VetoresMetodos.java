package Aula14Vetores;

import java.util.Scanner;

public class VetoresMetodos {

	Scanner input = new Scanner(System.in);
	
	public int tamanhoVetor() {
		int tamanho;
		System.out.println("Tamanho: ");
		tamanho = input.nextInt();
		return tamanho;
	}
	
	public int obterNumero() {
		int numero;
		System.out.println("Numero: ");
		numero = input.nextInt();
		return numero;
	}
	
	public int[] criaVetor(int tamanho) {
		int[] vetor = new int[tamanho];
		return vetor;
	}
	
	public int[] preencheVetor(int[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("vetor[%d]: ", i);
			vetor[i] = input.nextInt();
		}
		return vetor;
	}
	
	public int verificaOcorrencias(int [] vetor, int n) {
		int count = 0;
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == n) {
				System.out.printf("vetor[%d]: %d \n", i, vetor[i]);
				count++;
			}	
		}
		return count;
	}
	
	public int[] verificaParImpar(int[] vetor) {
		int countZeros = 0, countPar  = 0, countImpar = 0;
		int[] vetorResultante = new int[3];
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == 0) {
				System.out.printf("vetor[%d]: %d \n é zero",i,vetor[i]);
				countZeros++;
			}
			else if(vetor[i] % 2 == 0) {
				System.out.printf("vetor[%d]: %d é par \n",i, vetor[i]);
				countPar++;
			}
			else if(vetor[i] % 2 == 1) {
				System.out.printf("vetor[%d]: %d é impar",i,vetor[i]);
				countImpar++;
			}
		}
		vetorResultante[0] = countZeros;
		vetorResultante[1] = countPar;
		vetorResultante[2] = countImpar;
		
		return vetorResultante;
	}
	
	public void imprimeVetor(int[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("vetor[%d]: %d \n", i, vetor[i]);
		}
	}
}
