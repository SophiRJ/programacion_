package videolabInterfaces;

public final class Jefe extends Trabajador implements Responsable{
    private int nivelResponsabilidad;

    public Jefe(String nombre, String apellido, String dni, int id, int sueldo, int nivelResponsabilidad) {
        super(nombre, apellido, dni, id, sueldo);
        this.nivelResponsabilidad = nivelResponsabilidad;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Nivel responsabilidad "+nivelResponsabilidad);
    }

    public int getNivelResponsabilidad() {
        return nivelResponsabilidad;
    }

    public void setNivelResponsabilidad(int nivelResponsabilidad) {
        this.nivelResponsabilidad = nivelResponsabilidad;
    }

    @Override
    public int emitirVoto() {
        int voto=(int)(Math.random()*5);
        return voto;
    }
}
