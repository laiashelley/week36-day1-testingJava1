package com.example;

public class M313 {
    public static void main(String[] args) {
        

        boolean resultado1 = puedeVotar(true, 20);
        System.out.println("¿La persona puede votar (ciudadano, 20 años)? " + resultado1);

        boolean resultado2 = puedeVotar(true, 16);
        System.out.println("¿La persona puede votar (ciudadano, 16 años)? " + resultado2);

        boolean resultado3 = puedeVotar(false, 16);
        System.out.println("¿La persona puede votar (no ciudadano, 16 años)? " + resultado3);  


    }

    public static boolean puedeVotar(boolean ciudadano, int edad) {
        return ciudadano && edad >= 18;
    }

}