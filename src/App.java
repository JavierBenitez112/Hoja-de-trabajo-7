import BST.Arbol;
import BST.Nodo;
import Diccionario.DataReader;

public class App { 
    
    public static void main(String[] args) {
        Arbol tree = new Arbol();

        // Leer el archivo y almacenar los datos en una variable
        String[][] datos = DataReader.leerArchivo("C:\\Users\\javib\\OneDrive\\Documentos\\GitHub\\Hoja-de-trabajo-7\\src\\diccionario.txt");

        // Construir el árbol binario con los datos
        tree.construirArbol(datos);

        // Prueba buscar por nombre
        Nodo nodoHomework = tree.buscarPorNombre("homework");
        System.out.println("Valor asociado al nodo 'homework': " + nodoHomework.V);
    }
}
