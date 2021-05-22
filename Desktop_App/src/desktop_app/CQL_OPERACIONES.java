/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktop_app;

import com.github.cassandra.jdbc.internal.datastax.driver.core.Cluster;
import com.github.cassandra.jdbc.internal.datastax.driver.core.Row;
import com.github.cassandra.jdbc.internal.datastax.driver.core.Session;
import java.util.ArrayList;


/**
 *
 * @author Ramon
 */
public class CQL_OPERACIONES {
    private static Cluster cluster;
    private static Session session;
    
    
    
    public static void IniciarConnection(){
        cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
    }
    
    //conectarse a un keyspace
    public static void IniciarSession(String KeySpaceName){
        session = cluster.connect(KeySpaceName);
    }
    
    public static void endConnection(){
        session.close();
        cluster.close();
    }
    
    //ejemplo para eliminar datos
    public static void eliminar_Dato(String tableName, String condicional){
        session.execute("DELETE FROM " + tableName + " WHERE " + condicional);
    }
    
    //ejemplo para cantidad de datos
    public static int cantidad_datos(String TableName) {
       int cantidad = 0; 
       ArrayList<Row> rs = (ArrayList<Row>) session.execute("SELECT COUNT(*) FROM " + TableName).all();
        for (Row r : rs) {
            cantidad = r.getInt(0);
        }
        return cantidad;
    }
    
    //insert de los alumnos
    public static void insertAlumnos(int idA, String passA, String userA, String nombre){
        String insert = "";
        insert += idA + ",'" + passA + "'," + "'" + userA + "'," + "'" + nombre + "'";
        System.out.println(insert);
        session.execute(
                "INSERT INTO ALUMNO (ida, contrasena, login, nombre_completo) VALUES " +
                        "(" + insert + ")");
    }
    
}
