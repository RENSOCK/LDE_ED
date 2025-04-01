/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ManuelRios
 */
public class LDE {
     /** 
     * Inicializa los valores 
     */
    private Nodo Inicial; 
    private Nodo Final;  // Puntero al último nodo
    private int tam;

    /**
     * Nos permite conocer si la lista está vacía o no
     * 
     * @return true si "Inicial" es nulo (la lista está vacía), false en caso de que contenga algún nodo.
     */
    public boolean isEmpty() { 
        return Inicial == null;  // Devuelve true si 'Inicial' es null, indicando que la lista está vacía.
    }

    /**
     * Devuelve el tamaño actual de la lista.
     * 
     * @return El tamaño de la lista, es decir, la cantidad de nodos en ella.
     */
    public int size() { 
        return tam;  // Retorna el valor de 'tam', que representa la cantidad de elementos en la lista.
    }

}
