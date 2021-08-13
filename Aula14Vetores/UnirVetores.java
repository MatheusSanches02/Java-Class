package Aula14Vetores;

public class UnirVetores {

	public static void main(String[] args) {
		String  vetor1[] = {"Matheus", "1TDSG", "FIAP"};
		String vetor2[] = {"Fenando","Professor", "FIAP"};
		String vetor3[] = new String[vetor1.length + vetor2.length];
		
		for(int i = 0; i < vetor1.length; i++) {
			vetor3[i] = vetor1[i];
		}
		
		int count = 0;
		
		System.out.printf("Vetor3 tamanho: %s \n", vetor3.length);
		for(int i = vetor3.length - vetor2.length; i < vetor3.length; i++) {
			vetor3[i] = vetor2[count];
			count++;
		}
		for (int i = 0; i < vetor3.length; i++) {
			 System.out.println(vetor3[i]);
			 
		}
	}

}
