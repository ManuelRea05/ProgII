package Ejercicios;
import java.util.ArrayList;

public class Electrodomestico {
    private int precioBase;
    private String color;
    private char consumoEnerg;
    private int peso;

    private static final char CONSUMO_DEFECT = 'F';

    public Electrodomestico() {
        precioBase = 100000;
        color = "blanco";
        consumoEnerg = CONSUMO_DEFECT;
        peso = 5;
    }

    public Electrodomestico(int precioBase, int peso){
        this.precioBase = precioBase;
        this.peso = peso;
        color = "blanco";
        consumoEnerg = CONSUMO_DEFECT;
    }

    public Electrodomestico(int precioBase, String color, char consumoEnerg, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnerg = consumoEnerg;
        this.peso = peso;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnerg() {
        return consumoEnerg;
    }

    public int getPeso() {
        return peso;
    }

    public void comprobarConsumoEnergetico(char letra) {
        char consumoEnergetico;
        // Cambia la letra a mayuscula si está en minuscula y la guarda en la variable
        char letraMayuscula = Character.toUpperCase(letra);

        if (letraMayuscula >= 'A' && letraMayuscula <= 'F') {
            consumoEnergetico = letraMayuscula;
        } else {
            consumoEnergetico = CONSUMO_DEFECT;
        }
    }

    public void comprobarColor(String color) {
        String colorMinusculas = color.toLowerCase();

        ArrayList<String> coloresPermitidos = new ArrayList<>();
        coloresPermitidos.add("blanco");
        coloresPermitidos.add("negro");
        coloresPermitidos.add("rojo");
        coloresPermitidos.add("azul");
        coloresPermitidos.add("gris");

        if (coloresPermitidos.contains(colorMinusculas)){
            this.color = colorMinusculas;
        }
        else {
            this.color = "blanco";
        }
    }

    public void precioFinal(){
        
    }


}

