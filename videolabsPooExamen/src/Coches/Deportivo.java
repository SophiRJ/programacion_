package Coches;

public class Deportivo extends Coche{
    private int par;
    public Deportivo(String marca, String modelo, int cv,int par) {
        super(marca, modelo, cv);
        this.par=par;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Par "+par);
    }

    @Override
    public void acelerar(int velocidad) {
        super.acelerar(velocidad);
        setVelocidad(getVelocidad()+(int)((Math.random()*30)+30));
        System.out.println("La velocidad definitiva es "+getVelocidad());
    }

    public int getPar() {
        return par;
    }

    public void setPar(int par) {
        this.par = par;
    }
}
