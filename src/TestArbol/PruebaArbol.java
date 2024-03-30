package TestArbol;

import org.junit.Test;
import static org.junit.Assert.*;
import BST.Arbol;
import BST.Nodo;

public class PruebaArbol {

    @Test
    public void testInsercionYBusqueda() {
        // Crear un árbol binario
        Arbol tree = new Arbol();

        // Insertar nodos en el árbol
        tree.insert("A", "HouseA");
        tree.insert("B", "HouseB");
        tree.insert("C", "HouseC");
        tree.insert("D", "HouseD");

        // Realizar pruebas de búsqueda
        Nodo nodoA = tree.buscarPorNombre("A");
        Nodo nodoB = tree.buscarPorNombre("B");
        Nodo nodoX = tree.buscarPorNombre("X"); // Un nodo que no existe en el árbol

        // Verificar que los nodos se han insertado correctamente
        assertNotNull(nodoA);
        assertNotNull(nodoB);
        assertNull(nodoX); // Debería ser nulo porque el nodo "X" no existe en el árbol

        // Verificar que los valores de los nodos sean los esperados
        assertEquals("HouseA", nodoA.V);
        assertEquals("HouseB", nodoB.V);
    }
}
