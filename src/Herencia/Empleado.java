package Herencia;

/**
 *
 * @author jesus
 */
public class Empleado extends Persona{

    int numeroEmpleado;
    String cargo;
    Double salario;

    /*Constructores*/
    public Empleado() {
    }

    public Empleado(int numeroEmpleado, String cargo, Double salario, int edad, String nombre, String apellido) {
        super(edad, nombre, apellido);/*Se heredarán las propiedades de la clase Persona*/
        this.numeroEmpleado = numeroEmpleado;
        this.cargo = cargo;
        this.salario = salario;
    }

    /*Getters and Setters*/

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    /*Heredados*/

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
