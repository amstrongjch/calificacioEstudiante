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
public class profesor extends persona {
    private String titulo;
    private double salario;
    private String cargo;
    
    
    public profesor(){
        
    }

    public profesor(int i, String ingeniero, String gabriel, String _salario, int i0, String mes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setSalario(double salario){
        this.salario=salario;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public double getSalario(int horasTrabajadas, double valorPorHoras){
        return this.salario+(horasTrabajadas*valorPorHoras);
    }
    
    
     public void setCargo(String cargo){
        this.cargo=cargo;
    }
    public String getCargo(){
        return this.cargo;
    }
    
   
    
    
}
