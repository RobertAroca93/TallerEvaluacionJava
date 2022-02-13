//Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.
package Ejercicios.Java;
import javax.swing.JOptionPane;

public class EliminaEspacios {
    public static void main(String[] args) {

        String texto=JOptionPane.showInputDialog(null, "Ingrese una frase", "Inserción", JOptionPane.INFORMATION_MESSAGE);
        String texto_sin_espacios="";
        char caracterActual;

        for(int i=0;i<texto.length();i++){

            caracterActual=texto.charAt(i);

            if(caracterActual!=' '){
                texto_sin_espacios+=String.valueOf(caracterActual);
            }

        }

        JOptionPane.showMessageDialog(null,
                "La frase sin espacios es :"+ texto_sin_espacios,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);

    }

}
