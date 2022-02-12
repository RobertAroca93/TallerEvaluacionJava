package Ejercicios.Java;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Sofka {

    public static void main(String[] args) {
        //Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.
        //Agregar entrada por consola de dos valores e indicar si son mayores, menores o iguales.

        Scanner teclado = new Scanner(System.in);

        int v1= 2;
        int v2= 9;

        System.out.println("Ingrese el primer valor");
        v1=teclado.nextInt();
        System.out.println("Ingrese el segundo valor");
        v2=teclado.nextInt();


        if(v1>= v2){
            if(v1==v2){
                System.out.println("la variable " + v1 +" y " + v2 + " son iguales");
            }else{
                System.out.println("la variable "+ v1 + " es mayor que "+ v2);
            }
        }else {
            System.out.println(" la variable " + v1 + " es menor que "+v2);
        }


    }
}
