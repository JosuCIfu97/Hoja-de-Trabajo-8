
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Josué Cifuentes 15275
 * Pablo Muñoz 15258
 * @author Josue
 * @param <E>
 */
public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E> {
    
    /**
     *
     */
    protected Vector<E> info;

    /**
     *
     */
    public VectorHeap() {
        //Crea un nuevo vector.
        info = new Vector<E>();
    }
    
    /**
     *
     * @param info
     */
    public VectorHeap(Vector<E> info) {
        //Crea un nuevo vector con el vector proporcionado.
        //No copia al vector, sino que usa sus elementos y los ordena como indiquen los métodos del PriorityQueue.
        this.info = new Vector<E>(info.size()); //Se crea un vector vacío con la cantidad de elementos del vector parámetro.
        for (int i = 0; i < info.size(); i++){
            //Se agregan los elementos del vector parámetro al HeapVector en orden de llegada. El VectorHeap los organizará de mejor manera luego.
            add(info.get(i));
        }
    }
    
    /**
     * 
     * @param hoja
     * Posición de la hoja en el vector.
     * @return
     * Posición del padre de la hoja en el vector.
     */
    protected static int padre(int hoja){
        //pre: Parámetro es un índice del vector.
        //post: devuelve la posición en el vector del padre de la hoja.
        return (hoja-1)/2;
    }
    
    /**
     *
     * @param padre
     * Posición del nodo padre dentro del vector.
     * @return
     * Posición del hijo izquierdo del padre dentro del vecotor.
     */
    protected static int izq(int padre){
        //pre: Parámetro es un índice del vector.
        //post: devuelve la posición en el vector del hijo izquierdo del parámetro.
        return 2*padre+1;
    }
    
    /**
     *
     * @param padre
     * Posición del nodo padre dentro del vector.
     * @return
     * Posición del hijo izquierdo del padre dentro del vector.
     */
    protected static int der(int padre){
        //pre: Parámetro es un índice del vector.
        //post: devuelve la posición en el vector del hijo derecho del parámetro.
        return 2*(padre+1);
    }
    
    /**
     *
     * @param hoja
     * Posición de una hoja del vector que se ordenará según su prioridad.
     */
    protected void percolar(int hoja){
        //pre: Parámetro es un índice del vector.
        //post: Mueve la hoja del parámetro a su posición adecuada dentro del 'árbol' del vector.
        int papa;
        papa = padre(hoja); //Posición en el vector del padre del nodo.
        E nodo = info.get(hoja); //Nodo en sí.
        while ((nodo.compareTo(info.get(papa)) <0) && (hoja > 0)){ //Mientras el nodo sea de mayor prioridad que su 'papá'...
            info.set(hoja, info.get(papa)); //El 'padre' pasa a la posición del nodo.
            hoja = papa;
            papa = padre(hoja); //Se avanza con el 'abuelo' y se analizan sus prioridades de nuevo.
        }
        info.set(hoja, nodo);
    }
    
    /**
     *
     * @param raiz
     * Posición de la raíz del vector para irla bajando.
     */
    protected void bajarRaiz(int raiz){
        //pre: Parámetro es un índice del vector.
        //post: Mueve el nodo en la posición de la raíz para abajo para acomodarsu jerarquía.
        E root = info.get(raiz);
        int tamano = size();
        while (raiz < tamano){
            int izquierdo = izq(raiz);
            int derecho = der(raiz);
            int hijo = izquierdo; //Se asume por default que el hijo izquierdo es el de mayor prioridad.
            if (izquierdo < tamano){ //El hijo izquierdo debe estar dentro del vector.
                //Hijo derecho debe estar dentro del vector también y si tiene mayor prioridad (menor código ASCI) que el hijo izquierdo, se hace el análisis del hijo derecho.
                if ((derecho < tamano) && (info.get(derecho).compareTo(info.get(izquierdo)) < 0)){
                    hijo = derecho;
                }
                //Se cambia la raíz si uno de sus hijos tiene mayor prioridad a ella misma.
                if (info.get(hijo).compareTo(root) < 0){
                    info.set(raiz,info.get(hijo));
                    raiz = hijo; //El ciclo continua hacia abajo a través del nodo de mayor prioridad.
                }
                else{
                    info.set(raiz,root);
                    return;
                }
            }
            else{
                info.set(raiz,root);
                return;
            }
        }
    }

    /**
     *
     * @return
     */
    @Override
    public E getFirst() {
        // pre: La cola no está vacía.
	// post: Devuelve el valor mínimo de la cola.
        if (size() > 0)
            return info.get(0);
        else
            return null;
    }

    /**
     *
     * @return
     */
    @Override
    public E remove() {
        // pre: La cola no está vacía.
	// post: Remueve el valor mínimo de la cola y lo devuelve.
        E prioridad = getFirst();
        info.set(0,info.get(size() - 1));
        info.setSize(size()-1);
        if (size() > 1)
            bajarRaiz(0);
        return prioridad;
    }

    /**
     *
     * @param value
     */
    @Override
    public void add(E value) {
        // pre: El valor a añadir existe (no es nulo).
	// post: El valor es añadido en su posición respectiva de la cola.
        info.add(value);
        //Se reorganiza el 'árbol' del vector; el valor es trasladado a su posición respectiva de cola.
        percolar(size() - 1); //Se percola con el último elemento del vector porque allí se agregó el valor.
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        // post: Muestra si la cola está vacía (True) o no (False).
        if (size() > 0)
            return false;
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public int size() {
        // post: Devuelve el número de elementos de la cola.
        return info.size();
    }

    /**
     *
     */
    @Override
    public void clear() {
        // post: Vacía la cola; la deja sin elementos.
        info.clear();
    }
    
    
}
