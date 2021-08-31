package Aula15Matrizes;

import java.util.Scanner;

public class MatrizScanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int m[][] = new int[2][4];
		
		//popular a matriz
		for(int i = 0; i < m.length; i++) {
			System.out.printf("Elementos da %da. linha \n", i+1);
			for(int j = 0; j < m[i].length; j++) {
				System.out.printf("m[%d]{%d]: ",i, j);
				m[i][j] = input.nextInt();
			}
		}
		
		//imprimindo os elementos da matriz m
		for(int i = 0; i<m.length; i++) {
			for(int j = 0; j<m[i].length; j++) {
				System.out.printf("m[%d][%d]: %d \n", i,j, m[i][j]);
			}
		}
		

	}

}
