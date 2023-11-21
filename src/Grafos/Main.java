package Grafos;

public class Main
{
    public static void main (String[] args)
    {

        String[] vértices = new String [] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        Grafo grafo = new Grafo (vértices);
        grafo.conectar("A", "C",  4);
        grafo.conectar("A","B", 2);
        grafo.conectar("A","D", 3);
        grafo.conectar("B","E", 7);
        grafo.conectar("B","F", 4);
        grafo.conectar("B","G", 6);
        grafo.conectar("C","E", 3);
        grafo.conectar("C","F", 2);
        grafo.conectar("C","G", 4);
        grafo.conectar("D","E", 4);
        grafo.conectar("D","F", 1);
        grafo.conectar("D","G", 5);
        grafo.imprimir();

    }
}
