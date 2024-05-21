//La clase empleado asalariado hereda de Empleado
public class EmpleadoAsalariado extends Empleado {

    private double salario;

    //Cosntructor
    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario){
        super(nombre,apellido, nss);
        establecerSalarioSemanal(salario);
    }

    @Override
    public  double ingresos(){
        return obtenerSalarioSemanal();
    }
    public void establecerSalarioSemanal(double sal){
        salario = sal;
    }

    public double obtenerSalarioSemanal(){
        return salario;
    }

    @Override
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f", "Empleado asalariado",super.toString(), "Salario semanal", obtenerSalarioSemanal());
    }
}
