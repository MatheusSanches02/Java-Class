package Aula17_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExemplo2 {
	
	public static void main(String[] args) {
		System.out.print("Ordenando números...\n");
		
		List<Integer> list = new ArrayList<>();
		
		list.add(21);
		list.add(11);
		list.add(51);
		list.add(1);
		
		Collections.sort(list);
		
		for(Integer numero: list) {
			System.out.println(numero);
		}
	}

}
