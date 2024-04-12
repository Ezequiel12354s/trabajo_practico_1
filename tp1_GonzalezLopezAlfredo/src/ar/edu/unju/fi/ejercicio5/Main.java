package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese numero: ");
		int num = sc.nextInt();
		sc.close();
		if(num>=1 && num<=9) {
			for(int i=1;i<=10;i++) {
				int multi=num*i;
				System.out.println(num+"x"+i+"="+multi);
			}
		}else {
			System.out.println("El numero esta fuera de rango");
		}

	}

}
