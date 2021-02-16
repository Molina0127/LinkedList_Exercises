package exercicios;

import java.util.LinkedList;

public class Exercicio4 {

		public static void main(String args[]) {
			LinkedList<Integer> lista = new LinkedList<Integer>();
			
			lista.add(12);
			lista.add(4);
			lista.add(3);
			
			Integer maior = 0;
			Integer a = 0;
			
			
			for(a = 0; a < lista.size(); a++) {
				if(lista.get(a) > maior){
					maior = lista.get(a);
				}
			}
			
			System.out.println("O maior elemento é: " + maior);

			
		}
	}

