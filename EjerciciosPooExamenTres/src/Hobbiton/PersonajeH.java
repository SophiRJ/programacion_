package Hobbiton;

public abstract class PersonajeH {
    private String nombre, raza;

    public PersonajeH(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    abstract void habilidaEspecial();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
