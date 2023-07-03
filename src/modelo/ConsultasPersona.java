package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Daniel
 */
public class ConsultasPersona extends Conexion{
    PreparedStatement ps;
    ResultSet rs;

    public boolean insertarDatos(Persona persona){
        Connection conexion = null;
        try {
            conexion = getConnection();
            ps = conexion.prepareStatement("insert into escuela(clave, nombre, domicilio, celular, correo_electronico, fecha_nacimiento, genero) values (?,?,?,?,?,?,?)");
            ps.setString(1, String.valueOf(persona.getClave()));
            ps.setString(2, persona.getNombre());
            ps.setString(3, persona.getDomicilio());
            ps.setString(4, persona.getCelular());
            ps.setString(5, persona.getCorreo_electronico());
            ps.setDate(6, persona.getFecha_nacimiento());
            ps.setString(7, persona.getGenero());
            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
            return false;
        } finally{
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.println("ERROR: " + e);
            }
        }
    }
    
}
