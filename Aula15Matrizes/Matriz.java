package Aula15Matrizes;

public class Matriz {

	public static void main(String[] args) {
		
		// Inicialização direta da matriz "m"
		int m[][] = {{1,2}, {3}, {4,5,6}};
		
		//x representa o indice de linhas 
		//m.length retorna o numero de linhas da matriz m 
		for(int x = 0; x < m.length; x++) {
			System.out.printf("%da. linha: \n", x+1);
			//i representa o indice das colunas
			//m[x].length retorna o numero de colunas da linha x
			for(int i = 0; i < m[x].length; i++) {
				System.out.printf("matriz[%d][%d]: %d \n", x, i, m[x][i]);
				
			}
		}
		

	}

}
