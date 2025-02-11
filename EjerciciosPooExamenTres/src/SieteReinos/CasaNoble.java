package SieteReinos;

public class CasaNoble {
    private String nombreCasa;
    private String lema;
    private String escudo;

    public CasaNoble(String nombreCasa, String lema, String escudo) {
        this.nombreCasa = nombreCasa;
        this.lema = lema;
        this.escudo = escudo;
    }

    public String getNombreCasa() {
        return nombreCasa;
    }

    public void setNombreCasa(String nombreCasa) {
        this.nombreCasa = nombreCasa;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }
}
