package SieteReinos;

public class MapaSieteReinos {
    public static void main(String[] args) {
        Gestion gestion=new Gestion();
        CasaNoble casaNoble1=new CasaNoble("Grifindor","Asperfg","escudo1");
        CasaNoble casaNoble2=new CasaNoble("Demacde","Lema2","Escudo2");
        CasaNoble casaNoble3=new CasaNoble("Casanoble3", "Lema3","Escudo 3");
        gestion.aniadir(casaNoble1);
        gestion.aniadir(casaNoble2);
        gestion.aniadir(casaNoble3);
        gestion.mostrarDatos("Grifindor");
        gestion.mostrarDatos("meohsa");
        gestion.eliminar("Demacde");
    }
}
