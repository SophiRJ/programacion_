package HarryP;

public abstract class Personaje {
    private String nombre;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }
    protected abstract void moverse();

    public String getNombre() {
        return nombre;
    }
}
