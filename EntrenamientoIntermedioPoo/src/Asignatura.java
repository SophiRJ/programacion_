public class Asignatura {
    private int identificador;
    private double calificacion;
    public Asignatura(int identificador){
        this.identificador=identificador;

    }
    public void setCalificacion(double calificacion){
        this.calificacion=calificacion;
    }
    public int getIdentificador(){
        return identificador;
    }

    public double getCalificacion(){
        return calificacion;
    }
}
