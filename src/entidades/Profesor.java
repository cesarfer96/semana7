/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author César Fernández
 */
public class Profesor extends Persona {
    
    String horario;
    
    public Profesor(){
    }
    
    public Profesor(String nombre){
         this.nombre=nombre;
    } 
   
    public Profesor(String nombre,String apellido){
    this.nombre=nombre;
    this.apellido=apellido;
    }
    
    public Profesor(String nombre,String apellido,int edad,String sexo,String horario){
    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
    this.sexo=sexo;
    this.horario=horario;
    }
    
    
    @Override
    public void setNombre(String nombre) {
        this.nombre= nombre;
    }
    @Override
    public String getNombre() {
       return this.nombre;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido=apellido;
    }
    @Override
    public String getApellido() {
        return this.apellido;
    }

    @Override
    public void setEdad(int edad) {
        this.edad=edad;
    }
     @Override
    public int getEdad() {
        return this.edad;    
    }
    
    @Override
    public void setSexo(String sexo) {
        this.sexo=sexo;
    }
    @Override
    public String getSexo() {
    return this.sexo;    
    }
    
    @Override
    public void solicitar(){
        System.out.println("Nombre: ");
        this.nombre = sc.nextLine();
       
        System.out.println("Apellido: ");
        this.apellido = sc.nextLine();
        
        System.out.println("Sexo: ");
        this.sexo = sc.nextLine();
        
        System.out.println("Horario: ");
        this.horario = sc.nextLine();
        
        System.out.println("Edad: ");
        this.edad = sc.nextInt();
    }
    
    @Override
    public void imprimir(){
        System.out.println("----------------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Sexo: "+sexo);
        System.out.println("Horario: "+horario);
    }
     
    public void setHorario(String horario) {
        this.horario=horario;
    }
    public String getHorario() {
    return this.horario;    
    }
    
}
