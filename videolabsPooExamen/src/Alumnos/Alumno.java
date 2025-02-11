package Alumnos;

public class Alumno {
    private String nombre;
    private String apellido;
    private int telefono;
    private String correo;
    private Asignatura asignatura1,asignatura2,asignatura3;
    public Alumno(String nombre, String apellido,int telefono){
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        correo="Sin rellenar";
        asignatura1=new Asignatura("Programacion",0);
        asignatura2=new Asignatura("Base Datos",0);
        asignatura3=new Asignatura("SI",0);
    }
    public Alumno(String nombre, String apellido, int telefono,String correo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.correo=correo;
        asignatura1=new Asignatura("Programacion",0);
        asignatura2=new Asignatura("Base Datos",0);
        asignatura3=new Asignatura("SI",0);
    }
    public void mostrarDatos(){
        System.out.println("Nombre "+nombre);
        System.out.println("Apellido "+apellido);
        System.out.println("Telefono "+telefono);
        System.out.println("Correo "+correo);
        System.out.println("Nota 1 "+asignatura1.getCalificacion());
        System.out.println("Nota 2 "+asignatura2.getCalificacion());
        System.out.println("Nota 3 "+asignatura3.getCalificacion());
    }
    public void calificarNotas(){
        asignatura1.setCalificacion((int)(Math.random()*11));
        asignatura2.setCalificacion((int)(Math.random()*11));
        asignatura3.setCalificacion((int)(Math.random()*11));
    }
    public double calcularMedia(){
        int suma;
        double media;
        suma=asignatura1.getCalificacion()+asignatura2.getCalificacion()+asignatura3.getCalificacion();
        media=(double)suma/3;
        return media;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Asignatura getAsignatura1() {
        return asignatura1;
    }

    public void setAsignatura1(Asignatura asignatura1) {
        this.asignatura1 = asignatura1;
    }

    public Asignatura getAsignatura2() {
        return asignatura2;
    }

    public void setAsignatura2(Asignatura asignatura2) {
        this.asignatura2 = asignatura2;
    }

    public Asignatura getAsignatura3() {
        return asignatura3;
    }

    public void setAsignatura3(Asignatura asignatura3) {
        this.asignatura3 = asignatura3;
    }
}
