package videolabInterfaces;

public class Directivo extends Persona implements Responsable{
    private int porcentaje;

    public Directivo(String nombre, String apellido, String dni, int porcentaje) {
        super(nombre, apellido, dni);
        this.porcentaje = porcentaje;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Porcentaje Empresa "+porcentaje);
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public int emitirVoto() {
        int voto;
        if(porcentaje>50) {
            voto = (int) ((Math.random() * 5) +10);
        }else{
            voto = (int) ((Math.random() * 5) +5);
        }
        return voto;
    }
}
