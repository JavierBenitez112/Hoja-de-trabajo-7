import java.util.Scanner;

import BST.Arbol;
import Diccionario.DataReader;
import Traductor.Traductor;

public class App { 
    
    public static void main(String[] args) {
        Arbol tree = new Arbol();

        // Leer el archivo y almacenar los datos en una variable
        String[][] datos = DataReader.leerArchivo("C:\\Users\\javib\\OneDrive\\Documentos\\GitHub\\Hoja-de-trabajo-7\\src\\diccionario.txt");

        // Construir el árbol binario con los datos
        tree.construirArbol(datos);

        // Crear una instancia de la clase Traductor
        Traductor traductor = new Traductor(tree);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el texto para traducir:");
        String texto = scanner.nextLine();

        String resultado = traductor.procesarCadena(texto);

        System.out.println("Texto traducido:"+ resultado);

        scanner.close();
    }
}
