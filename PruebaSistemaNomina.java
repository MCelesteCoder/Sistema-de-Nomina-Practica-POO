public class PruebaSistemaNomina {
    public static void main(String[] args) {//El main se escribe solo en la parte que se debe mostrar

        //Se crean los objetos con sus respectivos argumentos
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Amanda", "Pérez", "111-111", 500.000);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Lily", "Mendez", "222-222", 30, 1.500);
        EmpleadoPorComision empleadoPorComision= new EmpleadoPorComision("Camila", "Flores", "333-333", 10000, .06);
        EmpleadoBaseMasComision empleadoBaseMasComision =  new EmpleadoBaseMasComision("Dulce", "Rodrigez", "444-444", 5000, .04, 300);

        System.out.println("\nEmpleados procesados por separado:\n");

        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoPorComision, "ingresos", empleadoPorComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n ",empleadoBaseMasComision, "ingresos", empleadoBaseMasComision.ingresos());
    }
}
