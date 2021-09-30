package Aula17_ArrayList;

import java.util.ArrayList;

public class PessoaTeste {

	public static void main(String[] args) {
			
		//criando o ArrayList <Pessoa>
		ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
		
		//Criando os objetos de Pessoa
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		//Configurando os atributos
		p1.setNome("nome1");
		p1.setSobrenome("sobrenome1");
		
		p2.setNome("nome2");
		p2.setSobrenome("sobrenome2");
		
		//Adicionando os objstos <Pessoa> na lista (ArrayList)
		listaDePessoas.add(p1);
		listaDePessoas.add(p2);
		
		
		for(int i=0; i < listaDePessoas.size(); i++) {
			System.out.println("Nome: " + listaDePessoas.get(i).getNome());
			System.out.println("Sobrenome: " + listaDePessoas.get(i).getSobrenome());
		}
	}
}
