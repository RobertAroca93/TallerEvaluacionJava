//Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza todas las a del String anterior por una e, adicionalmente concatenar a esta frase una adicional que ustedes quieran incluir por consola y las muestre luego unidas.
import java.lang.String;


public class AppCambiaLetras {
    public static void main(String[] args) {

        String cadena = "La sonrisa sera la mejor arma contra la tristeza";
        System.out.println(cadena.replace("a","e"));

        String cadena2 = " y la maldad";
        System.out.println(cadena + cadena2);
    }
}
