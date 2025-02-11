package Empresa;

public final class Jefe extends Trabajador implements Responsable{
    private int nivelResponsabilidad;

    public Jefe(String nombre, String apellido, String dni, int identificador, int sueldo, int nivelResponsabilidad) {
        super(nombre, apellido, dni, identificador, sueldo);
        this.nivelResponsabilidad = nivelResponsabilidad;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Nivel de Responsabilidad "+nivelResponsabilidad);
    }

    @Override
    public int emitirVoto() {
        return (int)((Math.random()*5)+1);
    }
}
