package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import javax.swing.JOptionPane;
import modelo.ConsultasPersona;
import modelo.Persona;
import vista.VistaCrud;

/**
 *
 * @author Daniel
 */
public class ControladorPersona implements ActionListener {
    // Declaracion de componentes
    private Persona persona;
    private VistaCrud vista;
    private ConsultasPersona consulta;

    public ControladorPersona(Persona persona, VistaCrud vista, ConsultasPersona consulta) {
        this.persona = persona;
        this.vista = vista;
        this.consulta = consulta;
        // DECLARACION DE BOTONES
        vista.botonInsertar.addActionListener(this);
        vista.botonLimpiar.addActionListener(this);
        vista.botonBuscar.addActionListener(this);
        vista.botonModificar.addActionListener(this);
        vista.botonEliminar.addActionListener(this);
    }

    public void iniciar() {
        // Configuraciones de la vista
        vista.setTitle("CRUD");
        vista.setLocationRelativeTo(null);
        vista.campoID.setVisible(false);
    }

    // metodo que limpia cada txtField
    public void limpiar() {
        vista.campoBuscar.setText(null);
        vista.campoCelular.setText(null);
        vista.campoClave.setText(null);
        vista.campoDomicilio.setText(null);
        vista.campoEmail.setText(null);
        vista.campoFechaNacimiento.setText(null);
        vista.campoGenero.setSelectedIndex(0);
        vista.campoNombre.setText(null);
    }

    // implementando cada accion de cierto boton
    @Override
    public void actionPerformed(ActionEvent e) {
        // ACCION BOTON INSERTAR
        if (e.getSource() == vista.botonInsertar) {
            // obteniendo datos de la vista para guardarlos en el objeto persona
            persona.setClave(Integer.parseInt(vista.campoClave.getText()));
            persona.setNombre(vista.campoNombre.getText());
            persona.setDomicilio(vista.campoDomicilio.getText());
            persona.setCelular(vista.campoCelular.getText());
            persona.setCorreo_electronico(vista.campoEmail.getText());
            persona.setFecha_nacimiento(Date.valueOf(vista.campoFechaNacimiento.getText()));
            persona.setGenero(vista.campoGenero.getSelectedItem().toString());
            // insertando datos de la persona
            Boolean r = consulta.insertarDatos(persona);
            if (r) {
                JOptionPane.showMessageDialog(null, "Registro ingresado exitosamente");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR al realizar el registro");
            }
        }
        // ACCION BOTON LIMPIAR 
        if (e.getSource() == vista.botonLimpiar) {
            limpiar();
        }
        // ACCION BOTON BUSCAR
        if (e.getSource() == vista.botonBuscar) {
            // buscar por clave del usuario
            // obteniendo clave de usuario desde la vista
            persona.setClave(Integer.parseInt(vista.campoBuscar.getText()));
            // buscar datos del usuario por clave obtenida
            boolean buscar = consulta.buscarDatos(persona);
            if (buscar) {
                // rellenando datos de la persona en la vista
                vista.campoID.setText(String.valueOf(persona.getIdPersona()));
                vista.campoClave.setText(String.valueOf(persona.getClave()));
                vista.campoNombre.setText(persona.getNombre());
                vista.campoDomicilio.setText(persona.getDomicilio());
                vista.campoCelular.setText(persona.getCelular());
                vista.campoEmail.setText(persona.getCorreo_electronico());
                vista.campoFechaNacimiento.setText(String.valueOf(persona.getFecha_nacimiento()));
                vista.campoGenero.setSelectedItem(persona.getGenero());
            }
            else{
                JOptionPane.showMessageDialog(null, "ERROR, no se encontro ningun dato con esa clave.");
                limpiar();
            }
        }
        // ACCION BOTON MODIFICAR
        if(e.getSource() == vista.botonModificar){
            // obteniendo datos del usuario desde la vista
            persona.setClave(Integer.parseInt(vista.campoClave.getText()));
            persona.setNombre(vista.campoNombre.getText());
            persona.setDomicilio(vista.campoDomicilio.getText());
            persona.setCelular(vista.campoCelular.getText());
            persona.setCorreo_electronico(vista.campoEmail.getText());
            persona.setFecha_nacimiento(Date.valueOf(vista.campoFechaNacimiento.getText()));
            persona.setGenero(vista.campoGenero.getSelectedItem().toString());
            // Modificando datos del usuario
            if(consulta.modificarDatos(persona)){
                JOptionPane.showMessageDialog(null, "Registro Modificado Correctamente.");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al Modificar registro.");
            }
        }
        // ACCION BOTON ELIMINAR
        if(e.getSource() == vista.botonEliminar){
            // obteniendo id del usuario desde la vista para eliminar dicho usuario
            persona.setIdPersona(Integer.parseInt(vista.campoID.getText()));
            // eliminando
            if(consulta.eliminarDato(persona)){
                JOptionPane.showMessageDialog(null, "Registro Eliminado Correctamente.");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al Eliminar registro.");
            }
        }
    }
}
