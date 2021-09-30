package Aula17_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListExemplo1 {
	
	public static void main(String[] args) {
			
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Manga");
		list.add("Banana");
		list.add("Maça");
		list.add("Uva");
		
		//imprimindo o objeto arrayList
		System.out.println(list);
		
		System.out.println("\n");
		
		//Iterando o arrayList usando o Iterator
		Iterator<String> itr = list.iterator(); //obtendo o iterator
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("\n");
		//Iterando com for-each
		for(String fruit:list) {
			System.out.println(fruit);
		}
		
	}

}
