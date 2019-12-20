/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author César Fernández
 */
public class Persona {
    
    Scanner sc=new Scanner(System.in);
    
     String nombre;
     String apellido;
     int edad;
     String sexo;
    
    
    public  void setNombre(String nombre){}
    public  String getNombre(){
    return this.nombre;
    }
    
    public  void setApellido(String apellido){}
    public  String getApellido(){
        return this.apellido;
    }
   
    public  void setEdad(int edad){}
    public  int getEdad(){
        return this.edad;
    }
    
    public  void setSexo(String sexo){}
    public  String getSexo(){
        return this.sexo;
    } 
    
    
    public void solicitar(){
        System.out.println("Nombre: ");
        this.nombre = sc.nextLine();
       
        System.out.println("Apellido: ");
        this.apellido = sc.nextLine();
        
        System.out.println("Sexo: ");
        this.sexo = sc.nextLine();
        
        System.out.println("Edad: ");
        this.edad = sc.nextInt();
    }
    
    public void imprimir(){
        
        System.out.println("----------------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Sexo: "+sexo);
    }
    
}
