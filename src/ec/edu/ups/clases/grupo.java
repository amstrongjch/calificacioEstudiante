/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author Ordenador
 */
public class grupo {
    private int codigo;
    private String nombre;
    private int cupo;

    public grupo(int i, String grupo_4a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setCodigo(int codigo){
        this.codigo=codigo;
        
    }
    public int getCodigo(){
        return this.codigo;
        
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
        
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
     public void setCupp(int cupo){
        this.cupo=cupo;
        
    }
    public int getCupo(){
        return this.cupo;
        
    }
    
}
