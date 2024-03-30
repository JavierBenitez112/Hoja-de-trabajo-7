package Diccionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {
    public static String[][] leerArchivo(String nombreArchivo) {
        List<String[]> lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;

            // Leer cada línea del archivo y almacenarlas en la lista
            while ((linea = br.readLine()) != null) {
                // Eliminar paréntesis y dividir la línea en dos partes por la coma
                linea = linea.replaceAll("[()]", "");
                String[] partes = linea.split(", ");
                lineas.add(partes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convertir la lista a una matriz
        String[][] datos = new String[lineas.size()][2];
        for (int i = 0; i < lineas.size(); i++) {
            datos[i] = lineas.get(i);
        }

        return datos;
    }
}
