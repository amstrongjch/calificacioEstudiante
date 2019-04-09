/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author Amstrong
 */
public class estudiante extends persona{
    private carrera Carrera;
    
    public estudiante(){//constructor vacio
        
    }
    
    public estudiante(int codigo, String nombre, String cedula){
        this.setNombre(nombre);
        this.setCodigo(codigo);
        this.setCedula(cedula);
    }
    public estudiante(int codigo, String dircecio, int telefono){
        this.setDireccion(direccion);
        this.setTelefono(telefono);
        
    }

    public estudiante(int i, String bryam) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setCarrera(carrera Carrera){
        this.Carrera=Carrera;
        
    }
    
 
}
