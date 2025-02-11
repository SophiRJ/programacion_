public class Profesor {
    public void ponerNotas(Alumno a1){
       a1.getA1().setCalificacion((int)(Math.random()*11));
       a1.getA2().setCalificacion((int)(Math.random()*11));
       a1.getA3().setCalificacion((int)(Math.random()*11));
    }
    public double calcularMedia(Alumno alumno1){
        double media;
        media=(int)((alumno1.getA1().getCalificacion()+alumno1.getA2().getCalificacion()+alumno1.getA3().getCalificacion())/3);
        return media;
    }
}
