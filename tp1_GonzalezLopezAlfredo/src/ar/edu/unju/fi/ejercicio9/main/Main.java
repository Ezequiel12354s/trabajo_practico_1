package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Producto producto = new Producto();
		
		System.out.println("Ingrese la cantidad de productos que desea registrar: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Ingrese nombre del producto: ");
			producto.setNombre(sc.next());
			System.out.println("Ingrese el codigo del producto: ");
			producto.setCodigo(sc.nextInt());
			System.out.println("Ingrese precio del producto: ");
			producto.setPrecio(sc.nextDouble());
			
			do {
				System.out.println("Ingrese el descuento que queria aplicar: ");
				producto.setDescuento(sc.nextInt());
			}while(producto.getDescuento()< 0 || producto.getDescuento()>50);
			double precioDescuento=producto.calcularDescuento(producto.getPrecio(),producto.getDescuento());
			System.out.println("Nombre del producto: "+producto.getNombre());
			System.out.println("Codigo del producto: "+producto.getCodigo());
			System.out.println("Precio del producto: "+producto.getPrecio());
			System.out.println("Descuento del producto: "+producto.getDescuento()+" %");
			System.out.println("Precio con descuento: "+precioDescuento);
			
		}
		sc.close();
	}
}


