/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josue
 * Clase tomada del libro del curso:
 * No se utilizaron todos los métodos ya que no todos eran necesarios.
 * Se realizó la interface ya que a pesar que ya existe la clase PriorityQueue, el ejercicio exigía usar una interface que funcionara de manera similar.
 * @param <E>
 */
public interface PriorityQueue<E extends Comparable<E>> {
    
    /**
     *
     * @return
     */
    public E getFirst();
	// pre: La cola no está vacía.
	// post: Devuelve el valor mínimo de la cola.
	
    /**
     *
     * @return
     */
    public E remove();
	// pre: La cola no está vacía.
	// post: Remueve el valor mínimo de la cola y lo devuelve.
	
    /**
     *
     * @param value
     */
    public void add(E value);
	// pre: El valor a añadir existe (no es nulo).
	// post: El valor es añadido en su posición respectiva de la cola.
	
    /**
     *
     * @return
     */
    public boolean isEmpty();
	// post: Muestra si la cola está vacía (True) o no (False).
	
    /**
     *
     * @return
     */
    public int size();
	// post: Devuelve el número de elementos de la cola.
	
    /**
     *
     */
    public void clear();
	// post: Vacía la cola; la deja sin elementos.
    
}
