package Listas;

public class ListaSimple {
    private Nodo primero;
    public int tamaño;
    public ListaSimple() {
        this.primero = null;
        this.tamaño = 0;
    }
    public boolean vacia() {
        return this.primero == null;
    }
    public void agregar(String valor) {
        Nodo nuevo = new Nodo(valor);

        if (vacia()) {
            // agregamos el primer nodo
            this.primero = nuevo;
        } else {
            // se tiene que recorrer la lista hasta llegar al ultimo nodo
            Nodo aux = this.primero;

            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;}
        this.tamaño++;
    }
    public void eliminarUltimo() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            // se tiene que recorrer la lista hasta llegar al ultimo nodo
            Nodo aux = primero;
            Nodo nodoAnterior = aux;

            while (aux.siguiente != null) {
                nodoAnterior = aux;
                aux = aux.siguiente;
            }

            // Verifico si realmente avanzó en la lista hasta llegar al
            // último nodo que sea distinto del primero.
            // Si estoy en el primero, entonces lo hago null para indicar que la lista esta vacia.
            if (aux == this.primero) {
                this.primero = null;
            } else {
                // Le indico al nodo anterior que no apunte más al nodo a eliminar "aux".
                nodoAnterior.siguiente = null;
            }

            // Decremento el tamaño
            this.tamaño--;
        }
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            Nodo aux = this.primero;
            for(int i = 0; i<this.tamaño; i++) {
                System.out.println(aux.valor);
                aux = aux.siguiente;
            }
        }
    }
    public String obtenerValorEnPosicion(int posicion) {
        if (posicion < 0 || posicion >= tamaño) {
            // La posición está fuera de los límites de la lista
            return null;
        } else {
            Nodo aux = primero;
            for (int i = 0; i < posicion; i++) {
                aux = aux.siguiente;
            }
            return aux.valor;
        }
    }

}