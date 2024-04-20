package ar.edu.unju.fi.ejercicio13.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int vector [] = new int[8];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<8;i++) {
			System.out.println("Ingrese un numero: ");
			vector[i]=sc.nextInt();
			System.out.println("Numero: "+vector[i]+" posicion "+i);
		}
		sc.close();
	}

}
