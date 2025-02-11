package Empresa;

public abstract class Trabajador extends Persona{
    private int identificador;
    private int sueldo;

    public Trabajador(String nombre, String apellido, String dni, int identificador, int sueldo) {
        super(nombre, apellido, dni);
        this.identificador = identificador;
        this.sueldo = sueldo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Identificador "+identificador);
        System.out.println("Sueldo "+sueldo);
    }
}
