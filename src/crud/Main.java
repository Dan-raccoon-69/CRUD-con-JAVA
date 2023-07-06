package crud;

import controlador.ControladorPersona;
import modelo.ConsultasPersona;
import modelo.Persona;
import vista.VistaCrud;

/**
 *
 * @author Daniel
 */
public class Main {
    public static void main(String[] args) {
        // Se crea las instancias de la vista, modelos y controlador
        VistaCrud vista = new VistaCrud();
        ConsultasPersona consulta = new ConsultasPersona();
        Persona persona = new Persona();
        // Se instancia el controlador y e inicializa los componentes
        ControladorPersona controlador = new ControladorPersona(persona, vista, consulta);
        controlador.iniciar();
        // Establecer que la vista sea visible
        vista.setVisible(true);
    }
}
