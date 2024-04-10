package controller;
import util.Teclado;

public class Questao01 {
	public static void main(String[] args) {
		int a[][] = new int[5][3];
		
		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 3; c++) {
				a[l][c] = Teclado.lerInt("Digite um número");
			}
		}
		
		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(a[l][c]+"\t");
			}
			System.out.println();
		}
	}
}
