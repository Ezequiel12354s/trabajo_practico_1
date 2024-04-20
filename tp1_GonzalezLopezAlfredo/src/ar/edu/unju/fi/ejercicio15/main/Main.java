package ar.edu.unju.fi.ejercicio15.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero comprendido entre el 5 y el 10");
		int num=sc.nextInt();
		if(num>=5 && num<=10) {
			String vector[]=new String[num];
			
			for(int i=0;i<num;i++) {
				System.out.println("Ingrese un nombre para el arreglo: ");
				vector[i]=sc.next();
				System.out.println(vector[i]+" posicion "+i);
				
			}
			System.out.println("MOSTRAR ORDEN INVERSO: ");
			for(int i=num-1;i>=0;i--) {
				System.out.println();
				System.out.println(vector[i]+" posicion "+(i));
			}
		}else {
			System.out.println("Fuera de rango");
		}
		sc.close();

	}
}
