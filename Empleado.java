//Clase abstracta empleado
public abstract class Empleado {

    // Atributos que son comunes en todos los empleados
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguridadSocial;

    // Constructor de empleado - dentro de esta clase abstracta - con tres
    // argumentos
    public Empleado(String nombre, String apellido, String nss) {
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguridadSocial = nss;
    } // Fin del constructor

    // Establece el primer nombre
    public void setPrimerNombre(String nombre) {
        primerNombre = nombre;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    // Establece el apellido
    public void setApellidoPaterno(String apellido) {
        apellidoPaterno = apellido;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

     // Establece numero de seguridad social
    public void setNumeroSeguridadSocial(String nss) {
        numeroSeguridadSocial = nss;
    }

    public String getNumeroSeguridadSocia() {
        return numeroSeguridadSocial;
    }

    @Override
    public String toString(){
        return String.format(" %s %s\nNumero de seguridad social: %s", getPrimerNombre(), getApellidoPaterno(), getNumeroSeguridadSocia());
    }

    // Es un metodo que debera ser sobreescrito, este es abstracto debido a que
    // calcular este en esta clase no tiene sentido ya que es necesario conocer mas
    // detalles de este empleado
    public abstract double ingresos();

}
