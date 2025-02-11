package Hobbiton;

public class Humano extends PersonajeH{
    public Humano(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    void habilidaEspecial() {
        System.out.println("Valiente");
    }
}
