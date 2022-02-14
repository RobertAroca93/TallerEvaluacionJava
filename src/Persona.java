public class Persona {
    public String Nombre;
    public int Edad;
    public int Peso;
    public int Altura;
    public String DNI;
    public char Sexo;
    final char sexoHombre = 'M';
    final int bajoIndice = -1;
    final int idealIndice = 0;
    final int sobrepeso = 1;
    public Persona(){
        DNI = generarDni();
        comprobarSexo();
    }
    public Persona(String nombre,int edad, char sexo){
        this.Nombre=nombre;
        this.Edad=edad;
        this.Sexo = sexo;
        this.DNI = generarDni();
        comprobarSexo();
    }
    public Persona(String nombre,int edad, char sexo,int peso,int altura){
        this.Nombre=nombre;
        this.Edad=edad;
        this.Sexo = sexo;
        this.DNI = generarDni();
        this.Peso = peso;
        this.Altura=altura;
        comprobarSexo();
    }
    public int calcularIMC(){
        float alturaMetros = (float)Altura/100;
        int IMC =(int)(Peso/(alturaMetros*alturaMetros));
        if(IMC<20)
            return bajoIndice;
        else if(IMC>19 && IMC <26)
            return idealIndice;
        else
            return sobrepeso;
    }
    public boolean esMayorDeEdad(){
        if(Edad>17)
            return true;

        return false;
    }
    private void comprobarSexo(){
        if(Sexo!='M' && Sexo!='F')
            Sexo = sexoHombre;
    }
    public String toString(){
        String result = "Nombre:"+Nombre+" Edad:"+String.valueOf(Edad)+" Peso:"+String.valueOf(Peso);
        result += " Altura:"+String.valueOf(Altura) + " DNI:"+ DNI +" Sexo:"+ Sexo;
        return result;
    }
    private String generarDni() {

        final int divisor = 23;
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));

        int result = numDNI - (numDNI / divisor * divisor);
        char letraDNI = obtenerLetra(result);
        return Integer.toString(numDNI) + letraDNI;

    }
    private char obtenerLetra(int result) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y','F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z','S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[result];
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public void setEdad(int edad) {
        this.Edad = edad;
    }
    public void setSexo(char sexo) {
        Sexo = sexo;
    }
    public void setPeso(int peso) {
        Peso = peso;
    }
    public void setAltura(int altura) {
        Altura = altura;
    }
}
