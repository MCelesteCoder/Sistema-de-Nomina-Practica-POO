public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    
    private double salarioBase;

    public EmpleadoBaseMasComision(String nombre, String apellido, String nss, double ventas, double tarifa, double salario){
        super(nombre,apellido,nss, tarifa, ventas);
        establecerSalarioBase(salario);
    }

    public void establecerSalarioBase(double salario){
        if(salario < 0.0){
            salarioBase = 0.0;
        } else {
            salarioBase = salario;
        }
    }

    public double obtenerSalarioBase(){
        return salarioBase;
    }

    @Override
    public  double ingresos(){
        //Se llamo al metodo ingresos de la superclase //
        return obtenerSalarioBase() + super.ingresos();
    }
    

    @Override
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f","Empleado por comision con base",super.toString(), "Salario Base", obtenerSalarioBase());
    }
}
