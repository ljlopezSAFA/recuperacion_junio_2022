package utilidades;

import modelos.ParqueTematico;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

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
    public static List<ParqueTematico> leerParquesConAtracciones() {

        return new ArrayList<>();

    }
}
