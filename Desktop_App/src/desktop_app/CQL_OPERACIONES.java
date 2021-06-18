/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktop_app;

import com.github.cassandra.jdbc.internal.datastax.driver.core.Cluster;
import com.github.cassandra.jdbc.internal.datastax.driver.core.LocalDate;
import com.github.cassandra.jdbc.internal.datastax.driver.core.ResultSet;
import com.github.cassandra.jdbc.internal.datastax.driver.core.Row;
import com.github.cassandra.jdbc.internal.datastax.driver.core.Session;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Ramon
 */
public class CQL_OPERACIONES {
    private static Cluster cluster;
    private static Session session;

    public CQL_OPERACIONES() {
    }
    
    
    
    
    
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
    
    //insertar en la tabla preguntas
    public static void insertarPregunta(int idP, String descripcion, int idClase, boolean respuesta, String titulo){
        String insert = "";
        insert += idP + ",'" + descripcion + "'," + idClase + "," + respuesta + ",'" + titulo + "'";
        System.out.println(insert);
        session.execute("INSERT INTO PREGUNTAS (idp, descripcion, idclase, respuesta, titulo) VALUES (" +
                insert + ")");
    }
    
    public static void insertarExamen(int idExamen, int idClase, int Cantpreguntas,String fechaAplicacion){
        String query = "";
        
        query += idExamen + ",'" + fechaAplicacion+ "',"+ idClase +  "," + Cantpreguntas;
        System.out.println(query);
        session.execute("INSERT INTO EXAMEN (ide, fech_aplicacion, idclase, num_preguntas) VALUES (" +
                query + ")");
    }
    
    //query para meter el examen en el set de la clase
    public static void insertExameninClass(int idClase,int idTest){
        String query = "UPDATE clase SET examenes = examenes + ";
        query += "{" + idTest + "} ";
        query += "WHERE idclase = " + idClase;
        session.execute(query);
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
    
    //metodo que retorna el último id de alumno
    public static int lastID_Alumno(){
        int last = 0;
        ResultSet results = session.execute("SELECT ida FROM alumno");
        for (Row row : results) {
            last++;
        }
        return last;
        
    }
    
    //metodo que retorna el último id de examenes
    public static int lastID_Examen(){
        int last = 0;
        ResultSet results = session.execute("SELECT ide FROM examen");
        for (Row row : results) {
            last++;
        }
        return last;
        
    }
    
    //metodo que retorna la cantidad de preguntas relacionada a una clase
    public static int lastID_CantPreguntasClase(int idClase){
        int counter = 0;
        ResultSet results = session.execute("SELECT idp FROM preguntas WHERE idclase = " + idClase + " ALLOW FILTERING");
        for (Row row : results) {
            counter++;
        }
        System.out.println("CANTIDAD DE PREGUNTAS EN EL METODO: " + counter);
        return counter;
        
        
    }
    
    //metodo para validar que una clase ya tenga examen
    public static boolean ExistsExamen(int idClase){
        boolean flag = false;
        int counter = 0;
        ResultSet results = session.execute("SELECT * FROM examen WHERE idclase = " + idClase + " ALLOW FILTERING");
        for (Row row : results) {
           counter++;
        }
        if (counter > 0)
            flag = true;
        System.out.println("EXISTE EXAMEN PARA ESTA CLASE: " + flag);
        return flag;
    }
    
    //metodo que retorna el último id de clase
    public static int lastID_Pregunta(){
        int last = 0;
        ResultSet results = session.execute("SELECT idp FROM preguntas");
        for (Row row : results) {
            last++;
        }
        System.out.println("NUM PREGUNTA:"+ last);
        return last;
    }
    
    //metodo que retorna la cantidad de preguntas en un examen
    public static int cantPreguntasExamen(int idExamen){
        int resultado = 0;
        ResultSet results = session.execute("SELECT * FROM examen WHERE ide = " 
                + idExamen + " ALLOW FILTERING");
        for (Row row : results) {
            resultado = row.getInt("num_preguntas");
        }
        return resultado;
    }
    
    //metodo que retorna la fecha de aplicación del examen
    public static LocalDate fechaAplicacion(int idExamen){
        LocalDate fecha = null;
        ResultSet results = session.execute("SELECT * FROM examen WHERE ide = " 
                + idExamen + " ALLOW FILTERING");
        for (Row row : results) {
            fecha = row.getDate("fech_aplicacion");
        }
        return fecha;
    }
    
    //metodo que retorna el id de un examen
    public static int idExamen(int idClase){
        int result = 0;
        ResultSet results = session.execute("SELECT * FROM examen WHERE idclase = " 
                + idClase + " ALLOW FILTERING");
        for (Row row : results) {
            result = row.getInt("ide");
        }
        return result;
    }
    
    
}
