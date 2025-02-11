public class Entrada {
    public static void main(String[] args) {
        Libro libro1=new Libro("Jupiter","Carlos",3,2);
        Libro libro2=new Libro();
        libro2.setTitulo("Cien años");
        libro2.setAutor("Andrea");
        libro2.setNumeroEjemplares(5);
        libro2.setNumeroPrestados(3);
        libro1.prestamo();
        libro2.prestamo();
        libro2.prestamo();
        libro2.devolucion();
        System.out.println(libro1);
        System.out.println(libro2);
    }
}
