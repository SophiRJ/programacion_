package Hobbiton;

public class Mago extends PersonajeH{
    public Mago(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    void habilidaEspecial() {
        System.out.println("Protector");
    }
}
