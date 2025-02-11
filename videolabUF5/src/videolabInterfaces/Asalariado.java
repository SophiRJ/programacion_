package videolabInterfaces;

public final class Asalariado extends Trabajador{
    private int numeroPagas;

    public Asalariado(String nombre, String apellido, String dni, int id, int sueldo, int numeroPagas) {
        super(nombre, apellido, dni, id, sueldo);
        this.numeroPagas=numeroPagas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Numero Pagas "+numeroPagas);
    }

    public int getNumeroPagas() {
        return numeroPagas;
    }

    public void setNumeroPagas(int numeroPagas) {
        this.numeroPagas = numeroPagas;
    }
}
