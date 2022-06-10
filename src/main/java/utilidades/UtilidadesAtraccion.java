package utilidades;

import modelos.Atraccion;
import modelos.TipoAtraccion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilidadesAtraccion {


    /**
     * Ejercicio 1
     *
     * Devuelve todas las atracciones cuyo Tipo coincide con alguno de los tipos de la lista que se le pasa.
     *
     * @param atraccions
     * @param tipos
     * @return
     */
    public static List<Atraccion> getAtraccionesConTipo(List<Atraccion> atraccions , List<TipoAtraccion> tipos){

        return new ArrayList<>();
    }


    /**
     * Ejercicio 2
     *
     * Devuelve un mapa con las atracciones agrupadas por su Tipo
     *
     * @param atracciones
     * @return
     */
    public static Map<TipoAtraccion, List<Atraccion>> getAtraccionesPorTipo(List<Atraccion> atracciones){
        return new HashMap<>();
    }




}
