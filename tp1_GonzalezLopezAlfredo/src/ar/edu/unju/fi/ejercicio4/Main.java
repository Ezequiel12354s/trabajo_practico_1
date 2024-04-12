package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int num = sc.nextInt();
		sc.close();
		if(num>=0 && num<=10) {
			while(num!=0) {
				fact=fact*num;
				num--;
			}
			System.out.println("El factorial es: "+fact);
		}else
			System.out.println("El numero esta fuera de rango");
		

	}

}
