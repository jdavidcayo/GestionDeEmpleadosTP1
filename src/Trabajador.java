public class Trabajador extends Empleado{
    private String area;

    public Trabajador(String nombre, int edad, double salario, String area) {
        super(nombre, edad, salario);
        this.area = area;
    }

    public Trabajador(String nombre, int edad, double salario) {
        super(nombre, edad, salario);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void trabajar(){
        System.out.println(this.getNombre() + "\tEsta trabajando en " + this.getArea());
    }
}
