public class EmpleadoPorComision extends Empleado{
    
    private double ventasBrutas;
    private double tarifaDeComision;

    public EmpleadoPorComision(String nombre, String apellido, String nss, double ventas, double tarifa){
        super(nombre,apellido,nss);
        establecerTraifaComision(tarifa);
        establevecerVentasBrutas(ventas);
    }

    public void establecerTraifaComision( double tarifa){
        if (tarifa > 0.0 && tarifa < 1.0){
            tarifaDeComision = tarifa;
        }else {
            tarifa = 0.0;
        }
    }

    public double ObtenerTarifaComision(){
        return tarifaDeComision;
    }

    public void establevecerVentasBrutas(double ventas){
        if (ventas < 0.0){
            ventasBrutas = 0.0;
        } else{
            ventasBrutas = ventas;
        }
    }

    public double ObtenerVentasBrutas(){
        return ventasBrutas;
    }

    @Override
    public  double ingresos(){
        return ObtenerTarifaComision() * ObtenerVentasBrutas();
    }
    

    @Override
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f", "Empleado por comision",super.toString(), "Ventas brutas", ObtenerTarifaComision());
    }
}
