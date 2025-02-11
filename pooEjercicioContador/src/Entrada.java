public class Entrada {
    public static void main(String[] args) {
        Contador c1=new Contador();
        Contador c2=new Contador(5);


        c1.setContador(3);
        Contador c3=new Contador(c1);
        c1.incrementar();
        System.out.println(c1);
        c2.decrementar();
        System.out.println(c2);
        System.out.println(c3);
    }
}
