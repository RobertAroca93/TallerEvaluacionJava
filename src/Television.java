public class Television extends Electrodomestico{

    private final static int RESOLUCION=20;

    private int Resolucion;

    private boolean SintonizadorTDT;

    public Television(){
        this(PRECIO_BASE, PESO, CONSUMO_ENERGETICO, COLOR, RESOLUCION, false);
    }
    public Television(int precioBase, int peso){
        this(precioBase, peso, CONSUMO_ENERGETICO, COLOR, RESOLUCION, false);
    }
    public Television(int precioBase, int peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.Resolucion=resolucion;
        this.SintonizadorTDT=sintonizadorTDT;
    }
    public int getResolucion() {
        return Resolucion;
    }
    public boolean getSintonizador() {
        return SintonizadorTDT;
    }
    public int PrecioFinal(){
        int adicional=super.PrecioFinal();
        if (Resolucion>40){
            adicional+=(PrecioBase*30/100);
        }
        if (SintonizadorTDT){
            adicional+=50;
        }

        return adicional;
    }
}