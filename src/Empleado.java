public class Empleado {
    //Implementa un sistema que modele esta situación utilizando herencia en Java.
    // Define una clase base llamada Empleado que contenga los atributos y
    // métodos comunes para todos los empleados, como el nombre, la edad, el salario y
    // la capacidad de trabajar.

    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void trabajar(){
        System.out.println(this.nombre + "\ttrabajando...");
    }
}
