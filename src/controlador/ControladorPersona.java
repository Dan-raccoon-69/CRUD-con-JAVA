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

    private Persona persona;
    private VistaCrud vista;
    private ConsultasPersona consulta;

    public ControladorPersona(Persona persona, VistaCrud vista, ConsultasPersona consulta) {
        this.persona = persona;
        this.vista = vista;
        this.consulta = consulta;
        vista.botonInsertar.addActionListener(this);
        vista.botonLimpiar.addActionListener(this);
        vista.botonBuscar.addActionListener(this);
    }

    public void iniciar() {
        vista.setTitle("CRUD");
        vista.setLocationRelativeTo(null);
        vista.campoID.setVisible(false);
    }

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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.botonInsertar) {
            persona.setClave(Integer.parseInt(vista.campoClave.getText()));
            persona.setNombre(vista.campoNombre.getText());
            persona.setDomicilio(vista.campoDomicilio.getText());
            persona.setCelular(vista.campoCelular.getText());
            persona.setCorreo_electronico(vista.campoEmail.getText());
            persona.setFecha_nacimiento(Date.valueOf(vista.campoFechaNacimiento.getText()));
            persona.setGenero(vista.campoGenero.getSelectedItem().toString());

            Boolean r = consulta.insertarDatos(persona);
            if (r) {
                JOptionPane.showMessageDialog(null, "Registro ingresado exitosamente");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR al realizar el registro");
            }
        }

        if (e.getSource() == vista.botonLimpiar) {
            limpiar();
        }

        if (e.getSource() == vista.botonBuscar) {
            persona.setClave(Integer.parseInt(vista.campoBuscar.getText()));
            boolean buscar = consulta.buscarDatos(persona);
            if (buscar) {
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
    }
}
