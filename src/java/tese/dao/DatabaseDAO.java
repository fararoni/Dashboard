package tese.dao;
///-- Conexion
import java.sql.Connection;
import java.sql.DriverManager;
//-- Consulta y acrtualizacion
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//-- Errores
import java.sql.SQLException;
public class DatabaseDAO {
    //-- Conexion a BD
    private static String dbURL = "jdbc:sqlite:C:/sc/db/libreria.db";
    
    public static Connection getConeccion() 
        throws SQLException, ClassNotFoundException 
    { 
        System.out.println("...| Conexion a la base de datos().");
        Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Se ha cargado el driver.");
            conn = DriverManager.getConnection(dbURL);
            System.out.println("...| Conectando a la base de datos.");
             if (conn != null) {
                System.out.println("...| Conectado a la base de datos.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("No se encontró el driver de base de datos");
            System.out.println(e.getMessage());
            throw e;
        } /* catch (SQLException e) {
             System.out.println("Error de SQLException");
            System.out.println(e.getMessage());
            throw e;
        } */ finally {
             System.out.println("Base de datos inicializada");
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return conn;
    }

    //-- Crear tala
    public static boolean crearTabla (String sql){
        boolean resultado = false;
        try {
            Connection conn = DriverManager.getConnection(dbURL);
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            System.out.println("...| Tabla creada." + sql);  
            resultado = true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }    
        return resultado;
    }
    //-- Actualizacion - Insert, Update, Delete
    public static int actualizar(String sql) {
        int cuantos=0;
        try { 
            Connection conn = DriverManager.getConnection(dbURL);
            Statement stmt = conn.createStatement() ;
                 stmt.executeUpdate(sql);
            System.out.println("...| Actualizado." + sql);            
            cuantos = 1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return cuantos;
    }
    
    //-- Consulta - Select
    
}
