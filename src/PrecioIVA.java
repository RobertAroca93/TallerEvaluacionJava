import javax.swing.JOptionPane;
import java.text.DecimalFormat;

//Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.

public class PrecioIVA {

    public static void main(String[] args) {

        final double IVA = 0.21;

        String texto = JOptionPane.showInputDialog("Ingrese el precio del producto");
        //Pasamos es string a double
        double precio = Double.parseDouble(texto);
        double precioFinal= precio +(precio* IVA);
        System.out.println("El precio del producto mas el iva es :" + precioFinal);


    }
}
