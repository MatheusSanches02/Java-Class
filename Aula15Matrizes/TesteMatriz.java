package Aula15Matrizes;

public class TesteMatriz {

	public static void main(String[] args) {
		MetodoMatriz mm = new MetodoMatriz();
		int[] vetorT = mm.tamanhoMatriz();
		int[][] matriz = mm.criaMatriz(vetorT);
		mm.imprimeMatriz(matriz);
		int numero = mm.obterNumero();
		int count = mm.verificaOcorrencias(numero, matriz);
		System.out.println("Ocorrencias: " + count);
		mm.posicaoOcorrencia(numero, matriz);
	}

}
