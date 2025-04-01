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
 /**
     * Añade un nodo al inicio de la lista.
     * 
     * @param nN El nodo a ser añadido al principio de la lista.
     * @return true si el nodo fue añadido correctamente, false en caso de algún error.
     */
    public boolean addFirst(Nodo nN) {
        if (this.isEmpty()) {  // Si la lista está vacía (Inicial es null)
            Inicial = nN;  // El nodo se convierte en el primer nodo de la lista.
            Final = nN;  // Como la lista tiene un solo nodo, 'Final' también apunta al mismo nodo.
            tam++;  // Se incrementa el tamaño de la lista.
            return true;  // El nodo fue añadido correctamente.
        } else {
            nN.setSiguiente(Inicial);  // El nuevo nodo apunta al antiguo primer nodo.
            Inicial.setAnterior(nN);  // El antiguo primer nodo apunta atrás al nuevo nodo.
            Inicial = nN;  // El nuevo nodo es el primero de la lista.
            tam++;  // Se incrementa el tamaño de la lista.
            return true;  // El nodo fue añadido correctamente.
        }
    }

}
