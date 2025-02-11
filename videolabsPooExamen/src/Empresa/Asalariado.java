package Empresa;

public final class Asalariado extends Trabajador{
    private int numeroPagas;

    public Asalariado(String nombre, String apellido, String dni, int identificador, int sueldo, int numeroPagas) {
        super(nombre, apellido, dni, identificador, sueldo);
        this.numeroPagas = numeroPagas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Numero de pagas "+numeroPagas);
    }
}
