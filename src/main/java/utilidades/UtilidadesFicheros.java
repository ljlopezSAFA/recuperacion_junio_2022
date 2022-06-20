package utilidades;

import modelos.Atraccion;
import modelos.Entrada;
import modelos.ParqueTematico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UtilidadesFicheros {

    public static final char SEPARATOR = ',';
    public static final char QUOTE = '"';
    public static final String filePath = new File("").getAbsolutePath();

    public UtilidadesFicheros() {
    }


    /**
     * Devuelve la lista de parques con sus atracciones
     *
     * @return
     */
    public static List<Entrada> leerEntradas() {
        return new ArrayList<>();

    }

}
