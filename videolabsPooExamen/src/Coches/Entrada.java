package Coches;

public class Entrada {
    public static void main(String[] args) {
        Coche coche=new Coche("Toyota","Fiesta",120);
        Deportivo deportivo=new Deportivo("Ford", "Diesta",150,400);
        Suv suv=new Suv("Verona","High", 100,4,200);
        coche.acelerar(100);
        coche.mostrarDatos();
        deportivo.acelerar(100);
        deportivo.mostrarDatos();
        suv.acelerar(100);
        suv.cargarMaletero();
        suv.mostrarDatos();
    }
}
