package Empresa;

public final class Directivo extends Persona implements Responsable{
    private int porcentajeEmpresa;

    public Directivo(String nombre, String apellido, String dni, int porcentajeEmpresa) {
        super(nombre, apellido, dni);
        this.porcentajeEmpresa = porcentajeEmpresa;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Porcentaje empresa "+porcentajeEmpresa);
    }

    @Override
    public int emitirVoto() {
        return (int)((Math.random()*5)+5);
    }
}
