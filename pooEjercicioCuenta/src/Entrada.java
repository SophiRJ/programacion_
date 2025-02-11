public class Entrada {
    public static void main(String[] args) {

        Cuenta pepe = new Cuenta("Pepe", "k41451j", 1.20, 500);
        Cuenta andrea = new Cuenta();
        andrea.setNombre("Andrea");
        andrea.setNumeroCuenta("4251f");
        andrea.setTipoInteres(1.56);
        andrea.setSaldo(200);
        System.out.println(pepe);
        System.out.println(andrea);
        pepe.ingreso(400);
        andrea.ingreso(200);
        System.out.println(pepe.getSaldo());
        System.out.println(andrea.getSaldo());
        pepe.transferencia(andrea,200);
        System.out.println(pepe);
        System.out.println(andrea);
    }
}
