package Listas;

public class Main {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        lista.agregar("A");
        lista.agregar("B");
        lista.agregar("C");

        System.out.println("Elementos de la lista:");
        lista.imprimir();

        System.out.println("Valor en la posición 1: " + lista.obtenerValorEnPosicion(1));
        System.out.println("Valor en la posición 2: " + lista.obtenerValorEnPosicion(2));
        System.out.println("Tamaño de la lista: " + lista.tamaño);
    }
}

