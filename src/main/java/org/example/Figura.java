package org.example;

abstract public class Figura implements Imprimible {
    protected String nombre;

    abstract public String obtenerNombre();

    abstract public void calcularDatos();

}
