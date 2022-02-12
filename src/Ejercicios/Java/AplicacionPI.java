package Ejercicios.Java;
import javax.swing.*;

public class AplicacionPI {
    public static void main(String[] args) {
//Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.

        String texto= JOptionPane.showInputDialog("Ingrese el radio");
        //Pasamos el string a double
        double radio= Double.parseDouble(texto);
        //Calculamos el area del circulo
        double area=Math.PI*Math.pow(radio,2);
        System.out.println("el area del circulo es : "+ area);
    }

}

