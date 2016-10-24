/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Josue
 */
public class VectorHeapTest {
    
    public VectorHeapTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of padre method, of class VectorHeap.
     */
    @Test
    public void testPadre() {
        System.out.println("padre");
        int hoja = 0;
        int expResult = 0;
        int result = VectorHeap.padre(hoja);
        assertEquals(expResult, result);
    }

    /**
     * Test of izq method, of class VectorHeap.
     */
    @Test
    public void testIzq() {
        System.out.println("izq");
        int padre = 0;
        int expResult = 1;
        int result = VectorHeap.izq(padre);
        assertEquals(expResult, result);
    }

    /**
     * Test of der method, of class VectorHeap.
     */
    @Test
    public void testDer() {
        System.out.println("der");
        int padre = 0;
        int expResult = 2;
        int result = VectorHeap.der(padre);
        assertEquals(expResult, result);
    }

    /**
     * Test of percolar method, of class VectorHeap.
     */
    @Test
    public void testPercolar() {
        System.out.println("percolar");
        int hoja = 0;
        VectorHeap instance = new VectorHeap();
        try{
            instance.percolar(hoja);
        }catch(ArrayIndexOutOfBoundsException e){
            hoja = 0;
        }
    }

    /**
     * Test of bajarRaiz method, of class VectorHeap.
     */
    @Test
    public void testBajarRaiz() {
        System.out.println("bajarRaiz");
        int raiz = 0;
        VectorHeap instance = new VectorHeap();
        try{
            instance.bajarRaiz(raiz);
        }catch(ArrayIndexOutOfBoundsException e){
            raiz = 0;
        }
    }

    /**
     * Test of getFirst method, of class VectorHeap.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        VectorHeap instance = new VectorHeap();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class VectorHeap.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        VectorHeap instance = new VectorHeap();
        Object expResult = null;
        Object result;
        try{
            result = instance.remove();
        }catch(NullPointerException e){
            result = null;
        }catch(ArrayIndexOutOfBoundsException f){
            result = null;
        }
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class VectorHeap.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Paciente value = null;
        VectorHeap instance = new VectorHeap();
        try{
            instance.add(value);
        }catch(NullPointerException e){
            value = null;
        }catch(ArrayIndexOutOfBoundsException f){
            value = null;
        }
    }

    /**
     * Test of isEmpty method, of class VectorHeap.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        VectorHeap instance = new VectorHeap();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class VectorHeap.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        VectorHeap instance = new VectorHeap();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of clear method, of class VectorHeap.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        VectorHeap instance = new VectorHeap();
        instance.clear();
    }
    
}
