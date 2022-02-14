// Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola, indicar cual es la longitud de esta frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u”.
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.HashMap;

public class LongitudFrase {
    public static void main(String[] args) {

        String frase;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        frase = teclado.nextLine();

        System.out.println("la frase : " + frase + " tiene " + frase.length()+ " caracteres ");



            }


    }

