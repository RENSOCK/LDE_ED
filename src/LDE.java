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
  /**
     * Imprime la lista en la consola de forma legible.
     * Se imprime cada valor de los nodos separados por " <--> ".
     */
    public void imprimirListaConsola() {
        Nodo nActual = Inicial;  // Inicia desde el primer nodo.
        while (nActual != null) {  // Mientras no se llegue al final de la lista (nActual sea null)
            System.out.print(nActual.getValor() + "<-->");
            nActual = nActual.getSiguiente();  // Avanza al siguiente nodo en la lista.
        }
    }
    /**
     * Elimina el último nodo de la lista.
     * 
     * @return true si el nodo fue eliminado correctamente, false si no se pudo eliminar.
     */
    public boolean removeLast() {
        if (size() == 1) {  // Si la lista tiene solo un nodo
            Inicial = null;  // Elimina el primer (y único) nodo, dejando la lista vacía.
            Final = null;  // También se debe actualizar el puntero 'Final'.
            tam = 0;  // Se actualiza el tamaño de la lista.
            return true;  // Se eliminó el nodo correctamente.
        } else if (size() > 1) {  // Si la lista tiene más de un nodo
            Final = Final.getAnterior();  // El nodo anterior al último nodo pasa a ser el último.
            Final.setSiguiente(null);  // El nuevo último nodo apunta a null.
            tam--;  // Se decrementa el tamaño de la lista.
            return true;  // El nodo fue eliminado correctamente.
        } else {
            return false;  // Si la lista está vacía, no se puede eliminar un nodo.
        }
    }
/**
     * Añade un nodo al final de la lista.
     * 
     * @param nN El nodo que se desea agregar al final de la lista.
     * @return true si el nodo fue añadido correctamente, false en caso contrario.
     */
    public boolean addLast(Nodo nN) {
        if (this.isEmpty()) {  // Si la lista está vacía
            Inicial = nN;  // El nodo se convierte en el primer nodo de la lista.
            Final = nN;  // 'Final' también apunta al mismo nodo.
            tam++;  // Se incrementa el tamaño de la lista.
            return true;  // El nodo fue añadido correctamente.
        } else {  // Si la lista no está vacía
            nN.setAnterior(Final);  // El nuevo nodo apunta al antiguo último nodo.
            Final.setSiguiente(nN);  // El antiguo último nodo apunta al nuevo nodo.
            Final = nN;  // El nuevo nodo es el último de la lista.
            tam++;  // Se incrementa el tamaño de la lista.
            return true;  // El nodo fue añadido correctamente.
        }
    }
    /**
     * Elimina el primer nodo de la lista.
     * 
     * @return true si el primer nodo fue eliminado correctamente, false si la lista está vacía.
     */
    public boolean removeFirst() {
        if (this.isEmpty()) {  // Si la lista está vacía
            return false;  // No se puede eliminar un nodo de una lista vacía.
        }
        Nodo nodoAEliminar = Inicial;  // Se guarda el primer nodo en una variable auxiliar.
        Inicial = Inicial.getSiguiente();  // El primer nodo se elimina al hacer que 'Inicial' apunte al siguiente nodo.
        if (Inicial != null) {
            Inicial.setAnterior(null);  // El nuevo primer nodo no debe tener un nodo anterior.
        } else {
            Final = null;  // Si la lista queda vacía, 'Final' también debe ser null.
        }
        tam--;  // Decrementa el tamaño de la lista.
        return true;  // El primer nodo fue eliminado correctamente.
    }

}
