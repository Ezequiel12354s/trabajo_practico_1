package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
    private int precio;
    private double area;
    private boolean ingredientesEspeciales;

    public static final int ADICIONAL_INGREDIENTES_20 = 500;
    public static final int ADICIONAL_INGREDIENTES_30 = 750;
    public static final int ADICIONAL_INGREDIENTES_40 = 1000;

    public Pizza() {
        
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isIngredientesEspeciales() {
        return ingredientesEspeciales;
    }

    public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
        this.ingredientesEspeciales = ingredientesEspeciales;
    }

    public void calcularPrecio() {
        if (diametro == 20) {
            precio = 4500 + (ingredientesEspeciales ? ADICIONAL_INGREDIENTES_20 : 0);
        } else if (diametro == 30) {
            precio = 4800 + (ingredientesEspeciales ? ADICIONAL_INGREDIENTES_30 : 0);
        } else if (diametro == 40) {
            precio = 5500 + (ingredientesEspeciales ? ADICIONAL_INGREDIENTES_40 : 0);
        }
    }

    public void calcularArea() {
        area = Math.PI * Math.pow(diametro / 2.0, 2);
    }
}
