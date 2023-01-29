/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author jesus
 */
public class Herencia {

    public static void main(String[] args) {
        /*Empleado*/
        Empleado empleado1 = new Empleado(123, "Developer", 15.2, 22, "Jesús", "Menodza");
        System.out.println("Edad: " + empleado1.getEdad());
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Apellido: " + empleado1.getApellido());
            //Heredó de Persona
        System.out.println("Número de empleado: " + empleado1.getNumeroEmpleado());
        System.out.println("Cargo: " + empleado1.getCargo());
        System.out.println("Salario: " + empleado1.getSalario());
        
        /*Consultor*/
        System.out.println("--------------------" + "\n" + "CONSULTOR");
        Consultor consultor1 = new Consultor(423, "Profesa", 34, "Pepe", "Juárez");
        System.out.println("Edad: " + consultor1.getEdad());
        System.out.println("Nombre: " + consultor1.getNombre());
        System.out.println("Apellido: " + consultor1.getApellido());
        System.out.println("Consultoría: " + consultor1.getNombreConsultoria());
        System.out.println("Número de consultor: " + consultor1.getNumeroConsultor());
    }
}
