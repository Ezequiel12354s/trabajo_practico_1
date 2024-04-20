package ar.edu.unju.fi.ejercicio14.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma=0;
		System.out.println("Indicar la cantidad del array dentro del rango del 3 al 10: ");
		int num=sc.nextInt();
		if(num>=3 && num<=10) {
			int vector[]= new int[num];
			for( int i=0;i<num;i++) {
				System.out.println("Ingrese un numero: ");
				vector[i]=sc.nextInt();
				System.out.println("Posicion "+i+" del numero "+vector[i]);
				
				suma=suma+vector[i];
			}
			
			System.out.println("La suma de los elementos del array es: "+suma);
		}else
		{
			System.out.println("Fuera de rango");
		}
		sc.close();
	}

}
