package Empresa;

public final class Autonomo extends Trabajador{
    private int cuotaSS;

    public Autonomo(String nombre, String apellido, String dni, int identificador, int sueldo, int cuotaSS) {
        super(nombre, apellido, dni, identificador, sueldo);
        this.cuotaSS = cuotaSS;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("CuotaSS "+cuotaSS);
    }
}
