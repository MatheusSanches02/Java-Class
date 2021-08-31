package Aula15Matrizes;

import java.util.Scanner;

public class MetodoMatriz {
	Scanner input = new Scanner(System.in);
	
	public int[] tamanhoMatriz() {
		System.out.println("Tamanho da Matriz");
		int[] vetor = new int[2];
		System.out.println("Linhas: ");
		vetor[0] = input.nextInt();
		System.out.println("Colunas: ");
		vetor[1] = input.nextInt();
		return vetor;
	}
	
	public int[][] criaMatriz(int[] vetor){
		System.out.println("Cria Matriz");
		int[][] matriz = new int[vetor[0]][vetor[1]];
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				System.out.printf("matriz[%d][%d]: ",i,j);
				matriz[i][j] = input.nextInt();
			}
		}
		return matriz;
	}
	
	public void imprimeMatriz(int[][] matriz) {
		System.out.println("Imprime Matriz");
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.printf("matriz[%d][%d]: %d",i,j,matriz[i][j]);
			}
		}
	}
	
	public int obterNumero() {
		System.out.println("Obter Numero");
		int numero;
		System.out.println("Numero: ");
		numero = input.nextInt();
		return numero;
	}
	
	public int verificaOcorrencias(int numero, int[][] matriz) {
		System.out.println("Verifica Ocorrencias");
		int count = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == numero) {
					count++;
				}
			}
		}
		return count;
	}

	public void posicaoOcorrencia(int numero, int[][] matriz) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == numero) {
					System.out.printf("matriz[%d][%d]", i,j);
				}
			}
		}
	}
}
