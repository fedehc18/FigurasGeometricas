package org.example;

public class Cubo extends Figuras3D {


    private int lado;


    public Cubo(int lado) {
        this.nombre = "cubo";
        this.lado = lado;


    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public void calcularDatos() {
        this.calcularArea();
        this.calcularPerimetro();
        this.calcularVolumen();
    }

    @Override
    protected void calcularArea() {
        this.area = lado * lado * 6;

    }

    @Override
    protected void calcularPerimetro() {
        this.perimetro = lado * 12;
    }

    @Override
    protected void calcularVolumen() {
        this.volumen = lado * lado * lado;
    }

    @Override
    public void imprimir() {
        System.out.println("El nombre de la figura es " + nombre + " su area es " + area + "cm^2 " + " y su perímetro es " + perimetro + "cm" + " y su volumen es " + volumen + " cm^3");
    }
}
