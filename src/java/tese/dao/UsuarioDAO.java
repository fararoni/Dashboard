package tese.dao;
public class UsuarioDAO extends DatabaseDAO {
    static String sqlCrearTabla = "CREATE TABLE USUARIOS "
            + "(ID PRIMARY KEY,"
            + "nombre  text,"
            + " email text,"
            + " password text"
            + ")";
    public static boolean crearTabla (){
        return DatabaseDAO.crearTabla(sqlCrearTabla);
    }
    
    public static int  sqlInsert (String nombre,
            String email,
            String password
            ){
    String sqlInsert = "INSERT INTO  usuarios (nombre, email, password)" + 
            "   VALUES (\""  + nombre +  "\", \"" + email + "\", \"" + password + "\")";
    
    return DatabaseDAO.actualizar(sqlInsert);
    
        
    }
    
}
