/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ManuelRios
 */
class Nodo {
    private int valor;  // El valor almacenado en el nodo.
    private Nodo Siguiente;  // Referencia al siguiente nodo en la lista.

     private Nodo Anterior; //Referencia al nodo anterior en al lista
    /**
     * Constructor de la clase Nodo. Inicializa el valor del nodo.
     * 
     * @param valor El valor que se almacenará en el nodo.
     */
    public Nodo(int valor) {
        this.valor = valor;  // Asigna el valor proporcionado al campo 'valor' del nodo.
    }

    /**
     * Obtiene el valor almacenado en el nodo.
     * 
     * @return El valor almacenado en el nodo.
     */
    public int getValor() {
        return valor;  // Devuelve el valor del nodo.
    }

    /**
     * Establece un nuevo valor para el nodo.
     * 
     * @param valor El nuevo valor que se asignará al nodo.
     */
    public void setValor(int valor) {
        this.valor = valor;  // Establece un nuevo valor en el nodo.
    }

    /**
     * Obtiene el siguiente nodo en la lista enlazada.
     * 
     * @return El siguiente nodo en la lista.
     */
    public Nodo getSiguiente() {
        return Siguiente;  // Devuelve la referencia al siguiente nodo.
    }

    /**
     * Establece el siguiente nodo en la lista enlazada.
     * 
     * @param Siguiente El nodo que se establecerá como siguiente del nodo actual.
     */
    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;  // Asigna el siguiente nodo de la lista.
    }
    
    /**
     * Obtiene el Anterior nodo en la lista enlazada.
     * 
     * @return El Anterior nodo en la lista.
     */
    public Nodo getAnterior() {
        return Anterior;  // Devuelve la referencia al anterior nodo.
    }
    
    /**
     * Obtiene el Anterior nodo en la lista enlazada.
     * 
     * @return El Anterior nodo en la lista.
     */
    public Nodo setAnterior(Nodo Anterior) {
        return Anterior;  // Devuelve la referencia al Anterior nodo.
    }
}
