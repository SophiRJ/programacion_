package videolabInterfaces;

public abstract class Trabajador extends Persona{
    private int id,sueldo;

    public Trabajador(String nombre, String apellido, String dni, int id,int sueldo){
        super(nombre,apellido,dni);
        this.id=id;
        this.sueldo=sueldo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Id "+id);
        System.out.println("Sueldo "+sueldo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
