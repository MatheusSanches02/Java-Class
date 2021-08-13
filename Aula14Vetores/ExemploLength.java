package Aula14Vetores;

public class ExemploLength {

	public static void main(String[] args) {
		
		//inicializção de vetores de forma direta(com 3 elementos)
		String nomes[] = {"Matheus Sanches", "Rosa Maria", "Sandro Francisco"};

		int n = nomes.length;
		System.out.println("Tamanho do vetor: " + n);

		for(int i = 0; i < n; i++){
			System.out.printf("nomes[%d]:  %s \n", (i+1), nomes[i]);
		}
		
		String meses[] = {"Janeiro", "Fevereiro","Março", "Abril","Maio","Junho","Julho","Agosto",
				"Setembro","Outubro","Novembro", "Dezembro"};
		
		int diaMes[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int i = 0; i < meses.length; i++) {
			System.out.printf("%s tem %d", meses[i], diaMes[i]);
		}

	}

}
