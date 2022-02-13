////Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usando for.
public class ParImparFor {

    public static void main(String[] args) {



        for(int num=1;num<=100;num++){
            if(num%2==0){
                System.out.println(num  + " es un numero par");
            }else {
                System.out.println(num  + " es un numero impar");
            }
        }

    }
}
