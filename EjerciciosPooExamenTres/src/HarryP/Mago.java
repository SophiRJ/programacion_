package HarryP;

public class Mago extends Personaje implements Magico{

    public Mago(String nombre) {
        super(nombre);
    }

    @Override
    public void lanzarHechizo(String hechizo) {
        System.out.println("Mago "+getNombre()+"lanza hechizo "+hechizo);
    }

    @Override
    void moverse() {
        System.out.println(getNombre()+" se mueve y evita el ataque");
    }
}
