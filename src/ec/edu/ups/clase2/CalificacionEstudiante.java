/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase2;

import ec.edu.ups.clases.carrera;
import ec.edu.ups.clases.estudiante;
import ec.edu.ups.clases.grupo;
import ec.edu.ups.clases.materia;
import ec.edu.ups.clases.profesor;
import ec.edu.ups.clases.sede;

/**
 *
 * @author Amstrong
 */
public class CalificacionEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sede cuanca =new sede(6,"el vecno","calle vieja","097634353");
       
        
        carrera computacion=new carrera (1, "computacion",12,3,"ingenieros en computacion");
        carrera telematica=new carrera (2, "telematica",5 ,300,"ingenieros en telematica" );
        carrera mecatronica=new carrera (3, "mecatronica", 3, 300, "ingenieros en mecatronica");
        
        materia calculo=new materia(4, "calculo", 6,7,7);
        materia fisica= new materia(5, "fisica", 12, 4, 13);
        materia literatura=new materia(6,"literatura", 14, 23, 12);
        materia antropologia=new materia(7," antropologia", 3, 14, 7);
        materia etica=new materia(2, "etica", 3, 23, 4);
        materia logica=new materia(2, "logica", 3,4,21);
        
        profesor gustabo=new profesor (1,"ingeniero", "Gustabo","salario",234,"mes");
        profesor gabriel=new profesor(1,"ingeniero", "Gabriel"," salario", 348,"mes");
        
        
        estudiante bryam=new estudiante(1,"Bryam");
        estudiante olger=new estudiante(2,"Olger");
        estudiante diana=new estudiante(3,"Diana");
        estudiante erika=new estudiante(4,"erika");
        
        grupo a=new grupo(000,"grupo 1a");
        grupo b=new grupo(001,"grupo 2a");
        grupo c=new grupo(010,"grupo 3a");
        grupo d=new grupo(011,"grupo 4a");
        
        
        
        
    }
    
}
