package com.open_bootcamp;

    /*
        Primera parte:
            -Crear una función con tres parámetros que sean números que se suman entre sí.
            -Llamar a la función en el main y darle valores.

        Segunda parte:
            -Crear una clase coche.
            -Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
            -Una función que incremente el número de puertas que tiene el coche.
            -Crear un objeto miCoche en el main y añadirle una puerta.
            -Mostrar el número de puertas que tiene el objeto.
     */

public class Main {

    public static void main(String[] args) {
        suma(20, 50, 30);

        Coche miCoche = new Coche();

        miCoche.sumarPuertas();
        miCoche.sumarPuertas();
        System.out.println(miCoche.numeroPuertas);
    }

    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}
class Coche {
    public int numeroPuertas = 3;

    public void sumarPuertas(){

        this.numeroPuertas++;
    }
}
