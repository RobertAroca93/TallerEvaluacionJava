//Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.

import java.util.Scanner;

public class PalabrasIguales {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor ingrese una palabra");
        String palabra1 = teclado.next();
        System.out.println("Por favor ingrese otra palabra");
        String palabra2 = teclado.next();

        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println("Las palabras son diferentes");



        }
    }}


