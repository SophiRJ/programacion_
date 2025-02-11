package Empleados;

public class Empleado {
    private String nif;
    private String nombre;
    private int sueldoBase;
    private int horasExtras;
    private double irpf;
    private String estadoCivil;
    private int numerHijos;
    private static int importeExtra;

    public Empleado(String nif) {
        this.nif = nif;
    }
    public Empleado(){};

    public int calculoHorasExtraImporte(){
        return importeExtra*horasExtras;
    }
    public int calculoSueldoBruto(){
        return (sueldoBase+calculoHorasExtraImporte());
    }
    public double calculoIrpf(){
        if(estadoCivil=="Casado"||estadoCivil=="casado"){
            irpf=irpf-2;
        }
        irpf=irpf-numerHijos;
        return calculoSueldoBruto()*(irpf/100);
    }
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getIrpf() {
        return irpf;
    }

    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getNumerHijos() {
        return numerHijos;
    }

    public void setNumerHijos(int numerHijos) {
        this.numerHijos = numerHijos;
    }

    public static int getImporteExtra() {
        return importeExtra;
    }

    public static void setImporteExtra(int importeExtra) {
        Empleado.importeExtra = importeExtra;
    }
}
