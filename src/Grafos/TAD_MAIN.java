package Grafos;

public class TAD_MAIN {
    public static void main(String[] args) {
        String[] vertices = new String [] {"A", "B", "C"};

        GrafoLista grafo1 = new GrafoLista (vertices);

        Grafo grafo2 = new Grafo(vertices);

        grafo2.conectar("A", "B", 10);
        grafo2.conectar("B", "C", 15);
        grafo2.imprimir();
    }

}
