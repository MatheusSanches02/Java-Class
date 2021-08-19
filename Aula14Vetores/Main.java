package Aula14Vetores;

public class Main {

	public static void main(String[] args) {
		VetoresMetodos teste = new VetoresMetodos();
		
		int tamanho = teste.tamanhoVetor();
		int[] vetor = teste.criaVetor(tamanho); //vetor zeros
		vetor = teste.preencheVetor(vetor);
		teste.imprimeVetor(vetor);
		int numero = teste.obterNumero();
		int ocorrencias = teste.verificaOcorrencias(vetor, numero);
		System.out.printf("Ocorrências de %d: %d \n", numero, ocorrencias);
		int vParesImpares[] = teste.verificaParImpar(vetor);
		System.out.println("Zeros: " + vParesImpares[0]);
		System.out.println("Pares: " + vParesImpares[1]);
		System.out.println("Impares: " + vParesImpares[2]);

	}

}
