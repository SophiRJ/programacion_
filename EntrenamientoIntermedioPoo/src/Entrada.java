public class Entrada {
    public static void main(String[] args) {
        Asignatura asignatura= new Asignatura(1);
        Asignatura asignatura2=new Asignatura(2);
        Asignatura asignatura3=new Asignatura(3);
        Alumno alumno1 =new Alumno(asignatura,asignatura2,asignatura3);
        Profesor profe =new Profesor();
        profe.ponerNotas(alumno1);

        System.out.println("Calificacion asignatura 1: "+alumno1.getA1().getCalificacion());
        System.out.println("Calificacion asignatura 2: "+alumno1.getA2().getCalificacion());
        System.out.println("Calificacion asignatura 3: "+alumno1.getA3().getCalificacion());
        System.out.println(profe.calcularMedia(alumno1));
    }
}
