public class Cuenta {
    private String nombre, numeroCuenta;
    private double tipoInteres,saldo;
    public Cuenta(){
    }
    public Cuenta(String nombre, String numeroCuenta,double tipoInteres,double saldo){
        this.nombre=nombre;
        this.numeroCuenta=numeroCuenta;
        this.tipoInteres=tipoInteres;
        this.saldo=saldo;
    }
    public Cuenta(Cuenta a){
        nombre=a.nombre;
        numeroCuenta=a.numeroCuenta;
        tipoInteres=a.tipoInteres;
        saldo=a.saldo;
    }
    public boolean ingreso(int cantidad){
        boolean ing;
        if(cantidad<0){
            ing=false;
        }else{
            saldo+=cantidad;
            ing=true;
        }
        return ing;
    }
    public boolean reintegro(int cantidad){
        boolean reint=true;
        if(cantidad<0){
            reint=false;
        } else if (cantidad>saldo) {
            reint=false;
        }if(cantidad<saldo){
            saldo-=cantidad;
            reint=true;
        }
        return reint;
    }
    public boolean transferencia(Cuenta destino,int importe){
        boolean trans=true;
        if(saldo<importe){
            trans=false;
        }
        if(saldo>importe){
            destino.ingreso(importe);
            reintegro(importe);
            trans=true;
        }
        return trans;
    }
    public String toString(){
        return "Nombre: "+nombre+",numero Cuenta: "+numeroCuenta+",tipo interes "+tipoInteres+",saldo "+saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
