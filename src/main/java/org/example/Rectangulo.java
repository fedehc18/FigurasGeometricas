package org.example;

public class Rectangulo extends Figuras2D {

    private int ladoA;
    private int ladoB;

    public Rectangulo(int ladoA, int ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        if (esCuadrado()) {
            this.nombre = "cuadrado";
        } else {
            this.nombre = "rectángulo";
        }
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public void calcularDatos() {
        this.calcularArea();
        this.calcularPerimetro();
    }

    @Override
    protected void calcularArea() {
        this.area = ladoA * ladoB;
    }

    @Override
    protected void calcularPerimetro() {
        this.perimetro = ladoA * 2 + ladoB * 2;
    }

    @Override
    public void imprimir() {
        System.out.println("El nombre de la figura es " + nombre + " su area es " + area + "cm^2 " + " y su perímetro es " + perimetro + "cm");
    }

    private boolean esCuadrado() {
        return ladoB == ladoA;
    }
}
