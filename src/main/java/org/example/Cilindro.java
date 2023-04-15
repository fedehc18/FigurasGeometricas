package org.example;

public class Cilindro extends Figuras3D {
    private int radio;
    private int altura;

    public Cilindro(int radio, int altura) {
        this.nombre = "cilindro";
        this.radio = radio;
        this.altura = altura;

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

        this.area = 2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2);
    }

    @Override
    protected void calcularPerimetro() {
        this.perimetro = 2 * Math.PI * radio;
    }

    @Override
    protected void calcularVolumen() {
        this.volumen = Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public void imprimir() {
        System.out.println("El nombre de la figura es " + nombre + " su area es " + Math.round(area) + "cm^2 " + " y su perímetro es " + Math.round(perimetro) + "cm" + " y su volumen es " + Math.round(volumen) + " cm^3");
    }
}
