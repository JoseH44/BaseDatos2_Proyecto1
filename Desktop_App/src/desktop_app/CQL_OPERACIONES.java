/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktop_app;

import com.github.cassandra.jdbc.internal.datastax.driver.core.Cluster;
import com.github.cassandra.jdbc.internal.datastax.driver.core.ResultSet;
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
    
    //verificar login
    public static boolean foundUser(String user){
        boolean flag = false;
        String loginDB = "";
        ResultSet results = session.execute("SELECT login FROM alumno");
        for (Row row : results) {
            loginDB = row.getString("login");
            System.out.println(loginDB);
            if(loginDB.equals(user))
                flag = true;
        }
        
        return flag;
    }
    
    //metodo que retorna el último id
    public static int lastID_Alumno(){
        int last = 0;
        ResultSet results = session.execute("SELECT ida FROM alumno");
        for (Row row : results) {
            last++;
        }
        return last;
        
    }
    
    //inicio de sesión
    public static boolean matchInfo(String login, String password){
        boolean flag = false;
        String loginDB = "";
        String passDB = "";
        ResultSet results = session.execute("SELECT * FROM alumno");
        for (Row row : results) {
            loginDB = row.getString("login");
            passDB = row.getString("contrasena");
            if (login.equals(loginDB) && password.equals(passDB)) {
                System.out.println("LOGIN:" + loginDB + " PASSWORD:" + passDB);
                System.out.println("LOGIN MAIN:" + login + " PASSWORD MAIN:" + password);
                flag = true; 
            }
        }
        
        return flag;
    }
    
}
