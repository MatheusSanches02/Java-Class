package Aula14Vetores;

import java.util.Scanner;

public class Exemplo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n = 10; // tamanho do vetor 
		int v[]= new int [n]; // declaração do vetor
		int i;// indice ou posição
		
		//entrada de dados
		for(i=0;i<n;i++) {
			System.out.printf("Informe [%d] valor de %d: ", (i+1), n);
			v[1] = ler.nextInt();
		}
		//processamento: somar todos os valores, definir o maior e o menor valor 
		int soma = 0;
		int menor = v[0]; // v[0] = 1o. valor armazenado no vetor v
		int maior = v[0];
		
		for(i=0;i<n;i++) {
			soma = soma + v[i];
			
			if(v[i]<menor)
				menor = v[i];
			
			if(v[i]>maior)
				maior = v[i];
		}
		//saida (resultados)
		System.out.printf("\n");
		for(i=0; i<n; i++) {
			if(v[i] == menor)
				System.out.printf("v[%d] = [%d] <--- menor valor\n", i, v[i]);
			else if(v[i] == maior)
				System.out.printf("v[%d] = [%d] <--- maior valor\n", i, v[i]);
			else System.out.println("v[%d] = [%d]\n,i,v[i");
		}
		System.out.printf("\nSoma = %d\n", soma);
	}

}
