package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class Conexion {
    public static final String url = "jdbc:mysql://localhost:3306/escuela";
    public static final String usuario = "root";
    public static final String contraseña = "616263646566676869";
    
    public Connection getConnection() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(url, usuario, contraseña);
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos MySQL: " + e.getMessage());
        }
        return conexion;
    }
}
