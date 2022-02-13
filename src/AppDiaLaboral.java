//Crea una aplicación por consola que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello.
import java.util.Scanner;

public class AppDiaLaboral {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana");
        String dia= sc.next();

        switch (dia){
            case "Lunes":
            case "Martes":
            case "Miercoles":
            case "Jueves":
            case "Viernes":
                System.out.println("Es dia laboral");
            break;
            case "Sabado":
            case "Domingo":
                System.out.println("Es dia festivo");
            default:
                System.out.println("Ingrese un dia de la semana");

        }
    }

}
