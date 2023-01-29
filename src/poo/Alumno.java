package poo;

/**
 *
 * @author jesus
 */

/*Una clase es un tipo de dato estructurado ya que puede contener multiples valores de 
de tipo de dato más simple (ej; int, boolean, String)*/
public class Alumno {
    private int id;
    private String nombre;
    private String  apellido;
    
    /*Constructor
    Es una función que nos permite contruir objetos/instancias de una clase (en este caso Alumno)*/
    public Alumno(){
        /*Constructor vacío: creará un objeto con propiedades vacías*/
    }

    public Alumno(int id, String nombre, String apellido) {
        /*Este contructor recibe datos, por lo tanto el objeto tendra valores*/
        /*this hace referencia al valor global (al de la clase, no al del constructor)*/
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    /*Métodos
    Son funciones o acciones que puede generar el objeto
    */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
