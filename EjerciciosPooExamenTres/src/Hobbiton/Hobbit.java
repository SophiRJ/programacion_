package Hobbiton;
public class Hobbit extends PersonajeH {
    public Hobbit(String nombre, String raza) {
        super(nombre, raza);
    }

    @Override
    void habilidaEspecial() {
        System.out.println("Pasar desapercibido");
    }
}
