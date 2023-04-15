package org.example;

public class Triangulo extends Figuras2D {

    private int ladoA;
    private int ladoB;
    private int ladoC;

    private double altura;

    public Triangulo(int ladoA, int ladoB, int ladoC, double altura) {
//el lado A será el lado base (ancho)
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        if (esEquilatero()) {
            this.nombre = "triangulo equilatero";
        } else if (esIsosceles()) {
            this.nombre = "triangulo isosceles";
        } else {
            this.nombre = "triangulo escaleno";
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
        this.area = ladoA * altura / 2;
    }

    @Override
    protected void calcularPerimetro() {
        this.perimetro = ladoA + ladoB + ladoC;
    }

    @Override
    public void imprimir() {
        System.out.println("El nombre de la figura es " + nombre + " su area es " + area + "cm^2 " + " y su perímetro es " + perimetro + "cm");
    }

    private boolean esEquilatero() {
        return ladoA == ladoB && ladoB == ladoC;
    }

    private boolean esIsosceles() {
        return ladoA == ladoB || ladoC == ladoA || ladoC == ladoB;
    }


}
