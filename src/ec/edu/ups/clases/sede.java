/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.List;

/**
 *
 * @author Ordenador
 */
public class sede extends persona {
    private int codigo;
    private String nombre;
    private String direcion;
    private String telefono;
    private List<carrera> carrera;

    public sede(int codigo, String nombre, String direcion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direcion = direcion;
        this.telefono=telefono;
        
        carrera=new VirtualFlow.ArrayLinkedList<>();//intanciar a la clase
        
    }

   
   
    
    
    public void setCodigo(int codigo){
        this.codigo=codigo;
        
    }
    public int getCodigo(){
        return codigo;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setDireccion(String direccion){
        this.direcion=direccion;
    }
    public String getDireccion(){
         return direccion;
    }
    
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
     public String getTelefono(){
        return telefono;
        
    }
        
    }
