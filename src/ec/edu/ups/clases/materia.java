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
public class materia extends persona {
private int codigo;
private String nombre;
private int numeroCreditos;
private int numeroHoras;
private int nivel;

    
public materia(){
    
}

    public materia(int i, String logica, int i0, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public void setCodigo(int codigo){
    this.codigo=codigo;
}

public int getCodigo(){
    return codigo;
}

@Override
public void setNombre(String nombre){
    this.nombre=nombre;
}

public String getNombre(){
    return nombre;
}

public void setBuneroCreditos( int numeroCreditos){
    this.numeroCreditos=numeroCreditos;
}

public int getNumeroCreditos(){
    return numeroHoras;
}

public void setNivel(int nivel){
    this.nivel=nivel;
}

public int getNivel(){
    return nivel;
}
 
}

