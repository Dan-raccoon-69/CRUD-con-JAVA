/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        VistaCrud vista = new VistaCrud();
        ConsultasPersona consulta = new ConsultasPersona();
        Persona persona = new Persona();
        ControladorPersona controlador = new ControladorPersona(persona, vista, consulta);
        
        controlador.iniciar();
        vista.setVisible(true);
    }
}
