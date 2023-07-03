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
    }
    
    public void iniciar(){
        vista.setTitle("CRUD");
        vista.setLocationRelativeTo(null);
        vista.campoID.setVisible(false);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.botonInsertar){
            persona.setClave(Integer.parseInt(vista.campoClave.getText()));
            persona.setNombre(vista.campoNombre.getText());
            persona.setDomicilio(vista.campoDomicilio.getText());
            persona.setCelular(vista.campoCelular.getText());
            persona.setCorreo_electronico(vista.campoEmail.getText());
            persona.setFecha_nacimiento(Date.valueOf(vista.campoFechaNacimiento.getText()));
            persona.setGenero(vista.campoGenero.getSelectedItem().toString());
           
            Boolean r = consulta.insertarDatos(persona);
            if(r){
                JOptionPane.showMessageDialog(null, "Registro ingresado exitosamente");
            }else{
                JOptionPane.showMessageDialog(null, "ERROR al realizar el registro");
            }
        }
    }
    
}
