/*
Programación Orientada a Objetos
¿Qué es? Es un paradigma (modelo, patron) orientado a objetos de programación
¿Qué es un Paradigma Orientado a Oobjetos? Es la abstracción de un problema y su
resolución de la vida real aplicado a programación, es decir; se basa en los 
objetos de la vida real para modelar la resolución de un problema en código
 */
package poo;

/**
 *
 * @author jesus
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Clases - Objetos - Métodos - Constructor*/
        Alumno alumno = new Alumno();
        Alumno alumno1 = new Alumno(1, "Jesús", "Menodoza");
        System.out.println(alumno1.getId() + " " +  alumno1.getNombre() + " " + alumno1.getApellido());
        
        /*Herencia*/
        
    }
}
