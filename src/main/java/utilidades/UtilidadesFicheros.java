package utilidades;

import com.opencsv.CSVReader;
import modelos.Atraccion;
import modelos.ParqueTematico;
import modelos.TipoAtraccion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
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
    public static List<ParqueTematico> leerParquesConAtracciones() throws FileNotFoundException {

        List<ParqueTematico> parqueTematicos = leerParques();
        Map<Integer,List<Atraccion>> mapa = leerAtracciones();

            //Recorrer los parques
            for(ParqueTematico p : parqueTematicos){

                //Si en el mapa hay alguna clave == id del parque le añadimos atracciones
                if( mapa.containsKey(p.getId())){
                    p.setAtracciones(new ArrayList<>(mapa.get(p.getId())));
                }
            }

        return parqueTematicos;

    }

    public static Map<Integer,List<Atraccion>> leerAtracciones() throws FileNotFoundException {


        Map<Integer, List<Atraccion>> mapa = new HashMap<>();
        CSVReader lector = null;
        String[] nextLine= null ;

        try{

            String[] nextLine1= null ;

            //Leemos las Atracciones
            lector = new CSVReader(new FileReader(filePath + "\\src\\main\\java\\archivos\\atracciones.csv"),SEPARATOR,QUOTE);
            int c1 = 0;



            while((nextLine1 = lector.readNext()) != null ){

                if(c1 >0) {
                    Atraccion a = new Atraccion();
                    a.setId(Integer.parseInt(nextLine1[1]));
                    a.setNombre(nextLine1[2]);
                    a.setTipo(TipoAtraccion.valueOf(nextLine1[3]));
                    a.setAlturaMinima(Double.valueOf(nextLine1[4]));
                    int id_parque = Integer.parseInt(nextLine1[0]);

                    if(!mapa.containsKey(id_parque)){
                        mapa.put(id_parque, new ArrayList<>());
                    }
                    mapa.get(id_parque).add(a);

                }

                c1++;
            }



        }
        catch (Exception e){
            System.out.println(e);
        }

        return mapa;

    }


    public static List<ParqueTematico> leerParques() throws FileNotFoundException {

        List<ParqueTematico> parqueTematicos = new ArrayList<>();

        CSVReader lector = null;
        String[] nextLine= null ;

        try{

            //Leemos los Parques
            lector = new CSVReader(new FileReader(filePath + "\\src\\main\\java\\archivos\\parques.csv"),SEPARATOR,QUOTE);
            int c = 0;

            while((nextLine = lector.readNext()) != null ){

                if(c >0){
                    ParqueTematico pt = new ParqueTematico();
                    pt.setId(Integer.parseInt(nextLine[0]));
                    pt.setNombre(nextLine[1]);
                    pt.setNum_max_visitantes(Integer.parseInt(nextLine[2]));
                    pt.setAtracciones(new ArrayList<>());
                    parqueTematicos.add(pt);
                }
                c++;
            }



        }
        catch (Exception e){
            System.out.println(e);
        }

        return parqueTematicos;

    }




    public static void main(String[] args) throws FileNotFoundException {

        leerParquesConAtracciones();

    }

}
