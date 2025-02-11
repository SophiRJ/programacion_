public class Libro {
    private String titulo,autor;
    private int numeroEjemplares;
    private int numeroPrestados;
    public Libro() {
    }
    public Libro(String titulo, String autor,int numeroEjemplares,int numeroPrestados){
        this.titulo=titulo;
        this.autor=autor;
        this.numeroEjemplares=numeroEjemplares;
        this.numeroPrestados=numeroPrestados;
    }
    public boolean prestamo(){
        boolean prest=true;
        if (numeroEjemplares<0){
            prest=false;
        }else {
            numeroPrestados++;
        }
        return prest;
    }
    public boolean devolucion (){
        boolean dev;
        if(numeroPrestados<0){
            dev=false;
        }else{
            numeroPrestados--;
            dev=true;
        }
        return dev;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroEjemplares=" + numeroEjemplares +
                ", numeroPrestados=" + numeroPrestados +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getNumeroPrestados() {
        return numeroPrestados;
    }

    public void setNumeroPrestados(int numeroPrestados) {
        this.numeroPrestados = numeroPrestados;
    }
}
