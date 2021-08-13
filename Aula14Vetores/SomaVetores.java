package Aula14Vetores;

public class SomaVetores {

	public static void main(String[] args) {
		
		int vetor1[] = {2, 4, 6};
		int vetor2[] = {1,3,5};
		int vetor3[] = new int[3] ;

		for(int x = 0; x < vetor1.length; x++) {
			vetor3[x] += vetor1[x] + vetor2[x];
			System.out.println(vetor3[x]);
		}
	}

}
