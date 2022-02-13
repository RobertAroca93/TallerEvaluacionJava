//Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
import javax.swing.JOptionPane;
import java.util.Scanner;


public class MayorIgualqueCero {

    public static void main(String[] args) {

        int codigo;
        do {
            String texto = JOptionPane.showInputDialog("Ingrese un numero mayor que cero");
            codigo = Integer.parseInt(texto);
        }while (codigo<=0);
        System.out.println(codigo);
        }


    }

