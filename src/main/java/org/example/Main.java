package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        List<Figura> figurasGeometricas = new ArrayList<>();
        Rectangulo cuadrado = new Rectangulo(4, 4);
        Rectangulo rectangulo = new Rectangulo(4, 5);
        Triangulo trianguloEquilatero = new Triangulo(10, 10, 10, 8.66);
        Triangulo trianguloIsosceles = new Triangulo(8, 6, 8, 5.56);
        Triangulo trianguloEscaleno = new Triangulo(5, 4, 3, 2.4);
        Cubo cubo = new Cubo(6);
        Cilindro cilindro = new Cilindro(10, 10);

        figurasGeometricas.add(cuadrado);
        figurasGeometricas.add(rectangulo);
        figurasGeometricas.add(trianguloEquilatero);
        figurasGeometricas.add(trianguloIsosceles);
        figurasGeometricas.add(trianguloEscaleno);
        figurasGeometricas.add(cubo);
        figurasGeometricas.add(cilindro);


        for (Figura elemento : figurasGeometricas) {
            elemento.calcularDatos();
        }

        imprimirDatos(figurasGeometricas);
    }

    public static void imprimirDatos(List<Figura> lista) {
        for (Figura elemento : lista) {
            elemento.imprimir();
        }
    }
}