package app.resources;

import java.util.ArrayList;

public class RecursiveAlgorithms {

	
	//achar o resto de uma divisão
	public int findRest (int x, int y) {
		if(x < y) {
			return x;
		}
		else return findRest(x-y, y);
	}

	//achar o resultado inteiro de uma divisão
	public int findDivision(int x, int y) {
		if(x<y) {
			return 0;
		}
		else return 1 + findDivision(x-y, y);
	}

	//procura o MDC entre dois números. Caso base é se o divisor é 0, retornamos o valor do dividendo
	public int findMDC(int x, int y) {
		if(y == 0) return x;
		return findMDC(y, x % y);
	}

	//busca sequencial
	public String findIndex(ArrayList<Integer> list, int x, int index) {
		if (index >= list.size()) return "not found"; //não achou na busca sequencial
		
		if(x == list.get(index)) return String.valueOf(index); // achou o valor de x no índice
		
		return findIndex(list, x, index+1); //não achou o valor, vai andar um índice para a direita
	}

	
	//busca binária recursiva
	public String findIndexBinarySearch(ArrayList<Integer> list, int x, int start, int end) {
		if(start > end) {
			return "not found"; // não achou no vetor ordenado
		}
		int middle = (start + end) /2;
		if (x == list.get(middle)) return String.valueOf(middle); //achou o indice do valor de X
		
		if(list.get(middle) < x) return findIndexBinarySearch(list, x, middle + 1, end); // se o X for maior do que o valor que está no meio, ele vai procurar à direita do indíce middle
		else return findIndexBinarySearch(list, x, start, middle -1); //se o x for menor que o valor que está no meio, o algoritmo irá buscar à esquerda do indíce middle 
		
	}
}
