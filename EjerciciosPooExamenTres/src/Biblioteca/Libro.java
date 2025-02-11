package Biblioteca;

public class Libro {
    private String titulo;
    private Autor autor;
    private int precio;

    public Libro(String titulo, Autor autor, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    public void mostrarDatos(){
        System.out.println("Titulo "+titulo);
        System.out.println("Autor "+autor.getNombre()+" "+autor.getGenero()+" "+autor.getEmail());
        System.out.println("Precio "+precio);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
