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
public class historialCalificaciones extends persona {
    private materia materia;
    private estudiante Estudiante;
    private int aprovechamiento;
    private int examen1;
    private int aprovechamiento2;
    private int examen2;
    
    
    public historialCalificaciones(){
        
    }
    public void setMateria(materia Materia){
        this.materia=Materia;
    }
    public materia getMateria(){
        return this.materia;
    }
    public void setEstudiante(estudiante Estudiante){
        this.Estudiante=Estudiante;
    }
    public estudiante getEstudiante(){
        return this.Estudiante;
    }
    public void setAprovechamiernto(int aprovechamiento){
        this.aprovechamiento=aprovechamiento;
    }
    public int getAprovechamiento(){
        return this.aprovechamiento;
    }
    
    public void setExamen1(int examen){
        this.examen1=examen1;
    }
    
    public int getExamen1(int examen1){
        return examen1;
    }
    
    public void setAprovechamiento2(int aprovechamiento){
        this.aprovechamiento2=aprovechamiento2;
    }
    
    public int getAprovechamiento2(){
        return aprovechamiento2;
    }
    
    public void setExamen2(int examen2){
        this.examen2=examen2;
    }
    
    public int getExamen2(){
        return examen2;
    }
}
