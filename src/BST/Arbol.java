package BST;

public class Arbol {

    Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    public void construirArbol(String[][] datos) {
        for (String[] par : datos) {
            String valorK = par[0];
            String valorV = par[1];
            insert(valorK, valorV);
        }
    }

    public void insert(String valorK, String valorV) {
        raiz = insertRecursive(raiz, valorK, valorV);
    }

    private Nodo insertRecursive(Nodo nodo, String valorK, String valorV) {
        if (nodo == null) {
            return new Nodo(valorK, valorV);
        }

        if (valorK.compareTo(nodo.K) < 0) {
            nodo.Hijo = insertRecursive(nodo.Hijo, valorK, valorV);
        } else if (valorK.compareTo(nodo.K) > 0) {
            nodo.Hijo = insertRecursive(nodo.Hijo, valorK, valorV);
        } else {
            // El valorK ya existe, podrías manejarlo de alguna manera específica si lo deseas
        }

        return nodo;
    }

    public Nodo buscarPorNombre(String nombre) {
        return buscarPorNombreRecursive(raiz, nombre);
    }

    private Nodo buscarPorNombreRecursive(Nodo nodo, String nombre) {
        if (nodo == null || nodo.K.equals(nombre)) {
            return nodo;
        }

        if (nombre.compareTo(nodo.K) < 0) {
            return buscarPorNombreRecursive(nodo.Hijo, nombre);
        }

        return buscarPorNombreRecursive(nodo.Hijo, nombre);
    }
}
