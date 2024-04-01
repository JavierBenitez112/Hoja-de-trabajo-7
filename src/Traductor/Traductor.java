package Traductor;

import BST.Arbol;
import BST.Nodo;

public class Traductor {
    private Arbol tree;

    public Traductor(Arbol tree) {
        this.tree = tree;
    }

    //metodo que recibe una cadena de texto y la divide por elementos
    public String procesarCadena(String cadena) {
    // Dividir la cadena en elementos individuales
    String[] elementos = cadena.split("\\s+"); // Suponiendo que los elementos están separados por espacios en blanco

    // Procesar cada elemento
    StringBuilder resultado = new StringBuilder();
    for (int i = 0; i < elementos.length; i++) {
        // Buscar el elemento en el árbol binario
        Nodo nodo = tree.buscarPorNombre(elementos[i]);
        // Si se encuentra un nodo, reemplazar el elemento por el valor asociado
        if (nodo != null) {
            resultado.append(nodo.V);
        } else {
            // Si no se encuentra el nodo, imprimir el elemento entre asteriscos
            resultado.append("*").append(elementos[i]).append("*");
        }
        resultado.append(" "); // Agregar espacio entre elementos
    }

    // Eliminar el espacio en blanco adicional al final y devolver la cadena procesada
    return resultado.toString().trim();
    }
}