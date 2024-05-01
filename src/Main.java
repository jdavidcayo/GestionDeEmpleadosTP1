import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //crea instancias de ambas subclases y muestra cómo se utilizan
        // los métodos específicos de cada tipo de empleado, así como sus atributos.

        System.out.println("Generando gerente:");
        Gerente gerente = (Gerente) crearEmpleado("gerente");
        System.out.println("\n");

        System.out.println("Generando trabajador");
        Trabajador trabajador = (Trabajador) crearEmpleado("trabajador");

        System.out.println("Gerente: " + gerente.getNombre()
            + "\nEdad: \t " + gerente.getEdad()
            + "\nSalario: \t " + gerente.getSalario()
        );
        gerente.trabajar();

        System.out.println(" ");

        System.out.println("Trabajador: " + trabajador.getNombre()
                + "\nEdad: \t " + trabajador.getEdad()
                + "\nSalario: \t " + trabajador.getSalario()
        );
        trabajador.trabajar();

    }

    public static Empleado crearEmpleado(String tipo){
        String nombre;
        int edad;
        double salario;
        String input;

        nombre = solicitarDato("nombre");
        input = solicitarDato("edad");
        edad = Integer.parseInt(input);
        input = solicitarDato("salario");
        salario = Double.parseDouble(input);

        if(tipo.equals("trabajador")){
            String area = solicitarDato("area");
            return new Trabajador(nombre, edad, salario, area);
        }

        if(tipo.equals("gerente")){
            String departamento = solicitarDato("departamento");
            return new Gerente(nombre, edad, salario, departamento);
        }
        return null;
    }

    public static String solicitarDato(String tipo){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese " + tipo);
        return sc.next();
    }
}