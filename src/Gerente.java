public class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    public Gerente(String nombre, int edad, double salario) {
        super(nombre, edad, salario);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void trabajar(){
        System.out.println(this.getNombre() + "\tOrganizando actividades en " + this.getDepartamento());
    }
}
