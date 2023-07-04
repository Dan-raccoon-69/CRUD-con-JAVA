package modelo;

import controlador.ControladorPersona;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vista.VistaCrud;

/**
 *
 * @author Daniel
 */
public class ConsultasPersona extends Conexion {

    PreparedStatement ps;
    ResultSet rs;

    public boolean insertarDatos(Persona persona) {
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
        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.println("ERROR: " + e);
            }
        }
    }

    public boolean buscarDatos(Persona persona) {
        Connection conexion = null;
        try {
            conexion = getConnection();
            ps = conexion.prepareStatement("select * from escuela where clave = ?");
            ps.setString(1, String.valueOf(persona.getClave()));
            rs = ps.executeQuery();
            if (rs.next()) {
                persona.setIdPersona(rs.getInt("idPersona"));
                persona.setClave(rs.getInt("clave"));
                persona.setNombre(rs.getString("nombre"));
                persona.setDomicilio(rs.getString("domicilio"));
                persona.setCelular(rs.getString("celular"));
                persona.setCorreo_electronico(rs.getString("correo_electronico"));
                persona.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                persona.setGenero(rs.getString("genero"));
                return true;
            } else {
                
                return false;
            }
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.err.println("ERROR: " + e);
            }
        }
    }
}
