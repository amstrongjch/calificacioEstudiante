/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author Amstrong
 * Date 2019
 */
public class carrera extends persona {
    private int codigo ;
    private String nombre;
    private materia materias;
    private int numeroSemestre;
    private int numeroEstudiantes;
    private String titulo;
    private materia Materias;
    private int materia;
    
    public carrera(){
        
    }

    public carrera(int i, String mecatronica, int i0, int i1, String ingenieros_en_mecatronica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void setcodigo(int codigo){
        this.codigo=codigo;
        
    }
    public int getcodigo(){
        return this.codigo;
    }
    
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setMaterias(int Materias){
        this.materia=Materias;
    }
    
    public materia getMaterias(){
        return this.Materias;
    }
    
    public void setNumeroSemestres(int numeroSemestres){
        this.numeroSemestre=numeroSemestres;
        
    }
    
    public int getNumeroSemestres(){
        return this.numeroSemestre;
    }
    
    public void setNumeroEstudiantes(int numeroEstudiantes){
        this.numeroEstudiantes=numeroEstudiantes;
        
    }
    
    public int getNumeroEstudiantes(){
        return this.numeroEstudiantes;
    }
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
        
    }
    
    
    public String getTitulo(){
        return this.titulo;
    }
   
   
}
