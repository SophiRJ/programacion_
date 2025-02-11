package Hobbiton;

public class Elfo extends PersonajeH{
    public Elfo(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    void habilidaEspecial() {
        System.out.println("Arquero diestro");
    }
}
