package Coches;

public class Suv extends Coche{
    private int asientos;
    private int capacidadMaletero;

    public Suv(String marca, String modelo, int cv, int asientos, int capacidadMaletero) {
        super(marca, modelo, cv);
        this.asientos = asientos;
        this.capacidadMaletero = capacidadMaletero;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Numero asientos "+asientos);
        System.out.println("Capacidad maletero "+capacidadMaletero);
    }
    public void cargarMaletero(){
        if(asientos<=5&&capacidadMaletero<=500){
            capacidadMaletero+=200;
        }else{
            System.out.println("El maletero tiene la carga completa");
        }
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }
}
