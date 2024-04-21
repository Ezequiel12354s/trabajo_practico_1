package ar.edu.unju.fi.ejercicio16.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String vector [] = new String[5];
		Scanner sc = new Scanner(System.in);
		int i;
		for(i=0;i<5;i++) {
			System.out.println("Ingrese nombres de persona: ");
			vector[i]=sc.next();
		}
		i=0;
		while(i<5) {
			System.out.println(vector[i]);
			i++;
		}
		System.out.println("el tamaño es: "+vector.length);
		
		byte eliminar;
		do {
			System.out.println("Ingrese el indice a eliminar del arreglo");
			eliminar=sc.nextByte();
		}while(eliminar<0 || eliminar>=vector.length);
		
		for (i = eliminar; i < vector.length - 1; i++) {
            vector[i] = vector[i + 1];
        }
        vector[vector.length - 1] = null;

        for (i = 0; i < vector.length - 1; i++) {
            System.out.println(vector[i]);
        }
        sc.close();
		
	}

}
