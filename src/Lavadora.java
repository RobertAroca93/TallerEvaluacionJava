public class Lavadora extends Electrodomestico{

    private final static int CARGA=5;
    private int Carga;
    public Lavadora(){
        this(PRECIO_BASE, PESO, CONSUMO_ENERGETICO, COLOR, CARGA);
    }
    public Lavadora(int precioBase, int peso){
        this(precioBase, peso, CONSUMO_ENERGETICO, COLOR, CARGA);
    }
    public Lavadora(int precioBase, int peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.Carga=carga;
    }
    public int getCarga() {
        return Carga;
    }
    public int PrecioFinal(){
        int adicional=super.PrecioFinal();
        if (Carga>30){
            adicional+=50;
        }

        return adicional;
    }
}