//Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.

public class ParImparWhile {
    public static void main(String[] args) {

        int numero=1;
        while(numero <= 100){
            if(numero%2==0){
                System.out.println( numero + "es numero par");
            }else{
                System.out.println( numero + "es numero impar");
            }
            numero++;
        }
    }
}

