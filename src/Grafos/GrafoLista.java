package Grafos;
import java.util.List;

public class GrafoLista {
    List[] listaAdyacencia;
    String[] vertices;

    public GrafoLista(String[] vertices){
        this.vertices = vertices;
        listaAdyacencia = new List[vertices.length];
    }

}
