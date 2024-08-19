package app.main;

import java.util.ArrayList;

import app.resources.RecursiveAlgorithms;

public class Main {

	public static void main(String[] args) {
		RecursiveAlgorithms recursive = new RecursiveAlgorithms();
		
		System.out.println("Resto da divisão entre 13 e 4 é: " + recursive.findRest(13, 4));
		
		System.out.println("A divisão inteira entre 13 e 4 é: " + recursive.findDivision(13,4));
		
		System.out.println("O mdc entre 13 e 4 é: " + recursive.findMDC(13,4));
		
		
		//preparação para algoritmos de busca
		ArrayList<Integer> list= new ArrayList<Integer>();
		for (int i = 1; i <101; i++) {
			list.add(i);
		}
		
		System.out.println("O índice que o número 3 está no vetor de 1 até 100 é: " + recursive.findIndex(list, 85, 0));
		
		System.out.println("O índice que o número 3 está no vetor de 1 até 100 é: " + recursive.findIndexBinarySearch(list, 3, 0, list.size()-1));
	}
}
