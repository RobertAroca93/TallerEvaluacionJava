public class Program {
    public static void main(String[] args) {
        Electrodomestico listaElectrodomesticos[]=new Electrodomestico[10];
        listaElectrodomesticos[0]=new Electrodomestico(150, 70, 'E', "negro");
        listaElectrodomesticos[1]=new Lavadora(250, 40);
        listaElectrodomesticos[2]=new Television(400, 30, 'C', "Blanco", 42, false);
        listaElectrodomesticos[3]=new Electrodomestico();
        listaElectrodomesticos[4]=new Electrodomestico(200, 50, 'Z', "Verde");
        listaElectrodomesticos[5]=new Lavadora(600, 30, 'E', "blanco", 40);
        listaElectrodomesticos[6]=new Television(350, 50);
        listaElectrodomesticos[7]=new Lavadora(300, 90, 'A', "negro", 15);
        listaElectrodomesticos[8]=new Television(500, 70, 'E', "gris", 30, true);
        listaElectrodomesticos[9]=new Electrodomestico(150, 30);
        int valorElectrodomesticos=0;
        int valorLavadoras=0;
        int valorTelevisores=0;
        for(int i=0;i<listaElectrodomesticos.length;i++){
            if(listaElectrodomesticos[i] instanceof Electrodomestico){
                valorElectrodomesticos+=listaElectrodomesticos[i].PrecioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavadora){
                valorLavadoras+=listaElectrodomesticos[i].PrecioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Television){
                valorTelevisores+=listaElectrodomesticos[i].PrecioFinal();
            }
        }
        System.out.println("Precio Total Electrodomesticos: "+valorElectrodomesticos);
        System.out.println("Precio Total Lavadoras: "+valorLavadoras);
        System.out.println("Precio Total Televisores: "+valorTelevisores);

    }
}
