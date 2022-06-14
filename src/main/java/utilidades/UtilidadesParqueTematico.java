package utilidades;

import modelos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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


        return  parqueTematicos.stream()
                .filter(p-> p.getAtracciones()
                        .stream()
                        .anyMatch(a-> a.getTipo().equals(TipoAtraccion.INFANTIL)))
                .collect(Collectors.toList());
    }

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
    public static List<ParqueTematico> getParquesConAtraccionesInfantiles2(List<ParqueTematico> parqueTematicos){

        List<ParqueTematico> lista = new ArrayList<>();

        for(ParqueTematico p : parqueTematicos){
            for(Atraccion a: p.getAtracciones()){
                if(a.getTipo().equals(TipoAtraccion.INFANTIL)){
                    lista.add(p);
                    break;
                }
            }
        }

        return lista ;
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
     * @param mapa
     * @param presupuesto
     * @return
     */
    public static List<ParqueTematico> getPosibles(List<ParqueTematico> parqueTematicos,
                                                   Map<TipoPersona, Integer> mapa, Double presupuesto){

        List<ParqueTematico> listaFinal = new ArrayList<>();

        //Recorremos los parques
        for(ParqueTematico parque : parqueTematicos ){

            Double costeTotalParque = 0.0;

            //Recorremos Tipo Persona que somos
            for(TipoPersona tipoPersona : mapa.keySet()){

                //Calcular cuanto nos cuesta el parque de atracciones por tipo de persona
                Double costeTipoPersona = calcularPrecioParquePorTipoPersona(tipoPersona, mapa.get(tipoPersona),parque);

                //Al coste total del parque le sumo el coste de las personas del tipo
                costeTotalParque += costeTipoPersona;


            }

            //Comprobar si el coste total del parque es menor que el presupuesto

            if(costeTotalParque <= presupuesto){
                listaFinal.add(parque);

            }

        }




        return new ArrayList<>();
    }



    /**
     *
     * Devuelvo los parques temáticos cuya Tarifas teniendo en cuenta los tipo de persona y el número de
     * personas pasado , no supera el presupuesto pasado
     *
     * @param parqueTematicos
     * @param mapa
     * @param presupuesto
     * @return
     */
    public static List<ParqueTematico> getPosibles2(List<ParqueTematico> parqueTematicos,
                                                   Map<TipoPersona, Integer> mapa, Double presupuesto){


        return parqueTematicos.stream()
                .filter(p -> presupuesto <=
                        mapa.keySet()
                                .stream()
                                .mapToDouble(k-> mapa.get(k) * p.getTarifas()
                                        .stream()
                                        .filter(t-> t.getTipo().equals(k))
                                        .findFirst()
                                        .get().getPrecio())
                                .sum())
                .collect(Collectors.toList());

    }




    private static Double calcularPrecioParquePorTipoPersona(TipoPersona tipoPersona, Integer numeroPersonas, ParqueTematico parqueTematico){

        Double coste = 0.0;

        //Tarifa del parque para ese TipoPersona

        Double precioPorPersona = 0.0;

        for(Tarifa tarifa : parqueTematico.getTarifas()){
            if(tarifa.getTipo().equals(tipoPersona)){
                precioPorPersona = tarifa.getPrecio();
                break;
            }
        }

        coste = precioPorPersona * numeroPersonas;



        return coste;

    }


}
