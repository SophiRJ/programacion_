package HarryP;

public class Entrada {
    public static void main(String[] args) {
        Mago mago=new Mago("Harry ");
        Bruja bruja=new Bruja("Hermion");

        mago.lanzarHechizo("scarmio");
        bruja.lanzarHechizo("Sectuxandre");
        mago.moverse();
        bruja.moverse();
    }
}
