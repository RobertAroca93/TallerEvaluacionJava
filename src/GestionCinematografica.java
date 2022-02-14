import java.util.Scanner;

public class GestionCinematografica {
    public static void main(String[] args) {

        String seleccion="";
        int seleccionNumber =0;
        do {
            System.out.println("****** GESTION CINEMATOGRÁFICA ********");
            System.out.println("1-NUEVO ACTOR");
            System.out.println("2-BUSCAR ACTOR");
            System.out.println("3-ELIMINAR ACTOR");
            System.out.println("4-MODIFICAR ACTOR");
            System.out.println("5-VER TODOS LOS ACTORES");
            System.out.println("6- VER PELICULAS DE LOS ACTORES");
            System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORE");
            System.out.println("8-SALIR");
            Scanner leer=new Scanner(System.in);
            seleccion = leer.nextLine();
            seleccionNumber = Integer.parseInt(seleccion);
            if(seleccionNumber > 8 || seleccionNumber<1){
                System.out.println("OPCION INCORRECTO");
                seleccionNumber = 1;
            }
        }while(seleccionNumber<8 &&seleccionNumber>0);

    }
}


