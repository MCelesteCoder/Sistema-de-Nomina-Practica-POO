//La clase empleado por horas hereda de Empleado
public class EmpleadoPorHoras extends Empleado {

    private double horas; // Horas trabajadas
    private double sueldo; // Sueldo por hora

    // Constructor
    public EmpleadoPorHoras(String nombre, String apellido, String nss, double horasTrabajadas, double sueldoPorHoras){
        super(nombre,apellido, nss);
        establecerSueldo(sueldoPorHoras);
        establecerHoras(horasTrabajadas);

    }
    public double obtenerSueldo() {
        return sueldo;
    }

    @Override
    public  double ingresos(){
        if (obtenerHoras() <= 40){
            return obtenerSueldo() * obtenerHoras();
        } else {
            return 40 * obtenerSueldo() + (obtenerHoras() -40) *obtenerSueldo() * 1.5;
        }
    }

    public void establecerSueldo(double su) {
        if (su < 0.0) {
            sueldo = 0.0;
        } else {
            sueldo = su;
        }

    }

    public double obtenerHoras() {
        return horas;
    }

    public void establecerHoras(double h) {
        if((h >= 0) && (h <= 168)){
            horas = h;
        } else{
            horas = 0;
        }
    }

    @Override
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f","Empleado por hosras",super.toString(), "Salario por hora", obtenerSueldo());
    }
}
