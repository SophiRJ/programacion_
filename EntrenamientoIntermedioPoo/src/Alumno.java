public class Alumno {
    private Asignatura a1;
    private Asignatura a2;
    private Asignatura a3;

    public Alumno(Asignatura a1,Asignatura a2,Asignatura a3){
        this.a1=a1;
        this.a2=a2;
        this.a3=a3;
    }
    public Alumno(int a1,int a2,int a3){
        this.a1=new Asignatura(a1);
        this.a2=new Asignatura(a2);
        this.a3=new Asignatura(a3);
    }
    public void mostrarDatos(){
        System.out.println(a1.getCalificacion());
        System.out.println(a2.getCalificacion());
        System.out.println(a3.getCalificacion());
    }

    public Asignatura getA1() {
        return a1;
    }

    public void setA1(Asignatura a1) {
        this.a1 = a1;
    }

    public Asignatura getA2() {
        return a2;
    }

    public void setA2(Asignatura a2) {
        this.a2 = a2;
    }

    public Asignatura getA3() {
        return a3;
    }

    public void setA3(Asignatura a3) {
        this.a3 = a3;
    }
}
