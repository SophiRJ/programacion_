package Hobbiton;

public class Enano extends PersonajeH{
    public Enano(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    void habilidaEspecial() {
        System.out.println("Muy audaz y valiente");
    }
}
