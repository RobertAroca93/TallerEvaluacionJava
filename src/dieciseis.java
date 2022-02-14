import java.util.Scanner;
public class dieciseis {
    public static void main(String[] args) {
        String nombre = "";
        int edad = 0;
        char sexo;
        int peso=0;
        int altura = 0;
        System.out.println("Ingrese Nombre:");
        Scanner leer = new Scanner(System.in);
        nombre = leer.nextLine();
        System.out.println("Ingrese Edad:");
        edad = Integer.parseInt(leer.nextLine()) ;
        System.out.println("Ingrese Sexo:");
        sexo =leer.nextLine().charAt(0) ;
        System.out.println("Ingrese Peso:");
        peso = Integer.parseInt(leer.nextLine()) ;
        System.out.println("Ingrese Altura:");
        altura = Integer.parseInt(leer.nextLine()) ;
        Persona primeraPersona = new Persona(nombre,edad,sexo,peso,altura);
        Persona segundaPersona = new Persona(nombre,edad,sexo);
        Persona terceraPersona = new Persona();
        terceraPersona.setNombre("Robert");
        terceraPersona.setEdad(27);
        terceraPersona.setAltura(175);
        terceraPersona.setPeso(70);
        mostrarEstadoIMC(primeraPersona.calcularIMC(),primeraPersona.Nombre);
        mostrarEstadoIMC(segundaPersona.calcularIMC(),segundaPersona.Nombre);
        mostrarEstadoIMC(terceraPersona.calcularIMC(),terceraPersona.Nombre);
        mostrarEstadoEdad(primeraPersona.esMayorDeEdad(),primeraPersona.Nombre);
        mostrarEstadoEdad(segundaPersona.esMayorDeEdad(),segundaPersona.Nombre);
        mostrarEstadoEdad(terceraPersona.esMayorDeEdad(),terceraPersona.Nombre);
        System.out.println(primeraPersona.toString());
        System.out.println(segundaPersona.toString());
        System.out.println(terceraPersona.toString());
    }
    public static void mostrarEstadoIMC(int resultIMC,String nombre){
        switch (resultIMC){
            case -1:
                System.out.println(nombre + ": Tiene bajo indice de masa corporal");
                break;
            case 0:
                System.out.println(nombre + ": Tiene indice de masa corporal ideal");
                break;
            case 1:
                System.out.println(nombre + ": Tiene sobrepeso");
                break;
        }
    }
    public static void mostrarEstadoEdad(boolean resultEdad,String nombre){
        if(resultEdad)
            System.out.println(nombre + ": Es Mayor de edad");
        else
            System.out.println(nombre + ": Es Menor de edad");

    }
}