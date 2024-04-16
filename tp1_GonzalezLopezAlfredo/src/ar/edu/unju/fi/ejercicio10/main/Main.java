package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Pizza[] pizzas = new Pizza[3];

        for (int i = 0; i < 3; i++) {
            Pizza pizza = new Pizza();

            System.out.println("** Pizza " + (i + 1) + " **");
            System.out.print("Ingrese el diámetro (20, 30 o 40): ");
            int diametro = scanner.nextInt();
            scanner.nextLine();  

            if (diametro != 20 && diametro != 30 && diametro != 40) {
                System.out.println("Diámetro inválido. Debe ser 20, 30 o 40.");
                i--;  
                continue;
            }

            pizza.setDiametro(diametro);

            System.out.print("¿Lleva ingredientes especiales? (true/false): ");
            boolean ingredientesEspeciales = scanner.nextBoolean();
            scanner.nextLine();  

            pizza.setIngredientesEspeciales(ingredientesEspeciales);

            pizza.calcularPrecio();
            pizza.calcularArea();

            pizzas[i] = pizza;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("** Pizza " + (i + 1) + " **");
            System.out.println("Diámetro = " + pizzas[i].getDiametro());
            System.out.println("Ingredientes especiales = " + pizzas[i].isIngredientesEspeciales());
            System.out.println("Precio Pizza = " + pizzas[i].getPrecio() + "$");
            System.out.println("Área de la pizza = " + pizzas[i].getArea());
            System.out.println();
        }

        scanner.close();
	}
}