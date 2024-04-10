package controller;

import util.Teclado;

public class Questao02 {
	public static void main(String[] args) {
		int a[][] = new int[3][2];
		int soma = 0;
		
		for(int l = 0; l < 3; l++) {
			for(int c= 0; c < 2; c++) {
				a[l][c] = Teclado.lerInt("Digite Número");
				soma += a[l][c];
			}
		}
		
		System.out.println("Exibindo a matriz");
		
		for(int l = 0; l < 3; l++) {
			for(int c= 0; c < 2; c++) {
				System.out.println(a[l][c] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Somatório: " + soma);
		
		
	}
	
}
