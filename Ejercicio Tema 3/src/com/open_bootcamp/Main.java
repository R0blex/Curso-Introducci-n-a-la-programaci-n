package com.open_bootcamp;

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
