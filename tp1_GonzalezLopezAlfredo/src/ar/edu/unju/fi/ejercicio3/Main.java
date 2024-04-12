package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int num = sc.nextInt();
		sc.close();
		if(num % 2== 1) {
			num=num*2;
			System.out.println("El numero es impar");
			System.out.println("El doble del numero es: "+num);
		}else {
			num=num*3;
			System.out.println("El numero es par");
			System.out.println("El triple del numero es: "+num);
		}

	}

}
