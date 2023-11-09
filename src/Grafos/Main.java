package Grafos;

public class Main
{
    public static void main (String[] args)
    {

        String[] vértices = new String [] {"A", "B", "C", "D", "E", "F", "G", "F"};
        Grafo grafo = new Grafo (vértices);
        grafo.conectar("A", "C",  5);
        grafo.conectar("A","B", 3);
        grafo.imprimir();

    }
}
