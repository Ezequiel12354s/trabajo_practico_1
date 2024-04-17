package ar.edu.unju.fi.ejercicio11.main;

public class Main {

	public static void main(String[] args) {
		int i=2;
		for(int j=40;j*i-(i*(i-2))>0;i++) {
			System.out.print(j*i-(i*(i-2))+" ");
		}
	}

}