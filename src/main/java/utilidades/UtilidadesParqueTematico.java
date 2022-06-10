package utilidades;

import modelos.ParqueTematico;
import modelos.Tarifa;
import modelos.TipoPersona;
import modelos.Ubicacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UtilidadesParqueTematico {


    /**
     *
     * Ejercicio 3
     *
     * Devuelve todos los parques cuyas atracciones contienen alguna que sea para niños, es decir que su tipo
     * sea INFANTIL
     *
     * @param parqueTematicos
     * @return
     */
    public static List<ParqueTematico> getParquesConAtraccionesInfantiles(List<ParqueTematico> parqueTematicos){

        return new ArrayList<>();
    }



    /**
     *
     * Ejercicio 4
     *
     * Devuelve todos los parques cuya ubicación coincida con el código postal pasado  y en cuyas atracciones contengan
     * alguna para adultos
     *
     * @param parqueTematicos
     * @return
     */

    public static List<ParqueTematico> getParquesPorUbicacionAdultos(List<ParqueTematico> parqueTematicos, Integer codigoPostal){
        return new ArrayList<>();
    }

    /**
     *
     * Devuelvo los parques temáticos cuya Tarifas teniendo en cuenta los tipo de persona y el número de
     * personas pasado , no supera el presupuesto pasado
     *
     * @param parqueTematicos
     * @param personasPorTipo
     * @param presupuesto
     * @return
     */
    public static List<ParqueTematico> getPosibles(List<ParqueTematico> parqueTematicos, Map<TipoPersona,
            Integer> personasPorTipo, Double presupuesto){


        return new ArrayList<>();
    }




}
