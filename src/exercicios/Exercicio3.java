package exercicios;

import java.util.LinkedList;

public class Exercicio3 {

	public static void main(String args[]) {
		LinkedList<Integer> lista = new LinkedList<Integer>();
		
		lista.add(12);
		lista.add(4);
		lista.add(3);
		
		Integer result = 0;
		Integer a = 0;
		

		for(a = 0; a < lista.size(); a++ ) {
			result += lista.get(a);
			
		}
		
		System.out.println("Resultado da soma de todos os elementos da lista");
		System.out.println(result);
		
	}
}
