package Biblioteca;

public class Entrada {
    public static void main(String[] args) {
        Autor autor =new Autor("Gabriel Garcia","ggarcia@gmail.com",'M');
        Libro libro=new Libro("cien años de soledad",autor,98);
        libro.mostrarDatos();
    }
}
