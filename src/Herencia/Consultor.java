/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author jesus
 */
public class Consultor extends Persona {
    int numeroConsultor;
    String nombreConsultoria;

    public Consultor() {
    }
    
    /*Este constructor solo usará las propiedade de Consultor*/
    public Consultor(int numeroConsultor, String nombreConsultoria) {
        this.numeroConsultor = numeroConsultor;
        this.nombreConsultoria = nombreConsultoria;
    }
    
    /*Este constructor heredará propiedades de Persona*/
    public Consultor(int numeroConsultor, String nombreConsultoria, int edad, String nombre, String apellido) {
        super(edad, nombre, apellido);
        this.numeroConsultor = numeroConsultor;
        this.nombreConsultoria = nombreConsultoria;
    }
    
    /*Getters ans setters*/

    public int getNumeroConsultor() {
        return numeroConsultor;
    }

    public void setNumeroConsultor(int numeroConsultor) {
        this.numeroConsultor = numeroConsultor;
    }

    public String getNombreConsultoria() {
        return nombreConsultoria;
    }

    public void setNombreConsultori(String nombreConsultori) {
        this.nombreConsultoria = nombreConsultori;
    }
    
    /*Heredado de Persona*/
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
}
