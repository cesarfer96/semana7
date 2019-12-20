/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana7;

import entidades.Persona;
import entidades.Profesor;
import entidades.Estudiante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author César Fernández
 */
public class Semana7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //instanciamos persona
        Persona per = new Persona();
        
        //llamamos al metodo solicitar de persona
        per.solicitar();
        
        //llamamos al metodo imprimir de persona
        per.imprimir();
        
        
        
        //Creo la lista de tipo Persona
        List<Persona> personas = new ArrayList<Persona>();
        
//        Persona nombre1 = new Persona();  //fulanito lo pasa a persona
        
//        nombre1.setNombre("Cesar");     //se agrega el nombre
        
//        ((Estudiante) nombre1).setNota(100);//Casteo es convertir a persona en estudiante
//        Persona sutanito = new Profesor("Roberto");
//        ((Profesor) sutanito).setHorario("Diurno");
//        Estudiante menganito = new Estudiante("John");
//        personas.add(nombre1);
//        personas.add(sutanito);
//        personas.add(menganito);
//        try {
//            printPersonas(personas);
//        } catch (NoRException ex) {
//            System.out.println("Nada de R: " + ex.getMessage());
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//    //recorido de arraylist con for eich en interables o elementos que se puedan recorrer 
//    private static void printPersonas(List<Persona> personas)
//            throws Exception {
//        for (Persona persona : personas) {
//            System.out.println(persona.getNombre());
//            if (persona.getNombre().contains("R")) {
//                throw new NoRException();
//            }
//        }
//    }
//
//    private static class NoRException extends Exception {
//
//        public NoRException() {
//            super("No se permiten R ");
//        }
        
    }
    
}
