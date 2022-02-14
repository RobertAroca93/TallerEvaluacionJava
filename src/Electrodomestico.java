import java.util.Arrays;
public class Electrodomestico {
    public int PrecioBase;
    public String Color;
    public char ConsumoEnergetico;
    public int Peso;

    protected final static String COLOR = "Blanco";
    protected final static char CONSUMO_ENERGETICO = 'F';
    protected final static int PRECIO_BASE = 100;
    protected final static int PESO = 5;

    public Electrodomestico(){}
    public Electrodomestico(int precio, int peso){
        PrecioBase = precio;
        Peso = peso;
        Color = COLOR;
        ConsumoEnergetico = CONSUMO_ENERGETICO;
    }
    public Electrodomestico(int precio, int peso,char consumo, String color){
        PrecioBase = precio;
        Peso = peso;
        Color = color;
        ConsumoEnergetico = consumo;
    }
    public double GetPrecioBase() {
        return PrecioBase;
    }
    public String GetColor() {
        return Color;
    }
    public char GetConsumoEnergetico() {
        return ConsumoEnergetico;
    }
    public double getPeso() {
        return Peso;
    }
    public void ComprobarConsumo(char consumo){

        if(consumo>=65 && consumo<=70){
            this.ConsumoEnergetico=consumo;
        }else{
            this.ConsumoEnergetico=consumo;
        }

    }
    private void ComprobarColor(String color){
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        Arrays.sort(colores);
        int res = Arrays.binarySearch(colores, color);
        if(res>0){
            this.Color=color;
        }else{
            this.Color=COLOR;
        }
    }
    public int PrecioFinal(){
        int adicional=AdicionalPorConsumo()+AdicionalPorPeso();

        return PrecioBase+adicional;
    }
    public int AdicionalPorConsumo(){
        int adicional=0;
        switch(ConsumoEnergetico){
            case 'A':
                adicional+=100;
                break;
            case 'B':
                adicional+=80;
                break;
            case 'C':
                adicional+=60;
                break;
            case 'D':
                adicional+=50;
                break;
            case 'E':
                adicional+=30;
                break;
            case 'F':
                adicional+=10;
                break;
        }
        return adicional;
    }
    public int AdicionalPorPeso(){
        int adicional=0;
        if(Peso>=0 && Peso<19){
            adicional+=10;
        }else if(Peso>=20 && Peso<49){
            adicional+=50;
        }else if(Peso>=50 && Peso<=79){
            adicional+=80;
        }else if(Peso>=80){
            adicional+=100;
        }
        return adicional;
    }

}
