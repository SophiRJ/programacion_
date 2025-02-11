package videolabInterfaces;

public final class Autonomo extends Trabajador{
    private int cuotaSS;

    public Autonomo(String nombre, String apellido, String dni, int id, int sueldo, int cuotaSS) {
        super(nombre, apellido, dni, id, sueldo);
        this.cuotaSS = cuotaSS;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cuota Seguridad Social "+cuotaSS);
    }

    public int getCuotaSS() {
        return cuotaSS;
    }

    public void setCuotaSS(int cuotaSS) {
        this.cuotaSS = cuotaSS;
    }
}
